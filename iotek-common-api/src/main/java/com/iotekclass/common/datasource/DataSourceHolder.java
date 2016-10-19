package com.iotekclass.common.datasource;

import javax.sql.DataSource;

/**
 * DataSourceHolder
 * 
 * @author 刘泽权
 * @date 2016-5-11
 */
public class DataSourceHolder {

	private static final String TRANSACTION = "dbTypeTM"; //事务数据源

	private static final String MASTER="dbTypeWR";

	private static final String SLAVE = "dbTypeRD";

	/**
	 * dataSource master or slave
	 */
	private static final ThreadLocal<String> dataSources = new ThreadLocal<String>();

	/**
	 * master local
	 */
	private static final ThreadLocal<DataSource> masterLocal = new ThreadLocal<DataSource>();

	/**
	 * master local
	 */
	private static final ThreadLocal<DataSource> slaveLocal = new ThreadLocal<DataSource>();

	/**
	 * master local
	 */
	private static final ThreadLocal<DataSource> transactionLocal = new ThreadLocal<DataSource>();

	/**
	 * 设置数据源
	 * 
	 * @param dataSourceKey
	 * @author 刘泽权
	 * @date 2016-5-11
	 */
	private static void setDataSource(String dataSourceKey) {
		dataSources.set(dataSourceKey);
	}

	/**
	 * 获取数据源
	 * 
	 * @return
	 * @author 刘泽权
	 * @date 2016-5-11
	 */
	private static String getDataSource() {
		return (String) dataSources.get();
	}

	/**
	 * 标志为master
	 */
	public static void setMaster() {
		setDataSource(MASTER);
	}

	/**
	 * 标志为slave
	 */
	public static void setSlave() {
		setDataSource(SLAVE);
	}

	public static void setTransaction() {
		setDataSource(TRANSACTION);
	}
	
	/**
	 * 将master放入threadlocal
	 * @param master
	 */
	public static void setMaster(DataSource master) {
		masterLocal.set(master);
	}
	
	/**
	 * 将slave放入threadlocal
	 * @param
	 */
	public static void setSlave(DataSource slave) {
		slaveLocal.set(slave);
	}

	public static void setTransaction(DataSource transaction) {
		transactionLocal.set(transaction);
	}

	
	public static boolean isMaster() {
		return getDataSource() == MASTER;
	}

	public static boolean isSlave() {
		return getDataSource() == SLAVE;
	}

	public static boolean isTransaction() {
		return getDataSource() == TRANSACTION;
	}

	/**
	 * 清除thread local中的数据源
	 *
	 * @author 刘泽权
	 * @date 2016-5-11
	 */
	public static void clearDataSource() {
		dataSources.remove();
		masterLocal.remove();
		slaveLocal.remove();
		transactionLocal.remove();
	}
}
