
/**
 * Write a description of class recursive_practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class recursive_practice
{
    //static public int x = 0;
    public static void main (String []args)
    {
        method2(5);
        method4(12,12 );
    }


public static void method2(int num)
{
    //int x = 0;
    if (num <= -1)
    {
        return;
    }
    else 
        method2(num - 1); 
        System.out.print(num + " ");  
   
   
    
}
   


public static boolean method4(int divisor, int prime)
{
 divisor--;
 if (divisor == 1)
 return true;
 
 if (prime%divisor == 0)
 return false;
 
 return method4(divisor, prime);
}

}