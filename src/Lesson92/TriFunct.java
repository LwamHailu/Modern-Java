package Lesson92;


@FunctionalInterface
public interface TriFunct<S,T,U,R> {
	R apply(S s, T t, U u);
}
