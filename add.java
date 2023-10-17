class dag
{ 
	int a, b ,c;
	void assign()
	{
		a=20;
		b=30;
	}
	void sum()
	{
		c=a+b;
	}
	void display()
	{
		System.out.println("sum is " + c);
	}
}
class Com extends dag
{
	public static void main(String[] args)
	{
		Com c=new Com();
		c.display();
	}
}
	