package models.response.employee;

public class UpdateEmployeeResponse {
    public Data data;

    public static class Data {
        public UpdateEmployee updateEmployee;
    }

    public static class UpdateEmployee {
        public String id;
    }
}
