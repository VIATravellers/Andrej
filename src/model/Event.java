package model;

public class Event {

	private String name;
	private String season;
	private Article article;
	
	public Event(){
		
	}

	public Event(String name, String season) {
		
		this.name = name;
		this.season = season;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "Event \nName: " + name + ",\nSeason=" + season ;
	}
	
	
}
