import java.util.Iterator;
import java.util.function.Consumer;

public class MyIterator<E> implements Iterator<E> {

    private int index = 0;
    E[] values;

    MyIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super E> action) {
        Iterator.super.forEachRemaining(action);
    }
}
