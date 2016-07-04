package infsen02.designpatterns.iterator;

import infsen02.designpatterns.visitor.Option;


/**
 * BEHAVIOURAL PATTERN - ITERATOR
 * Accesses the elements of an object sequentially without exposing its underlying representation.
 * 
 * Interface that represents accessing elements in a list.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 * @param <T> The stored value's type.
 */
public interface Iterator<T> {
	
	/**
	 * Gets the next item in a list.
	 * 
	 * @return The Option<T> value.
	 */
	public Option<T> next();
	
}