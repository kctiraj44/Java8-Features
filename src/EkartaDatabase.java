import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartaDatabase {


    public static List<Employee> getALlEMployee() {


        return  Stream.of(
                new Employee(1,"Tiraj","tiraj@gmail.com", Arrays.asList("3434343","454545")),
                new Employee(2,"dipesh","dipesh@gmail.com",Arrays.asList("3434343","454545")),
                new Employee(3,"samir","samir@gmail.com",Arrays.asList("3434343","454545"))).collect(Collectors.toList());



    }
}
