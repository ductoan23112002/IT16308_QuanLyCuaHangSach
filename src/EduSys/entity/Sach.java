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
public class Sach {
    private String MaSach;
    private String TenSach;
    private Date NamXuatBan;
    private float GiaBan;
    private int SoLuong;
    private boolean TrangThai;
    private String MaDauSach;
    private String GhiChu;
    private String MaKeSach;

    public Sach() {
    }

    public Sach(String MaSach, String TenSach, Date NamXuatBan, float GiaBan, int SoLuong, boolean TrangThai, String MaDauSach, String GhiChu, String MaKeSach) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.NamXuatBan = NamXuatBan;
        this.GiaBan = GiaBan;
        this.SoLuong = SoLuong;
        this.TrangThai = TrangThai;
        this.MaDauSach = MaDauSach;
        this.GhiChu = GhiChu;
        this.MaKeSach = MaKeSach;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public Date getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(Date NamXuatBan) {
        this.NamXuatBan = NamXuatBan;
    }

    public float getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(float GiaBan) {
        this.GiaBan = GiaBan;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMaDauSach() {
        return MaDauSach;
    }

    public void setMaDauSach(String MaDauSach) {
        this.MaDauSach = MaDauSach;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getMaKeSach() {
        return MaKeSach;
    }

    public void setMaKeSach(String MaKeSach) {
        this.MaKeSach = MaKeSach;
    }

   
    
}
