
import java.util.Scanner;

class Customer{
	private String search_place;
	
	
	void search(Pharmacy pha) {
		search_place = pha.getName();
		System.out.println("["+search_place+"�� ����ũ ��� Ȯ���մϴ�.]");
		pha.show();
	}
	
	void buy(Pharmacy phy, int num) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[�Һ����� ����]");
		if(phy.getNum()<=0) {
			System.out.println("����ũ�� ��� ���� ������ �� �����ϴ�. ");
		}
		
		else {
			if(phy.getNum()<num) {
				System.out.println("���� ����ũ�� ���� "+phy.getNum()+"���� �ֹ��Ͻ� �纸�� �����ϴ�." );
				System.out.print("�����ִ� ��ü ��� "+phy.getNum()+"��ŭ�̶� �����Ͻðڽ��ϱ�?(y/n)");
				String c = sc.next();
				if(c.equals("y")) {
					System.out.println("���� ����ũ�� ���� "+phy.getNum()+"�� �̱� ������ "+phy.getNum()+
							"���� ����ũ�� �����մϴ�. ������ "+(num-phy.getNum())+"���� ����ũ�� �ٸ� �౹���� �����ϰڽ��ϴ�.\n");
					phy.setNum(0);
				}
				if(c.equals("n")) {
					System.out.println("�������� �ʰڽ��ϴ�.");
				}
				
			}
			
			else {
				System.out.println("����ũ�� "+num+"�� �����մϴ�.\n");
				phy.setNum(phy.getNum()-num);
			}
		}
	}
	
}