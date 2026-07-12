package models.response.program;

public class AddProgramResponse {

    public Data data;

    public static class Data {
        public CreateProgram createProgram;
    }

    public static class CreateProgram {
        public String id;
    }
}
