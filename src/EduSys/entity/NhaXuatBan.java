/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EduSys.entity;

import java.util.Date;

/**
 *
 * @author Đức Toàn
 */
public class NhaXuatBan {
    private String MaNXB;
    private String TenNXB;
    private String DiaChi;
    private String Email;
    private Date NamXuatBan;
    private boolean TrangThai;

    public NhaXuatBan() {
    }

    public String getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(String MaNXB) {
        this.MaNXB = MaNXB;
    }

    public String getTenNXB() {
        return TenNXB;
    }

    public void setTenNXB(String TenNXB) {
        this.TenNXB = TenNXB;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public NhaXuatBan(String MaNXB, String TenNXB, String DiaChi, String Email, Date NamXuatBan, boolean TrangThai) {
        this.MaNXB = MaNXB;
        this.TenNXB = TenNXB;
        this.DiaChi = DiaChi;
        this.Email = Email;
        this.NamXuatBan = NamXuatBan;
        this.TrangThai = TrangThai;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public Date getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(Date NamXuatBan) {
        this.NamXuatBan = NamXuatBan;
    }

   
}
