import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandling {
    public static void main(String[] args) {

        List<String > list = Arrays.asList("23","6755","xyz");
   //     list.forEach(t->System.out.println(Integer.parseInt(t)));
//---------------------------------------------------------------------
        list.forEach(t->{
            try{
                System.out.println(Integer.parseInt(t));
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        });
        System.out.println("*---------------------------");
//---------------------------------------------------------------------

        list.forEach(getExceptonHandle(t->System.out.println(Integer.parseInt(t))));
        System.out.println("*---------------------------");

        list.forEach(handle(t->System.out.println(Integer.parseInt(t)),ClassCastException.class));
    }

    public static Consumer<String> getExceptonHandle(Consumer<String> a){
        return t->{
            try {
                a.accept(t);

            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        };
    }


    static <Target,exObj extends Exception> Consumer<Target> handle(Consumer<Target> targetConsumer, Class<exObj> objClass){
        return t->{
            try {
                targetConsumer.accept(t);

            }
            catch (Exception ex){
               try {
                   exObj exa = objClass.cast(ex);
                   System.out.println(exa.getMessage());
               }
               catch (ClassCastException e){
                   System.out.println(e.getMessage());
               }
            }
        };

    }

}
