package guo;

/**
 * 菜单
 * 		为猜拳游戏提供菜单界面
 *
 */
public class Menu {
	public void menu() {
		System.out.println("*********************************猜拳游戏*********************************");
		System.out.println("*********************************请选择*********************************");
		System.out.println("******1. 查看出拳代码		2. 	开始猜拳 	3. 退出 	******");
	}

	public void rule() {
		System.out.println("出拳代码：");
		System.out.println("1-->石头");
		System.out.println("2-->剪刀");
		System.out.println("3-->布");
	}
}
