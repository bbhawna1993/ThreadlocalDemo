
public class ThreadLocalCheck {

	public static void main(String[] args) {

		ThreadLocal myThreadLocal = new ThreadLocal();
		System.out.println(myThreadLocal.get());
		myThreadLocal.set("Durga1");
		myThreadLocal.set("Durga2");
		myThreadLocal.set("Durga3");
		myThreadLocal.set("Durga4");
		myThreadLocal.set("Durga5");
		myThreadLocal.set("Durga6");
		System.out.println(myThreadLocal.get());
//		myThreadLocal.remove();
		System.out.println(myThreadLocal.get());

	}

}
