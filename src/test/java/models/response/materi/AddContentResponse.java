package models.response.materi;

public class AddContentResponse {

    public Data data;

    public static class Data {
        public AddContentResponse.CreateContent createContent;
    }

    public static class CreateContent {
        public String id;
    }
}
