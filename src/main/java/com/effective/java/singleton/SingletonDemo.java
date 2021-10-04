package com.effective.java.singleton;

public class SingletonDemo {
	public static void main(String args[]) {
		SingletonWithPrivateConstructor singleton = SingletonWithPrivateConstructor.getInstance();
		System.out.println(System.identityHashCode(singleton));

		SingletonWithPrivateConstructor singleton2 = SingletonWithPrivateConstructor.getInstance();
		System.out.println(System.identityHashCode(singleton2));
		System.out.println(singleton2.getName());


		System.out.println(System.identityHashCode(SingletonWithEnumType.INSTANCE));
		System.out.println(SingletonWithEnumType.INSTANCE.getName());
	}
}
