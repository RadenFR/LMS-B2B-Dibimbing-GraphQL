package tests.assign;

import models.response.assign.AddAssignResponse;
import models.response.assign.UpdateAssignResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.AddAssignService;
import service.UpdateAssignService;
import tests.BaseAuthenticatedTest;
import utils.ApiResponse;

public class UpdateAssignTest extends BaseAuthenticatedTest {

    @Test
    public void updateAssignSuccessfully() {
        ApiResponse<UpdateAssignResponse> response = UpdateAssignService.updateAssign();

        UpdateAssignResponse responseBody = response.getResponseBody();

        Assert.assertNotNull(responseBody.data.updateAssign.id);
    }
}
