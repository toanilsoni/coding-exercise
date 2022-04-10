package misc;
class SingletonEager {

	private static SingletonEager singletonObj = new SingletonEager();

	private SingletonEager() {
	};

	public static SingletonEager getInstance() {
		return singletonObj;
	}
}

class SingletonLazy {

	private static SingletonLazy singletonLazy;

	private SingletonLazy() {
	};

	public static SingletonLazy getInstance() {
		if (singletonLazy == null) {
			singletonLazy = new SingletonLazy();
		}
		return singletonLazy;
	}
}

public class SingletonClass {

	public static void main(String[] args) {
		SingletonEager singltonEager = SingletonEager.getInstance();
		System.out.println(singltonEager);

		SingletonEager singltonEager1 = SingletonEager.getInstance();
		System.out.println(singltonEager1);
		
		SingletonLazy singletonLazy = SingletonLazy.getInstance();
		System.out.println(singletonLazy);

		SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
		System.out.println(singletonLazy1);
	}

}
