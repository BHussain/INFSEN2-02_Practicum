package infsen02.designpatterns.factory;

import infsen02.enums.GUIElementType;
import infsen02.interfaces.GUIElement;


/**
 * Class that creates different GUIElement objects.
 * What element should be created is determined by the supplied GUIElementType enum.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 */
public class GUIElementFactory extends AbstractFactory {

	/**
	 * Creates a new GUIElement object of a specified type.
	 * 
	 * @param type The type of GUIElement that is to be created.
	 * @param value The supplied value string.
	 * @param colour The supplied colour value.
	 * @return The created GUIElement object.
	 */
	@Override
	public GUIElement create(GUIElementType type, String value) {
		if(type.equals(GUIElementType.PANEL)) {
			PanelFactory factory = new PanelFactory();
			return factory.create();
		} else if(type.equals(GUIElementType.BUTTON)) {
			ButtonFactory factory = new ButtonFactory();
			return factory.create(value);
		} else if(type.equals(GUIElementType.LABEL)) {
			LabelFactory factory = new LabelFactory();
			return factory.create(value);
		}
		return null;
	}
	
}