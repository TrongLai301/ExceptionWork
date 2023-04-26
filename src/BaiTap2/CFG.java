package BaiTap2;

import java.io.*;

public class CFG {
    public static void main(String[] args) {
        //IllegalArgumentException (Ngoại lệ đối số bất hợp pháp)
        //Khai báo biến s kiểu dữ liệu String và giá trị mặc định là rỗng
        String s = "";
        try
        {
            System.out.println(getLength(s));
        }catch(IllegalArgumentException ex)

        {
            System.out.println("IllegalArgumentException caugth");
        }

        s="1555555555";
        try

        {
            System.out.println(getLength(s));
        }catch(IllegalArgumentException e)

        {
            System.out.println("IllegalArgumentException caugth");
        }

        s=null;
        try

        {
            System.out.println(getLength(s));
        }catch(IllegalArgumentException e)

        {
            System.out.println("IllegalArgumentException caugth");
        }
    }
    public static int getLength(String s) {
        if (s == null) {
            throw new IllegalArgumentException("The argument cannot be null");
        }
        return s.length();
    }
}



//Hàm getLength khởi tạo để lấy giá trị có tham số truyền vào là s
// và sẽ thực thi khối lệnh bên trong nếu thỏa mãn điều kiện


//Trương trình trên in ra: 0 , 13 , IllegalArgumentException caugth

//Ngoại lệ IllegalArgumentException xảy ra khi truyến đối số không phù hợp cho phương thức