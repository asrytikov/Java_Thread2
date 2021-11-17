import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class TimerCounter extends TimerTask {

    private static int i;

    @Override
    public void run() {
        System.out.println(++i);
        try {
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException exp){
            exp.printStackTrace();
        }
        System.out.println("\t" + i);
    }
}
