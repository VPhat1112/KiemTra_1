package com.example.firebase;

public class CongAn {
    private int anh;
    private String Ten;
    private String Capbac;
    private String NoiCongTac;
    private String QuocGia;

    public CongAn(int anh, String ten, String capbac, String noiCongTac, String quocGia) {
        this.anh = anh;
        Ten = ten;
        Capbac = capbac;
        NoiCongTac = noiCongTac;
        QuocGia = quocGia;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getCapbac() {
        return Capbac;
    }

    public void setCapbac(String capbac) {
        Capbac = capbac;
    }

    public String getNoiCongTac() {
        return NoiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        NoiCongTac = noiCongTac;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String quocGia) {
        QuocGia = quocGia;
    }

    @Override
    public String toString() {
        return "CongAn{" +
                "anh=" + anh +
                ", Ten='" + Ten + '\'' +
                ", Capbac='" + Capbac + '\'' +
                ", NoiCongTac='" + NoiCongTac + '\'' +
                ", QuocGia='" + QuocGia + '\'' +
                '}';
    }
}
