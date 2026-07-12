package models.request.assign;

import java.util.HashMap;
import java.util.Map;

public class DeleteAssignVarible {

    public static Map<String, Object> variables(
            String id
    ) {
        // Wrap it in the variables map
        Map<String, Object> inputVariables = new HashMap<>();
        inputVariables.put("id", id);

        return inputVariables;
    }
}
