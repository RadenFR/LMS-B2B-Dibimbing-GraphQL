package service;

import client.GraphQlClient;
import io.restassured.response.Response;
import models.request.assign.UpdateAssignVariable;
import models.request.materi.UpdateChapterVariable;
import models.response.assign.UpdateAssignResponse;
import models.response.materi.UpdateChapterResponse;
import utils.ApiResponse;
import utils.TestDataLoader;

import java.util.Map;

public class UpdateAssignService {

    public static ApiResponse<UpdateAssignResponse> updateAssign() {
        String query = TestDataLoader.load("graphql/mutations/UpdateAssign.graphql");

        Map<String, Object> variable = UpdateAssignVariable.variables(
                "af5ad9a2-5806-4357-94af-a6941752bea9",
                "2026-03-20"
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
                response.as(UpdateAssignResponse.class)
        );
    }
}
