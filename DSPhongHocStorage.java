import java.util.ArrayList;

public class DSPhongHocStorage {

	public DSPhongHocStorage(){
		
	}
	ArrayList<PhongHocLyThuyet> getDSPhongHocLyThuyet(){
		ArrayList<PhongHocLyThuyet> dsPhonghocLyThuyet;
		dsPhongHocLyThuyet = MemoryPhongHocDatabase.getPhongHoclyThuyet();
		return dsPhongHocLyThuyet;
	}
	ArrayList<PhongHocMayTinh> getDSPhongHocMayTinh(){
		return MemoryPhongHocDatabase.getPhongHocMayTinh();
	}
	ArrayList<PhongHocThiNghiem> getDSPhongHocThiNghiem(){
		return MemoryPhongHocDatabase.getPhongHocThiNghiem();
	}
}