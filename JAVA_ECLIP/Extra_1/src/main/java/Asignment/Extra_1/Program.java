package Asignment.Extra_1;
import java.util.Date;

public class Program {
	public static void main(String[] args) {
		//he hoc
		HeHoc heHoc1 = new HeHoc();
		heHoc1.IDBacHoc = 1;
		heHoc1.tenBacHoc = tenBacHoc.Daihoc;
		heHoc1.thoigiandaotao = thoigiandaotao.BONNAM;
		heHoc1.sotinchitichluy = sotinchitichluy.haitrammuoi;
		
		HeHoc heHoc2 = new HeHoc();
		heHoc2.IDBacHoc = 2;
		heHoc2.tenBacHoc = tenBacHoc.Caodang;
		heHoc2.thoigiandaotao = thoigiandaotao.BANAM;
		heHoc2.sotinchitichluy = sotinchitichluy.mottramnammuoi;
		
		//clb
		clb clb1 = new clb();
		clb1.ID_CLB = 1;
		clb1.tenCLB = "cau long";
		clb1.createDate = new Date("2022/06/05");
		
		clb clb2 = new clb();
		clb2.ID_CLB = 2;
		clb2.tenCLB = "guitar";
		clb2.createDate = new Date("2022/02/05");
		
		clb clb3 = new clb();
		clb3.ID_CLB = 3;
		clb3.tenCLB = "bong ban";
		clb3.createDate = new Date("2022/03/05");
		
		// Phong ban CLB
		phongbanCLB phongbanCLB1 = new phongbanCLB();
		phongbanCLB1.ID_Phongban = 1;
		phongbanCLB1.tenphongbanString = "quan ly su kien";
		
		phongbanCLB phongbanCLB2 = new phongbanCLB();
		phongbanCLB2.ID_Phongban = 2;
		phongbanCLB2.tenphongbanString = "thanh vien moi";
		
		phongbanCLB phongbanCLB3 = new phongbanCLB();
		phongbanCLB3.ID_Phongban = 3;
		phongbanCLB3.tenphongbanString = "thi dau";
		
		// Bo mon
		bomon bomon1 = new bomon();
		bomon1.ID_Bomon = 1;
		bomon1.tenBoMonString = "dia chat";
		bomon1.createDate = new Date("1996/03/12");
		bomon1.soGiangVien = 20;
		
		bomon bomon2 = new bomon();
		bomon2.ID_Bomon = 2;
		bomon2.tenBoMonString = "CNTT";
		bomon2.createDate = new Date("1996/02/12");
		bomon2.soGiangVien = 30;
		
		bomon bomon3 = new bomon();
		bomon3.ID_Bomon = 3;
		bomon3.tenBoMonString = "xay dung";
		bomon3.createDate = new Date("1996/04/12");
		bomon3.soGiangVien = 40;
		
		// Lop hoc
		lophoc lophoc1= new lophoc();
		lophoc1.ID_Lophoc = 1;
		lophoc1.tenLopHocString = "lop 1";
		
		lophoc lophoc2= new lophoc();
		lophoc2.ID_Lophoc = 2;
		lophoc2.tenLopHocString = "lop 2";
		
		lophoc lophoc3= new lophoc();
		lophoc3.ID_Lophoc = 3;
		lophoc3.tenLopHocString = "lop 3";
		
		// SV
		Sv sv1 = new Sv();
		sv1.maSv = 1;
		sv1.fullName = "Nguyen Khanh 1";
		sv1.email = "nguyenkhanh1@gmail.com";
		sv1.sdt = 0123451;
		sv1.queQuan = "Thai Binh";
		sv1.ngayThangNamSinhDate = new Date("1996/11/1");
		sv1.chuyenNganh = "diachatcongtrinh";
		sv1.iD_bacHoc = heHoc1;
		sv1.diaChiNienHe = "cau giay";
		sv1.id_Clb = clb1;
		sv1.id_phongBanClb = phongbanCLB1;
		sv1.id_lopHocDangKyTrongky = lophoc1;
		
		Sv sv2 = new Sv();
		sv1.maSv = 2;
		sv1.fullName = "Nguyen Khanh 2";
		sv1.email = "nguyenkhanh2@gmail.com";
		sv1.sdt = 0123452;
		sv1.queQuan = "Nam Dinh";
		sv1.ngayThangNamSinhDate = new Date("1996/11/2");
		sv1.chuyenNganh = "xaydungdandung";
		sv1.iD_bacHoc = heHoc2;
		sv1.diaChiNienHe = "Tu Liem";
		sv1.id_Clb = clb2;
		sv1.id_phongBanClb = phongbanCLB2;
		sv1.id_lopHocDangKyTrongky = lophoc2;
		
		Sv sv3 = new Sv();
		sv1.maSv = 3;
		sv1.fullName = "Nguyen Khanh 3";
		sv1.email = "nguyenkhanh3@gmail.com";
		sv1.sdt = 0123453;
		sv1.queQuan = "Ha Noi";
		sv1.ngayThangNamSinhDate = new Date("1996/11/3");
		sv1.chuyenNganh = "congnghemaytinh";
		sv1.iD_bacHoc = heHoc1;
		sv1.diaChiNienHe = "Ha Noi";
		sv1.id_Clb = clb3;
		sv1.id_phongBanClb = phongbanCLB3;
		sv1.id_lopHocDangKyTrongky = lophoc3;
		
		// GV
		
		giangvien giangvien1 = new giangvien();
		giangvien1.maGV = 1;
		giangvien1.fullName = "Nguyen Van A";
		giangvien1.email = "Nguyenvan1@gmail.com";
		giangvien1.sdt = 01234561;
		giangvien1.queQuan = "Phu Tho";
		giangvien1.ngayThangNamSinhDate = new Date("1988/01/01");
		giangvien1.id_bomon = bomon1;
		giangvien1.luong = 10000000;
		giangvien1.diaChiLienHe = "Ha Noi";
		lophoc [] lophoc1s = {lophoc1,lophoc2};
		giangvien1.id_lophocGiangdayLophocs = lophoc1s;
		
		giangvien giangvien2 = new giangvien();
		giangvien2.maGV = 2;
		giangvien2.fullName = "Nguyen Van B";
		giangvien2.email = "Nguyenvan2@gmail.com";
		giangvien2.sdt = 01234562;
		giangvien2.queQuan = "Ha Tinh";
		giangvien2.ngayThangNamSinhDate = new Date("1988/02/01");
		giangvien2.id_bomon = bomon3;
		giangvien2.luong = 20000000;
		giangvien2.diaChiLienHe = "Ha Noi";
		lophoc [] lophoc2s = {lophoc1,lophoc3};
		giangvien1.id_lophocGiangdayLophocs = lophoc2s;
		
		giangvien giangvien3 = new giangvien();
		giangvien3.maGV = 3;
		giangvien3.fullName = "Nguyen Van C";
		giangvien3.email = "Nguyenvan3@gmail.com";
		giangvien3.sdt = 01234563;
		giangvien3.queQuan = "Yen Bai";
		giangvien3.ngayThangNamSinhDate = new Date("1988/03/01");
		giangvien3.id_bomon = bomon2;
		giangvien3.luong = 30000000;
		giangvien3.diaChiLienHe = "Ha Noi";
		lophoc [] lophoc3s = {lophoc2,lophoc3};
		giangvien1.id_lophocGiangdayLophocs = lophoc3s;
		
	}
}
