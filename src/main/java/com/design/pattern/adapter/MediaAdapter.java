package com.design.pattern.adapter;


public class MediaAdapter implements IMediaPlayer {
	IAdvancedMediaPlayer fIAdvancedMediaPlayer;

	public MediaAdapter(String audioType) {
		switch (audioType){
			case "vlc":
				fIAdvancedMediaPlayer = new VLCPlayer();
				break;
			case "mp4":
				fIAdvancedMediaPlayer = new MP4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		switch(audioType){
			case "vlc":
				fIAdvancedMediaPlayer.playVLC(fileName);
				break;
			case "mp4":
				fIAdvancedMediaPlayer.playMP4(fileName);
		}
	}
}
