package kr.hs.gsw.web.simplest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimplestApplicationTests {

	@Test
	void contextLoads() {
		String hobby1 = request.getParameter("hobby");
		if(hobby1 == null) {
			hobby1 = "reading";
		}
		String sCount = request.getParameter("count");
		int count1 = Integer.parseInt(sCount);
		int count1 = 0;
		try {
			count1 = Integer.parseInt(sCount);
		} catch (NumberFormatException ne) {

		}
	}
	Count:120
	Hobby : reading
	Name: gbsw
	Count: 128
	Hobby: football
}
