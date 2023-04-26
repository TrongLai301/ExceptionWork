package BaiTap1;

public class TriagleCheck {
    public void TriagleCheck1(double a, double b, double c) throws TriagleEx {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new TriagleEx("Tam giác không hợp lệ");
        }
        if (a + b <= c || b + c <= a || c + a <= b) {
            throw new TriagleEx("Lỗi: Tam giác không hợp lệ");
        } else {
            System.out.println("Tam giác hợp lệ");
        }
    }
}
