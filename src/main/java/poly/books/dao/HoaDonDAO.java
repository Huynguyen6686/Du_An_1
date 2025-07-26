/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.books.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import poly.books.entity.HoaDon;
import poly.books.util.XJdbc;
import poly.books.util.XQuery;

/**
 *
 * @author LAPTOP
 */
public class HoaDonDAO {

    String getAllSQL = """
                       SELECT  [MaHD]
                             ,[NgayLap]
                             ,[MaKH]
                             ,[TenDangNhap]
                             ,[MaPhieu]
                             ,[TongTien]
                             ,[PhuongThuc]
                             ,[NgayThanhToan]
                       ,TrangThai
                         FROM [QLNhaSachPro].[dbo].[HoaDon]
                       """;
    String updateSQL = """
                       UPDATE [dbo].[HoaDon]
                          SET [NgayLap] = ?
                             ,[MaKH] = ?
                             ,[TenDangNhap] = ?
                             ,[MaPhieu] = ?
                             ,[TongTien] = ?
                             ,[PhuongThuc] = ?
                             ,[NgayThanhToan] = ?
                       ,TrangThai =?
                        WHERE MaHD = ?
                       """;
    String deleteSQL = """
                       DELETE FROM [dbo].[HoaDon]
                             WHERE MaHD = ?
                       """;

    public HoaDon findById(int maHD) {
        String sql = "SELECT * FROM HoaDon WHERE MaHD = ?";
        return XQuery.getSingleBean(HoaDon.class, sql, maHD);
    }

    public List<HoaDon> getAll() {
        return XQuery.getBeanList(HoaDon.class, getAllSQL);
    }

    public int create(HoaDon hoaDon) throws SQLException {
        String sql = """
        INSERT INTO [dbo].[HoaDon] ([NgayLap], [MaKH], [TenDangNhap], [MaPhieu], [TongTien], [PhuongThuc], [NgayThanhToan], TrangThai)
        VALUES (?, ?, ?, ?, ?, ?, ?, ?); SELECT SCOPE_IDENTITY();
    """;
        try (Connection conn = XJdbc.openConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDate(1, new java.sql.Date(hoaDon.getNgayLap().getTime()));
            ps.setInt(2, hoaDon.getMaKH());
            ps.setString(3, hoaDon.getTenDangNhap().trim());
            if (hoaDon.getMaPhieu() != null) {
                ps.setInt(4, hoaDon.getMaPhieu());
            } else {
                ps.setNull(4, java.sql.Types.INTEGER);
            }
            ps.setDouble(5, hoaDon.getTongTien());
            ps.setInt(6, hoaDon.getPhuongThuc());
            ps.setTimestamp(7, new java.sql.Timestamp(hoaDon.getNgayThanhToan().getTime()));
            ps.setInt(8, hoaDon.getTrangThai());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
            throw new SQLException("Không lấy được ID tự động.");
        } catch (SQLException e) {
            System.out.println("SQL Error in HoaDonDAO.create: " + e.getMessage());
            throw e;
        }
    }

    public int update(HoaDon hoaDon) {
        Object[] values = {
            hoaDon.getNgayLap(),
            hoaDon.getMaKH(),
            hoaDon.getTenDangNhap(),
            hoaDon.getMaPhieu(),
            hoaDon.getTongTien(),
            hoaDon.getPhuongThuc(),
            hoaDon.getNgayThanhToan(),
            hoaDon.getTrangThai(),
            hoaDon.getMaHD()
        };
        return XJdbc.executeUpdate(updateSQL, values);
    }

    public int delete(int MaHD) {
        return XJdbc.executeUpdate(deleteSQL, MaHD);
    }
}
