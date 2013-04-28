package com.sw_engineering_candies;

import org.springframework.stereotype.Service;

@Service
public class Foo {

	public String run(final String input) {
		return input + " from Foo";
	}

}
