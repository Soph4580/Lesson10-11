public class ISSstudent implements Comparable {

    private String name;
    private String address;
    private int id;
    
    public ISSstudent(String n, String a, int i){
        name=n;
        address=a;
        id=i;
    }
    
    public int getID(){
        return id;
    }
    
    public String toString(){
        String str="Name:\t" + name;
        str += "\nAddress:\t" + address;
        str+= "\n ID Number:\t" + id;
        return str;
    }
    
    public int compareTo(Object o) {
        int difference= id-((ISSstudent)o).getID();
        return difference;
    }
    
}
