package br.com.matheus.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date timestemp;
	private String menssage;
	private String details;

	public ExceptionResponse(Date timestemp, String menssage, String details) {
		this.timestemp = timestemp;
		this.menssage = menssage;
		this.details = details;
	}

	public Date getTimestemp() {
		return timestemp;
	}

	public void setTimestemp(Date timestemp) {
		this.timestemp = timestemp;
	}

	public String getMenssage() {
		return menssage;
	}

	public void setMenssage(String menssage) {
		this.menssage = menssage;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
