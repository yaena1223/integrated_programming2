
class Mask{
	private String type;
	private String color;

	Mask(){};
	Mask(String type, String color){
		this.type = type;
		this.color = color;
	
	}
	void show() {
		System.out.print("����ũ�� ���� : "+type+", �� : "+color);
	}
}

