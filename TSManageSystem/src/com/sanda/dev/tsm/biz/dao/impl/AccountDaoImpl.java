/**
 * 
 */
package com.sanda.dev.tsm.biz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sanda.dev.tsm.biz.dao.AccountDao;
import com.sanda.dev.tsm.biz.model.Account;
import com.sanda.dev.tsm.biz.util.db.ConnectDB;


/**s
 * @author erwin.wang
 * @Description:
 *       
 * 2018年9月17日 下午2:58:57
 */
public class AccountDaoImpl implements AccountDao{

	private List<Account> AccountLists= null;
	
	private static final String SQL_ALL_AccountS ="SELECT * FROM Account ORDER BY Account_UPDATED_DATE"; 
	private static final String SQL_A_Account_ID = "SELECT * FROM Account WHERE Account_ID = ?";
	private static final String SQL_INSERT_A_Account = "INSERT INTO Account VALUES(?,?,?,?,?,?,?,?,?,?)";
	private static final String SQL_DELETE_Account_ID = "DELETE FROM Account WHERE Account_ID = ?";
	private static final String SQL_UPATE_A_Account = "UPDATE";
	
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs  = null;
	private Account tea = null;
	private boolean flag = false;
	
	/**
	 * 
	 */
	public AccountDaoImpl() {
		this.AccountLists = new ArrayList<>();
		this.conn = ConnectDB.getConnectDB();
	}
	/**
	 * 
	 */
	public List<Account> queryAllAccount() {
		try {
			this.pstmt = conn.prepareStatement(SQL_ALL_AccountS);
			this.rs =this.pstmt.executeQuery();
			while(rs.next()){
				this.tea = new Account();
				tea.setAccountId(rs.getInt("Account_id"));
				tea.setAccountName(rs.getString("Account_name"));
				this.AccountLists.add(tea);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return AccountLists;
	}

	/* (non-Javadoc)
	 * @see com.clps.sanda.teady.java.two.dao.AccountDao#queryAccountById(java.lang.Integer)
	 */
	@Override
	public Account queryAccountById(Integer AccountId) {
		try {
			this.pstmt = conn.prepareStatement(SQL_A_Account_ID);
			pstmt.setInt(1, AccountId);
			this.rs =this.pstmt.executeQuery();
			while(rs.next()){
				this.tea = new Account();
				tea.setAccountId(rs.getInt("Account_id"));
				tea.setAccountName(rs.getString("Account_name"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return tea;
	}

	/* (non-Javadoc)
	 * @see com.clps.sanda.teady.java.two.dao.AccountDao#saveAccount(com.clps.sanda.teady.java.two.model.Account)
	 */
	public boolean saveAccount(Account tea) {
		try {
			this.pstmt = conn.prepareStatement(SQL_INSERT_A_Account);
			pstmt.setInt(1, tea.getAccountId());
			pstmt.setString(2, tea.getAccountName());
			this.flag=this.pstmt.execute();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return this.flag;
	}

	/* (non-Javadoc)
	 * @see com.clps.sanda.teady.java.two.dao.AccountDao#deleteAccountById(java.lang.Integer)
	 */
	@Override
	public boolean deleteAccountById(Integer AccountId) {
		try {
			this.pstmt = conn.prepareStatement(SQL_DELETE_Account_ID);
			pstmt.setInt(1, AccountId);
			this.flag =this.pstmt.execute();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return this.flag;
	}

	/* (non-Javadoc)
	 * @see com.clps.sanda.teady.java.two.dao.AccountDao#updateAccount(com.clps.sanda.teady.java.two.model.Account)
	 */
	public boolean updateAccount(Account Account) {
		try {
			this.pstmt = conn.prepareStatement(SQL_UPATE_A_Account);
			pstmt.setInt(1, tea.getAccountId());				// dont change Accountid 
			pstmt.setString(2, tea.getAccountName());
			this.flag=this.pstmt.execute();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return this.flag;
	}

	
}
