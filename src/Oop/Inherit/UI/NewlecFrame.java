package Oop.Inherit.UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class NewlecFrame extends Frame {
	
	private Panel panel;
	private Panel chartPanel;
	
	public NewlecFrame() {
		
		setLayout(new BorderLayout());
		
		panel = new NewlecPanel();
		panel.setBackground(Color.blue);
		add(panel, BorderLayout.PAGE_START);
		
		chartPanel = new Panel();
		chartPanel = new ChartPanel();
		chartPanel.setBackground(Color.YELLOW);
		add(chartPanel, BorderLayout.CENTER);
 	}
	
	
	
}
