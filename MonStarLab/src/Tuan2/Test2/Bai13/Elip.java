package Tuan2.Test2.Bai13;

public class Elip extends Diem {
    private double nuaTrucLon;
    private double nuaTrucBe;

    public double getNuaTrucLon() {
		return nuaTrucLon;
	}

	public void setNuaTrucLon(double nuaTrucLon) {
		this.nuaTrucLon = nuaTrucLon;
	}

	public double getNuaTrucBe() {
		return nuaTrucBe;
	}

	public void setNuaTrucBe(double nuaTrucBe) {
		this.nuaTrucBe = nuaTrucBe;
	}

	public double dienTich(){
        return Math.PI*nuaTrucLon*nuaTrucBe;
    }


}
