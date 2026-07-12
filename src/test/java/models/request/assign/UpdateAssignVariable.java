package models.request.assign;

import java.util.HashMap;
import java.util.Map;

public class UpdateAssignVariable {

    public static Map<String, Object> variables(
            String id,
            String endDate
    ) {
        // Wrap it in the variables map
        Map<String, Object> inputVariables = new HashMap<>();
        inputVariables.put("id", id);
        inputVariables.put("endDate", endDate);

        return inputVariables;
    }
}
