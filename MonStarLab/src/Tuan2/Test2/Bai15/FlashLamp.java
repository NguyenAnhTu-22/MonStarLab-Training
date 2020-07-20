package Tuan2.Test2.Bai15;

public class FlashLamp {
	private boolean status;

	public Battery battery = new Battery();

	public FlashLamp() {
		// TODO Auto-generated constructor stub
		this.status = false;
		battery.setEnergy(0);
	}

	public void setBattery(Battery b) {
		battery.setEnergy(b.getEnergy());
	}

	public int getBatteryInfo() {
		return battery.getEnergy();
	}

	public void turnOn() {
		if (this.status = true && battery.getEnergy() > 0) {
			System.out.println("ON");
		}
	}

	public void turnOff() {
		if (this.status == false)
			System.out.println("Off");
	}
}
