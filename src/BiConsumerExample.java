import java.util.concurrent.Callable;
import java.util.function.BiConsumer;

public class BiConsumerExample implements BiConsumer<String,Integer> {

    @Override
    public void accept(String s, Integer integer) {
        System.out.println("Hello:"+s+"-"+integer);
    }

    public static void main(String[] args) {
        BiConsumerExample example = new BiConsumerExample();
        example.accept("Tiraj",809000);
        //--------------------------------------------------

        BiConsumer<String,Integer> biConsumer = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println("Hello:"+s+"-"+integer);
            }
        };
        biConsumer.accept("Ram",786788);

        //--------------------------------------------------

        BiConsumer<String , Integer> biConsumer1 = (s,i)->{
            System.out.println("Hello:"+s+"-"+i);
        };
        biConsumer1.accept("Hari",567767667);
        //
        Callable<Integer> c1= new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return null;
            }
        };


        Runnable c2 =new Runnable() {
            @Override
            public void run() {

            }
        };
        System.out.println("");

        int count =Runtime.getRuntime().availableProcessors();
        System.out.println(count);

    }



}
