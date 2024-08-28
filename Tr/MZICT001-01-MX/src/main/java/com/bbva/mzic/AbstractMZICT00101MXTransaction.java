package com.bbva.mzic;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.mzic.dto.project.CostumerDTO;
import com.bbva.mzic.dto.project.LetterDTO;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractMZICT00101MXTransaction extends AbstractTransaction {

	public AbstractMZICT00101MXTransaction(){
	}


	/**
	 * Return value for input parameter Name
	 */
	protected String getName(){
		return (String)this.getParameter("Name");
	}

	/**
	 * Return value for input parameter Phone
	 */
	protected Long getPhone(){
		return (Long)this.getParameter("Phone");
	}

	/**
	 * Return value for input parameter Lastname
	 */
	protected String getLastname(){
		return (String)this.getParameter("Lastname");
	}

	/**
	 * Return value for input parameter email
	 */
	protected String getEmail(){
		return (String)this.getParameter("email");
	}

	/**
	 * Return value for input parameter MZICC005
	 */
	protected CostumerDTO getMzicc005(){
		return (CostumerDTO)this.getParameter("MZICC005");
	}

	/**
	 * Set value for String output parameter Name
	 */
	protected void setName(final String field){
		this.addParameter("Name", field);
	}

	/**
	 * Set value for String output parameter LastName
	 */
	protected void setLastname(final String field){
		this.addParameter("LastName", field);
	}

	/**
	 * Set value for Long output parameter Secuence
	 */
	protected void setSecuence(final Long field){
		this.addParameter("Secuence", field);
	}

	/**
	 * Set value for Long output parameter phone
	 */
	protected void setPhone(final Long field){
		this.addParameter("phone", field);
	}

	/**
	 * Set value for LetterDTO output parameter LetterDTO
	 */
	protected void setLetterdto(final LetterDTO field){
		this.addParameter("LetterDTO", field);
	}
}
