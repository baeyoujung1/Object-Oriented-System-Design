package lab04;

import java.util.Calendar;

public class Watch {
	
	protected boolean backlitIsOn;
	
	protected Calendar cal = Calendar.getInstance();
	
	public void onBacklit() {
		if (!backlitIsOn) {
			System.out.println("Backlit ON!");
		} else {
			System.out.println("Backlit is already ON!");
		}
	}
	
	public void offBacklit() {
		if(backlitIsOn) {
			System.out.println("Backlit OFF!");
		} else {
			System.out.println("Backlit is already OFF!");
		}
	}
	
	private String getTime() {
		return cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
	}
	
	public void showTime() {
		System.out.println(getTime());
	}
	
	public String toString() {
		return "Backlit: "+ (backlitIsOn ? "ON" : "OFF")+", TIME"+getTime();
	}

}
