package models.request.materi;

import java.util.HashMap;
import java.util.Map;

public class UpdateChapterVariable {
    public static Map<String, Object> variables(
            String title,
            String description,
            int order,
            String programId,
            String id
    ) {
        Map<String, Object> inputData = new HashMap<>();
        inputData.put("title", title);
        inputData.put("description", description);
        inputData.put("order", order);
        inputData.put("programId", programId);

        // Wrap it in the variables map
        Map<String, Object> inputVariables = new HashMap<>();
        inputVariables.put("id", id);
        inputVariables.put("input", inputData);

        return inputVariables;
    }
}
