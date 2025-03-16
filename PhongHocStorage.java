
public class PhongHocStorage {

	PhongHocStorage(){
		
	}
	//INSERT: thêm mới một phòng
	void insertPhongHocLyThuyet(PhongHocLyThuyet ph){
		MemoryPhongHocDatabase.addPhongHocLyThuyet(ph);
		System.out.println("thêm phòng học thành công");
	}
	
	void insertPhongHocMayTinh(PhongHocMayTinh ph) {
		MemoryPhongHocDatabase.addPhongHocMayTinh(ph);
		System.out.println("thêm phòng học thành công");
	}
	void insertPhongHocThiNghiem(PhongHocThiNghiem ph) {
		MemoryPhongHocDatabase.addPhongHocThiNghiem(ph);
		System.out.println("thêm phòng học thành công");
	}
	
	//UPDATE: cập nhật thông tin
	//boolean success: Biến nhận kết quả từ phương thức
	void updatePhongHocLyThuyet(int id,PhongHocLyThuyet newPh) {
		if (MemoryPhongHocDatabase.updatePhongHocLyThuyet(id, newPh)) {
	        System.out.println("Cập nhật phòng học lý thuyết thành công");
	    } else {
	        System.out.println("Không tìm thấy phòng học lý thuyết với id: " + id);
	    	}
		}
	void updatePhongHocMayTinh(int id, PhongHocMayTinh newPh) {
		if (MemoryPhongHocDatabase.updatePhongHocMayTinh(id, newPh)) {
		    System.out.println("Cập nhật phòng học máy tính thành công");
		} else {
		    System.out.println("Không tìm thấy phòng học máy tính với id: " + id);
		   }
		}
	void updatePhongHocThiNghiem(int id, PhongHocThiNghiem newPh) {
		if (MemoryPhongHocDatabase.updatePhongHocThiNghiem(id, newPh)) {
		    System.out.println("Cập nhật phòng học thí nghiệm thành công");
		} else {
		    System.out.println("Không tìm thấy phòng học thí nghiệm với id: " + id);
		   }
		}
	
	//DELETE xóa phòng học
	void deletePhongHocLyThuyet(int id) {
	    if (MemoryPhongHocDatabase.deletePhongHocLyThuyet(id)) {
	        System.out.println("Xóa phòng học lý thuyết thành công");
	    } else {
	        System.out.println("Không tìm thấy phòng học lý thuyết với id: " + id);
	    	}
		}
	 void deletePhongHocMayTinh(int id) {
	    if (MemoryPhongHocDatabase.deletePhongHocMayTinh(id)) {
	     System.out.println("Xóa phòng học máy tính thành công");
	    } else {
	     System.out.println("Không tìm thấy phòng học máy tính với id: " + id);
	    	}
	 	}
	  void deletePhongHocLyThuyet(int id) {
	    if (MemoryPhongHocDatabase.deletePhongHocLyThuyet(id)) {
	     System.out.println("Xóa phòng học lý thuyết thành công");
	    } else {
	    	System.out.println("Không tìm thấy phòng học lý thuyết với id: " + id);
	    	}
	  	}
	  void deletePhongHocMayTinh(int id) {
		  if (MemoryPhongHocDatabase.deletePhongHocMayTinh(id)) {
			  System.out.println("Xóa phòng học máy tính thành công");
		  } else {
			  System.out.println("Không tìm thấy phòng học máy tính với id: " + id);
		  	}
	  	}
	 void deletePhongHocThiNghiem(int id) {
		 if (MemoryPhongHocDatabase.deletePhongHocThiNghiem(id)) {
			 System.out.println("Xóa phòng học thí nghiệm thành công");
		 } else {
			 System.out.println("Không tìm thấy phòng học thí nghiệm với id: " + id);
		 	}
	 	}
}

