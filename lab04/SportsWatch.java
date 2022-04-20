package lab04;

public class SportsWatch extends HeartRateMonitableWatch {
	
	private HeartRateMonitor monitor;
	
	public SportsWatch() {
		monitor = new HeartRateMonitor();
	}
	
	public void getMap() {
		System.out.println("You are here");
	}
	
	public int getHeartRate() {
		return monitor.getHeartRate();
	}

}
