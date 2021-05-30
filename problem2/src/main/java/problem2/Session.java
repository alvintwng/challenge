package problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Session {
	private LocalDateTime startTime;
	private int duration;
	private ArrayList<Talk> talks;
	
	public Session() {
		super();
	}
	public Session(ArrayList<Talk> talks) {
		super();
		this.talks = talks;
	}
	public ArrayList<Talk> getTalks() {
		return talks;
	}
	public void setTalks(ArrayList<Talk> talks) {
		this.talks = talks;
	}

	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(String text) {
	    DateTimeFormatter dTF;  //Declare dateTime formatter
	    dTF = DateTimeFormatter.ofPattern("d/M/yyyy HH:mm");
	    LocalDateTime parsedDate = LocalDateTime.parse(text, dTF);
		this.startTime = parsedDate;
	}
	
	// total duration of talks within this session
	public int getTotalTime() {
		int ttime = 0;
		for (var s : talks) {
			ttime += s.getMins();
		}
		return ttime;
	}
	
	public void printSess() {
	    DateTimeFormatter tF = DateTimeFormatter.ofPattern("hh:mm a");	// Declare Time format	
		LocalDateTime ldt = getStartTime();
		for (var s : talks) {
			System.out.println(ldt.format(tF) + "\t" +s.getDesc());
			ldt = ldt.plusMinutes(s.getMins());
		}
	}
	
	/* for ScheduleMustFinishedByNoon, Selection Sort algorithm */ 
	// talks - talks allocated to be sort; session - to be sort into this empty session
	public Session selectionSort(ArrayList<Talk> talks, Session session) {
		var balTalks = new ArrayList<Talk>();	// unselected Talks
		var temp = new ArrayList<Talk>();	// sorting Talks buffer for UN-selected talk
		var sessTalks = session.getTalks();	// sorting Talks buffer for Selected talk
		int sessDura = session.getDuration();	// sort to within this duration
		
		do {
			sessTalks.clear();
			temp.clear();
			
			for (var t : talks) {
				if ((session.getTotalTime() + t.getMins() ) <= sessDura) {
					sessTalks.add(t);}
				else temp.add(t);
			}
			
			// remove 1st talk from talks, and proceed to next round
			if ((session.getTotalTime() != sessDura) && (temp.size() > 0) ) {
				balTalks.add(talks.get(0));
				talks.remove(0);
			}
		} while ((session.getTotalTime() != sessDura) && (temp.size() > 0) );
		
		for (var t : temp) {
			balTalks.add(t);
		}
		
		setTalks(balTalks);
		return session;
	}	
}
