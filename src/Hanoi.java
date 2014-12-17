import TerminalIO.*;

public class Hanoi {
    static int nummoves =0;
    
    public static void main (String[]args){
        KeyboardReader kr = new KeyboardReader ();
        int numrings= kr.readInt("Enter a number of rings between 3 & 10: ");
        if(numrings>3 || numrings<10){
            System.out.println("Invalid input - The program will now end");
            return;
        }
        move(numrings, 1, 3, 2);
        System.out.println("Total moves = " + nummoves);
    }
    
    public static void move(int n, int j, int i, int k){
        
    }
    
}
