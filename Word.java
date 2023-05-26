/*You are working on a text editor application that allows users to write sentences. As part of an enhancement to the application, you need to implement a feature that automatically capitalizes the first letter of each word in a sentence. This will make the text appear more visually appealing and adhere to standard writing conventions. You are tasked with writing a program in Java to accomplish this.
For example, if the user enters "the quick brown fox jumps over the lazy dog", the program should output "The Quick Brown Fox Jumps Over The Lazy Dog"*/
import java.util.Scanner;
public class Word{
public static void main(String args[]){
    UpperLetter u=new UpperLetter();
    u.firstLetter();
 }
} 
class  UpperLetter{
  public void firstLetter(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String str=sc.nextLine();
    String words[]=str.split(" ");
    String first=" ";
    String remain="";
    String newStr=" ";
    for(int i=0;i<words.length;i++){
      String w=words[i];
      for(int j=0;j<w.length();j++){
      first=w.substring(0,1);
      remain=w.substring(1);
      newStr=first.toUpperCase()+remain+" ";
    }
    System.out.print(newStr.trim());
    }  
  }
}