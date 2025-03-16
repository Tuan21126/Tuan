
public class PhongHocStorage {

	PhongHocStorage(){
		
	}
	
	void insertPhongHocLyThuyet(PhongHocLyThuyet ph){
		MemoryPhongHocDatabase.addPhongHocLyThuyet(ph);
	}
	
	void insertPhongHocMayTinh(PhongHocMayTinh ph) {
		MemoryPhongHocDatabase.addPhongHocMayTinh(ph);
	}
	void insertPhongHocThiNghiem(PhongHocThiNghiem ph) {
		MemoryPhongHocDatabase.addPhongHocThiNghiem(ph);
	}
}
