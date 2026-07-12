package models.response.assign;

public class UpdateAssignResponse {

    public Data data;

    public static class Data {
        public UpdateAssignResponse.UpdateAssign updateAssign;
    }

    public static class UpdateAssign {
        public String id;
    }
}
