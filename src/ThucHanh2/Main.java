package ThucHanh2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample= new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner sc= new Scanner(System.in);
        System.out.print("\n vui lòng nhập vị trí của một số bất kì: ");
        int enter = sc.nextInt();
        try{
            System.out.println("Giá trị của phần tử có chỉ số " +enter+" là "+ arr[enter]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
