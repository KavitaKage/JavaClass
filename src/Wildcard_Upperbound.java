
import static com.sun.javafx.util.Utils.sum;
import java.util.Arrays;
import java.util.List;


public class Wildcard_Upperbound {
    public static void main(String[] args) {
        List<Integer> list1=Arrays.asList(1,2,3,4);
        System.out.println("sum:"+sum(list1));
        
        List<Double> list2=Arrays.asList(1.1,2.2,3.3,4.4);
        System.out.println("sum:"+sum(list2));
        
    }
    private static double sum(List<? extends Number> list)
    {
        double sum=0.0;
        for (Number i : list) {
            
           sum+=i.doubleValue();
           
        }
        return sum;
        
    }
}
