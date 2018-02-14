package ObjectOriented;

public class ObjectOrientDemo2 {
	public static void main(String[] args) {
		Zi2 zi=new Zi2();
	}
	
}

class Fu2{
	{
		System.out.println("fu constructor code body run ");
		show();
	}
	
	Fu2(){
		super();//obj
		//显示初始化
		//code body 3
		show();
	}
	
	public void show() {
		System.out.println("Fu class show");
	}
}

class Zi2 extends Fu2{
	
	int num=9;
	{
		System.out.println("constuctor code body.."+num);
		num=10;
	}
	public Zi2() {
		super();//1
		//显示初始化5
		//constructor code body6
		System.out.println("constructor method "+num);
	}
	
	public void show() {
		//4
		System.out.println("show num "+num);
	}
	
}
