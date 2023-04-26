package Test;
import java.io.*;
public class CFG {


    public static void main (String[] args)
    {
        // String s set an empty string  and calling getLength()
        int s = 0;
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught");
        }

        // String s set to a value and calling getLength()
        s = 6;
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught");
        }

        // Setting s as null and calling getLength()
        s = Integer.parseInt(null);
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught");
        }
    }

    // Function to return length of string s. It throws
    // IllegalArgumentException if s is null.
    public static int getLength(int s)
    {
        if (s == Integer.parseInt(null))
            throw new IllegalArgumentException("The argument cannot be null");
        return s;
    }

}
