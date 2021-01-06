import java.util.*;
import java.io.*;
public class PigLatin{
  public static String pigLatinSimple(String s)
  {
    s = s.toLowerCase();
    ArrayList<String> vowels = new ArrayList<String>(Arrays.asList("a","e","i","o","u"));
    return vowels.contains(s.substring(0, 1)) ? s + "hay" : s.substring(1) + s.substring(0, 1) + "ay";
  }
  public static String pigLatin(String s)
  {
    ArrayList<String> vowels =
    new ArrayList<String>(Arrays.asList("a","e","i","o","u"));
    ArrayList<String> diagraphs =
    new ArrayList<String>(Arrays.asList("bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"));
    return vowels.contains(s.substring(0, 1)) ? s + "hay" : diagraphs.contains(s.substring(0, 2)) ? s.substring(2) + s.substring(0, 2) + "ay" : s.substring(1) + s.substring(0, 1) + "ay";
  }
  public static String pigLatinBest(String s)
  {
    s = s.toLowerCase();
    String thing = "";
    if (Character.isDigit(s.charAt(0))) {return s;}
    if (!Character.isLetter(s.charAt(s.length() - 1 )))
    {
      thing = Character.toString(s.charAt(s.length() - 1));
      s = s.substring(0,s.length() - 2);
    }
    ArrayList<String> vowels =
    new ArrayList<String>(Arrays.asList("a","e","i","o","u"));
    ArrayList<String> diagraphs =
    new ArrayList<String>(Arrays.asList("bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"));
    s = vowels.contains(s.substring(0, 1)) ? s + "hay" : diagraphs.contains(s.substring(0, 2)) ? s.substring(2) + s.substring(0, 2) + "ay" : s.substring(1) + s.substring(0, 1) + "ay";
    return s + thing;
  }
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    ArrayList<String[]> lines = new ArrayList<String[]>(0);
    while(s.hasNext()){ lines.add(s.nextLine().split(" ")); }
    for (int i = 0;i < lines.size(); i ++) {
      String[] line = lines.get(i);
      for (int j = 0; j < line.length; j ++ )
      {
        System.out.print(pigLatinBest(line[j]));
        if (j != line.length - 1) {System.out.print(" ");}
      }
      System.out.println();
    }
  }
}
