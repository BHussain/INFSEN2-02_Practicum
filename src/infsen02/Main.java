package infsen02;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import infsen02.designpatterns.adapter.LabelColourAdapter;
import infsen02.designpatterns.decorator.ButtonColourDecorator;
import infsen02.designpatterns.factory.GUIElementFactory;
import infsen02.designpatterns.iterator.GUIElementIterator;
import infsen02.designpatterns.visitor.GUIElementVisitor;
import infsen02.designpatterns.visitor.Option;
import infsen02.enums.ColourType;
import infsen02.enums.GUIElementType;
import infsen02.interfaces.GUIElement;
import infsen02.models.Button;
import infsen02.models.Label;


/**
 * Class that contains the main method.
 * Initialises the frame, panels, etc.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 */
public class Main {

	private static JPanel mainPanel, optionsPanel;
	private static GUIElementFactory factory;
	
	public static void main(String[] args) {
		factory = new GUIElementFactory();
		createWindow();
		fillOptionsPanel();
	}

	/**
	 * Creates a window containing all the GUI elements.
	 */
	private static void createWindow() {
		JFrame mainFrame = new JFrame("INFSEN02-2 GUI System");
		mainFrame.setSize(1400, 1000);
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainPanel = (JPanel) getPanel().getComponent();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
		createOptionsPanel();
		//createDisplayPanel();
		mainPanel.add(optionsPanel);
		//mainPanel.add(displayPanel);
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);  
	}
	
	/**
	 * Creates an options panel where the user can create GUI elements.
	 */
	private static void createOptionsPanel() {
		optionsPanel = (JPanel) getPanel().getComponent();
		//optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.Y_AXIS));
	}
	
	/**
	 * Creates a display panel where the user can see the created GUI elements.
	 */
	/*private static void createDisplayPanel() {
		displayPanel = (JPanel) getPanel().getComponent();
	    displayPanel.setBackground(Color.darkGray);
	}*/
	
	/**
	 * Fills the options panel with all possible GUI Element options.
	 */
	private static void fillOptionsPanel() {
		ArrayList<GUIElement> elements = getElements();
		GUIElementVisitor visitor = new GUIElementVisitor();
		GUIElementIterator iterator = new GUIElementIterator(elements);
		boolean done = false;
		while(!done) {
			Option<GUIElement> option = iterator.next();
			Component component = option.visit(visitor);
			if(component != null)
				optionsPanel.add(component);
			else
				done = true;
		}
		optionsPanel.revalidate();
		optionsPanel.repaint();
	}
	
	/**
	 * Adds elements to the array list.
	 * 
	 * @return The filled array list.
	 */
	private static ArrayList<GUIElement> getElements() {
		ArrayList<GUIElement> elements = new ArrayList<>();
		elements.add(getButton("Normal button"));
		elements.add(getColouredButton("Red button", ColourType.RED));
		elements.add(getColouredButton("Blue button", ColourType.BLUE));
		elements.add(getColouredButton("Green button", ColourType.GREEN));
		elements.add(getLabel("Normal label"));
		elements.add(getColouredLabel("Red label", ColourType.RED));
		elements.add(getColouredLabel("Blue label", ColourType.BLUE));
		elements.add(getColouredLabel("Green label", ColourType.GREEN));
		return elements;
	}
	
	/**
	 * Creates and returns a panel.
	 * 
	 * @return The created GUIElement object.
	 */
	private static GUIElement getPanel() {
		return factory.create(GUIElementType.PANEL, "panel");
	}
	
	/**
	 * Creates and returns a label.
	 * 
	 * @param value The supplied value string.
	 * @return The created GUIElement object.
	 */
	private static GUIElement getLabel(String value) {
		return factory.create(GUIElementType.LABEL, value);
	}
	
	/**
	 * Creates and returns a label.
	 * 
	 * @param value The supplied value string.
	 * @param colour The supplied ColourType value.
	 * @return The created GUIElement object.
	 */
	private static GUIElement getColouredLabel(String value, ColourType colour) {
		ButtonColourDecorator button = new ButtonColourDecorator(colour,(Button) factory.create(GUIElementType.BUTTON, "placeholder"));
		return new LabelColourAdapter(button, new Label(value));
	}
	
	/**
	 * Creates and returns a button.
	 * 
	 * @param value The supplied value string.
	 * @param colour The supplied ColourType value.
	 * @return The created GUIElement object.
	 */
	private static GUIElement getButton(String value) {
		return factory.create(GUIElementType.BUTTON, value);
	}
	
	/**
	 * Creates and returns a button.
	 * 
	 * @param value The supplied value string.
	 * @param colour The supplied ColourType value.
	 * @return The created GUIElement object.
	 */
	private static GUIElement getColouredButton(String value, ColourType colour) {
		return new ButtonColourDecorator(colour,(Button) factory.create(GUIElementType.BUTTON, value));
	}
	
}