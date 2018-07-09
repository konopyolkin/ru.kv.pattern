package ru.kv.pattern.behavional.state;

public class PlayingState extends State {

	public PlayingState(Player player) {
		super(player);
		player.setPlaying(false);
	}

	@Override
	public String onLock() {
		player.changeState(new LockedState(player));
		player.resetCurrentTrackNumber();
		return "Stop playing";
	}

	@Override
	public String onPlay() {
		player.changeState(new ReadyState(player));
		return "Paused...";
	}

	@Override
	public String onNext() {
		return player.nextTrack();
	}

	@Override
	public String onPrev() {
		return player.prevTrack();
	}

}
