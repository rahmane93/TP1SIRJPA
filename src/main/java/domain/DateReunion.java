package domain;

import java.util.Date;

public class DateReunion {
	 private Date date;
	 private boolean hasPause;
	 
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isHasPause() {
		return hasPause;
	}
	public void setHasPause(boolean hasPause) {
		this.hasPause = hasPause;
	}
}
