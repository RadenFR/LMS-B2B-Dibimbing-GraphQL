package tests.employee;

import models.response.employee.DeleteEmployeeResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.DeleteEmployeeService;
import tests.BaseAuthenticatedTest;
import utils.ApiResponse;

public class DeleteEmployeeTest extends BaseAuthenticatedTest {

    @Test
    public void deleteEmployeeSuccessfully() {

        ApiResponse<DeleteEmployeeResponse> response = DeleteEmployeeService.deleteEmployee();

        DeleteEmployeeResponse responseBody = response.getResponseBody();

        Assert.assertNotNull(responseBody.data.deleteEmployee.id);
    }
}
