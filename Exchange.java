package guo;

/**
 * 翻译
 *		将出拳代码翻译成出拳样式
 *		1  将翻译成  石头
 *		2  将翻译成  剪刀
 *		3  将翻译成  布
 */
public class Exchange {

	public String exchange(int num) {
		String quan = null;
		switch (num) {
		case 1: {
			quan = "石头";
			break;
		}
		case 2: {
			quan = "剪刀";
			break;
		}
		case 3: {
			quan = "布";
			break;
		}
		}
		return quan;
	}
}
