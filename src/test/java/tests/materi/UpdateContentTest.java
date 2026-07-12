package tests.materi;

import models.response.materi.UpdateChapterResponse;
import models.response.materi.UpdateContentResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseAuthenticatedTest;
import utils.ApiResponse;

public class UpdateContentTest extends BaseAuthenticatedTest {

    @Test
    public void updateContentSuccessfully() {
        ApiResponse<UpdateContentResponse> response = service.UpdateContentService.updateContent();

        UpdateContentResponse responseBody = response.getResponseBody();

        Assert.assertNotNull(responseBody.data.updateContent.id);
    }
}
