package BaiTap5;

public class MyException extends Exception{
    public MyException(String s){
        //Gọi constructor của ngoại lệ cha
        super (s);
    }
}
