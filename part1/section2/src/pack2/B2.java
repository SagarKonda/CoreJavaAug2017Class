package pack2;
class B1 
{
	static int i=50;
	static double j=99.99
}
class B2
{
	public static void main(String a[])
	{
		System.out.println(B1.i);
		System.out.println(B1.j);
		System.out.println(pack1.B1.i);
	}
}
