package Pojo;

public class Score {
	private int teamA;
	private int teamB;
	private String winner;
	
	
	public Score(int teamA, int teamB, String winner) {
		super();
		this.teamA = teamA;
		this.teamB = teamB;
		this.winner = winner;
	}
	public int getTeamA() {
		return teamA;
	}
	public void setTeamA(int teamA) {
		this.teamA = teamA;
	}
	public int getTeamB() {
		return teamB;
	}
	public void setTeamB(int teamB) {
		this.teamB = teamB;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	

}
