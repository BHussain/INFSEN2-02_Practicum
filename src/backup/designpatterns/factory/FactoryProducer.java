package backup.designpatterns.factory;

import backup.enums.FactoryType;

public class FactoryProducer {

	public static AbstractFactory getFactory(FactoryType factory) {
		if(factory.equals(FactoryType.COLOUR))
			return new ColourFactory();
		else if(factory.equals(FactoryType.SHAPE))
			return new ShapeFactory();
		return null;
	}
	
}