import java.util.List;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {

        long start = 0;
        long end  =0;
//        start= System.currentTimeMillis();
//        IntStream.range(1,10).forEach(t->System.out.println(t));
//        end= System.currentTimeMillis();
//        System.out.println("Plain stream took time :"+(end-start));

        System.out.println("*-----------------------------------------");

        List<Custonmer> employees =CustomerDatabase.getCustomerStream();
        start =System.currentTimeMillis();
        double salary1= employees.stream().map(custonmer ->custonmer.getSalary()).mapToDouble(i->i).average().getAsDouble();
       end= System.currentTimeMillis();
        System.out.println("Regualr stream  time:"+(end-start) +":-Salary:-"+salary1);

        System.out.println("*-----------------------------------------");
        start =System.currentTimeMillis();
        double salray2= employees.parallelStream().map(Custonmer::getSalary).mapToDouble(i->i).average().getAsDouble();
        end= System.currentTimeMillis();
        System.out.println("Parallel stream  time:"+(end-start)+":-Salary :-"+salray2);


        System.out.println("*-----------------------------------------");



    }
}
