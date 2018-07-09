package ru.kv.pattern.generate.builder.v2;

public class Army {

	public int warriorCount;
	public int tankCount;
	public int jetFighterCount;
	
	public void setWarriorCount(int warriorCount) {
		this.warriorCount = warriorCount;
	}
	
	public void setTankCount(int tankCount) {
		this.tankCount = tankCount;
	}
	
	public void setJetFighterCount(int jetFighterCount) {
		this.jetFighterCount = jetFighterCount;
	}
	
	@Override
	public String toString() {
		return "Army [warriorCount=" + warriorCount + ", tankCount=" + tankCount + ", jetFighterCount="
				+ jetFighterCount + "]";
	}
	
}
