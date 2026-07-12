package models.request.program;

import java.util.HashMap;
import java.util.Map;

public class UpdateProgramVariable {

    public static Map<String, Object> variables(
            String id,
            String title,
            String description,
            String type,
            boolean isSequential
    ) {
        Map<String, Object> input = new HashMap<>();
        input.put("title", title);
        input.put("description", description);
        input.put("type", type);
        input.put("isSequential", isSequential);

        Map<String, Object> variables = new HashMap<>();
        variables.put("id", id);
        variables.put("input", input);

        return variables;
    }
}
