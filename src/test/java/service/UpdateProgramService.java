package service;

import client.GraphQlClient;
import io.restassured.response.Response;
import models.request.program.UpdateProgramVariable;
import models.response.program.UpdateProgramResponse;
import utils.ApiResponse;
import utils.TestDataLoader;

import java.util.Map;

public class UpdateProgramService {

    public static ApiResponse<UpdateProgramResponse> updateProgram() {
        return updateProgram(
                "4d0ba948-18c2-46a5-8313-da4da10d0375",
                "Program Updated",
                "Description setelah update",
                "training",
                true
        );
    }

    public static ApiResponse<UpdateProgramResponse> updateProgram(
            String id,
            String title,
            String description,
            String type,
            boolean isSequential
    ) {
        String query = TestDataLoader.load("graphql/mutations/UpdateProgram.graphql");

        Map<String, Object> variables = UpdateProgramVariable.variables(
                id,
                title,
                description,
                type,
                isSequential
        );

        Response response = GraphQlClient.execute(query, variables);

        // Debug helper (boleh dihapus nanti)
        System.out.println(response.asPrettyString());

        return new ApiResponse<>(
                response.getStatusCode(),
                response.getHeaders(),
                response.as(UpdateProgramResponse.class)
        );
    }
}
