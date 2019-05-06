
public class OverrideInitialValue {

	public static void main(String[] args)
	{
		ThreadLocal myThreadLocal = new ThreadLocal()
		{
			public Object initialValue()
			{
				return "default value";
			}
		};
		System.out.println(myThreadLocal.get());
		myThreadLocal.set("overriden value");
		System.out.println(myThreadLocal.get());
		myThreadLocal.remove();
		System.out.println(myThreadLocal.get());
	}

}
