package jp.co.internous.action;

public class Test {
	public static void main(String[] args){
		Person taro = new Person();
		Person jiro = new Person();
		Person hanako = new Person();
		Robot aibo = new Robot();
		Robot asimo = new Robot();
		Robot pepper = new Robot();

		taro.name ="山田太郎";
		taro.age=20;
		taro.phoneNumber = "080-1111-2222";
		taro.address = "東京都港区";


		jiro.name ="木村次郎";
		jiro.age =18;
		jiro.phoneNumber = "080-3333-4444";
		jiro.address = "東京都豊島区";

		hanako.name = "鈴木花子";
		hanako.age=16;
		hanako.phoneNumber = "080-5555-6666";
		hanako.address = "埼玉県川越市";

		aibo.name = "aibo";
		asimo.name = "asimo";
		pepper.name = "pepper";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();

		aibo.talk();
		aibo.walk();
		aibo.run();

		asimo.talk();
		asimo.walk();
		asimo.run();

		pepper.talk();
		pepper.walk();
		pepper.run();

	}

}
