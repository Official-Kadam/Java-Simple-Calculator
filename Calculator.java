import java.util.*;
public class Main {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num1,opr,num2;
    
    
    while(true){
      System.out.println("Enter first number: "); 
      num1=sc.nextInt();
      System.out.println("Enter operator: + - × ÷\nor quite for q");
      opr=sc.next().charAt(0);
      opr=Character.toLowerCase(opr);
      if(opr=='q'){
        System.out.println("Thanks for using\nDeveloped by @Official-Kadam");
        break;
      }

      System.out.println("Enter second number: ");
      num2=sc.nextInt();
            
      if(opr=='+'){
        System.out.println(num1+num2);
      }
      else if(opr=='-'){
        System.out.println(num1-num2);
      }
      else if(opr=='×'){
        System.out.println(num1*num2);
      }
      else if(opr=='÷'){
        System.out.println(num1/num2);
      }
      else{
        System.out.println("Invalid operation Try Again !");
      }

      
    }
  
  }
}
