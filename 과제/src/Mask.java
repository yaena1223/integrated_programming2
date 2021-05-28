
class Mask{
	private String type;
	private String color;

	Mask(){};
	Mask(String type, String color){
		this.type = type;
		this.color = color;
	
	}
	void show() {
		System.out.print("마스크의 종류 : "+type+", 색 : "+color);
	}
}

