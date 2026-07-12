package service;

import client.GraphQlClient;
import io.restassured.response.Response;
import models.request.assign.AddAssignVariable;
import models.response.assign.AddAssignResponse;
import utils.ApiResponse;
import utils.TestDataLoader;

import java.util.Map;

public class AddAssignService {

    public static ApiResponse<AddAssignResponse> addAssign() {
        String query = TestDataLoader.load("graphql/mutations/AddAssign.graphql");

        Map<String, Object> variable = AddAssignVariable.variables(
                "f83d1096-a3bc-4382-9707-d0196b584320",
                "2026-01-29",
                "2026-02-28",
                "1be9d274-c49b-4f9d-9f70-a281268b4e2f"
        );


        System.out.println("Query: " + query);
        System.out.println("Variables: " + variable);

        Response response = GraphQlClient.execute(
                query,
                variable
        );

        return new ApiResponse<>(
                response.getStatusCode(),
                response.getHeaders(),
                response.as(AddAssignResponse.class)
        );
    }
}
