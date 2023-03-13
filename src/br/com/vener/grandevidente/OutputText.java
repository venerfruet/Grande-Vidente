package br.com.vener.grandevidente;

import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 * 
 * @author Vener Fruet da Silveira
 * @version 2023-03-12
 */

public class OutputText extends JTextPane {
	
	private static final long serialVersionUID = 1L;

	public OutputText(boolean opaque, boolean center) {
		
		Font font = new Font("Courrier", Font.ITALIC, 16);
		
		setEditable(false);
		setFocusable(false);
		setOpaque(opaque);
		setFont(font);
		
		if(center)
			setCenter();
		
	}

	private void setCenter() {
		
		StyledDocument styleDoc = getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		styleDoc.setParagraphAttributes(0, styleDoc.getLength(), center, false);
		
	}
}
