package bear;

public class Bear {
	private int legs;
	private boolean hasTail;
	private String color;
	private boolean awake;
	
	public Bear(int legs, boolean tail, String color, boolean awake) {
		this.legs = legs;
		this.hasTail = tail;
		this.color = color;
		this.awake = awake;
	}
	
	public static void main(String[] args) {
		Bear benno = new Bear(17, false, "Purple", true);
		 benno.setLegs(12);
		 
		 System.out.println("De beer heeft " + benno.getLegs() + " poten");
		 
		 Bear baloe = new Bear(3, true, "Blue", false);
		 baloe.wakeUp();
		 baloe.wakeUp();
		 
		 benno.setAwake(true);
		 benno.wakeUp();
	}
	
	public boolean isAwake() {
		return awake;
	}
	
	public void setAwake(boolean bool) {
		this.awake = bool;
	}
	
	public void wakeUp() {
		if (!awake) {
			setAwake(true);
			System.out.print("Goedemorgen!");
		} else {
			System.out.println(" Ïëk was al wakker...");
		}
	}
	public int getLegs() {
		return legs;
	}
	
	public void setLegs(int newLegs) {
		this.legs = newLegs;
	}
}
