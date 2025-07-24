/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.books.dao;

import java.util.List;
import poly.books.entity.KhachHang;
import poly.books.util.XJdbc;
import poly.books.util.XQuery;

/**
 *
 * @author LAPTOP
 */
public class KhachHangDAO {
    String getAllSQL = """
                       SELECT [MaKH] ,[TenKH],[SDT],[Email],[DiaChi]
                           FROM [QLNhaSachPro].[dbo].[KhachHang]
                       """;
    String findBySQL = """
                       SELECT * FROM [QLNhaSachPro].[dbo].[KhachHang] where MaKH = ?
                       """;
    String create = """
                       INSERT INTO [dbo].[KhachHang]
                                  ([TenKH]
                                    ,[SDT]
                                    ,[Email]
                                    ,[DiaChi])
                            VALUES
                                  (?,?,?,?)
                       """;
    String update = """
                   UPDATE [dbo].[KhachHang]
                      SET [TenKH] = ?
                          ,[SDT] = ?
                          ,[Email] = ?
                          ,[DiaChi] = ?
                    WHERE MaKH=?
                   """;
    String delete = """
                   DELETE FROM [dbo].[KhachHang]
                         WHERE MaKH=?
                   """;
    public List<KhachHang> getAll() {
        
        return XQuery.getBeanList(KhachHang.class, getAllSQL);
        
    }
    public KhachHang findbyID(int maLinhVuc) {
        
        return XQuery.getSingleBean(KhachHang.class, findBySQL, maLinhVuc);
    }
    public int create(KhachHang kh) {
        Object[] rowData = {
            kh.getTenKH(),
            kh.getSDT(),
            kh.getEmail(),
            kh.getDiaChi()
        };
        return XJdbc.executeUpdate(create, rowData);
    }

    public int update(KhachHang kh) {
        Object[] rowData = {
            kh.getTenKH(),
            kh.getSDT(),
            kh.getEmail(),
            kh.getDiaChi(),
            kh.getMaKH()

        };
        return XJdbc.executeUpdate(update, rowData);
    }

    public int delete(int id) {
        return XJdbc.executeUpdate(delete, id);
    }
    public List<KhachHang> findByKhachHangID(int maKhachHang) {
    String sql = "SELECT kh.* FROM KhachHang kh " +
                 "JOIN Sach_LinhVuc slv ON lv.MaLinhVuc = slv.MaLinhVuc " +
                 "WHERE slv.MaSach = ?";
    return XQuery.getBeanList(KhachHang.class, sql, maKhachHang);
} 
}
