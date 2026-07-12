package service;

import client.GraphQlClient;
import io.restassured.response.Response;
import models.request.materi.AddContentVariable;
import models.request.materi.UpdateContentVariable;
import models.response.materi.AddContentResponse;
import models.response.materi.UpdateContentResponse;
import utils.ApiResponse;
import utils.TestDataLoader;

import java.util.Map;

public class UpdateContentService {

    public static ApiResponse<UpdateContentResponse> updateContent() {
        String query = TestDataLoader.load("graphql/mutations/UpdateContent.graphql");

        Map<String, Object> variable = UpdateContentVariable.variables(
                "Introdunction STLC",
                "Pemaparan materi STLC",
                1,
                "b552dbd7-b610-4228-94ca-a7d9daa8e565",
                "video",
                "",
                4,
                "",
                "url",
                "304a4852-594d-4e0a-a9d5-534fd3aee945",
                false,
                "c8553ea4-2f55-4211-b087-ceb70c3b6c04"
        );

        System.out.println("Query: " + query);
        System.out.println("Variables: " + variable);

        Response response = GraphQlClient.execute(
                query,
                variable
        );

        return new ApiResponse<>(
                response.getStatusCode(),
                response.getHeaders(),
                response.as(UpdateContentResponse.class)
        );
    }
}
