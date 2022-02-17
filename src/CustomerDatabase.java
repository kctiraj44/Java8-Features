import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabase {


    public static List<Custonmer> getCustomer(){

        return Stream.of(
                new Custonmer(1,"Tiraj","A",78000),
                new Custonmer(1,"Tiraj","A",80000),
                new Custonmer(2,"sam","B",78000),
                new Custonmer(3,"raj","C",78000)
        ).collect(Collectors.toList());


    }

    public static List<Custonmer> getCustomerStream(){

        List<Custonmer>  custonmers = new ArrayList<>();
        for (int i=0;i<=1000;i++){
            custonmers.add(new Custonmer(i,"Customer"+i,"A",Double.valueOf(new Random().nextInt(1000*100))));
        }
        return custonmers;

    }




}
