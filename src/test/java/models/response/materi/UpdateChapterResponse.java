package models.response.materi;

public class UpdateChapterResponse {
    public Data data;

    public static class Data {
        public UpdateChapterResponse.UpdateChapter updateChapter;
    }

    public static class UpdateChapter {
        public String id;
    }
}
