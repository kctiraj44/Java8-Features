import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {


    public static void main(String[] args) {
       List<Custonmer> custonmers = CustomerDatabase.getCustomer();

        Double salary = custonmers.stream().filter(custonmer -> custonmer.getGrade().equals("A"))
               .map(custonmer -> custonmer.getSalary())
               .mapToDouble(i->i)
               .average()
               .getAsDouble();

        System.out.println(salary);
//----------------------------------------------------------------
        Double max =  custonmers.stream().filter(custonmer -> custonmer.getGrade().equals("A"))
                .map(custonmer -> custonmer.getSalary())
                .mapToDouble(i->i)
                .max()
                .getAsDouble();
        System.out.println(max);

//----------------------------------------------------------------
        List<Double> salaries = custonmers.stream().filter(custonmer -> custonmer.getGrade().equals("A"))
                .map(custonmer -> custonmer.getSalary())
                .collect(Collectors.toList());
        System.out.println(salaries);

        //----------------------------------------------------------------

        System.out.println( custonmers.stream().filter(custonmer -> custonmer.getGrade().equals("A"))
                .map(custonmer -> custonmer.getSalary())
                .count());

        //----------------------------------------------------------------
          Double sal=  custonmers.stream().filter(custonmer -> custonmer.getGrade().equals("A"))
                .map(custonmer -> custonmer.getSalary())
                   .mapToDouble(i->i)
                   .average()
                   .getAsDouble();
        System.out.println(sal);


        //--------------------------------------------------


    }
}
