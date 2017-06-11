package Lesson92;
@FunctionalInterface
public interface QuadFuction<T,S,U,V,R> {
	R apply(T t,S s,U u,V v);

}
