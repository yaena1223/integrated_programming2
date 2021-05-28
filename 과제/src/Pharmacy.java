
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
			
			System.out.println("현재 "+name+"에 남은 마스크의 재고가 없습니다.\n ");
		}
		else {
			
			System.out.println("현재 "+name+"에는 "+num+"개의 마스크가 있습니다. \n");}
	}
	
	void buy(Provider pro, int num) {
		System.out.println("["+pro.getCompanyname()+" -> "+name+"]");
		if(pro.getStock()<=0) {
			System.out.println(name+"은 제조업체로부터 마스크를 구입할 수 없습니다. \n");
		}
		else {
			if(pro.getStock()<num) {
				int stock = pro.getStock();
				pro.provide(stock);
				System.out.println(name+"은 제조업체로부터 "+stock+"개의 마스크만 구입할 수 있습니다. 이만큼만 구입합니다. \n");
				this.num = this.num + stock;
				
			}
			
			else {
				pro.provide(num);
				System.out.println(name+"은 "+pro.getCompanyname()+"로부터 "+num+"개의 마스크를 구입합니다.\n");
				this.num = this.num + num;
			}
		}
	}	
}

