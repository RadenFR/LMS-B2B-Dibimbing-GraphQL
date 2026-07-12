package tests.employee;

import org.testng.Assert;
import org.testng.annotations.Test;
import models.response.employee.AddEmployeeResponse;
import service.EmployeeService;
import tests.BaseAuthenticatedTest;
import utils.ApiResponse;

public class AddEmployeeTest extends BaseAuthenticatedTest {

    @Test
    public void addEmployeeSuccessfully() {
        ApiResponse<AddEmployeeResponse> response = EmployeeService.addEmployee();

        AddEmployeeResponse responseBody = response.getResponseBody();

        Assert.assertNotNull(responseBody.data.createEmployee.id);
    }
}
