import java.util.List;
import java.util.concurrent.Callable;

public class ActCall  implements Callable<Double> {
    private List<Double> integers;

    public ActCall(List<Double> integers){
        this.integers = integers;
    }

    @Override
    public Double call() {
        double sum =0;
        for(double number : integers){
            sum += number;
        }
        return sum;
    }
}
