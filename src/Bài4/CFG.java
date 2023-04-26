package Bài4;

public class CFG {
    public static void main(String[] args) {
        String str = null;
        String message = (str == null) ? "" : str.substring(0, 5);
        System.out.println(message);

        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0,5);
        System.out.println(message);

    }
}

//Khi chạy đoạn mã trên ở biến str đầu tiên giá trị là rỗng
//còn str thứ 2 có giá trị là Geeks
//trong toán tử 3 ngôi trên, nếu message có str là null thì gán giá trị là rỗng
//còn không thì sẽ lấy giá trị trong chuỗi đó substring (vị trí bắt đầu lấy, số lượng)


//cú pháp toán tử 3 ngôi
//Biến = (Điều kiện) ? Khối lệnh 1(true) : Khối lệnh 2(false);