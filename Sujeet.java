abstract class A
{
public abstract void showSomething();
public void diplaySomething()
{
System.out.println("Calling diplaySomething");
}
}
class Sujeet extends A	
{
public void showSomething()
{
System.out.println("Calling showSomething");
}
	public static void main(String args[])
	{
	//A a=new A();		// throws an error on attemting to creating its object
	Day6P1	obj = new Sujeet();
	obj.diplaySomething();
	obj.showSomething();

	}


}