package auto_typing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.StringTokenizer;

public class AutoTypeCharacter {
	
	private static int key=-1;

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
		
		String str="Hello world....,,,,,YUGhjb@#$^&^*&*&(**(jhbsYGHjdcb';[[;'/652hjc  you bitch, get off my way";
		
		char ch[]=str.toCharArray();
		
		Robot rb=new Robot();
		Runtime rt=Runtime.getRuntime(); //opens notepad
		rt.exec("notepad.exe");
		rb.delay(1000);
		
		for(int i=0;i<ch.length;i++){
			
			if((ch[i]<=90 && ch[i]>=65)
					|| ch[i]=='!' || ch[i]=='@' || ch[i]=='#' || ch[i]=='$' || ch[i]=='%' || ch[i]=='^'
					|| ch[i]=='&' || ch[i]=='*' || ch[i]=='(' || ch[i]==')' || ch[i]=='_' || ch[i]=='+' ||
					ch[i]=='{' || ch[i]=='}' || ch[i]=='|' ||
					ch[i]==':' || ch[i]=='"' || ch[i]=='<' || ch[i]=='>' || ch[i]=='?'){
				
				rb.keyPress(KeyEvent.VK_SHIFT);
			}
			
			//TODO:
			/***if statements for chars not allowed in ''
			*
			*
			***/
			
			
			switch(ch[i]){
			case 'a':
			case 'A':
				key=KeyEvent.VK_A;
				break;
				
			case 'b':
			case 'B':
				key=KeyEvent.VK_B;
				break;
				
			case 'c':
			case 'C':
				key=KeyEvent.VK_C;
				break;
				
			case 'd':
			case 'D':
				key=KeyEvent.VK_D;
				break;
				
			case 'e':
			case 'E':
				key=KeyEvent.VK_E;
				break;
				
			case 'f':
			case 'F':
				key=KeyEvent.VK_F;
				break;
				
			case 'g':
			case 'G':
				key=KeyEvent.VK_G;
				break;
				
			case 'h':
			case 'H':
				key=KeyEvent.VK_H;
				break;
				
			case 'i':
			case 'I':
				key=KeyEvent.VK_I;
				break;
				
			case 'j':
			case 'J':
				key=KeyEvent.VK_J;
				break;
				
			case 'k':
			case 'K':
				key=KeyEvent.VK_K;
				break;
				
			case 'l':
			case 'L':
				key=KeyEvent.VK_L;
				break;
				
			case 'm':
			case 'M':
				key=KeyEvent.VK_M;
				break;
				
			case 'n':
			case 'N':
				key=KeyEvent.VK_N;
				break;
				
			case 'o':
			case 'O':
				key=KeyEvent.VK_O;
				break;
				
			case 'p':
			case 'P':
				key=KeyEvent.VK_P;
				break;
				
			case 'q':
			case 'Q':
				key=KeyEvent.VK_Q;
				break;
				
			case 'r':
			case 'R':
				key=KeyEvent.VK_R;
				break;
				
			case 's':
			case 'S':
				key=KeyEvent.VK_S;
				break;
				
			case 't':
			case 'T':
				key=KeyEvent.VK_T;
				break;
				
			case 'u':
			case 'U':
				key=KeyEvent.VK_U;
				break;
				
			case 'v':
			case 'V':
				key=KeyEvent.VK_V;
				break;
				
			case 'w':
			case 'W':
				key=KeyEvent.VK_W;
				break;
				
			case 'x':
			case 'X':
				key=KeyEvent.VK_X;
				break;
				
			case 'y':
			case 'Y':
				key=KeyEvent.VK_Y;
				break;
				
			case 'z':
			case 'Z':
				key=KeyEvent.VK_Z;
				break;
				
			case '1':
				key=KeyEvent.VK_1;
				break;
				
			case '2':
				key=KeyEvent.VK_2;
				break;
				
			case '3':
				key=KeyEvent.VK_3;
				break;
				
			case '4':
				key=KeyEvent.VK_4;
				break;
				
			case '5':
				key=KeyEvent.VK_5;
				break;
				
			case '6':
				key=KeyEvent.VK_6;
				break;
				
			case '7':
				key=KeyEvent.VK_7;
				break;
				
			case '8':
				key=KeyEvent.VK_8;
				break;
				
			case '9':
				key=KeyEvent.VK_9;
				break;
				
			case '0':
				key=KeyEvent.VK_0;
				break;
				
			case ' ':
				key=KeyEvent.VK_SPACE;
				break;
				
			case ',':
				key=KeyEvent.VK_COMMA;
				break;
				
			case '.':
				key=KeyEvent.VK_PERIOD;
				break;
				
			case ';':
				key=KeyEvent.VK_SEMICOLON;
				break;
				
			case '=':
				key=KeyEvent.VK_EQUALS;
				break;
				
			case '-':
				key=KeyEvent.VK_MINUS;
				break;
				
			case '/':
				key=KeyEvent.VK_SLASH;
				break;
				
			case '[':
				key=KeyEvent.VK_OPEN_BRACKET;
				break;
				
			case ']':
				key=KeyEvent.VK_CLOSE_BRACKET;
				break;
				
				//shifted characters
				//17 characters
				//
				
			case '?':
				key=KeyEvent.VK_SLASH;
				break;
				
			case ':':
				rb.keyPress(KeyEvent.VK_SHIFT);
				key=KeyEvent.VK_COLON;
				break;	
				
			case '*':
				key=KeyEvent.VK_8;
				break;
				
			case '!':
				key=KeyEvent.VK_1;
				break;
				
			case '@':
				key=KeyEvent.VK_2;
				break;
				
			case '#':
				key=KeyEvent.VK_3;
				break;
				
			case '$':
				key=KeyEvent.VK_4;
				break;
				
			case '%':
				key=KeyEvent.VK_5;
				break;
				
			case '^':
				key=KeyEvent.VK_6;
				break;
				
			case '&':
				key=KeyEvent.VK_7;
				break;
				
			case '(':
				key=KeyEvent.VK_9;
				break;
				
			case ')':
				key=KeyEvent.VK_0;
				break;
				
			case '_':
				key=KeyEvent.VK_MINUS;
				break;
				
			case '+':
				key=KeyEvent.VK_EQUALS;
				break;
				
			case '"' :
				key=KeyEvent.VK_QUOTE;
				break;
				
			case '{' :
				key=KeyEvent.VK_OPEN_BRACKET;
				break;
				
			case '}' :
				key=KeyEvent.VK_CLOSE_BRACKET;
				break;
				
			}
			
			rb.keyPress(key);
			rb.keyRelease(key);
			if((ch[i]<=90 && ch[i]>=65) || ch[i]=='!' || ch[i]=='@' || ch[i]=='#' || ch[i]=='$' || ch[i]=='%' || ch[i]=='^'
					|| ch[i]=='&' || ch[i]=='*' || ch[i]=='(' || ch[i]==')' || ch[i]=='_' || ch[i]=='+' ||
					ch[i]=='{' || ch[i]=='}' || ch[i]=='|' ||
					ch[i]==':' || ch[i]=='"' || ch[i]=='<' || ch[i]=='>' || ch[i]=='?'){
				
				rb.keyRelease(KeyEvent.VK_SHIFT);
			}
			rb.delay(100);			
		}
		
		rb.keyPress(KeyEvent.VK_ALT);
		rb.keyPress(KeyEvent.VK_F4);
		
		rb.keyRelease(KeyEvent.VK_ALT);
		rb.keyRelease(KeyEvent.VK_F4);
//		
//		rb.keyPress(KeyEvent.VK_RIGHT);
//		rb.keyPress(KeyEvent.VK_ENTER);
////		
//		rb.keyPress(KeyEvent.VK_RIGHT);
//		rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
