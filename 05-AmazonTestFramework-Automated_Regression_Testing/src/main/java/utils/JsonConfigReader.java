package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonConfigReader {

    private static JsonNode rootNode;

    static {
        try {
            ObjectMapper mapper = new ObjectMapper();
            rootNode = mapper.readTree(new File("src/test/resources/config.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getCredential(String key) {
        return rootNode.path("credentials").path(key).asText();
    }

    public static String getLocatorType(String key) {
        return rootNode.path("locators").path(key).path("type").asText();
    }

    public static String getLocatorValue(String key) {
        return rootNode.path("locators").path(key).path("value").asText();
    }
}