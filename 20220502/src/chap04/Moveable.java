package chap04;

public interface Moveable {
	void move(int x, int y);
	default void method() {};
}
