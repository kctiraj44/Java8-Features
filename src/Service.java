import java.util.List;
import java.util.stream.Collectors;

public class Service {


    public static void main(String[] args) {

       List<Employee> employees = EkartaDatabase.getALlEMployee();
       List<String > emails =   employees.stream().map(employee -> employee.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

        //----------------------------------------------------------------------
        List<String> phones =  employees.stream().flatMap(employee -> employee.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phones);
        //----------------------------------------------------------------------

         List<List<String>> phoness=  employees.stream().map(employee -> employee.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoness);




    }


}
