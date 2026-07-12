package models.response.program;


public class UpdateProgramResponse {
    public UpdateProgramResponse.Data data;

    public static class Data {
        public UpdateProgram updateProgram;
    }

    public static class UpdateProgram {
        public String id;
    }
}
