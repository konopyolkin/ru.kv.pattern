package ru.kv.pattern.behavional.state;

public class LockedState extends State {

	public LockedState(Player player) {
		super(player);
	}

	@Override
	public String onLock() {
		if (player.isPlaying()) {
			player.changeState(new ReadyState(player));
			return "Stop playing";
		} else {
			return "Locked ...";
		}
	}

	@Override
	public String onPlay() {
		player.changeState(new ReadyState(player));
		return "Ready";
	}

	@Override
	public String onNext() {
		return "Locked...";
	}

	@Override
	public String onPrev() {
		return "Locked...";
	}

}
