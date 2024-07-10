package ch13.m3;

public interface Player<T> {

    public T get();

    public void set(T t);

    public void run();

    public void stop();

}
