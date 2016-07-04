package infsen02.designpatterns.iterator;

import java.util.List;

import infsen02.designpatterns.visitor.None;
import infsen02.designpatterns.visitor.Option;
import infsen02.designpatterns.visitor.Some;
import infsen02.interfaces.GUIElement;


/**
 * Concrete implementation of the Iterator interface.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 */
public class GUIElementIterator implements Iterator<GUIElement> {

	private List<GUIElement> GUIElements;
	private int index = -1;
	
	public GUIElementIterator(List<GUIElement> GUIElements) {
		this.GUIElements = GUIElements;
	}
	
	/**
	 * Gets the next item in a list.
	 * This is either a Some or a None.
	 * 
	 * @return Some value if the list contains something, None value if not.
	 */
	@Override
	public Option<GUIElement> next() {
		if(GUIElements.size() > index + 1) {
			index++;
			Some<GUIElement> some = new Some<GUIElement>(GUIElements.get(index));
			return some;
		}
		None<GUIElement> none = new None<GUIElement>();
		return none;
	}

}
