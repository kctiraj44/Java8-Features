import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BifunctionExamplepart2 {

    public static void main(String[] args) {

        Map<String, Integer> map =new HashMap<>();
        map.put("basant",1000);
        map.put("tiraj",2000);
        map.put("samir",3000);

        BiFunction<String,Integer,Integer> biFunction = new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String s, Integer vallue) {
                return vallue+1000;
            }
        };

        map.replaceAll(biFunction);
        System.out.println(map);




    }
}
