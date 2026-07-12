package tests.program;

import org.testng.Assert;
import org.testng.annotations.Test;
import models.response.program.AddProgramResponse;
import service.AddProgramService;
import tests.BaseAuthenticatedTest;
import utils.ApiResponse;

public class AddProgramServiceTest extends BaseAuthenticatedTest {

    @Test
    public void addProgramSuccessfully() {
        ApiResponse<AddProgramResponse> response = AddProgramService.addProgram();

        AddProgramResponse responseBody = response.getResponseBody();

        Assert.assertNotNull(responseBody.data.createProgram.id);
    }

    @Test
    public void failedAddProgram() {
        ApiResponse<AddProgramResponse> response = AddProgramService.addProgram(
                "Program dika",
                "Desc",
                null,
                false
        );

        AddProgramResponse responseBody = response.getResponseBody();
        int statusCode = response.getStatusCode();

        System.out.println("Status Code: " + statusCode);
        System.out.println("Errors: " + responseBody);

        Assert.assertEquals(statusCode, 400);
    }
}
