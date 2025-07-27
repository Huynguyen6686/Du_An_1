package poly.books.entity;

import java.util.Date;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LichSu {

    private int MaLichSu;
    private int MaHD;
    private String TenDangNhap;
    private Date ThoiGian;
    private String GhiChu;
}
