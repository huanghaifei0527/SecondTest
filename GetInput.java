package guo;

import java.util.Scanner;

/**
 * 获取用户出拳方式
 *
 */
public class GetInput {

	private int input;

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}

	public int getUserInput() {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入猜拳代码\n");
		try {
			input = in.nextInt();
		} catch (Exception e) {
			System.out.println("出拳代码必须为1  |  2  |  3");
		}
		return input;
	}
}
