package interfaces;


/**
 * Interface that represents visiting the value of an Option.
 * 
 * @author Basit, Michelle, Randa
 *
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