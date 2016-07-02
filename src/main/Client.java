package main;

import javax.swing.*;
import java.awt.*;


/**
 * Class that contains the main method.
 * Initializes the frame, panels, etc.
 * 
 * @author Basit, Michelle, Randa
 */
public class Client {

	public static JPanel mainPanel, optionsPanel, displayPanel;
	
	public static void main(String[] args) {
		createWindow();
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