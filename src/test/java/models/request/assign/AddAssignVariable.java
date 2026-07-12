package models.request.assign;

import java.util.HashMap;
import java.util.Map;

public class AddAssignVariable {

    public static Map<String, Object> variables(
            String employeeIds,
            String startDate,
            String endDate,
            String programId
    ) {
        Map<String, Object> inputData = new HashMap<>();
        inputData.put("employeeIds", employeeIds);
        inputData.put("startDate", startDate);
        inputData.put("endDate", endDate);
        inputData.put("programId", programId);

        // Wrap it in the variables map
        Map<String, Object> inputVariables = new HashMap<>();
        inputVariables.put("input", inputData);

        return inputVariables;
    }
}
