package guo;

/**
 * 判断
 * 		对用户出拳进行合法性判断
 * 		对系统出拳和用户出拳进行胜负判定
 * @author Admin
 *
 */
public class Judge {

	public void judge(Number num, GetInput getin) {

		if (new Exchange().exchange(getin.getInput()) == null) {
			System.out.println("您未出拳！！！");
		} else {
			System.out.println("系统出拳" + new Exchange().exchange(num.getNum()));
			System.out.println("您出拳" + new Exchange().exchange(getin.getInput()));

			int result = num.getNum() - getin.getInput();

			switch (result) {
			case -2:
			case 1: {
				System.out.println("您胜利了！！！");
				break;
			}
			case 0:
				System.out.println("平");
				break;
			case -1:
			case 2: {
				System.out.println("系统胜利！！！");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + result);
			}
		}
	}
}
