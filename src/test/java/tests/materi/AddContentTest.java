package tests.materi;

import models.response.materi.AddContentResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.AddContentService;
import tests.BaseAuthenticatedTest;
import utils.ApiResponse;

public class AddContentTest extends BaseAuthenticatedTest {

    @Test
    public void addContentSuccessfully() {
        ApiResponse<AddContentResponse> response = AddContentService.createContent();

        AddContentResponse responseBody = response.getResponseBody();

        Assert.assertNotNull(responseBody.data.createContent.id);
    }
}
