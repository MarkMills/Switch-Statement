import java.util.Scanner;
//import scanner
class Main {
  //create class
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    //create scanner
    System.out.println("Number?");
    //print question
    int x = input.nextInt();
    //get user input
    switch (x) {
      //create switch statement
      case 1:
        if(x == 1) {
          System.out.println("");
          System.out.println(x + " is Cyan.");
          break;
        }
        //case 1 if statement
      case 2:
        if(x == 2) {
          System.out.println("");
          System.out.println(x + " is Magenta.");
          break;
        }
      case 3:
        if(x == 3) {
          System.out.println("");
          System.out.println(x + " is Yellow.");
          break;
        }
      case 4:
        if(x == 4) {
          System.out.println("");
          System.out.println(x + " is Black.");
          break;
        }
      default:
        System.out.println("");
        System.out.println("That number is not valid.");
        //create default output
    }
  }
}
