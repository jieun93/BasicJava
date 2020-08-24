package f_oop2;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {

		if (hour > 23 || 0 < hour) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}

		if (hour > 24) {
			this.hour = hour % 24;
		}

	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {

		if (minute <= 60 || 0 < minute) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}

		if (minute > 60) {
			this.setHour(this.hour+minute / 60);
			this.minute = minute % 60;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {

		if (second <= 60 || 0 < second) {
			this.second = second;
		} else {
			this.second = 0;
		}

		if (second > 60) {
			this.setMinute(second / 60);
			this.second = second % 60;
		}
	}

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

}
