package service;

import client.GraphQlClient;
import io.restassured.response.Response;
import models.request.employee.DeleteEmployeeVariable;
import models.request.materi.DeleteContentVarible;
import models.response.employee.DeleteEmployeeResponse;
import models.response.materi.DeleteContentResponse;
import utils.ApiResponse;
import utils.TestDataLoader;

import java.util.Map;

public class DeleteContentService {

    public static ApiResponse<DeleteContentResponse> deleteContent() {
        String query = TestDataLoader.load("graphql/mutations/DeleteContent.graphql");

        Map<String, Object> variable = DeleteContentVarible.variables(
                "c8553ea4-2f55-4211-b087-ceb70c3b6c04"
        );

        System.out.println("Variables: " + variable);

        Response response = GraphQlClient.execute(
                query,
                variable
        );

        return new ApiResponse<>(
                response.getStatusCode(),
                response.getHeaders(),
                response.as(DeleteContentResponse.class)
        );
    }
}
