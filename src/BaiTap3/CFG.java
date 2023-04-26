package BaiTap3;

import java.io.*;

public class CFG {
    public static void main(String[] args) {
        //khai báo biến ptr là null kiểu dữ liệu String
        String ptr = null;
        try {
            if (ptr.equals("gfg")) {
                System.out.println("same");
            } else {
                System.out.println("Not same");
            }
        } catch (NullPointerException ex) {
            System.out.println("Caught NullPointerException");
        }
    }
}

//Bước 1: Khi chạy đoạn mã sẽ báo lỗi vì ptr là null nên không thể gọi được điều kiện trên
//Giải thích: nếu giá trị ptr có chuỗi là gfg thì sẽ in ra màn hình là same còn không sẽ in ra Not same//

//Bước 2: ở đây nó sẽ bắt lỗi NullPointerException và in ra màn hình NullPointerException Caught
// vì ở đây là một ngoại lệ, giá trị của ptr là null

//Bước 3: NullPointerException xảy ra khi tham chiếu tới object nhưng khong có chỗ trống vị trí nào trong bộ nhớ

//Bước 4: sẽ in ra Caught NullPointerException, vì tương tự bước 2
