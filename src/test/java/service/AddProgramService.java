package service;

import io.restassured.response.Response;
import models.response.program.AddProgramResponse;
import client.GraphQlClient;
import models.request.program.AddProgramVariable;
import utils.ApiResponse;
import utils.TestDataLoader;

import java.util.Map;

public class AddProgramService {

    public static ApiResponse<AddProgramResponse> addProgram() {
        return addProgram(
                "Ini contoh Program baru",
                "tester",
                "training",
                false
        );
    }

    public static ApiResponse<AddProgramResponse> addProgram(
            String title,
            String description,
            String type,
            boolean isSequential
    ) {
        String query = TestDataLoader.load("graphql/mutations/AddProgram.graphql");

        System.out.println("Query: " + query);

        Map<String, Object> variables = AddProgramVariable.variables(
                title,
                description,
                type,
                isSequential
        );

        System.out.println("Variables: " + variables);

        Response response = GraphQlClient.execute(
                query,
                variables
        );

        return new ApiResponse<>(
                response.getStatusCode(),
                response.getHeaders(),
                response.as(AddProgramResponse.class)
        );
    }
}
