import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParseStringArray {
  public static void main(String[] args) {
    String sampleString = "There are many words in a \"string\", this is one of them. (Daniel)";
    String delims = "[ ,.:;?\"()]+";
    String[] tokens = sampleString.split(delims);
    List<String> itemList = new ArrayList<String>(Arrays.asList(tokens));
    System.out.println(itemList);
  }
}
