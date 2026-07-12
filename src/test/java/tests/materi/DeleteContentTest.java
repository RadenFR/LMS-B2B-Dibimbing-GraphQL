package tests.materi;

import models.response.materi.DeleteContentResponse;
import models.response.materi.UpdateChapterResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseAuthenticatedTest;
import utils.ApiResponse;

public class DeleteContentTest extends BaseAuthenticatedTest {

    @Test
    public void deleteChapterSuccessfully() {
        ApiResponse<DeleteContentResponse> response = service.DeleteContentService.deleteContent();

        DeleteContentResponse responseBody = response.getResponseBody();

        Assert.assertNotNull(responseBody.data.deleteContent.id);
    }
}
