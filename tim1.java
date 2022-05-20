/** run the given code on bluej*/
import java.util.Calendar;/*importing required libraries for operations concerning real life time  */
import java.util.Date;

public class tim1
{
   long currTime()//function tha returns current no. of milliseconds fron a reference point
   {
       Calendar c = Calendar.getInstance();
      //Returns current time in millis
      long n = c.getTimeInMillis(); 
      return n;
    }
   void main()
   {
     long num= currTime();
      //System.out.println(num+ "      ");
      int i;
    
      for(i=0; ;i++)
      {
        long num1=currTime();
          //System.out.print(num1+ "      ");
          if((num1-num)>=900 && (num1-num)<=1100)
          break;
          //System.out.println(num1-num + "     "+i);
        }
        System.out.println(i);
        System.exit(0);//terminates the code
}
}