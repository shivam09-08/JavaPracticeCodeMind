package Encapsulation;

public class Rectangle {
	private int length;
	private int breadth;
	
	
	public Rectangle(int len ,int bre)
	{
		this.length =len;
		this.breadth= bre;
	}


	public int getLength() {
		return length;
	}


	public int getBreadth() {
		return breadth;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

}
