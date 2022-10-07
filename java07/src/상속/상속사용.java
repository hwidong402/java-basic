package 상속;

public class 상속사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.gender = "남자";
		p.name = "클라크";
		System.out.println(p);
		
		맨 m = new 맨();
		m.gender = "남자";
		m.name = "데이비드";
		m.size = 100;
		
		System.out.println(m);
		
		수퍼맨 sMan = new 수퍼맨();
		sMan.gender = "남자";
		sMan.name = "윌리엄";
		sMan.size = 200;
		System.out.println(sMan);
		
		sMan.날아다니다(); // 수퍼맨
		sMan.달리다(); // 맨
		sMan.먹다(); // 사람
		sMan.잠자다(); // 사람
		
		우먼 wMon = new 우먼();
		wMon.gender = "여자";
		wMon.name = "엠마 스톤";
		wMon.size = 50;
		
		wMon.섬광();
		System.out.println(wMon);
		
		원더우먼 wM = new 원더우먼();
		wM.gender = "여성";
		wM.height = 175;
		wM.name = "아만다 사이프리드";
		wM.size = 55;
		wM.버티다();
		System.out.println(wM);
	}

}
