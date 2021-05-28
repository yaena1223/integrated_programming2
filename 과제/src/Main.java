import java.util.Scanner;



public class Main {
	
	static void menu() {
		System.out.println("************************************\n");
		System.out.println("  0.menu");
		System.out.println("  1. 소비자 : 마스크 구매");
		System.out.println("  2. 소비자 : 약국의 마스크 재고 확인");
		System.out.println("  3. 약국 : 제조업체로 부터 마스크 구매");
		System.out.println("  4. 제조업체 : 제조업체의 재고 확인 ");
		System.out.println("  5. 제조업체 : 마스크 생산");
		System.out.println("  6. 프로그램 종료");
		System.out.println("\n************************************");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu();
		
		Pharmacy ph1 = new Pharmacy("금호약국",20); // 약국 마스크 재고 처음에 20개로 설정. 
		
		int stock;
		stock = (int)(20+Math.random()*200);
		
		Provider company = new Provider("A회사","kf94", "white", stock); // 제조업체 마스크 재고 랜덤으로 설정. 
		System.out.println("초기"+company.getCompanyname() +"의 재고 : " + stock);
		System.out.println("초기 "+ph1.getName()+"의 재고 : "+ph1.getNum());
		
		
		Customer yaena = new Customer();
		
		Scanner sc = new Scanner(System.in);
		
		int mode = -1;
		while(mode!=6) {
			System.out.print("Menu 선택 > ");
			mode = sc.nextInt();
			switch(mode) {
			
			case 0:
				menu();
				break;
			case 1:
				System.out.println("*********** 소비자 : 마스크 구매 ***********");
				System.out.print("희망 구매 개수 : ");
				int num = sc.nextInt();
				yaena.buy(ph1, num);
				break;
				
			case 2:
				System.out.println("*********** 소비자 : 약국의 마스크 재고 확인 ***********");
				yaena.search(ph1);
				break;
			
				
			case 3: 
				System.out.println("*********** 약국 : 제조업체로부터 마스크 구매 ***********");
				System.out.print("약국이 제조업체로부터 구매할 마스크의 개수를 입력하세요 > ");
				int buy_num = sc.nextInt();
				ph1.buy(company, buy_num);
				break;
				
			case 4:
				System.out.println("*********** 제조업체 : 제조업체의 재고 확인 ***********");
				company.check_stock();
				break;

			case 5:
				System.out.println("*********** 제조업체 : 제조업체의 마스크 생산 ***********");
				System.out.print("제조업체가 생산할 마스크의 개수를 입력하시오. > ");
				int make = sc.nextInt();
				company.make(make);
				System.out.println(company.getCompanyname()+"은 "+make+"개의 마스크를 생산합니다.");
				break;
				
			case 6:
				System.out.println("프로그램 종료");
				break;
			}
		}
		sc.close();
		
	}

	
}
