

class Provider{ // �������� . ȸ�纰�� �� ������ ����ũ�� �Ǹ��Ѵٰ� ����. 
	private String companyname;
	private int stock;
	
	Mask mask;
	Provider(String companyname, String type,String color, int stock){ //ó���� ȸ�簡 ������ �ִ� ����ũ�� ������ ����ũ�� ��, ���. 
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
			System.out.println(companyname+"�� ���� ��� �����Ͽ� �౹�� ����ũ�� ������ �� �����ϴ�. ����ũ�� ������ �ʿ��մϴ�.\n");
		}
		else {			
			stock = stock - num;
			mask.show();
			System.out.println(", �������� : "+ num+"��");
		}
	}
	
	void make(int n) {
		stock = stock + n;
	}
	
	void check_stock() {
		System.out.println("[������ü"+companyname+"�� ���]");
		if (stock<1) {
			
			System.out.println(companyname+"�� ����ũ ��� �����ϴ�.\n");
		}
		else {
			
			System.out.println(companyname+"�� ����ũ ���� "+stock+"�Դϴ�.\n");
		}
	}
}
