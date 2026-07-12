package models.request.employee;

import java.util.HashMap;
import java.util.Map;

public class DeleteEmployeeVariable {

    public static Map<String, Object> variables(
            String id
    ) {
        // Wrap it in the variables map
        Map<String, Object> inputVariables = new HashMap<>();
        inputVariables.put("id", id);

        return inputVariables;
    }
}
