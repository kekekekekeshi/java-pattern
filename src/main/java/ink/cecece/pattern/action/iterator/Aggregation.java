package ink.cecece.pattern.action.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 聚合类
 */
public class Aggregation {

    private List<Object> list = new ArrayList<>();

    public void add(Object object){
        this.list.add(object);
    }

    public void remove(Object object){
        this.list.remove(object);
    }

    public Iterator createIterator(){
        return  new DemoIterator();
    }

    private class DemoIterator implements Iterator{

        //游标记录位置
        private int cursor = 0;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if(cursor == list.size()) return;
            cursor += 1;
        }

        @Override
        public boolean hasNext() {
            return cursor<list.size()?true:false;
        }

        @Override
        public boolean isFirst() {
            return cursor == 0?true:false;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size()-1?true:false;
        }

        @Override
        public Object getCurrentObject() {
            return list.get(cursor);
        }
    }

}
