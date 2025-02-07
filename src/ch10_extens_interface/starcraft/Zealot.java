package ch10_extens_interface.starcraft;

public class Zealot extends StarUnit{
	private int shideld;
	public Zealot()
	{
		this("질럿", 16, 100, 1, 60);
	}
	public Zealot(String name, int damage, int hp, int armor, int shideld)
	{
		super(name, damage, hp, armor);
		this.shideld = shideld;
	}
	public int getShideld() {return shideld;}
	public void setShideld(int shideld) {this.shideld = shideld;}
	@Override
	public String toString() {
		return "Zealot [shideld=" + shideld + ", getName()=" + getName() + ", getDamage()=" + getDamage() + ", getHp()="
				+ getHp() + ", getArmor()=" + getArmor() + "]";
	}
}