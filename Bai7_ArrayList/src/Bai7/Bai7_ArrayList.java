package Bai7;

import java.util.ArrayList;

//Lớp MatHang
class MatHang {
 private String ten;
 private int soLuong;
 private double donGia;

 public MatHang(String ten, int soLuong, double donGia) {
     this.ten = ten;
     this.soLuong = soLuong;
     this.donGia = donGia;
 }

 @Override
 public String toString() {
     return "MatHang{" +
             "ten='" + ten + '\'' +
             ", soLuong=" + soLuong +
             ", donGia=" + donGia +
             '}';
 }
}
public class Bai7_ArrayList {
 public static void main(String[] args) {
     // Tạo danh sách ArrayList để lưu trữ các đối tượng MatHang
     ArrayList<MatHang> danhSachMatHang = new ArrayList<>();

     // Thêm các đối tượng MatHang vào danh sách
     danhSachMatHang.add(new MatHang("Ghế nhựa", 2, 500000));
     danhSachMatHang.add(new MatHang("Bàn gỗ", 1, 1500000));
     danhSachMatHang.add(new MatHang("Ghế gỗ", 5, 300000));

     // In thông tin của từng mặt hàng
     System.out.println("Danh sách mặt hàng ban đầu:");
     for (MatHang matHang : danhSachMatHang) {
         System.out.println(matHang);
     }

     // Sử dụng phương thức get để lấy một phần tử
     MatHang matHang1 = danhSachMatHang.get(0);
     System.out.println("\nLấy mặt hàng đầu tiên: " + matHang1);

     // Sử dụng phương thức set để thay đổi một phần tử
     danhSachMatHang.set(1, new MatHang("Mặt hàng 2 - Cập nhật", 3, 1400000));
     System.out.println("\nDanh sách mặt hàng sau khi cập nhật:");
     for (MatHang matHang : danhSachMatHang) {
         System.out.println(matHang);
     }

     // Sử dụng phương thức remove để xóa một phần tử
     danhSachMatHang.remove(2);
     System.out.println("\nDanh sách mặt hàng sau khi xóa phần tử thứ 3:");
     for (MatHang matHang : danhSachMatHang) {
         System.out.println(matHang);
     }

     // Sử dụng phương thức size để lấy số lượng phần tử
     int soLuongMatHang = danhSachMatHang.size();
     System.out.println("\nSố lượng mặt hàng trong danh sách: " + soLuongMatHang);

     // Sử dụng phương thức clear để xóa tất cả phần tử
     danhSachMatHang.clear();
     System.out.println("\nDanh sách mặt hàng sau khi xóa tất cả phần tử:");
     System.out.println(danhSachMatHang);
 }
}  