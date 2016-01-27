package Demo;

import lejos.hardware.Sound;
import lejos.utility.Delay;

public class MyFirstRobot {
	 
	public static void main(String[] args) {
	    // 叫两声
	    Sound.twoBeeps();
	    // 休息三秒
	    Delay.msDelay(3000);
	   // 叫一声
	    Sound.beep();
	} 
}
