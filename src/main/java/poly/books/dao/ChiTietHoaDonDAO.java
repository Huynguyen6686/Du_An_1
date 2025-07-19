/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.books.dao;

import java.util.List;
import poly.books.entity.ChiTietHoaDon;
import poly.books.util.XJdbc;
import poly.books.util.XQuery;

/**
 *
 * @author LAPTOP
 */
public class ChiTietHoaDonDAO {
       String getAllSQL = """
                       SELECT TOP (1000) [MaHD]
                             ,[MaSach]
                             ,[SoLuong]
                             ,[DonGia]
                         FROM [QLNhaSachPro].[dbo].[ChiTietHoaDon]
                       """;
    String updateSQL = """
                      UPDATE [dbo].[ChiTietHoaDon]
                          SET 
                             [MaSach] = ?
                             ,[SoLuong] = ?
                             ,[DonGia] = ?
                        WHERE [MaHD] = ?
                       """;
    String deleteSQL = """
                      DELETE FROM [dbo].[ChiTietHoaDon]
                             WHERE MaHD = ?
                       """;
        public List<ChiTietHoaDon> getAll() {
         return XQuery.getBeanList(ChiTietHoaDon.class, getAllSQL);
    }
    public int update(ChiTietHoaDon chiTietHoaDon) {
        Object[] values = {
           chiTietHoaDon.getMaSach(),
            chiTietHoaDon.getSoLuong(),
            chiTietHoaDon.getDonGia(),
            chiTietHoaDon.getMaHD()
        };
        return XJdbc.executeUpdate(updateSQL, values);
    }
    public int delete(int MaHD) {
        return XJdbc.executeUpdate(deleteSQL, MaHD);
    }
}
