package utils;

import org.openqa.selenium.By;

public class LocatorFactory {
    public static By getLocator(String key) {
        String type = JsonConfigReader.getLocatorType(key);
        String value = JsonConfigReader.getLocatorValue(key);

        switch (type.toLowerCase()) {
            case "id": return By.id(value);
            case "name": return By.name(value);
            case "xpath": return By.xpath(value);
            case "css": return By.cssSelector(value);
            case "classname": return By.className(value);
            case "tagname": return By.tagName(value);
            case "linktext": return By.linkText(value);
            case "partiallinktext": return By.partialLinkText(value);
            default: throw new IllegalArgumentException("Invalid locator type: " + type);
        }
    }
}