package models.response.materi;

public class DeleteContentResponse {

    public Data data;

    public static class Data {
        public DeleteContentResponse.DeleteContent deleteContent;
    }

    public static class DeleteContent {
        public String id;
    }
}
