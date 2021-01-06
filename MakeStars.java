import java.util.*;
import java.io.*;
public class MakeStars{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    ArrayList<String[]> lines = new ArrayList<String[]>(0);
    while(s.hasNext()){ lines.add(s.nextLine().split(" ")); }
    for (int i = 0;i < lines.size(); i ++) {
      String[] line = lines.get(i);
      for (int j = 0; j < line.length; j ++ )
      {
        for (int k = 0; k < line[j].length(); k ++)
        {
          System.out.print("*");
        }
        if (j != line.length - 1) {System.out.print(" ");}
      }
      System.out.println();
    }
  }
}
