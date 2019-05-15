package ocp;
/**
 * Interface specification to validate if one condition is satisfied 
 * @author thiarlles.a.gomes
 *
 * @param <T>
 */

public interface Specification<T> {
	
	boolean isSatisfied(T item);

}
