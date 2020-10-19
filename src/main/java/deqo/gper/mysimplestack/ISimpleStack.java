package deqo.gper.mysimplestack;

import java.util.EmptyStackException;

public interface ISimpleStack{

    boolean isEmpty();

    int getSize();

    void push(Gateau gateau);

    Gateau peek() throws EmptyStackException;

    Gateau pop() throws EmptyStackException;

}
