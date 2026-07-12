package models.response.assign;

public class AddAssignResponse {

    public Data data;

    public static class Data {
        public AddAssignResponse.AddAssign addAssign;
    }

    public static class AddAssign {
        public String id;
    }
}
