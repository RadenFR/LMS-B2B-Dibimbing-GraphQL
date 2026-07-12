package tests.materi;

import models.response.materi.AddChapterResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.AddChapterService;
import tests.BaseAuthenticatedTest;
import utils.ApiResponse;

public class AddChapterTest extends BaseAuthenticatedTest {

    @Test
    public void addChapterSuccessfully() {
        ApiResponse<AddChapterResponse> response = AddChapterService.addChapter();

        AddChapterResponse responseBody = response.getResponseBody();

        Assert.assertNotNull(responseBody.data.createChapter.id);
    }
}
