import java.io.Console;

public class evenOdd {
  public static void main (String [] args){
    Console theConsole = System.console();
    System.out.println("Please enter a number");
    String userNumberStr = theConsole.readLine();
    for (int i = 0; i<= Integer.parseInt(userNumberStr); i++){
      if (isEven(i)){
        System.out.println("Even");
      } else{
        System.out.println("Odd");
      }
    }
  }
  public static boolean isEven(Integer number){
    if(number % 2 == 0){
      return true;
    } else
    return false;
  }
}
