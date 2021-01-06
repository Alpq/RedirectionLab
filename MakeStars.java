import java.util.ArrayList
public class MakeStars{
  public static void main(String[] args) {
    String f = args[0];
    File f = new File(f);//can combine
    Scanner s = new Scanner(f);
    ArrayList<String[]> lines = new ArrayList<String[]>(0);
    while(in.hasNext()){ lines.add(in.nextLine().split(" ")); }
    for (int i = 0;i < lines.size(); i ++) {
      String[] line = lines.get(i);
      for (int j = 0; line.length; j ++ )
      {
        system.out.print(line[j]);
        system.out.print(" ");
      }
      system.out.println();
    }
  }
}


/*

Syntax to run this program should be:
java MakeStars < book.txt
cat book.txt | java MakeStars

Pig Latin Translator!

-Create a new java file PigLatin.java which will contain 3 methods + a main.

Pig Latin I.

public static String pigLatinSimple(String s){}
Given a single word of at least 1 character:
Words that start with a,e,i,o,u  add 'hay' to the end of the word
All other words move the first letter to the end, and add 'ay' to the word.
output should be lower case to avoid issues with capitalization
pigLatinSimple("mock") → "ockmay"
pigLatinSimple("pie") → "iepay
pigLatinSimple("david") → "avidday"
pigLatinSimple("aaron") → "aaronhay"
Pig Latin II

Make a better version of pig latin as follows:
public static String pigLatin(String s){}

Given a single word of at least 1 character.
Words that start with any digraph (list included for your convenience) move the first two letters to the end, and add 'ay'
Words that start with a,e,i,o,u add 'hay' to the end of the word
All other words move the first letter to the end, and add 'ay' to the word.
output should be lower case to avoid issues with capitalization

Digraphs: {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"}

Examples:
pigLatin("the") → "ethay"
pigLatin("check") → "eckchay"
pigLatin("skee") → "eeskay"
pigLatin("emu") → "emuhay"
pigLatin("grade") → "adegray"

konstantinovich
konstantinovich
Admin
Owner
10:43 AM
Pig Latin III
Make your final version of pig latin:

public static String pigLatinBest(String s){}
Given a single word of at least 1 character, that can optionally have a punctuation mark afterwards.
Words that start with a NON letter are left alone
Otherwise: Same rules as pigLatin() except now there can optionally be punctuation marks at the end of a word.
Punctuation is any non-letter, non-number symbol after the word.
The punctuation must remain after the word after you convert to pig latin.
output should be lower case to avoid issues with capitalization


pigLatinBest("*emu") → "*emu"
pigLatinBest("4chan") → "4chan"
pigLatinBest("fish!") → "ishfay!"
pigLatinBest("fish") → "ishfay"
pigLatinBest("the.") → "ethay."
pigLatinBest("cat!") → "atcay!"
pigLatinBest("amazing?") → "amazinghay?"
pigLatinBest("apple%") → "applehay%"
Final step:
Make your PigLatin.java apply your pigLatinBest on each word in text input.
You should print out the pigLatinBest version of the text. Newlines should be preserved (use nextLine / println )

Syntax to run this program should be:
java PigLatin < book.txt
cat book.txt | java PigLatin



Both
java Piglatin < sonnet.txt
cat sonnet.txt | java PigLatin

You can compare the output of your program with my output!
If the pig latin text above is in a file expectedOutput.txt and the English text above is in a file sonnet.txt
You can then rn the command:
java PigLatin < sonnet.txt | diff expectedOutput.txt -

*/
