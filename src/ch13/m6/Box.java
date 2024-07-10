package ch13.m6;

public class Box<T, U> {

    public <T, U> void printInfoGeneric(T t, U u) {
        System.out.print("printInfoGeneric(T t, U u) :: t= " + t + " | 클래스=" + t.getClass().getSimpleName());
        System.out.println(" || u= " + u + " | 클래스=" + u.getClass().getSimpleName());
    }

}
