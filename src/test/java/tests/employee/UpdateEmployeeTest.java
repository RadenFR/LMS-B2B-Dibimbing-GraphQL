package tests.employee;

import models.response.employee.AddEmployeeResponse;
import models.response.employee.UpdateEmployeeResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.UpdateEmployeeService;
import tests.BaseAuthenticatedTest;
import utils.ApiResponse;

public class UpdateEmployeeTest extends BaseAuthenticatedTest {

    @Test
    public void updateEmployeeSuccessfully() {
        ApiResponse<UpdateEmployeeResponse> response = UpdateEmployeeService.updateEmployee();

        UpdateEmployeeResponse responseBody = response.getResponseBody();

        Assert.assertNotNull(responseBody.data.updateEmployee.id);
    }
}
