package Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Robo {
	public static void run() throws AWTException {
	Robot rob = new Robot();
	rob.setAutoDelay(2000);

	rob.keyPress(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_V);
	rob.keyRelease(KeyEvent.VK_CONTROL);
	rob.keyRelease(KeyEvent.VK_V);
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
}
	
}