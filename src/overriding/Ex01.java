package overriding;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 오버라이딩
		 - 상속받은 메소드의 내용을 변경하는 것
		 - 업데이트(패치)하고자 하는 내용을 작성
		 오버라이딩 조건
		 -부모 메소드와 이름이 같아야 한다.
		 -매개변수 개수 타입이 같아야 한다.
		 -접근 제한자가 부모와 같거나 커야한다.
		   -private < package < protected < public
		 */
		//Ferrari fe = new Ferrari(2021);
		//fe.speed();
		NewFerrari nfe = new NewFerrari(2022);
		nfe.autoSystem(); nfe.speed();
	}
}

//부모 클래스에서 상속 받고자하는 메소드를 자식 클래스에서 새로 만들고(같은 이름으로)
//내용을 바꾸면 됨

/* 
부모를 over해서 자식거를 쓰겠다
그러니까 어떤 메소드/변수 사용할 때 자식한테도 그게 있으면 자식거를 쓰고
없으면 부모거를 쓰는 거임
*/