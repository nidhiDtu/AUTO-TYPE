package auto_typing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class AutoTypeCharacter {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
		
		String str="Hello world";
		
		char ch[]=str.toCharArray();
		
		Robot rb=new Robot();
		Runtime rt=Runtime.getRuntime(); //opens notepad
		rt.exec("notepad.exe");
		
		rb.keyPress(KeyEvent.VK_ALT);
		rb.keyPress(KeyEvent.VK_F4);
		
		rb.keyRelease(KeyEvent.VK_ALT);
		rb.keyRelease(KeyEvent.VK_F4);
		
		rb.keyPress(KeyEvent.VK_RIGHT);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		rb.keyPress(KeyEvent.VK_RIGHT);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
