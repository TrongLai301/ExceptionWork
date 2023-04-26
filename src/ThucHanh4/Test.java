package ThucHanh4;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = -1;
//        while (i < 0) {
//            try {
//                int n = Integer.parseInt(sc.nextLine());
//                if (99 % n == 0) {
//                    System.out.println(n + " is a factor of 99");
//                }
//            } catch (ArithmeticException ex) {
//                System.out.println("Arithmetic " + ex);
//            } catch (NumberFormatException ex) {
//                System.out.println("Number format exception " + ex);
//            }
//        }
        while (i < 0) {
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (99 % n == 0) {
                    System.out.println(n + " is a factor of 99");
                }
            } catch (ArithmeticException | NumberFormatException ex) {
                System.out.println("Exception encountered " + ex);
            }
        }
    }
}



//Giải thích, phần catch 1 là xét trường hợp ngoại lệ về số học
//phần catch 2 là ngoại lệ về định dạng số
//khi nhập GeeksforGeeks (Là một chuỗi), vì vậy nó sẽ chạy vào catch( NumberFormatException) và sau đó báo lỗi thuộc catch 2
//và có chuỗi là GeeksforGeeks
//tương tự khi nhập 0 (là một số ngoại lệ), nên nó sẽ chạy vào catch 1 và thông bào lỗi số học bằng 0

//Ở phần gộp 2 catch với nhau thì nó sẽ tự định dạng lỗi thuộc lỗi nào, và sau đó sẽ thông báo lỗi đó.