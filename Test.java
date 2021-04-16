package guo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		do {
			// 菜单页面
			Menu menu = new Menu();
			menu.menu();
			try {
				// choice --> 操作数
				int choice = sc.nextInt();
				switch (choice) {
				case 1: {
					// 介绍出拳代码
					System.out.println();
					System.out.println("******关于游戏******");
					menu.rule();
					System.out.println();
					break;
				} // 查看出拳代码
				case 2: {
					System.out.println();
					System.out.println("******开始游戏******");
					// 系统出拳
					Number number = new Number();
					number.setNum();
					number.createNumber();
					// 用户出拳
					GetInput userInput = new GetInput();
					userInput.getUserInput();
					// 判断
					Judge judge = new Judge();
					judge.judge(number, userInput);
					System.out.println();
					break;
				} // 开始猜拳
				case 3: {
					System.out.println();
					System.out.println("******退出游戏******");
					// 退出游戏
					System.out.println("退出成功！");
					System.exit(0);
					break;
				} // 退出
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}
			} catch (Exception e) {
				// 捕抓异常
				// 玩家输入的操作数不是int型
				System.out.println("操作错误！");
				System.out.println("操作数必须是整数（1 | 2 | 3）！");
				System.out.println("退出中...");
				System.exit(0);
			}

		} while (true);
	}
}
