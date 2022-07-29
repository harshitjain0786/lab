class 4
{
	int id;
	String name;
	int age;
	overloading_constructor(int i,String s)
	{
		id = i;
		name = s;
	}
	overloading_constructor(int i,String s,int a)
	{
		id = i;
		name = s;
		age = a;
	}
	void display()
	{
		System.out.println(id+ " " +name+ " "+age);
	}
	public static void main(String[] args) {
		overloading_constructor o1 = new overloading_constructor(101,"harshit");
		overloading_constructor o2 = new overloading_constructor(102,"dhaval",19);
		o1.display();
		o2.display();

	}
}