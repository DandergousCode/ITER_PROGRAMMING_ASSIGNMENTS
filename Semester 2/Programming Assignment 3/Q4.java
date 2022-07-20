class Box<T>
{
	T obj;
	void addition(T a)
	{
		obj=a;
	}
	public T getObj()
	{
		return obj;
	}
}


public class Q4 
{
	public static void main(String[] args) 
	{
		Box<String> sobj = new Box<>();
		Box<String> so = sobj;
		so.addition("Lenovo");
		System.out.println(so.getObj());

		Box<Object> oobj = new Box<>();
		Box<Object> oo = oobj;
		oo.addition('s');
		
		System.out.println(oo.getObj());
		Box<Integer> iobj = new Box<>();
		Box<Integer> io = iobj;
		io.addition(340);
		System.out.println(io.getObj());
	}
}