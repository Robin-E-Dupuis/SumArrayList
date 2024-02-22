import java.util.ArrayList;

/**
 *
 * @author Robin Dupuis
 */
public class sumArrayList {
    public static double sum(ArrayList<Double> list){
        double sum=0.0;
        for(int i=0; i<list.size(); ++i){
            sum+=list.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(9.5);
        list.add(20.5);
        list.add(4.45);
        list.add(5.55);
        System.out.println(sum(list));
    }
}
