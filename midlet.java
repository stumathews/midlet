import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class HelloWorld extends MIDlet
{
    private TextBox textbox;
    private Display display;
    private static final int SCREEN_LENGTH = 20;

    public HelloWorld()
    {
    }
    
    /**
    Represents the first state of the applications after the initial pause state. It is typicalyl transistions to from the pause state(which is the first, initial state) 
    */
    public void startApp()
    {
	textbox = new TextBox("First MIDlet", "Hello World", SCREEN_LENGTH, TextField.ANY);
	display = Display.getDisplay(this);
	display.setCurrent(textBox);
    }
    /**
     Represents the state that the app is in when it is paused, for example when an incomming call is encountered*/
    public void pauseApp()
    {

    }
    
    /** When the app is signaled to close or encounters a problem(forrced closure) this state is transistioned to. Typically release resources if you can*/
    public void destroyApp()
    {
	
    }
}