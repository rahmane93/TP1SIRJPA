package domain;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Sondage {
   private Utilisateur creator;
   private Reunion meeting;
   private List<DateSondage> datesProposees;
   private String lienSondage;
	
   public String getLienSondage() {
	return lienSondage;
   }
	public void setLienSondage(String lienSondage) {
		this.lienSondage = lienSondage;
	}
	public Utilisateur getCreator() {
			return creator;
	}
	
	public void setCreator(Utilisateur creator) {
		this.creator = creator;
	}
	public Reunion getMeeting() {
		return meeting;
	}
	public void setMeeting(Reunion meeting) {
		this.meeting = meeting;
	}
	public List<DateSondage> getDatesProposees() {
		
		return Collections.unmodifiableList(datesProposees);
	}
	public void setDatesProposees(List<DateSondage> datesProposees) {
		this.datesProposees = datesProposees;
	}
	
	public void valideDateReunion(DateSondage dateRetenue) {
		this.meeting.setDateRetenue(dateRetenue.getDate());
		
		if(dateRetenue.isHasPause()) {
			//get list de tous participants au sondage this
			//envoi mail pour choix allergie et preference
		}
		
	}
   
}
