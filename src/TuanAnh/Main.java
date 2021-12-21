package TuanAnh;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
//    Stack<String> stackChuoi = new Stack<String>();
//    stackChuoi.push("value") => đưa giá trị vào stack
//        stackChuoi.pop()  => lấy giá trị ra, xóa khỏi stack
//        stackChuoi.peek() => lấy giá trị ra, không xóa khỏi stack
//    stackChuoi.clear(); => xóa tất cả
//    stackChuoi.contains("value") xác định giá trị có tồn tại trong stack hay không
    Queue<String> danhsach = new PriorityQueue<String>();

//    danhsach.add() => chèn phần tử đã định vào hàng chờ
//        danhsach.offer() => chèn vào
//        danhsach.element() => trả về phần đầu của hàng đợi
//    danhsach.peek() => trả về phần đầu của hàng đợi null
//        danhsach.remove() => trả về và  xóa phần đầu của hàng đợi
//        danhsach.poll() => trả về và loại bỏ phần đầu của hàng đợi null
    danhsach.offer("tuan anh");
        danhsach.offer("duong");
        danhsach.offer("a chạy ở đây này");
        danhsach.offer("khoan");

String ten = danhsach.poll();
        System.out.println(ten);
    }


}
