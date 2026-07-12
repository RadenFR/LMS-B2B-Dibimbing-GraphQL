package service;

import io.restassured.response.Response;
import client.AuthSession;
import client.GraphQlClient;
import config.CredentialsConfig;
import models.request.login.LoginVariables;
import models.response.login.LoginResponse;
import utils.ApiResponse;
import utils.TestDataLoader;

public class AuthService {

    public static ApiResponse<LoginResponse> postLogin() {
        return postLogin(
                CredentialsConfig.EMAIL,
                CredentialsConfig.PASSWORD,
                CredentialsConfig.COMPANY_ID
        );
    }

    public static ApiResponse<LoginResponse> postLogin(String email, String password, String companyId) {
        String query = TestDataLoader.load("graphql/mutations/Login.graphql");

        LoginVariables variables = new LoginVariables(email, password, companyId);

        Response response = GraphQlClient.execute(
                query,
                variables
        );

        // GraphQL-level validation
        if (response.jsonPath().getList("data.login.errors") != null) {
            throw new RuntimeException("Failed to login: "
                    + response.jsonPath().getString("data.login.errors")
            );
        }

        String sid = response.getCookie("sid_b2b");

        if (sid == null) {
            throw new RuntimeException("Login succeeded but sid_b2b cookie missing");
        }

        AuthSession.setSessionCookie(sid);

        System.out.println("SID: " + sid);

        LoginResponse loginResponse = response.as(LoginResponse.class);

        return new ApiResponse<>(
                response.getStatusCode(),
                response.getHeaders(),
                loginResponse
        );
    }
}
