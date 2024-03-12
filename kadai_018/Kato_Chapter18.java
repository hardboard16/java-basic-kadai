package kadai_018;

abstract public class Kato_Chapter18 {
	
	//familyNameフィールド
	public String familyName = "加藤";
	
	//givenNameフィールド
	public String givenName;
	
	//addressフィールド
	public String address = "東京都中野区○×";
	
	//commonIntroduceメソッド
	public void commonIntroduce(){
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	//eachIntroduceメソッド
	abstract public void eachIntroduce();
	
	//execIntroduceメソッド
	public void execIntrduce() {
		commonIntroduce();
		eachIntroduce();
	}
	

}
