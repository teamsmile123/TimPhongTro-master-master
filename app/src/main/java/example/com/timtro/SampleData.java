package example.com.timtro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 19/10/2017.
 */

public class SampleData {
    public static List<TimNguoiOGhep> getSample() {
        List<TimNguoiOGhep> thongtin = new ArrayList<>();
        TimNguoiOGhep timNguoiOGhep1 = new TimNguoiOGhep("K82/95 Nguyễn Lương Bằng-Đà Nẵng","01657894678","700k/tháng","Free wifi\n Có khóa cổng\n Cho nấu ăn","Huỳnh Thị Hiền",20,"Nữ","01674859362");
        thongtin.add(timNguoiOGhep1);
        TimNguoiOGhep timNguoiOGhep2 = new TimNguoiOGhep("K47/95 Nguyễn Lương Bằng-Đà Nẵng","01657894678","1000k/tháng"," Free wifi\n Trọ thoáng mát\n Có khóa cổng\n Cho nấu ăn","Ngô Anh Tú",18,"Nam","01672025385");
        thongtin.add(timNguoiOGhep2);
        TimNguoiOGhep timNguoiOGhep3 = new TimNguoiOGhep("K2/9 Đồng Kè-Liên Chiểu-Đà Nẵng","01657894678","900k/tháng"," Wifi30k/tháng/người\n Có khóa cổng\n Cho nấu ăn","Phan Anh Quang",20,"Nam","01215674839");
        thongtin.add(timNguoiOGhep3);
        TimNguoiOGhep timNguoiOGhep4 = new TimNguoiOGhep("95 Ngô Sĩ Liên-Liên Chiểu-Đà Nẵng","01657894678","850k/tháng"," Free wifi\n Có khóa cổng\n Cho nấu ăn\n Chủ dể tính","Võ Thị Ánh Tuyết",25,"Nữ","0898567429");
        thongtin.add(timNguoiOGhep4);
        TimNguoiOGhep timNguoiOGhep5 = new TimNguoiOGhep("K58/6 Phạm Như Xương-Liên Chiểu-Đà Nẵng","01657894678","600k/tháng"," Free wifi\n Có khóa cổng\n Cho nấu ăn","Trần Phú Việt Minh",19,"Nam","0905673892");
        thongtin.add(timNguoiOGhep5);
        return thongtin;
    }
}
