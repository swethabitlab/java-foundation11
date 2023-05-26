//program to illustrate all the methods in StringBuffer class.
import java.util.Scanner;
public class Basic{
  public static void main(String args[]){
    StringBuffer s=new StringBuffer("welcome");
    System.out.println(s);
    //appending " to bitLabs"
    s.append(" to bitLabs");
    System.out.println("after appending:"+s);
    //indserting "interns"into string
    s.insert(7," interns");
    System.out.println("after inserting:"+s);
    //replace "interns" with ""
    
    s.replace(7,15,"");
    System.out.println("after replacing:"+s);
    //deleting index 
    s.delete(7,7);
    System.out.println("after deleting:"+s);
    //reversing the string
    s.reverse();
    System.out.println("after reversing:"+s);
 }
}