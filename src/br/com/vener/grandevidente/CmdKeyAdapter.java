package br.com.vener.grandevidente;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 
 * @author Vener Fruet da Silveira
 * @version 2023-03-12
 */

public class CmdKeyAdapter extends KeyAdapter {
	private static boolean hasCtrl = false;
	private static boolean hasBackSpace = false;
	private static boolean hasEnter = false;

	@Override
	public void keyReleased(KeyEvent e) {

		switch (e.getKeyCode()) {
		case KeyEvent.VK_CONTROL:
			hasCtrl = !hasCtrl;
			break;
		case KeyEvent.VK_ENTER:
			hasEnter = !hasEnter;
			break;
		default:
			break;
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE)
			hasBackSpace = true;
	}

	/*
	 * GETTERS AND SETTERS
	 */
	public static boolean isHasCtrl() {
		return hasCtrl;
	}

	public static void setHasCtrl(boolean hasCtrl) {
		CmdKeyAdapter.hasCtrl = hasCtrl;
	}

	public static boolean isHasBackSpace() {
		return hasBackSpace;
	}

	public static void setHasBackSpace(boolean hasBackSpace) {
		CmdKeyAdapter.hasBackSpace = hasBackSpace;
	}

	public static boolean isHasEnter() {
		return hasEnter;
	}

	public static void setHasEnter(boolean hasEnter) {
		CmdKeyAdapter.hasEnter = hasEnter;
	}

}
