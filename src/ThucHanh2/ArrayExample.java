package ThucHanh2;

import java.util.Random;

public class ArrayExample {
    //Tạo phương thức creatRandom
    public Integer[] createRandom(){
        //Khởi tạo đối tượng Ramdom
        Random rd = new Random();
        //Khởi tạo mảng đối tượng
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng ");
        //Tạo vòng lặp for để duyệt mảng
        for (int i = 0; i < 100; i++) {
            arr[i]= rd.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
}
