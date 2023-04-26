package BaiTap5;

public class Main {
    public static void main(String[] args) {
        try{
            throw new MyException("Lỗi này do tôi tạo ra");
        } catch (MyException ex){
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}


//Đoạn mã trên có 2 lớp, lớp MyException là lớp đại diện cho ngoại lệ do người dùng định nghĩa
//Lớp Main thì để chạy lớp MyException trên
//khi chạy ở try, nó sẽ ném ngoại lệ vào MyException với thông báo Lỗi này do tôi tạo ra
//sau đó phần catch sẽ bắt lỗi và in ra thông báo Caught và in ra chuỗi thông báo lỗi ở trên 