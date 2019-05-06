
public class OverrideInitialValue {

	public static void main(String[] args)
	{
		ThreadLocal myThreadLocal = new ThreadLocal()
		{
			public Object initialValue()
			{
				return "abc";
			}
		};
		System.out.println(myThreadLocal.get());
		myThreadLocal.set("override");
		System.out.println(myThreadLocal.get());
		myThreadLocal.remove();
		System.out.println(myThreadLocal.get());
		myThreadLocal.remove();
		System.out.println(myThreadLocal.get());
	}

}
