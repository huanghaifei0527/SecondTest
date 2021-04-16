package guo;

/**
 * 生成系统的出拳方式
 *
 */
public class Number {

	private int num;

	public int getNum() {
		return num;
	}

	public void setNum() {
		this.num = (int) (Math.random() * 3 + 1);
	}

	public int createNumber() {
		System.out.println("系统出拳中...");
		new Exchange().exchange(num);
		return num;
	}
}
