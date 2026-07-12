package models.response.materi;


public class AddChapterResponse {
    public Data data;

    public static class Data {
        public AddChapterResponse.CreateChapter createChapter;
    }

    public static class CreateChapter {
        public String id;
    }
}
