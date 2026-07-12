package models.request.materi;

import java.util.HashMap;
import java.util.Map;

public class AddContentVariable {
    public static Map<String, Object> variables(
            String title,
            String description,
            int order,
            String chapterId,
            String type,
            String thumbnailUrl,
            int duration,
            String article,
            String articleType,
            String mediaId,
            boolean isRandomQuestion
    ) {
        Map<String, Object> inputData = new HashMap<>();
        inputData.put("title", title);
        inputData.put("description", description);
        inputData.put("order", order);
        inputData.put("chapterId", chapterId);
        inputData.put("type", type);
        inputData.put("thumbnailUrl", thumbnailUrl);
        inputData.put("duration", duration);
        inputData.put("article", article);
        inputData.put("articleType", articleType);
        inputData.put("mediaId", mediaId);
        inputData.put("isRandomQuestion", isRandomQuestion);

        // Wrap it in the variables map
        Map<String, Object> inputVariables = new HashMap<>();
        inputVariables.put("input", inputData);

        return inputVariables;
    }
}
