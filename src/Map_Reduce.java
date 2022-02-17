import java.util.Arrays;
import java.util.List;

public class Map_Reduce {

    public static void main(String[] args) {

  List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
    Integer sum =   list.stream().mapToInt(i->i).sum();
        System.out.println(sum);

       Integer sum1 = list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum1);
        System.out.println("*------------------*");
        System.out.println( list.stream().reduce(Integer::sum).get());

        System.out.println("*------------------*");
        System.out.println(list.stream().reduce(Integer::max).get());

        System.out.println("*------------------*");
        System.out.println(list.stream().reduce(Integer::min));

        System.out.println("*------------------*");
        Integer maxvalue = list.stream().reduce(0,(a,b)->a >b ?a :b);
        System.out.println(maxvalue);

    }
}
