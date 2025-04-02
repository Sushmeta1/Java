//import java.util.*;  //java.util- pacakage name(bhaut sara code likha hoga jisse hum apnai usmai use kre honge  , import from scanner class)

//public class ScannerClassInput {
  //  public static void main(String[] args) {
    //    Scanner sc =  new Scanner(System.in); // for input we use System.in
        //String name = sc.nextLine();  // for storing (maanle humai kisika naam store krna h )
        //System.out.println(name);
      //  int age = sc.nextInt();

        //if(age > 18) {
          //System.out.println("Adult");
       // }else {
      //    System.out.println("Not adult");
       // }

        //}

    //}



//import java.util.*;  // Importing the java.util package

//public class scanner_class_input {
  //  public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in); // Creating a Scanner object
      //  String name = sc.nextLine();  // Reading a full line of input
        //System.out.println(name);  // Printing the input
    //}
//}


//Question
import java.util.*;  //java.util- pacakage name(bhaut sara code likha hoga jisse hum apnai usmai use kre honge  , import from scanner class)

public class ScannerClassInput {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int button  = sc.nextInt();

        if(button == 1) {
          System.out.println("Hello");
        } else if(button ==2) {
          System.out.println("Namaste");
        } else if(button == 3){
          System.out.println("Bonjour");
        } else {
          System.out.println("Invalid Button");
        }
      }
    }
