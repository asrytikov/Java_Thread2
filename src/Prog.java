import java.util.List;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Prog {

    public static void main(String[] args) throws InterruptedException {
        /*Thread talk = new Thread(new TalkThread());
        //talk.wait(1000);
        talk.start();
        System.out.println(talk.getState());
        talk.wait();*/

     //   List<Double> list = IntStream.range(0, 10000000).asDoubleStream().boxed().collect(Collectors.toList());
        /*for(Integer l:list){
            System.out.print(l + " ");
        }
        System.out.println();*/
    /*    ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> future = executorService.submit(new ActCall(list));
        executorService.shutdown();

        try{
            System.out.println(future.get());
        }catch (Exception exp){
            exp.printStackTrace();
        }


        int[] numbers = {-5, -4, -3, -2, -1, 0, 1,2,3,4,5 };
        int count = 0;
        for (int i : numbers) {
            if (i>0){
                count++;
            }
        }
        System.out.println(count);

        long count2 = IntStream.of(numbers).filter(w -> w>0).count();
        System.out.println(count2);

     */
        Timer timer = new Timer();
        timer.schedule(new TimerCounter(), 100, 3000);
    }

}
