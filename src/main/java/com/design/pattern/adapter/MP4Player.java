package com.design.pattern.adapter;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class MP4Player implements IAdvancedMediaPlayer{
	@Override
	public void playVLC(String fileName) {
		throw new NotImplementedException();
	}

	@Override
	public void playMP4(String fileName) {
		System.out.println("Playing mp4 file: "+ fileName);
	}
}
