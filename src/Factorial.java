import TerminalIO.*;

public class Factorial {
    
    public static void main (String[] args){
        
        KeyboardReader kr = new KeyboardReader();
        double f;
        
        while(true){
            f = kr.readDouble("Enter a number between 1 to 15: ");
            if(f<= 15 && f>= 1 )
                break;
            }
        System.out.println(f + " The factorial is equal to " + factorial(f));
    }
    public static double factorial (double s){
        if(s==1)
            return 1;
        else
            return s*factorial(s-1);
    }
    
}