import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;

public class SubToYT {
	public static void main(String[] args) {
		// startingUp();

		// countItUp();

		UnSubToYT("Prodsy");
		SubToYT("Prodsy");
	}


	public static void SubToYT(String ChannelName) {

//		String ChannelName = "MrBeast";

	//	MouseButton mb = MouseButton.PRIMARY;
		Robot robot;
		try {
			robot = new Robot();
			int mask1 = InputEvent.BUTTON1_DOWN_MASK;
			int mask2 = InputEvent.BUTTON2_DOWN_MASK;
			
			
			robot.keyPress(KeyEvent.VK_WINDOWS);
			robot.keyPress(KeyEvent.VK_R);
			
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_WINDOWS);
			
			
			Thread.sleep(500);
			
			type("Chrome", robot);
			
			Thread.sleep(500);
			
			type(" YouTube.com", robot);
			
			typeEnter(robot);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(500);
			
//			robot.mouseMove(575, 850);
//			robot.mousePress(mask2);
//			robot.mouseRelease(mask2);
//			
			Thread.sleep(3000);	//set higher if you have slow wifi (or open chrome before)
			
			
			Thread.sleep(500);
			
			robot.keyPress(KeyEvent.VK_F11);
			robot.keyRelease(KeyEvent.VK_F11);
			
			
			Thread.sleep(500);
			
			type("/", robot);
			
			Thread.sleep(500);
			
			type(ChannelName, robot);
			
			Thread.sleep(500);
			
			typeEnter(robot);
			
			Thread.sleep(500);
			
			//use Tab to get around!
			for(int i = 0; i < 4; i++) {
			typeTab(robot);
			Thread.sleep(200);
			}
			
			typeEnter(robot);
			
			Thread.sleep(1500);
//			robot.mouseMove(240, 330);			//robot.mouseMove(390, 550);
//			robot.mousePress(mask1);
//			robot.mouseRelease(mask1);

			
			Thread.sleep(500);
			
			robot.keyPress(KeyEvent.VK_F11);
			robot.keyRelease(KeyEvent.VK_F11);
			
			Thread.sleep(500);
 
		} catch (AWTException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
//		int mask = InputEvent.MOUSE_BUTTON1_DOWN;
//		bot.mouseMove(x, y);           
//		bot.mousePress(mask);     
//		bot.mouseRelease(mask);
		
	}
	
	public static void UnSubToYT(String ChannelName) {

		Robot robot;
		try {
			robot = new Robot();
			int mask1 = InputEvent.BUTTON1_DOWN_MASK;
			int mask2 = InputEvent.BUTTON2_DOWN_MASK;
			
			
			robot.keyPress(KeyEvent.VK_WINDOWS);
			robot.keyPress(KeyEvent.VK_R);
			
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_WINDOWS);
			
			
			Thread.sleep(500);
			
			type("Chrome", robot);
			
			Thread.sleep(500);
			
			type(" YouTube.com", robot);
			
			typeEnter(robot);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(500);
			
//			robot.mouseMove(575, 850);
//			robot.mousePress(mask2);
//			robot.mouseRelease(mask2);
//			
			Thread.sleep(3000);	//set higher if you have slow wifi (or open chrome before)
			
			Thread.sleep(500);
			
			robot.keyPress(KeyEvent.VK_F11);
			robot.keyRelease(KeyEvent.VK_F11);
			
			
			Thread.sleep(1500);
			
			type("/", robot);
			
			Thread.sleep(500);
			
			type(ChannelName, robot);
			
			Thread.sleep(500);
			
			typeEnter(robot);
			
			Thread.sleep(500);
			
			//use Tab to get around!
			for(int i = 0; i < 4; i++) {
			typeTab(robot);
			Thread.sleep(200);
			}
			
			typeEnter(robot);
			
			Thread.sleep(500);
			
			typeTab(robot);
			
			Thread.sleep(500);
			
			typeEnter(robot);
			
			Thread.sleep(1500);
			
			Thread.sleep(500);
			
			robot.keyPress(KeyEvent.VK_F11);
			robot.keyRelease(KeyEvent.VK_F11);
			
			Thread.sleep(500); 
		} catch (AWTException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
//		int mask = InputEvent.MOUSE_BUTTON1_DOWN;
//		bot.mouseMove(x, y);           
//		bot.mousePress(mask);     
//		bot.mouseRelease(mask);
		
	}
	
