    package service;

    import client.GraphQlClient;
    import io.restassured.response.Response;
    import models.request.employee.DeleteEmployeeVariable;
    import models.response.employee.DeleteEmployeeResponse;
    import utils.ApiResponse;
    import utils.TestDataLoader;

    import java.util.Map;

    public class DeleteEmployeeService {

        public static ApiResponse<DeleteEmployeeResponse> deleteEmployee() {
            String query = TestDataLoader.load("graphql/mutations/DeleteEmployee.graphql");

            Map<String, Object> variable = DeleteEmployeeVariable.variables(
                    "e8223808-5224-498c-8b90-f135af2fda48"
            );

            System.out.println("Variables: " + variable);

            Response response = GraphQlClient.execute(
                    query,
                    variable
            );

            return new ApiResponse<>(
                    response.getStatusCode(),
                    response.getHeaders(),
                    response.as(DeleteEmployeeResponse.class)
            );
        }
    }
