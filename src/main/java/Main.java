import org.time2java.cunncurency.BlockingQueueimpl;
import org.time2java.cunncurency.Consumer;
import org.time2java.cunncurency.Producer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main().work();
    }

    private void work() {
        BlockingQueueimpl blockingQueueimpl = new BlockingQueueimpl();
        Producer p = new Producer(blockingQueueimpl);

        List<Consumer> consumers = new ArrayList<Consumer>() ;
        int consumerCount = 20 ;
        while (consumerCount-- > 0){
            consumers.add(new Consumer(blockingQueueimpl)) ;

        }

        try {
            p.join();
            for(Consumer iter : consumers){
                iter.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Consumer.list.size());
    }
}
