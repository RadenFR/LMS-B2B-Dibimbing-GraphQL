package models.response.employee;

public class DeleteEmployeeResponse {
    public Data data;

    public static class Data {
        public DeleteEmployee deleteEmployee;
    }

    public static class DeleteEmployee {
        public String id;
    }
}
