package com.design.pattern.adapter;


import org.apache.commons.lang3.NotImplementedException;

public class VLCPlayer implements IAdvancedMediaPlayer{

	@Override
	public void playVLC(String fileName) {
		System.out.println("Playing VLC file: "+ fileName);
	}

	@Override
	public void playMP4(String fileName) {
		throw new NotImplementedException("VLCPlayer");
	}
}
