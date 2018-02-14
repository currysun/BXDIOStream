package ObjectOriented;

import java.io.FileNotFoundException;

public class Practice {
	public static void main(String[] args) {
		A a=new B();
		//a.func();
	}
}

interface A{
	
}
class B implements A{
	public String func() {
		return "func";
	}
}


class Demo
{
    public static void func(){
        try{
            throw new Exception();
            
            //System.out.println("A"); 
        }catch (Exception e)
        {
            System.out.println("B");
        }
    }
    public static void main(String[] args)
        {
              try{
                func();
                }catch (Exception e)
                {
                System.out.println("C");
                }
                System.out.println("D");
        }
}


class Test
{
        public static String output="";
        public static void foo(int i)
        {
            try
                {
            	if(i==1)
                        throw new Exception();
                        output+="1";
                }
            catch(Exception e)
                {
                    output+="2";
                    return;
                 }
                finally
                {
                       output+="3";
                }
                output+="4";
        }

        public static void main(String args[])
        {
            foo(0);
             System.out.println(output);
            foo(1);
             System.out.println(output);
        }

}

