package Tuan2.Test2.Bai15;

public class Battery {
	public int energy;

	public Battery() {
		// TODO Auto-generated constructor stub
		this.energy = 10;
	}

	public void setEnergy(int energy1) {
		this.energy = energy1;
	}
	
	public int getEnergy() {
		return this.energy;
	}
	
	public void decreaseEnergy() {
		this.energy = this.energy - 2;
	}
}
