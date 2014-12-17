import TerminalIO.*;

public class Fibonacci {
    
    public static void main (String[] args){
        
        KeyboardReader kr = new KeyboardReader();
        int a;
        
        while(true){
            a = kr.readInt("Enter a number from 1 to 15: ");
            if(a<=15&& a>=1)
                break;
        }
        String ending;
        if (a==1) ending="st";
        else if (a==2) ending="nd";
        else if (a==3) ending= "rd";
        else ending="th";
        System.out.println(fibonacci(a) + " is the " + a + ending + " fibonacci number.");
    }
    
    public static int fibonacci (int b){
        if(b==1 || b==2)
            return 1;
        else
            return fibonacci(b-1)+fibonacci(b-2);
    }
    
}
