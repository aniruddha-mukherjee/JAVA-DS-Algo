package com.example.helloworld;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void isGreater() {
		assertThat(new HelloWorld().isGreater(7, 1), is(true));
	}
}