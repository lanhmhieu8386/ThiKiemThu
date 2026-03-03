package org.example.Service;

import org.example.Entity.BaiHat;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {

    List<BaiHat> lstBaiHat = new ArrayList<>();

    public void add(BaiHat baiHat) {
        if (baiHat == null) {
            throw new NullPointerException("Khong tim thay bai hat");
        }
        if (baiHat.getMa() == null || baiHat.getMa().trim().isEmpty()) {
            throw new IllegalArgumentException("Ma bai hat khong duoc de trong");
        }
        if ((baiHat.getTen() == null || baiHat.getTen().trim().isEmpty())) {
            throw new IllegalArgumentException("Ten bai hat khong duoc de trong");
        }
        if (baiHat.getTenCaSi() == null || baiHat.getTenCaSi().trim().isEmpty()) {
            throw new IllegalArgumentException("Ten ca si khong duoc de trong");
        }
        if (baiHat.getTheLoai() == null || baiHat.getTheLoai().trim().isEmpty()) {
            throw new IllegalArgumentException("The loai bai hat khong duoc de trong");
        }
        if (baiHat.getThoiLuong() < 0) {
            throw new IllegalArgumentException("Thoi luong bai hat phai lon hon 0");
        }
        if (baiHat.getThoiLuong() < 2 || baiHat.getThoiLuong() > 5.59f) {
            throw new IllegalArgumentException("Thoi luong bai hat phai trong khoang 2 - 5,59");
        }
        lstBaiHat.add(baiHat);
    }

    public int size() {
        return lstBaiHat.size();
    }
}
