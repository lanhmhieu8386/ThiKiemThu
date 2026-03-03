package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaiHat {
    private String ma;
    private String ten;
    private String tenCaSi;
    private float thoiLuong;
    private String theLoai;

}
