package infsen02.designpatterns.visitor;


/**
 * Interface representing an option.
 * The value of the option can be visited with a visitor.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 * @param <T> The stored value's type.
 */
public interface Option<T> {

	/**
	 * Visits the value of the option.
	 * Uses the supplied visitor to return the stored value.
	 */
	public <U> U visit(Visitor<T, U> visitor);
	
}