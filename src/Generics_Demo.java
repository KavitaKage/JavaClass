//Generic Constructor Example
class Studpair<T,U>
{
    private T name;
    private U rollnumber;
    public Studpair(T nobj,U robj)
    {
        this.name=nobj;
        this.rollnumber=robj;
    }
    public T displayName()
            {
                return name;
            }
     public U displayNumber()
            {
                return rollnumber;
            }
     
}        
        
public class Generics_Demo {
    public static void main(String[] args) {
        Studpair<String,Integer> studobj =new Studpair<String,Integer>("kavi",1);
        System.out.println(studobj.displayName());
        System.out.println(studobj.displayNumber());
    }
    
}
