package service;

import client.GraphQlClient;
import io.restassured.response.Response;
import models.request.materi.UpdateChapterVariable;
import models.response.materi.UpdateChapterResponse;
import utils.ApiResponse;
import utils.TestDataLoader;

import java.util.Map;

public class UpdateChapterService {
    public static ApiResponse<UpdateChapterResponse> updateChapter() {
        String query = TestDataLoader.load("graphql/mutations/UpdateChapter.graphql");

        Map<String, Object> variable = UpdateChapterVariable.variables(
                "STLC",
                "Materi STLC",
                1,
                "1be9d274-c49b-4f9d-9f70-a281268b4e2f",
                "b552dbd7-b610-4228-94ca-a7d9daa8e565"
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
                response.as(UpdateChapterResponse.class)
        );
    }
}
