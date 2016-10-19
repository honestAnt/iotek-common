package com.iotekclass.common.rwSplitting;

import com.iotekclass.tools.constants.Constants;

/**
 * Created by lzq on 2016/3/24.
 */
public class DbContextHolder {

    private static ThreadLocal<String> contextHolder = new ThreadLocal<String>();



    public static String getDbType() {

        String db = contextHolder.get();
        if(db == null) {
            db = Constants.DB_TYPE_WR;// 默认是读写库
        }

        return db;
        }

    public static void setDbType(String str) {
        contextHolder.set(str);
    }
    }
