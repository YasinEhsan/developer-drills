package stack;

import java.util.Stack;
import java.util.Scanner;

//bracket matching based on Algorithm on p201 Goodrich & Tamassia

public class BrackMatch {
  public static void main(String args[]) {
    System.out.println("Enter input tokens separated by spaces");
    System.out.println("Terminate input with Z");
    Stack<String> s = new Stack<String>();
    Scanner input = new Scanner(System.in);
    try {
      while (input.hasNext()) {
        String b = input.next();
        if (b.equals("Z")) break;
        if (openBrac(b))
          s.push(b);
        if (closeBrac(b)) {
          if (s.empty())
            throw new Exception("Unmatched " + b);
          String c = (String) s.pop();
          if (!matchBrac(c, b))
            throw new Exception("Mismatched " + c + b);
        }
      }
      if (s.empty())
        System.out.println("Brackets are OK");
      else
        throw new Exception("Unmatched " + s.pop());
    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
    input.close();
  }

  // ------------------------ helper methods are below -------------------

  public static boolean openBrac(String x) {
    if (x.equals("(") || x.equals("{") || x.equals("["))
      return true;
    return false;
  }

  public static boolean closeBrac(String x) {
    if (x.equals(")") || x.equals("}") || x.equals("]"))
      return true;
    return false;
  }

  public static boolean matchBrac(String x, String y) {
    if (x.equals("(") && y.equals(")"))
      return true;
    if (x.equals("{") && y.equals("}"))
      return true;
    if (x.equals("[") && y.equals("]"))
      return true;
    return false;
  }
}
