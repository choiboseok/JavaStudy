package cafe;

import java.util.ArrayList;
import java.util.Scanner;

import bank.Account;

public class Cafe {
	String name;
	ArrayList <Coffee>menuList = new ArrayList<>();
	
	public Cafe(String name, ArrayList menuList) {
		super();
		this.name = name;
		this.menuList = menuList;
	}

	public Cafe() {
	}

	@Override
	public String toString() {
		return "Cafe [name=" + name + ", menuList=" + menuList + "]";
	}
	
	public static ArrayList<Coffee> addCoffee(String name) {
		ArrayList <Coffee> menu = new ArrayList<>();
		
		System.out.println(name + "입니다.");
		if(name.equals("스타벅스")) {
			menu.add(new Coffee("아메리카노", 5000));
			menu.add(new Coffee("카푸치노", 6000));
			menu.add(new Coffee("오곡라떼", 7000));
		} else if(name.equals("아카")) {
			menu.add(new Coffee("아메리카노", 2500));
			menu.add(new Coffee("바닐라떼", 3000));
			menu.add(new Coffee("아이스티", 3500));
		}
		return menu;
	}
	
	public static void showMenu(String name) {
		ArrayList <Coffee>menuList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		menuList = addCoffee(name);
		int i=1;
		for(Coffee str: menuList) {
			System.out.println(i +". " + "[" + str.name + ": " + str.price + "]");
			i++;
		}
		while(true) {
		System.out.print("메뉴를 선택해주세요: ");
		int buyCoffee = sc.nextInt();
		Coffee c = new Coffee();
			if(buyCoffee == 1) {
				System.out.println(menuList.get(0).name + "를 " + menuList.get(0).price + "원에 구매했습니다.");
				break;
			}else if(buyCoffee == 2) {
				System.out.println(menuList.get(1).name + "를 " + menuList.get(1).price + "원에 구매했습니다.");
				break;
			}else if(buyCoffee == 3) {
				System.out.println(menuList.get(2).name + "를 " + menuList.get(2).price + "원에 구매했습니다.");
				break;
			} else {System.out.println("다시 골라주세요");}
		}
	}
}
