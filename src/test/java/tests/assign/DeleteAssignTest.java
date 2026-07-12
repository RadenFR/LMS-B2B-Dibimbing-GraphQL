package tests.assign;

import models.response.assign.DeleteAssignResponse;
import models.response.employee.DeleteEmployeeResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.DeleteAssignService;
import service.DeleteEmployeeService;
import tests.BaseAuthenticatedTest;
import utils.ApiResponse;

public class DeleteAssignTest extends BaseAuthenticatedTest {

    @Test
    public void deleteAssignSuccessfully() {

        ApiResponse<DeleteAssignResponse> response = DeleteAssignService.deleteAssign();

        DeleteAssignResponse responseBody = response.getResponseBody();

        Assert.assertNotNull(responseBody.data.deleteAssign.id);
    }
}
