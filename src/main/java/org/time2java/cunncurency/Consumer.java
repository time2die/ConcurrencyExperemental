package org.time2java.cunncurency;

/**
 * Created by time2die on 29.05.16.
 */
public class Consumer extends BlockingQueueUser {
    public Consumer(BlockingQueueimpl blockingQueueimpl) {
        super(blockingQueueimpl);
        start();
    }

    @Override
    public void run(){
        Object object = null ;

        while( (object = blockingQueueimpl.get()) != null){
//            System.out.println(this.getId()+" object: " + object);
            list.add(object);
        }

    }
}
