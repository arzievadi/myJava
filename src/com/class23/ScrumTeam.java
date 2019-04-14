package com.class23;

public class ScrumTeam extends Employee  {

public String artifacts;	
public String ceremonies;



public void workOnArtifacts() {
	System.out.println("scrum team works on  "+artifacts);
}
public void attendScrumMeetings() {
	System.out.println("scrum team attends "+ceremonies);
}
}
