import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ExampleBiFunctionD implements BiFunction<List<Integer>,List<Integer>,List<Integer>>{

    @Override
    public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
        return
                Stream.of(list1,list2)
                        .flatMap(List::stream)
                        .distinct()
                        .collect(Collectors.toList());
    }
}

public class ExampleBifucntionDemo  {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,36,44,5,76,62,7,7,7,8);
        List<Integer> list2 = Arrays.asList(2,5,6,7,8,8,9,10,11);
        ExampleBiFunctionD exampleBiFunctionD = new ExampleBiFunctionD();
        System.out.println(exampleBiFunctionD.apply(list1,list2));
        System.out.println("------------------------------------");
        //-------------------------------------------------------------

        BiFunction<List<Integer>,List<Integer>,List<Integer>> e2 = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> list, List<Integer> list2) {
                return Stream.of(list,list2)
                        .flatMap(List::stream)
                        .distinct()
                        .collect(Collectors.toList());
            }
        };
        System.out.println( e2.apply(list1,list2));

        System.out.println("------------------------------------");
        //-------------------------------------------------------------

        BiFunction<List<Integer>, List<Integer>, List<Integer>> e3 =(l1,l2)->{
            return
            Stream.of(l1,l2)
                    .flatMap(List::stream)
                    .distinct()
                    .sorted(new Comparator<Integer>() {
                        @Override
                        public int compare(Integer o1, Integer o2) {
                            return o2-o1;
                        }
                    })
                    .collect(Collectors.toList());
        };


        System.out.println(e3.apply(list1,list2));

    }



}
