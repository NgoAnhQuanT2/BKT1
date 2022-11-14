package com.example.bkt1;

public class Casi {
String ten,nghedanh,quocgia;
int hinhanh;

    public Casi(String ten, int hinhanh) {
        this.ten = ten;
        this.hinhanh = hinhanh;
        this.nghedanh = nghedanh;
        this.quocgia = quocgia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getNghedanh() {
        return nghedanh;
    }

    public void setNghedanh(String nghedanh) {
        this.nghedanh = nghedanh;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }
}