	public static void typeEnter(Robot bot) {
			bot.keyPress(KeyEvent.VK_ENTER);
			bot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public static void typeTab(Robot bot) {
		bot.keyPress(KeyEvent.VK_TAB);
		bot.keyRelease(KeyEvent.VK_TAB);
	
}
	
	 public static void type(CharSequence characters, Robot bot) {
	        int length = characters.length();
	        for (int i = 0; i < length; i++) {
	            char character = characters.charAt(i);
	            type(character, bot);
	        }
	    }
	 

	    public static void type(char character, Robot bot) {
	        switch (character) {
	        case 'a': bot.keyPress(KeyEvent.VK_A); break;
	        case 'b': bot.keyPress(KeyEvent.VK_B); break;
	        case 'c': bot.keyPress(KeyEvent.VK_C); break;
	        case 'd': bot.keyPress(KeyEvent.VK_D); break;
	        case 'e': bot.keyPress(KeyEvent.VK_E); break;
	        case 'f': bot.keyPress(KeyEvent.VK_F); break;
	        case 'g': bot.keyPress(KeyEvent.VK_G); break;
	        case 'h': bot.keyPress(KeyEvent.VK_H); break;
	        case 'i': bot.keyPress(KeyEvent.VK_I); break;
	        case 'j': bot.keyPress(KeyEvent.VK_J); break;
	        case 'k': bot.keyPress(KeyEvent.VK_K); break;
	        case 'l': bot.keyPress(KeyEvent.VK_L); break;
	        case 'm': bot.keyPress(KeyEvent.VK_M); break;
	        case 'n': bot.keyPress(KeyEvent.VK_N); break;
	        case 'o': bot.keyPress(KeyEvent.VK_O); break;
	        case 'p': bot.keyPress(KeyEvent.VK_P); break;
	        case 'q': bot.keyPress(KeyEvent.VK_Q); break;
	        case 'r': bot.keyPress(KeyEvent.VK_R); break;
	        case 's': bot.keyPress(KeyEvent.VK_S); break;
	        case 't': bot.keyPress(KeyEvent.VK_T); break;
	        case 'u': bot.keyPress(KeyEvent.VK_U); break;
	        case 'v': bot.keyPress(KeyEvent.VK_V); break;
	        case 'w': bot.keyPress(KeyEvent.VK_W); break;
	        case 'x': bot.keyPress(KeyEvent.VK_X); break;
	        case 'y': bot.keyPress(KeyEvent.VK_Y); break;
	        case 'z': bot.keyPress(KeyEvent.VK_Z); break;
	        case 'A': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_A); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'B': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_B); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'C': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_C); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'D': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_D); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'E': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_E); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'F': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_F); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'G': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_G); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'H': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_H); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'I': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_I); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'J': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_J); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'K': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_K); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'L': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_L); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'M': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_M); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'N': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_N); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'O': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_O); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'P': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_P); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'Q': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_Q); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'R': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_R); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'S': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_S); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'T': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_T); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'U': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_U); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'V': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_V); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'W': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_W); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'X': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_X); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'Y': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_Y); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case 'Z': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_Z); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case '`': bot.keyPress(KeyEvent.VK_BACK_QUOTE); break;
	        case '0': bot.keyPress(KeyEvent.VK_0); break;
	        case '1': bot.keyPress(KeyEvent.VK_1); break;
	        case '2': bot.keyPress(KeyEvent.VK_2); break;
	        case '3': bot.keyPress(KeyEvent.VK_3); break;
	        case '4': bot.keyPress(KeyEvent.VK_4); break;
	        case '5': bot.keyPress(KeyEvent.VK_5); break;
	        case '6': bot.keyPress(KeyEvent.VK_6); break;
	        case '7': bot.keyPress(KeyEvent.VK_7); break;
	        case '8': bot.keyPress(KeyEvent.VK_8); break;
	        case '9': bot.keyPress(KeyEvent.VK_9); break;
	        case '-': bot.keyPress(KeyEvent.VK_MINUS); break;
	        case '=': bot.keyPress(KeyEvent.VK_EQUALS); break;
	        case '~': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_BACK_QUOTE); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case '!': bot.keyPress(KeyEvent.VK_EXCLAMATION_MARK); break;
	        case '@': bot.keyPress(KeyEvent.VK_AT); break;
	        case '#': bot.keyPress(KeyEvent.VK_NUMBER_SIGN); break;
	        case '$': bot.keyPress(KeyEvent.VK_DOLLAR); break;
	        case '%': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_5); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case '^': bot.keyPress(KeyEvent.VK_CIRCUMFLEX); break;
	        case '&': bot.keyPress(KeyEvent.VK_AMPERSAND); break;
	        case '*': bot.keyPress(KeyEvent.VK_ASTERISK); break;
	        case '(': bot.keyPress(KeyEvent.VK_LEFT_PARENTHESIS); break;
	        case ')': bot.keyPress(KeyEvent.VK_RIGHT_PARENTHESIS); break;
	        case '_': bot.keyPress(KeyEvent.VK_UNDERSCORE); break;
	        case '+': bot.keyPress(KeyEvent.VK_PLUS); break;
	        case '\t': bot.keyPress(KeyEvent.VK_TAB); break;
	        case '\n': bot.keyPress(KeyEvent.VK_ENTER); break;
	        case '[': bot.keyPress(KeyEvent.VK_OPEN_BRACKET); break;
	        case ']': bot.keyPress(KeyEvent.VK_CLOSE_BRACKET); break;
	        case '\\': bot.keyPress(KeyEvent.VK_BACK_SLASH); break;
	        case '{': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_OPEN_BRACKET); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case '}': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_CLOSE_BRACKET); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case '|': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_BACK_SLASH); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case ';': bot.keyPress(KeyEvent.VK_SEMICOLON); break;
	        case ':': bot.keyPress(KeyEvent.VK_COLON); break;
	        case '\'': bot.keyPress(KeyEvent.VK_QUOTE); break;
	        case '"': bot.keyPress(KeyEvent.VK_QUOTEDBL); break;
	        case ',': bot.keyPress(KeyEvent.VK_COMMA); break;
	        case '<': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_COMMA); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case '.': bot.keyPress(KeyEvent.VK_PERIOD); break;
	        case '>': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_PERIOD); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case '/': bot.keyPress(KeyEvent.VK_SLASH); break;
	        case '?': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_SLASH); bot.keyRelease(KeyEvent.VK_SHIFT); break;
	        case ' ': bot.keyPress(KeyEvent.VK_SPACE); break;
	        default:
	            throw new IllegalArgumentException("Cannot type character " + character);
	        }
	    }
}
