package backup;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import backup.designpatterns.adapter.AudioPlayer;
import backup.designpatterns.factory.AbstractFactory;
import backup.designpatterns.factory.FactoryProducer;
import backup.enums.ColourType;
import backup.enums.FactoryType;
import backup.enums.ShapeType;
import backup.interfaces.Colour;
import backup.interfaces.Shape;


/**
 * Main class that initialises everything else.
 * @author Michelle Ritzema
 */
public class Main {

	public static JPanel mainPanel, optionsPanel, displayPanel;
	
	public static void main(String[] args) {
		createWindow();
		
		//Adapter
		AudioPlayer audioPlayer = new AudioPlayer();
	    audioPlayer.play("mp3", "beyond the horizon.mp3");
	    audioPlayer.play("mp4", "alone.mp4");
	    audioPlayer.play("vlc", "far far away.vlc");
	    audioPlayer.play("avi", "mind me.avi");
		
	    //(Abstract) Factory
		AbstractFactory colourFactory = FactoryProducer.getFactory(FactoryType.COLOUR);
		Colour colour1 = colourFactory.getColour(ColourType.BLUE);
		colour1.fill();
		Colour colour2 = colourFactory.getColour(ColourType.GREEN);
		colour2.fill();
		Colour colour3 = colourFactory.getColour(ColourType.RED);
		colour3.fill();
		AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);
		Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
		shape1.draw();
		Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);
		shape2.draw();
		Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);
		shape3.draw();
	}
	
	/**
	 * Creates a window containing all the GUI elements.
	 */
	private static void createWindow() {
		JFrame mainFrame = new JFrame("INFSEN02-2 GUI System");
		mainFrame.setSize(1400, 1000);
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
		createOptionsPanel();
		createDisplayPanel();
		mainPanel.add(optionsPanel);
		mainPanel.add(displayPanel);
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);  
	}
	
	/**
	 * Creates an options panel where the user can create GUI elements.
	 */
	private static void createOptionsPanel() {
		optionsPanel = new JPanel();
		optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.Y_AXIS));
	}
	
	/**
	 * Creates a display panel where the user can see the created GUI elements.
	 */
	private static void createDisplayPanel() {
		displayPanel = new JPanel();
	    displayPanel.setBackground(Color.darkGray);
	}
	
}