package org.time2java.cunncurency;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by time2die on 29.05.16.
 */


public class BlockingQueueUser extends Thread {
    protected BlockingQueueimpl blockingQueueimpl;
    public static ConcurrentLinkedQueue<Object> list = new ConcurrentLinkedQueue<>() ;

    public BlockingQueueUser(BlockingQueueimpl blockingQueueimpl) {
        this.blockingQueueimpl = blockingQueueimpl;
    }
}
