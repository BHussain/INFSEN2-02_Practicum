package infsen02.designpatterns.visitor;


/**
 * Concrete implementation of the Option interface.
 * Represents a value.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 * @param <T> The stored value's type.
 */
public class Some<T> implements Option<T> {

	private T value;
	
	public Some(T value) {
		this.value = value;
	}

	/**
	 * Visits the value of the option.
	 * Uses the supplied visitor to return the stored value.
	 */
	@Override
	public <U> U visit(Visitor<T, U> visitor) {
		return visitor.onSome(value);
	}
	
}