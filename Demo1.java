class Demo1
{
	static int a = 10;
	int b=10;
	public void display()
	{
		a=a+10;
		b=b+10;
		System.out.println("a :-"  +a);
		System.out.println("b :-"  +b);
	}
}
class Staticdemo
{
	public static void main(String[] args) {
		demo d1 = new demo();
		demo d2 = new demo();
		d1.display();
		d2.display();
	}
}