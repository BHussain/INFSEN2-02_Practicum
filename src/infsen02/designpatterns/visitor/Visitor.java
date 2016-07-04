package infsen02.designpatterns.visitor;


/**
 * BEHAVIOURAL PATTERN - VISITOR
 * Separates an algorithm from an object structure by moving the hierarchy of methods into one object.
 * 
 * Interface that represents visiting the value of an Option.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 * @param <T> The stored value's type.
 * @param <U> The returned value.
 */
public interface Visitor<T, U> {

	/**
	 * Called when the option is a Some object.
	 * 
	 * @param value The supplied value.
	 * @return The visited value.
	 */
	public U onSome(T value);
	
	/**
	 * Called when the option is a None object.
	 * 
	 * @return The visited value.
	 */
	public U onNone();
	
}