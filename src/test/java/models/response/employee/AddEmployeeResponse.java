package models.response.employee;

public class AddEmployeeResponse {
    public Data data;

    public static class Data {
        public CreateEmployee createEmployee;
    }

    public static class CreateEmployee {
        public String id;
    }
}
