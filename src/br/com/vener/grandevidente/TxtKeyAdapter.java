package br.com.vener.grandevidente;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 
 * @author Vener Fruet da Silveira
 * @version 2023-03-12
 */

public class TxtKeyAdapter extends KeyAdapter {
	private static String memoText = "";
	private static String defaultText = Enviroments.DEFAULT_TEXT;
	private static String emptyText = Enviroments.EMPTY_TEXT;

	@Override
	public void keyTyped(KeyEvent e) {
		String txt = "";

		if (memoText.length() == defaultText.length())
			CmdKeyAdapter.setHasCtrl(false);

		if (!CmdKeyAdapter.isHasBackSpace()) {

			if (CmdKeyAdapter.isHasCtrl()) {

				memoText += e.getKeyChar();
				txt = defaultText.substring(0, memoText.length());

			} else {

				txt = Seer.outputText.getText() + e.getKeyChar();

			}

		} else {

			int length;

			length = Seer.outputText.getText().length() - 1;
			length = length < 0 ? 0 : length;
			txt = "" + Seer.outputText.getText().substring(0, length);

			length = memoText.length();
			length = length < 0 ? 0 : length;
			memoText = memoText.substring(0, length);

			CmdKeyAdapter.setHasBackSpace(false);

		}

		Seer.outputText.setText(txt.toUpperCase());

	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (CmdKeyAdapter.isHasEnter()) {

			if(!Seer.imageBalloon.isVisible()) {
				
				Player.play();
				
				memoText = memoText == "" ? emptyText + "\n" : memoText + "\n";
				
				Seer.dialogText.setText((memoText).toUpperCase());
				Seer.imageBalloon.setVisible(true);
				
			}else {
				
				Seer.imageBalloon.setVisible(false);
				
			}
			
			Seer.outputText.setText("");
			memoText = "";
			CmdKeyAdapter.setHasCtrl(false);
			CmdKeyAdapter.setHasEnter(false);

		}

	}
}
