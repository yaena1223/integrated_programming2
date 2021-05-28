import java.util.Scanner;



public class Main {
	
	static void menu() {
		System.out.println("************************************\n");
		System.out.println("  0.menu");
		System.out.println("  1. �Һ��� : ����ũ ����");
		System.out.println("  2. �Һ��� : �౹�� ����ũ ��� Ȯ��");
		System.out.println("  3. �౹ : ������ü�� ���� ����ũ ����");
		System.out.println("  4. ������ü : ������ü�� ��� Ȯ�� ");
		System.out.println("  5. ������ü : ����ũ ����");
		System.out.println("  6. ���α׷� ����");
		System.out.println("\n************************************");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu();
		
		Pharmacy ph1 = new Pharmacy("��ȣ�౹",20); // �౹ ����ũ ��� ó���� 20���� ����. 
		
		int stock;
		stock = (int)(20+Math.random()*200);
		
		Provider company = new Provider("Aȸ��","kf94", "white", stock); // ������ü ����ũ ��� �������� ����. 
		System.out.println("�ʱ�"+company.getCompanyname() +"�� ��� : " + stock);
		System.out.println("�ʱ� "+ph1.getName()+"�� ��� : "+ph1.getNum());
		
		
		Customer yaena = new Customer();
		
		Scanner sc = new Scanner(System.in);
		
		int mode = -1;
		while(mode!=6) {
			System.out.print("Menu ���� > ");
			mode = sc.nextInt();
			switch(mode) {
			
			case 0:
				menu();
				break;
			case 1:
				System.out.println("*********** �Һ��� : ����ũ ���� ***********");
				System.out.print("��� ���� ���� : ");
				int num = sc.nextInt();
				yaena.buy(ph1, num);
				break;
				
			case 2:
				System.out.println("*********** �Һ��� : �౹�� ����ũ ��� Ȯ�� ***********");
				yaena.search(ph1);
				break;
			
				
			case 3: 
				System.out.println("*********** �౹ : ������ü�κ��� ����ũ ���� ***********");
				System.out.print("�౹�� ������ü�κ��� ������ ����ũ�� ������ �Է��ϼ��� > ");
				int buy_num = sc.nextInt();
				ph1.buy(company, buy_num);
				break;
				
			case 4:
				System.out.println("*********** ������ü : ������ü�� ��� Ȯ�� ***********");
				company.check_stock();
				break;

			case 5:
				System.out.println("*********** ������ü : ������ü�� ����ũ ���� ***********");
				System.out.print("������ü�� ������ ����ũ�� ������ �Է��Ͻÿ�. > ");
				int make = sc.nextInt();
				company.make(make);
				System.out.println(company.getCompanyname()+"�� "+make+"���� ����ũ�� �����մϴ�.");
				break;
				
			case 6:
				System.out.println("���α׷� ����");
				break;
			}
		}
		sc.close();
		
	}

	
}
