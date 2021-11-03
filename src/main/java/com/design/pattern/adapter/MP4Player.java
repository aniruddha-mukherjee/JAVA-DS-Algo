package com.design.pattern.adapter;


import org.apache.commons.lang3.NotImplementedException;

public class MP4Player implements IAdvancedMediaPlayer{
	@Override
	public void playVLC(String fileName) { throw new NotImplementedException("MP4PLayer");
	}

	@Override
	public void playMP4(String fileName) {
		System.out.println("Playing mp4 file: "+ fileName);
	}
}
