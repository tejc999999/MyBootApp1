package jp.te4a.spring.boot.myapp1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HelloControllerTest {

	@Test
	public void index_規定の文字列を返す() {
		HelloController helloController = new HelloController();
		String actual = helloController.index();
		String expected = "Hello, Spring Boot!";
		assertThat(actual, is(expected));
	}
}
