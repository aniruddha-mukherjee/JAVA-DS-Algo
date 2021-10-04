package com.design.pattern.adapter;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class VLCPlayer implements IAdvancedMediaPlayer{

	@Override
	public void playVLC(String fileName) {
		System.out.println("Playing VLC file: "+ fileName);
	}

	@Override
	public void playMP4(String fileName) {
		throw new NotImplementedException();
	}
}
