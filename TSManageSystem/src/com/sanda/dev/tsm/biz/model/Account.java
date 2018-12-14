/**
 * 
 */
package com.sanda.dev.tsm.biz.model;

import java.io.Serializable;

/**
 * @author erwin.wang
 *
 * 2018年10月15日 下午1:56:13
 */
public class Account implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer accountId;
	private String accountName;
	private String accountEmail;
	
	/**
	 * 
	 */
	public Account() {
		super();
	}
	/**
	 * @return the accountId
	 */
	public Integer getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}
	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	/**
	 * @return the accountEmail
	 */
	public String getAccountEmail() {
		return accountEmail;
	}
	/**
	 * @param accountEmail the accountEmail to set
	 */
	public void setAccountEmail(String accountEmail) {
		this.accountEmail = accountEmail;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + ", accountEmail=" + accountEmail
				+ "]";
	}
	
	
}
