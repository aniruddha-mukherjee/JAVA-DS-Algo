package com.example.helloworld;

import java.util.List;
import javax.annotation.Nonnull;

public class TestNullable {
	public void foo(@Nonnull List<Integer> param){
		int i = param.hashCode();
	}
}
