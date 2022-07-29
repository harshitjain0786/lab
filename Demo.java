class Demo
class 
{
	int id;
	String name;
    void demo(int id,String name)
    {
    	this.id = id;
    	this.name = name;
    }	
    void show()
    {
    	System.out.println(id+ " " +name);
    }

}
class this_keyword
{
	public static void main(String[] args) {
		demo d = new demo();
		d.demo(10,"shubham");
		d.show();
	}
}
