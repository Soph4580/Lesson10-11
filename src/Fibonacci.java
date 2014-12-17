import TerminalIO.*;

public class Fibonacci {
    
    public static void main (String[] args){
        
        KeyboardReader kr = new KeyboardReader();
        int a;
        
        while(true){
            a = kr.readInt("Enter a number from 1 to 15");
            if(a<=15&& a>=1)
                break;
        }
        System.out.println(fibonacci(a) + " is the fibonacci number" + a);
    }
    
    public static int fibonacci (int b){
        if(b==1)
            return 1;
        else
            return fibonacci(b-1)+fibonacci(b-2);
    }
    
}
