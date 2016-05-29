package org.time2java.cunncurency;

import java.util.Random;

/**
 * Created by time2die on 29.05.16.
 */
public class Producer extends BlockingQueueUser {

    public Producer(BlockingQueueimpl blockingQueueimpl) {
        super(blockingQueueimpl);
        start();
    }

    @Override
    public void run(){
       Random r = new Random() ;
        int iterCount = r.nextInt(2000) ;
        while (iterCount > 0){
            blockingQueueimpl.add(r.nextInt(2000));
            iterCount -- ;
        }
        blockingQueueimpl.add(null);

    }
}
