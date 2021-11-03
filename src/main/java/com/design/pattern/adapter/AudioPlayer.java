package com.design.pattern.adapter;


public class AudioPlayer implements IMediaPlayer{
	MediaAdapter fMediaAdapter;

	@Override
	public void play(String audioType, String fileName) {

	if(audioType.equalsIgnoreCase("mp3"))
				playMP3(fileName);
	else if(audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")){
		fMediaAdapter = new MediaAdapter(audioType);
		fMediaAdapter.play(audioType,fileName);
	}else
		System.out.println("Invalid media. " + audioType + " format not supported");
	}

	public void playMP3(String fileName) {
		System.out.println("Playing mp3 file: "+ fileName);
	}
}
