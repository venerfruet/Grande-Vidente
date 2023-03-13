package br.com.vener.grandevidente;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;

/**
 * 
 * @author Vener Fruet da Silveira
 * @version 2023-03-12
 */

public class Seer {

	public static OutputText outputText = new OutputText(true,false);
	public static OutputText dialogText = new OutputText(false,true);
	public static ImagePanel imageBalloon;

	public static void main(String[] args) {

		Dimension balloonSize = new Dimension(200, 100);
		Rectangle balloonRect = new Rectangle(90, 200, balloonSize.width, balloonSize.height);
		
		MainFrame mainFrame = new MainFrame();
		ImagePanel imageSeer = new ImagePanel("resources/mr.png", null, new Dimension(400, 400), null, true);
		imageBalloon = new ImagePanel("resources/balloon.png", new BorderLayout(), balloonSize, balloonRect, false);

		mainFrame.add(imageSeer, BorderLayout.NORTH);
		imageSeer.add(imageBalloon);
		imageBalloon.add(dialogText, BorderLayout.SOUTH);
		mainFrame.add(outputText, BorderLayout.AFTER_LAST_LINE);
		
		mainFrame.setVisible(true);
		
		Player.play();
		
	}

}
