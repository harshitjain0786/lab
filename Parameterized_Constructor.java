class Parameterized_Constructor
{
	int id;
	String name;
	parameterized_constructor(int i,String s)
	{
		id = i;
		name = s;
	}
	void display()
	{
		System.out.println(id+ " " +name);
	}
	public static void main(String[] args) {
		
		parameterized_constructor p1 = new parameterized_constructor(101,"shubham");
		parameterized_constructor p2 = new parameterized_constructor(102,"sahil");
		p1.display();
		p2.display(); 
	}

}