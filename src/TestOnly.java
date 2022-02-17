import java.util.concurrent.*;

public class TestOnly {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

         ExecutorService service = Executors.newFixedThreadPool(10);
          service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("*----This is just the demo ------*");
            }
        });
        System.out.println("--------------1------------");
        //---------------------------------------------------



        Future<Integer> future = service.submit(new myCallable() {
        });
        System.out.println(future.get());
        System.out.println("-------------2-------------");
        //---------------------------------------------------

        Future<Integer> future1 = service.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
        System.out.println(future1.get());


        System.out.println("===========================================================");
        CompletableFuture<Integer> completableFuture = new CompletableFuture<>();
        Integer f3 = completableFuture.get();
        boolean f1= completableFuture.complete(4);





    }

    static class myCallable implements  Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            return 100;
        }
    }
}
