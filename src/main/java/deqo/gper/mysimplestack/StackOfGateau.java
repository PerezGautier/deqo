package deqo.gper.mysimplestack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackOfGateau implements ISimpleStack {

    Gateau[]tab;
    int capacity;
    int last;

    public StackOfGateau(int capacity) {
        this.capacity = capacity;
        this.last = -1;
        tab = new Gateau[capacity];
    }

    @Override
    public boolean isEmpty() {
        return (this.last==-1);
    }

    @Override
    public int getSize() {
        return this.last;
    }

    @Override
    public void push(Gateau gateau) {
        if(this.last == this.tab.length){
            throw new Error("La pile de gateau est pleine!");
        }
        last ++;
        tab[last] = gateau;
    }

    @Override
    public Gateau peek() throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return tab[last];
    }

    @Override
    public Gateau pop() throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Gateau temp = tab[last];
        tab[last] = null;
        last--;
        return temp;
    }

    @Override
    public String toString() {
        return "StackOfGateau{" +
                "tab=" + Arrays.toString(tab) +
                ", capacity=" + capacity +
                ", last=" + last +
                '}';
    }
}
