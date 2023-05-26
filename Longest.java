//write a java program that returns the longest word in the string.If there are two or more words that are the same length, return the first word from the string with that length. Words may also contain numbers, for example "Hello world123 567.
import java.util.Scanner;
public class Longest{
  public static void main(String args[]){
    LongestWord l=new LongestWord();
    l.longestWordIs();
  }
}
class  LongestWord{
  public void longestWordIs(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine();
    String words[]=s.split(" ");
    String s1=words[0];
    int max=words[0].length();
    for(int i=0;i<words.length;i++){
      int length=words[i].length();
      if(max<length){
        max=length;
        s1=words[i];
      }
    } 
      System.out.println("the longest word in  "+s+ " is "+s1+" and it's length is "+max);

  }
}