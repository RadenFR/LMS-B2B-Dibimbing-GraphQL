package service;

import io.restassured.response.Response;
import client.GraphQlClient;
import models.request.employee.AddEmployeeVariable;
import models.response.employee.AddEmployeeResponse;
import utils.ApiResponse;
import utils.TestDataLoader;

import java.util.Map;

public class EmployeeService {

    public static ApiResponse<AddEmployeeResponse> addEmployee() {
        String query = TestDataLoader.load("graphql/mutations/AddEmployee.graphql");

        Map<String, Object> variable = AddEmployeeVariable.variables(
                "Raden Tiga",
                "QA01",
                "tiga@gmail.com",
                "89511214411",
                "43b462d2-e360-46e2-b6bd-73b3f5fb0721",
                "Member",
                2,
                "male",
                "1998-11-04T00:00:00.000Z",
                "Jln Moch TOha",
                "1234567890123451",
                "123451"
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
                response.as(AddEmployeeResponse.class)
        );
    }
}
