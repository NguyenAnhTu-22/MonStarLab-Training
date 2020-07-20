package Tuan2.Test2.Bai15;

public class TestFlashLamp {
	public static void main(String[] args) {
		Battery bat = new Battery();
		FlashLamp flamp = new FlashLamp();
		flamp.setBattery(bat);
		for (int i = 0; i < 10; i++) {
			System.out.println("Năng lượng pin: " + bat.getEnergy());
			flamp.turnOn();
			bat.decreaseEnergy();
			flamp.setBattery(bat);
			flamp.turnOff();
		}
	}
}
