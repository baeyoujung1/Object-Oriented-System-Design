package lab04;

public class HeartRateMonitableWatch extends Watch{
	public int getHeartRate() {
		return 60 + (int) (Math.random()*41);
	}
	
	public String toString() {
		return super.toString() + ", " + "HR: " + getHeartRate();
 	}

}
