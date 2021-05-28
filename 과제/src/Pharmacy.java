
class Pharmacy{ 
	private String name;
	private int num;
	Pharmacy(String name, int num){
		this.name = name;
		this.num = num;
		
	}
	String getName() {
		return name;
	}

	
	int getNum() {
		return num;
	}
	
	void setNum(int num) {
		this.num = num;
	}
	
	void show() {
		
		if (num<1) {
			
			System.out.println("���� "+name+"�� ���� ����ũ�� ��� �����ϴ�.\n ");
		}
		else {
			
			System.out.println("���� "+name+"���� "+num+"���� ����ũ�� �ֽ��ϴ�. \n");}
	}
	
	void buy(Provider pro, int num) {
		System.out.println("["+pro.getCompanyname()+" -> "+name+"]");
		if(pro.getStock()<=0) {
			System.out.println(name+"�� ������ü�κ��� ����ũ�� ������ �� �����ϴ�. \n");
		}
		else {
			if(pro.getStock()<num) {
				int stock = pro.getStock();
				pro.provide(stock);
				System.out.println(name+"�� ������ü�κ��� "+stock+"���� ����ũ�� ������ �� �ֽ��ϴ�. �̸�ŭ�� �����մϴ�. \n");
				this.num = this.num + stock;
				
			}
			
			else {
				pro.provide(num);
				System.out.println(name+"�� "+pro.getCompanyname()+"�κ��� "+num+"���� ����ũ�� �����մϴ�.\n");
				this.num = this.num + num;
			}
		}
	}	
}

