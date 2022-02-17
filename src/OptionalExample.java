public class OptionalExample {

    public static void main(String[] args) {


     //   Employee employee = new Employee(1,"Tiraj","ndjsdnsjn", Arrays.asList("3434343","454545"));

//        Optional<Object> emptyOptional =  Optional.empty();
//    //    System.out.println(emptyOptional);
//
//        //-------------------------------------------------------
//        Optional<String> ofOptional =  Optional.of(employee.getEmail());
//       // System.out.println(ofOptional);
//
//        //-------------------------------------------------------
//
//         Optional<String> opt1 = Optional.ofNullable(employee.getEmail());
//       // System.out.println(opt1);
        //-------------------------------------------------------
//
//       Optional<String> opt2 = Optional.ofNullable(employee.getEmail());
//        System.out.println(opt2.orElse("Hello world"));
//
        System.out.println( getEmployeeByEmail("samir@gmail.com"));
       // getEmployeeByEmail("pqr");

    }
    public static Employee getEmployeeByEmail(String mail){

        return EkartaDatabase.getALlEMployee().stream().filter(employee -> employee.getEmail().equals(mail)).findAny().orElse(new Employee());
    }




}
