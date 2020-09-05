package com.example.helloworld;

import java.util.List;

import com.sun.istack.internal.NotNull;

public class TestNullable {
	public void foo(@NotNull List<Integer> param){
		int i = param.hashCode();
	}
}
