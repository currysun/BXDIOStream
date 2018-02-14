package ObjectOriented;import java.util.Arrays;
import java.util.Comparator;

import javax.swing.plaf.synth.SynthCheckBoxMenuItemUI;



interface Shape
{
    void getArea(int r) throws Exception;
    void getArea(int l,int w) throws Exception;
}

class Circle implements Shape{
    double area=0;
    final double pai=3.1434;
    public void getArea(int r ) throws Exception{
              area=pai*r*r;
  System.out.println(area);
    }
	@Override
	public void getArea(int l, int w) {
		// TODO Auto-generated method stub
		
	}

}

class Square implements Shape{
    double area=0;
    public void getArea(int l ,int w) throws Exception{
              area=l*w;
    System.out.println(area);
    }
	@Override
	public void getArea(int r) {
		// TODO Auto-generated method stub
		
	}

}

class Practice2
{
    public static void main(String[] args){
        
        Shape sc=new Circle();
        Shape ss=new Square();
        try
        {
        	sc.getArea(99999999);
        }
        catch(Exception e)
        {
        	System.out.println("非法数字");
        }

        try
        {
        	ss.getArea(5,6);
        }
        catch(Exception e)
        {
        	System.out.println("非法数字");
        }
    
    }
}

//===========================================================

class Circle1 implements Comparable
{
        private static double pi=3.14;
        private double radius;
        public Circle1(double r)
        {
            radius=r;
        }
        public static double compare(Circle1[] cir)
        {
            //code
        	//int maxIndex=0;
        	/*double maxNum=cir[0].radius;
        	
        	for (int i = 1; i < cir.length; i++) {
				if (maxNum<cir[i].radius) {
					maxNum=cir[i].radius;
				}
			}
        	return  maxNum;*/
        	Circle1 maxNum=cir[0];
        	
        	for (int i = 1; i < cir.length; i++) {
				if (maxNum.compareTo(cir[i])<0) {
					maxNum=cir[i];
				}
			}
        	return maxNum.radius;
        }
        
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			Circle1 circle=(Circle1) o;
			return (int)(this.radius-circle.radius);
		}
        

}
class TC
{
   public static void main(String args[])
    {
	   		//String aStrings[]=new String[3];
            Circle1[] cir=new Circle1[3];
            cir[0]=new Circle1(1.0);
            cir[1]=new Circle1(2.0);
            cir[2]=new Circle1(4.0);
              System.out.println("最大的半径值是： "+Circle1.compare(cir));
    }
}

