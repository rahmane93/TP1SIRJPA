package domain;

import java.util.Date;

public class Reunion {
   private String titre;
   private String resume;
   private Date dateRetenue;
   private String lienPad;
   
	public String getLienPad() {
	return lienPad;
}
public void setLienPad(String lienPad) {
	this.lienPad = lienPad;
}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public Date getDateRetenue() {
		return dateRetenue;
	}
	public void setDateRetenue(Date dateRetenue) {
		this.dateRetenue = dateRetenue;
	}
   
   
}
