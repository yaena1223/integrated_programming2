

class Provider{ // 구성관계 . 회사별로 한 종류의 마스크만 판매한다고 가정. 
	private String companyname;
	private int stock;
	
	Mask mask;
	Provider(String companyname, String type,String color, int stock){ //처음에 회사가 가지고 있는 마스크의 종류와 마스크의 색, 재고. 
		mask = new Mask(type,color);
		this.stock = stock;
		this.companyname = companyname;
	}
	
	void setStock(int stock) {
		this.stock = stock;
	}
	
	int getStock(){
		return stock;
	}
	
	String getCompanyname() {
		return companyname;
	}
	void provide(int num) {
		
		if (stock<1) {
			System.out.println(companyname+"은 현재 재고가 부족하여 약국에 마스크를 제공할 수 없습니다. 마스크의 제조가 필요합니다.\n");
		}
		else {			
			stock = stock - num;
			mask.show();
			System.out.println(", 제공개수 : "+ num+"개");
		}
	}
	
	void make(int n) {
		stock = stock + n;
	}
	
	void check_stock() {
		System.out.println("[제조업체"+companyname+"의 재고]");
		if (stock<1) {
			
			System.out.println(companyname+"는 마스크 재고가 없습니다.\n");
		}
		else {
			
			System.out.println(companyname+"의 마스크 재고는 "+stock+"입니다.\n");
		}
	}
}
