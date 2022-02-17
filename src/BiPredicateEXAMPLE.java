import java.util.concurrent.Callable;
import java.util.function.BiPredicate;

class abc implements Callable<String>{

    @Override
    public String call() throws Exception {
        return null;
    }
}

class aapple implements Runnable{

    @Override
    public void run() {

    }
}


public class BiPredicateEXAMPLE  {

    public static void main(String[] args) {


        BiPredicate<String,String> biPredicate = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.equals(s2);
            }
        };
        System.out.println(biPredicate.test("mam","mam"));

        BiPredicate<String,String> biPredicate1=(s1,s2)->{
            return
                    s1.equals(s2);
        };
        System.out.println(biPredicate1.test("m","m"));
    }
}
