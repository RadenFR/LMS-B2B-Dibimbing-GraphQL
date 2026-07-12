package service;

import client.GraphQlClient;
import io.restassured.response.Response;
import models.request.assign.DeleteAssignVarible;
import models.request.materi.DeleteContentVarible;
import models.response.assign.DeleteAssignResponse;
import models.response.materi.DeleteContentResponse;
import utils.ApiResponse;
import utils.TestDataLoader;

import java.util.Map;

public class DeleteAssignService {

    public static ApiResponse<DeleteAssignResponse> deleteAssign() {
        String query = TestDataLoader.load("graphql/mutations/DeleteAssign.graphql");

        Map<String, Object> variable = DeleteAssignVarible.variables(
                "af5ad9a2-5806-4357-94af-a6941752bea9"
        );

        System.out.println("Variables: " + variable);

        Response response = GraphQlClient.execute(
                query,
                variable
        );

        return new ApiResponse<>(
                response.getStatusCode(),
                response.getHeaders(),
                response.as(DeleteAssignResponse.class)
        );
    }
}
