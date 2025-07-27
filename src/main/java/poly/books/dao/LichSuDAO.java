
package poly.books.dao;

import java.util.List;
import poly.books.entity.LichSu;
import poly.books.util.XQuery;

public class LichSuDAO {
    String getAllSQL = """
                       SELECT TOP (1000) [MaLichSu]
                             ,[MaHD]
                             ,[TenDangNhap]
                             ,[ThoiGian]
                             ,[GhiChu]
                         FROM [QLNhaSachPro].[dbo].[LichSuGiaoDich]
                       """;
    public List<LichSu> getAll() {
        return XQuery.getBeanList(LichSu.class, getAllSQL);
    }
}
