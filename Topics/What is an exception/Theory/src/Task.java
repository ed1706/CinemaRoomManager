// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    String input = "g";
    boolean result = Boolean.parseBoolean(input);
    result = !result;
    String output = String.valueOf(result);
    System.out.println(output);
  }
}
