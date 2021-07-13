package com.eight.utils;

public class SqlUtils {
    private StringBuffer sql=new StringBuffer("SELECT * FROM ");
    private int iniSqlLen;//不进行任何条件插入时sql语句的长度，方便后面进行条件的删除
    public SqlUtils(String tb_name){//初始化sql语句
        sql.append(tb_name+";");
        iniSqlLen=sql.length()-1;
    }
    public void Add(String newCon){//newCon:用户添加的新的筛选条件
        if(!sql.toString().contains("WHERE")){
            sql.insert(sql.length()-1," WHERE ");
        }
        else
        {
            sql.insert(sql.length()-1," & ");
        }
        sql.insert(sql.length()-1,newCon);
        sql.trimToSize();
    }
    public void Del(String delCon){//delCon:用户不需要的筛选条件
        if(sql.length()-1==iniSqlLen+ delCon.length()+" WHERE ".length()){
            sql=new StringBuffer(sql.toString().replace(" WHERE "+delCon,""));
        }
        else{
            sql=new StringBuffer(sql.toString().replace(delCon+" & ",""));
        }
        sql.trimToSize();
    }

    public String getSql() {
        return sql.toString();
    }
}
