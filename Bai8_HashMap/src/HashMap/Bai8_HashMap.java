package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Bai8_HashMap {
    public static void main(String[] args) {
        // Tạo đối tượng HashMap để lưu trữ các cặp khóa-giá trị
        HashMap<String, Integer> danhSachDiem = new HashMap<>();

        // Thêm các cặp khóa-giá trị vào HashMap
        danhSachDiem.put("Nguyen Van A", 85);
        danhSachDiem.put("Tran Thi B", 90);
        danhSachDiem.put("Le Van C", 78);

        // In thông tin của từng cặp khóa-giá trị
        System.out.println("Danh sách điểm ban đầu:");
        for (Map.Entry<String, Integer> entry : danhSachDiem.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Sử dụng phương thức get để lấy giá trị của một khóa
        int diemA = danhSachDiem.get("Nguyen Van A");
        System.out.println("\nĐiểm của Nguyen Van A: " + diemA);

        // Sử dụng phương thức remove để xóa một cặp khóa-giá trị
        danhSachDiem.remove("Le Van C");
        System.out.println("\nDanh sách điểm sau khi xóa Le Van C:");
        for (Map.Entry<String, Integer> entry : danhSachDiem.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Sử dụng phương thức containsKey để kiểm tra sự tồn tại của một khóa
        boolean coTranThiB = danhSachDiem.containsKey("Tran Thi B");
        System.out.println("\nCó Tran Thi B trong danh sách: " + coTranThiB);

        // Sử dụng phương thức containsValue để kiểm tra sự tồn tại của một giá trị
        boolean coDiem90 = danhSachDiem.containsValue(90);
        System.out.println("Có điểm 90 trong danh sách: " + coDiem90);

        // Sử dụng phương thức size để lấy số lượng cặp khóa-giá trị
        int soLuong = danhSachDiem.size();
        System.out.println("Số lượng cặp khóa-giá trị trong danh sách: " + soLuong);

        // Sử dụng phương thức clear để xóa tất cả các cặp khóa-giá trị
        danhSachDiem.clear();
        System.out.println("\nDanh sách điểm sau khi xóa tất cả:");
        System.out.println(danhSachDiem);
    }
}