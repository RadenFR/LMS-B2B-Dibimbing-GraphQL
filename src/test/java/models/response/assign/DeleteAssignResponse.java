package models.response.assign;

import models.response.employee.DeleteEmployeeResponse;

public class DeleteAssignResponse {

    public Data data;

    public static class Data {
        public DeleteAssignResponse.DeleteAssign deleteAssign;
    }

    public static class DeleteAssign {
        public String id;
    }
}
