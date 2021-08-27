package overriding;

import java.util.ArrayList;

public class Ferrari extends ArrayList<String>{
	private int ye;
	public Ferrari(int ye) {
		this.ye = ye;
	}
	public int getYe() {
		return ye;
	}
	public void speed() {
		System.out.println(ye + "년식 페라리 속도 : 300km");
		add("ttt"); //가독성을 높이기 위해 super.add("ttt")라고 씀. 가져왔다는 걸 알리려고
		System.out.println(get(0));
	}
	@Override
	public boolean add(String e) {
		// TODO Auto-generated method stub
		System.out.println("내가 만든 add 메소드");
		System.out.println("저장따윈 하지 않겠다");
		return true;
	}
	
}
