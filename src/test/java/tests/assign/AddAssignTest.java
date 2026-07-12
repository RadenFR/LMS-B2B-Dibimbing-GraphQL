package tests.assign;

import models.request.assign.AddAssignVariable;
import models.response.assign.AddAssignResponse;
import models.response.employee.AddEmployeeResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.AddAssignService;
import service.EmployeeService;
import tests.BaseAuthenticatedTest;
import utils.ApiResponse;

public class AddAssignTest extends BaseAuthenticatedTest {

    @Test
    public void addAssignSuccessfully() {
        ApiResponse<AddAssignResponse> response = AddAssignService.addAssign();

        AddAssignResponse responseBody = response.getResponseBody();

        Assert.assertNotNull(responseBody.data.addAssign.id);
    }
}
