package Tuan2.Test2.Bai12;

public class HinhBinhHanh extends DaGiac {

    private double chieuDai;
    private double chieuRong;
    private double chieuCao;

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public void thuocTinh() {
        super.thuocTinh();
        System.out.println("Các cạnh đối song song và bằng nhau");
    }

    public double chuVi(){
        return (chieuDai+chieuRong)*2;
    }
    public double dienTich(){
        return chieuDai*chieuCao;
    }
    
}