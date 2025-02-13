package bank;

public class Account {
	public String number;
	public String name;
	public int money;

	@Override
	public String toString() {
		return "Account [number=" + number + ", name=" + name + ", money=" + money + "]";
	}
	
	public String getNumber() {return number;}
	public void setNumber(String number) {this.number = number;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getMoney() {return money;}
	public void setMoney(int money) {this.money = money;}
}
