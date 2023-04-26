package ThucHanh1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
            System.out.println("Linear Equation Resolver");
            System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
            Scanner sc= new Scanner(System.in);
            System.out.print("a: ");
            double a = sc.nextDouble();
            System.out.print("b: ");
            double b = sc.nextDouble();
            System.out.print("c: ");
            double c = sc.nextDouble();
            double x;
            if (a!=0){
                x=(c-b)/a;
                System.out.println("Số của x là: "+x);
            }else{
                x=0;
                System.out.println("Số của x là: "+x);
            }
    }
}
