/**
 * 
 */
package com.sanda.dev.tsm.biz.dao;

import java.util.List;

import com.sanda.dev.tsm.biz.model.Account;

/**
 * @author erwin.wang
 *
 * 2018年10月15日 下午1:58:28
 */
public interface AccountDao {

	/**
	 * @Description:
	 * 				
	 * @return List<Account>
	 */
	public List<Account> queryAllAccount();
	
	/**
	 * 
	 * @Description:
	 *
	 * @param AccountId
	 * @return Account
	 */
	public Account queryAccountById(Integer AccountId);
	
	
	/**
	 * @Description:
	 *  			here is a save a Account method
	 * @param Account
	 * @return boolean false isn't save successfully!
	 * 				   true is save successfully!
	 */
	public boolean saveAccount(Account Account);
	
	/**
	 * 
	 * @Description:
	 *
	 * @param AccountId
	 * @return boolean false isn't delete successfully!
	 * 				   true is delete successfully!
	 */
	public boolean deleteAccountById(Integer AccountId);
	
	/**
	 * 
	 * @Description:
	 *
	 * @param Account
	 * @return boolean false isn't update successfully!
	 * 				   true is update successfully!
	 */
	public boolean updateAccount(Account Account);
}
