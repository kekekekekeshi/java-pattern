package ink.cecece.pattern.action.iterator;

import org.junit.Test;

/**
 * 迭代器模式
 */
public class IteratorTest {

    @Test
    public void test(){

        Aggregation aggregation = new Aggregation();

        for(int i=0;i<10;i++)
            aggregation.add(i+"a");

        Iterator iterator = aggregation.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getCurrentObject());
            iterator.next();
        }
    }
}
