package tests.program;

import models.response.program.UpdateProgramResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.UpdateProgramService;
import utils.ApiResponse;

public class UpdateProgramTest {

    @Test
    public void updateProgramSuccessfully() {
        ApiResponse<UpdateProgramResponse> response = UpdateProgramService.updateProgram();

        UpdateProgramResponse responseBody = response.getResponseBody();

        Assert.assertNotNull(responseBody.data.updateProgram.id);
    }
}
