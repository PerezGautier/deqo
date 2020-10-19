package deqo.gper.mysimplestack;

import java.util.EmptyStackException;

public interface ISimpleStack{

    public boolean isEmpty();

    public int getSize();

    public void push(Gateau gateau);

    public Gateau peek() throws EmptyStackException;

    public Gateau pop() throws EmptyStackException;

}
