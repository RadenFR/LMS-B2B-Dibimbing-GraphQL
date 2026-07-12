package service;

import io.restassured.response.Response;
import client.GraphQlClient;
import models.request.employee.UpdateEmployeeVariable;
import models.response.employee.UpdateEmployeeResponse;
import utils.ApiResponse;
import utils.TestDataLoader;

import java.util.Map;

public class UpdateEmployeeService {

    public static ApiResponse<UpdateEmployeeResponse> updateEmployee() {

        // Load GraphQL mutation
        String query = TestDataLoader.load("graphql/mutations/UpdateEmployee.graphql");

        // Build variables (id DI LUAR input)
        Map<String, Object> variables = UpdateEmployeeVariable.variables(
                "Raden Tiga Pratama",
                "QA-001",
                "tiga@dibimbing.id",
                "898766543211",
                "bb58252c-12b5-428c-b9a0-10272ac39fec",
                "Staff",
                2,
                "male",
                "2001-01-01T00:00:00.000Z",
                "Jln moch toha no 30",
                "1234567890987651",
                "123451",
                "e8223808-5224-498c-8b90-f135af2fda48"
        );

        // Debugging (BEST PRACTICE)
        System.out.println("Query:");
        System.out.println(query);
        System.out.println("Variables:");
        System.out.println(variables);

        // Execute GraphQL
        Response response = GraphQlClient.execute(query, variables);

        // Wrap response
        return new ApiResponse<>(
                response.getStatusCode(),
                response.getHeaders(),
                response.as(UpdateEmployeeResponse.class)
        );
    }
}
