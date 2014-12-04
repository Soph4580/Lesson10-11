import java.util.ArrayList;

public class Peoplelist {

    
    public static void main(String[] args) {
        ArrayList People = new ArrayList();
        Person p = new Person("Bob", 32);
        People.add(p);
        People.add(new Person("John", 25));
        //Add Sydney to front of line
        People.add(0,new Person("Sydney", 27));
        //Print all in array list
        for (int x=0;x<People.size();x++){
            p = (Person) People.get(x);
            System.out.println(p);
        }
        //Remove bob
        People.remove(1);
         for (int x=0;x<People.size();x++){
            p = (Person) People.get(x);
            System.out.println(p);
        }
         
    }
    
}
