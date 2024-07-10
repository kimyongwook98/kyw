package ch13.m8;

public class Box<T> extends Fashion{
	T data;
	public Box() {
		
	}
	
	public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void printInfo() {
        data.printInfo();
    }
}
