import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFuture_runAsync {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(10);

        CompletableFuture future= CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                System.out.println("*-----This is just a example---*");
                System.out.println("Thread : " + Thread.currentThread().getName());
            }
        });
        System.out.println(future.get());
        System.out.println("----------------------------------------------------------");
        //---------------------------------------------------------------------------------

        CompletableFuture future1= CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                System.out.println("*-----This is just a example---*");
                System.out.println("Thread : " + Thread.currentThread().getName());
            }
        },service);




    }


}
