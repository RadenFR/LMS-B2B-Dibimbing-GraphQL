package service;

import client.GraphQlClient;
import io.restassured.response.Response;
import models.request.materi.AddContentVariable;
import models.response.materi.AddContentResponse;
import utils.ApiResponse;
import utils.TestDataLoader;

import java.util.Map;

public class AddContentService {

    public static ApiResponse<AddContentResponse> createContent() {
        String query = TestDataLoader.load("graphql/mutations/AddContent.graphql");

        Map<String, Object> variable = AddContentVariable.variables(
                "ini content baru",
                "<p>ini deskripsi kontent<p>",
                1,
                "b552dbd7-b610-4228-94ca-a7d9daa8e565",
                "video",
                "",
                4,
                "",
                "url",
                "6117d7b7-8e82-433f-b384-44c7d4852b82",
                false
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
                response.as(AddContentResponse.class)
        );
    }
}
