package poly.books.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class ChiTietLichSu {

    private int STT;
    private int MaLichSu;
    private int MaSach;
    private String TenSach;
    private int SoLuong;
    private double DonGia;
}
