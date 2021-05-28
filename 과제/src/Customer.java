
import java.util.Scanner;

class Customer{
	private String search_place;
	
	
	void search(Pharmacy pha) {
		search_place = pha.getName();
		System.out.println("["+search_place+"의 마스크 재고를 확인합니다.]");
		pha.show();
	}
	
	void buy(Pharmacy phy, int num) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[소비자의 구매]");
		if(phy.getNum()<=0) {
			System.out.println("마스크의 재고가 없어 구매할 수 없습니다. ");
		}
		
		else {
			if(phy.getNum()<num) {
				System.out.println("현재 마스크의 재고는 "+phy.getNum()+"개로 주문하신 양보다 적습니다." );
				System.out.print("남아있는 전체 재고 "+phy.getNum()+"만큼이라도 구매하시겠습니까?(y/n)");
				String c = sc.next();
				if(c.equals("y")) {
					System.out.println("현재 마스크의 재고는 "+phy.getNum()+"개 이기 때문에 "+phy.getNum()+
							"개의 마스크만 구매합니다. 나머지 "+(num-phy.getNum())+"개의 마스크는 다른 약국에서 구매하겠습니다.\n");
					phy.setNum(0);
				}
				if(c.equals("n")) {
					System.out.println("구매하지 않겠습니다.");
				}
				
			}
			
			else {
				System.out.println("마스크를 "+num+"개 구매합니다.\n");
				phy.setNum(phy.getNum()-num);
			}
		}
	}
	
}