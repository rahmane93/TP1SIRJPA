package domain;

import java.util.List;

public class ParticipationSondage {
	private Utilisateur participant;
	private Sondage sondage;
	private List<DateSondage> dateChoix;
	
	public Utilisateur getParticipant() {
		return participant;
	}
	public void setParticipant(Utilisateur participant) {
		this.participant = participant;
	}
	public Sondage getSondage() {
		return sondage;
	}
	public void setSondage(Sondage sondage) {
		this.sondage = sondage;
	}
	public List<DateSondage> getDateChoix() {
		return dateChoix;
	}
	public void setDateChoix(List<DateSondage> dateChoix) {
		this.dateChoix = dateChoix;
	}
	

}
