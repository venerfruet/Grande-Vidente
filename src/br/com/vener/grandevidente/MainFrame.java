package br.com.vener.grandevidente;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * 
 * @author Vener Fruet da Silveira
 * @version 2023-03-12
 */

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		
		Image ico = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/eye.png"));
		
		setTitle("Grande Vidente");
		setIconImage(ico);
		setSize(400, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setFocusable(true);
		
		addKeyListener(new CmdKeyAdapter());
		addKeyListener(new TxtKeyAdapter());
	}
	
}
