package BaiTap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TriagleCheck triagleCheck = new TriagleCheck();
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();
        try{
            triagleCheck.TriagleCheck1(a,b,c);
        }catch (TriagleEx ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println("Lỗi: không đúng hình dạng");
        }
    }
}
