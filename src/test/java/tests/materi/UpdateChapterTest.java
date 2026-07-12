package tests.materi;

import models.response.materi.AddContentResponse;
import models.response.materi.UpdateChapterResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.AddContentService;
import tests.BaseAuthenticatedTest;
import utils.ApiResponse;

public class UpdateChapterTest extends BaseAuthenticatedTest {

    @Test
    public void updateChapterSuccessfully() {
        ApiResponse<UpdateChapterResponse> response = service.UpdateChapterService.updateChapter();

        UpdateChapterResponse responseBody = response.getResponseBody();

        Assert.assertNotNull(responseBody.data.updateChapter.id);
    }
}
