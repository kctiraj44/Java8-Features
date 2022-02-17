import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandling_Part2 {

    public static void main(String[] args) {

        List<String > list = Arrays.asList("1","232","a");
        List<Integer> list1 = Arrays.asList(1,2,44,5,0);

        list.forEach(handleConsumer(t->System.out.println(Integer.parseInt(t))));
        System.out.println("*----------------------------------------------*");

        list.forEach((handleException(t->System.out.println(Integer.parseInt(t)),ClassCastException.class)));
        System.out.println("*----------------------------------------------*");

        list1.forEach(handleException(t->System.out.println(10/t),ArithmeticException.class));



    }

    public static Consumer<String > handleConsumer(Consumer<String> payload){
        return t->{
            try{
                payload.accept(t);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        };
    }

static <Target ,ExObj extends Exception> Consumer<Target> handleException(Consumer<Target> consumertarget ,Class<ExObj> objClass){
   return obj->{
       try {
           consumertarget.accept(obj);
       }
       catch (Exception ex){
           try {
               ExObj obj1 = objClass.cast(ex);
           System.out.println(obj1.getMessage());
           }
           catch (ClassCastException e){
               System.out.println(e.getMessage());
           }
       }
   } ;

}

    }

