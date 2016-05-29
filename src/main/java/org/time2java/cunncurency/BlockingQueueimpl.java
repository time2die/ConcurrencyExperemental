package org.time2java.cunncurency;

public class BlockingQueueimpl {

    static int i = 1000 ;

    public Object get(){
        if( i -- > 0)
            return i ;
        return null ;
    }

    public void add(Object o){

    }

}
