import java.util.*;

public class DataProcessor {

  public static void main(String[] args) {
    String rawData = "name:John Doe,age:29;name:Jane Smith,age:34";
    List<Map<String, String>> data = processData(rawData);
    for (Map<String, String> entry : data) {
      System.out.println("Name: " + entry.get("name") + ", Age: " + entry.get("age"));
    }
  }

  public static List<Map<String, String>> processData(String rawData) {
    List<Map<String, String>> data = new ArrayList<>();
    for (String entry : rawData.split(";")) {
      data.add(parseEntry(entry));
    }
    return data;
  }

  private static Map<String, String> parseEntry(String entry) {
    Map<String, String> dataMap = new HashMap<>();
    for (String detail : entry.split(",")) {
      String[] keyValue = detail.split(":");
      dataMap.put(keyValue[0].trim(), keyValue[1].trim());
    }
    return dataMap;
  }
}
