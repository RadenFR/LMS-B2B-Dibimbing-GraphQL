package models.response.materi;

public class UpdateContentResponse {

    public Data data;

    public static class Data {
        public UpdateContentResponse.UpdateContent updateContent;
    }

    public static class UpdateContent {
        public String id;
    }
}
