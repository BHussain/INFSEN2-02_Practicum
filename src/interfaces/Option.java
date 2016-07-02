package interfaces;


/**
 * Interface representing an option.
 * The value of the option can be visited with a visitor.
 * 
 * @author Basit, Michelle, Randa
 *
 * @param <T> The stored value's type.
 */
public interface Option<T> {

	/**
	 * Uses the supplied visitor to return the stored value.
	 */
	public <U> U visit(Visitor<T, U> visitor);
	
}