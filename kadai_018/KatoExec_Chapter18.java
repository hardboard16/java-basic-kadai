package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		//各クラスのインスタンスを作成する
		KatoTaro_Chapter18 Taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 Ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 Hanako = new KatoHanako_Chapter18();
		
		//setGivenNameメソッドを実行する
		Taro.setGivenName("太郎");
		Ichiro.setGivemName("一郎");
		Hanako.setGivenName("花子");
		
		//execIntroduceメソッドを実行する
		Taro.execIntrduce();
		Ichiro.execIntrduce();
		Hanako.execIntrduce();

	}

}
