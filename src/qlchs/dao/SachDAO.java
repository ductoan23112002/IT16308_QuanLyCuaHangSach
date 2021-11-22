/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlchs.dao;


import EduSys.entity.Sach;
import qlchs.utils.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SachDAO extends QLNSDAO<Sach, String>{
 String insertSql = "INSERT SACH(MaSach,TenSach,GiaBan,SoLuong,MaDauSach,GhiChu,TrangThai) VALUES(?,?,?,?,?,?,?)";
    String selectAll = "SELECT*FROM SACH";
    String selectById = "SELECT*FROM SACH WHERE MaSach=?";
    String updateSql="UPDATE SACH SET TenSach=?,GiaBan=?,SoLuong=?,MaDauSach=?,GhiChu=?,TrangThai=? where MaSach=?";
    String deleteSql="DELETE FROM SACH WHERE MaSach=?";

    @Override
    public void insert(Sach entity) {
        JDBCHelper.update(insertSql, entity.getMaSach(),entity.getTenSach(),entity.getGiaBan(),entity.getSoLuong(),entity.getMaDauSach(),entity.getGhiChu(),entity.isTrangThai());
    }

    @Override
    public void update(Sach entity) {
JDBCHelper.update(updateSql, entity.getMaSach(),entity.getTenSach(),entity.getGiaBan(),entity.getSoLuong(),entity.getMaDauSach(),entity.getGhiChu(),entity.isTrangThai());
        }

    @Override
    public void delete(String id) {
        JDBCHelper.update(deleteSql, id);
    }

    @Override
    public List<Sach> selectAll() {
        return selectBySql(selectAll);
    }

    @Override
    public Sach selectById(String id) {
        List<Sach> list= selectBySql(selectById, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<Sach> selectBySql(String sql, Object... args) {
        List<Sach> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                
                Sach entity = new Sach();
                entity.setMaSach(rs.getString("MaSach"));
                entity.setTenSach(rs.getString("TenSach"));
                
                entity.setGiaBan(rs.getFloat("GiaBan"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setTrangThai(rs.getBoolean("TrangThai"));
                entity.setMaDauSach(rs.getString("MaDauSach"));
                entity.setGhiChu(rs.getString("GhiChu"));
                list.add(entity);
            }
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
        return list;
    }
    
}
