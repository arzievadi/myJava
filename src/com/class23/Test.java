package com.class23;

public class Test {

	public static void main(String[] args) {
		System.out.println("---Creating Employee object---");
		Employee emp=new Employee();
		//acessing static variable and method
		System.out.println(Employee.department);//acessing through class name
		Employee.work();//acessing through instances that is not preffered
		
		emp.salary=90000;
		emp.getPaid();

		System.out.println("---Creating SrumTeam object---");
		ScrumTeam st=new ScrumTeam();
		//acessing static
		ScrumTeam.work();//can acess through childs
		
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog,Sprint Backlog, BurnDown chart";
		st.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		
		System.out.println("---Creating Developer object---");
		Developer dev =new Developer();
		//acessing
		Developer.work();
		
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprit backlog";
		dev.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();
		
		System.out.println("---Creating Tester object---");
		Tester qa =new Tester();
		qa.salary=100000;
		qa.getPaid();
		qa.artifacts="Sprit backlog";
		qa.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();
	
		System.out.println("---Creating Bussiness Analyst object---");
		BusinessAnalyst ba =new BusinessAnalyst();
		ba.salary=85000;
		ba.getPaid();
		ba.artifacts="Sprit backlog, Product Backlog";
		ba.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();
		
		System.out.println("---Creating Scrum Master object---");
		ScrumMaster sm =new ScrumMaster();
		sm.salary=90000;
		sm.getPaid();
		sm.artifacts="Burn Down Chart";
		sm.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.drivescrumMeetings();
		
		System.out.println("---Creating Product Owner object---");
		ProductOwner po =new ProductOwner();
		po.salary=150000;
		po.getPaid();
		po.artifacts="Sprit backlog, Product Backlog";
		po.ceremonies="Sprit grooming, Sprint Planning, Sprint Demo";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBacklog();
		po.talkToTheClient();
		
		
		System.out.println("---Creating front end developer object---");
		FrontEndDeveloper fed =new FrontEndDeveloper();
	    fed.salary=120000;
		fed.getPaid();
		fed.artifacts="Sprint backlog";
		fed.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		fed.workOnArtifacts();
		fed.attendScrumMeetings();
		fed.code();
		fed.doHtml();
		
		System.out.println("---Creating back end developer object---");
		BackEndDeveloper bed =new BackEndDeveloper ();
	    bed.salary=125000;
		bed.getPaid();
		bed.artifacts="Sprint backlog";
		bed.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		bed.workOnArtifacts();
		bed.attendScrumMeetings();
		bed.code();
		bed.doSql();
		
		System.out.println("---Creating  ManualTester object---");
		ManualTester mt =new ManualTester();
		mt.salary=140000;
		mt.getPaid();
		mt.artifacts="Sprit backlog";
		mt.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		mt.workOnArtifacts();
		mt.attendScrumMeetings();
		mt.test();
		mt.testManually();
		
		System.out.println("---Creating AutomationTester object---");
		AutomationTester at =new AutomationTester();
		at.salary=150000;
		at.getPaid();
		at.artifacts="Sprit backlog";
		at.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		at.workOnArtifacts();
		at.attendScrumMeetings();
		at.test();
		at.codeInJava();
	}
}