package service;

import client.GraphQlClient;
import io.restassured.response.Response;
import models.request.employee.AddEmployeeVariable;
import models.request.materi.AddChapterVariable;
import models.request.program.AddProgramVariable;
import models.response.employee.AddEmployeeResponse;
import models.response.materi.AddChapterResponse;
import models.response.program.AddProgramResponse;
import utils.ApiResponse;
import utils.TestDataLoader;

import java.util.Map;

public class AddChapterService {

    public static ApiResponse<AddChapterResponse> addChapter() {
        String query = TestDataLoader.load("graphql/mutations/AddChapter.graphql");

        Map<String, Object> variable = AddChapterVariable.variables(
                "test 2",
                "Ini contoh materi 2",
                2,
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
                response.as(AddChapterResponse.class)
        );
    }
}
