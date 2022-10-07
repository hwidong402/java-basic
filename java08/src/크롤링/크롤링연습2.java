package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습2 {

	public static void main(String[] args) {
		// 1. 사이트에 연결해서, html문서를 다 가지고 오자.
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
			// Elements list = doc.select(".code"); // class가 code인 태그를 다 찾아서 묶어서 가지고 와 줘
			// System.out.println(list.size());
			// Element tag = list.get(0); // Element는 태그를 나타냄
			// System.out.println(tag.text());

			// Elements list = doc.select(".blind");
			// Elements list = doc.select(".blind");
			// Elements list = doc.select(".클래스명");
			// Elements list = doc.select("태그명.클래스명");
//			System.out.println(list.size());
//			System.out.println(list);
//			for (int i = 0; i < list.size(); i++) {
//				Element tag = list.get(i);
//				System.out.println(i+ ": " + tag);
//			}
			// 현재가
//			Element tag = list.get(16);
//			System.out.println(tag.text());
			
			// 전일가, 고가
			Elements list = doc.select(".first");
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(i+ ": " + tag);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
