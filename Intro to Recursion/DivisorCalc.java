
/**
 * Write a description of class DivisorCalc here.
 *
 * @author (Samantha Christian)
 * @version (5/11/21)
 */
public class DivisorCalc
{
    

    /**
     * Constructor for objects of class DivisorCalc
     */
    
        public static int gcd (int num1, int num2)
        {
          if (num2 <= num1 && num2%num1 == 0)
            {
            return num2;
            }
            
          else if(num1<num2)
          {
          return gcd(num2, num1);
        }
          else 
          return gcd(num2, num1%num2);
        
    }

}


