package ThucHanh5;

public class ThrowExcep {
    static void fun() {
        try{
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e){
            System.out.println("Caught inside fun().");
            throw e;
        }
    }
    public static void main(String[] args)  {
        try{
            fun();
        }catch(NullPointerException e){
            System.out.println("Caught in main.");
        }
    }
//static void fun()
//{
//    try
//    {
//        throw new NullPointerException("demo");
//    }
//    catch(NullPointerException e)
//    {
//        System.out.println("Caught inside fun().");
//        throw e; // rethrowing the exception
//    }
//}
//
//    public static void main(String args[])
//    {
//        try
//        {
//            fun();
//        }
//        catch(NullPointerException e)
//        {
//            System.out.println("Caught in main.");
//        }
//    }

}


//lệnh throw trong đoạn mã trên dùng để ném ngoại lệ, khi một phương thức không thể bắt được ngoại lệ

//throw new NullPointerException("demo"); ném ngoại lệ mới có tên ngoại lệ là NullPointerException và thông báo là demo

//dùng để ném ngoại lệ khi ở phần phương thức trên bắt được ngoại lệ nhưng không giải quyết triệt để được

//Đoạn mã trên in ra Caught inside fun().
//Caught in main. vì phương thức fun() đã bắt được ngoại lệ sau đó xử lý rồi ném sang main() để xử lý