import java.util.*;

public class Main {
      static String Order(int val){
          String ordered="Nothing is Selected";
          switch(val){
                 case 0: ordered="Nothing is Selected ";
                  break;
                case 1: ordered="Big Cola";
                break;
                case 2: ordered="Coca Cola";
                break;

                case 3: ordered="Jeeru";
                break;

                case 4: ordered="Sting";
                break;

                case 5: ordered="Slice";
                break;
          }
          System.out.print("Please wait while we proceed your order sir");
          return ordered;
      }
    public static void main(String[] args) {
       
        System.out.println("*****************************************************");
        System.out.println("********************WELCOME SIR**********************");
        System.out.println("*****************************************************");
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Select product from given list");
        Products p=new Products();
        p.productList();
        int n= sc.nextInt();
        if(n>5){System.out.println("Please Enter valid Id");
      }
        Payment orderedItems=new Payment();
        orderedItems.cash(n);
        String m=Order(n);
        int x=sc.nextInt();
        if(x==orderedItems.price(m)){
          System.out.println("Thank You!!!!");
        }
        else {
          System.out.println("You have not paid required amount sir,sorry for inconvenience please order again"); 
        }
        Greetings msg=new Greetings();
        msg.greet();
        
        

    }
}
