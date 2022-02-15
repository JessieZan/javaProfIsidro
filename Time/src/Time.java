
public class Time {
	private int h;
	private int m;
	private int s;
	
	public int getH() {
		return h;
	}
	
	public int getM() {
		return m;
	}
	
	public int getS() {
		return s;
	}
	
	public void setTime(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	public String exibirTimeUniversal() {
		String timeUniversal = (this.h + ":" + this.m + ":" + this.s);

		return timeUniversal;
	}
	
	public String exibirPadrao() {
		
		String timePadrao = "";
		
		if(h > 12) {
			timePadrao = ((h - 12) + ":" + m + ":" + s + "PM");
		}
		
		if(h > 0 && h < 12) {
			timePadrao = (h + ":" + m + ":" + s + "AM");
		}
		
		if(h == 12) {
			timePadrao = (h + ":" + m + ":" + s + "PM");
		}
		
		if(h == 0) {
			timePadrao = (12 + ":" + formataN(m) + ":" + formataN(s) + "AM");
		}
		

		return timePadrao;
	}
	
	private String formataN(int N) {
		return (N < 10) ? "0"+ N : "N";
	}
}
