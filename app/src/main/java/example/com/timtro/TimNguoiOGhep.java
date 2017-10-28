package example.com.timtro;

/**
 * Created by linh on 9/23/2017.
 */

public class TimNguoiOGhep extends PhongTro {
    private String ten;
    private int tuoi;
    private String gioiTinh;
    private String sdt;

    public TimNguoiOGhep(String diachi, String sdtlienhe, String giatien, String chitiet, String ten, int tuoi, String gioiTinh, String sdt) {
        super(diachi, sdtlienhe, giatien, chitiet);
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}


