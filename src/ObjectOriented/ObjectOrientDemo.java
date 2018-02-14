package ObjectOriented;

public class ObjectOrientDemo {
	public static void main(String[] args) {
		Zi zi=new Zi();
	}
	
}

class Fu{
	
	Fu(){
		show();
	}
	
	public void show() {
		System.out.println("Fu class show");
	}
}

class Zi extends Fu{
	int num=9;
	public Zi() {
		System.out.println("constructor method "+num);
	}
	public void show() {
		System.out.println("show num "+num);
	}
}
