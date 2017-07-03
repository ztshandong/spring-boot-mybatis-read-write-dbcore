//package com.zhangtao.aop;
//
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import DataSourceContextHolder;
//import DataSourceType;
//
///**
// * 在dao层决定数据源(注：如果用这方式，service层不能使用事务，否则出问题，因为打开事务打开时，就会觉得数据库源了）
// * @author Jfei
// *
// */
////@Aspect
////@Component
//public class DataSourceAopInDao {
//
//	private static Logger log = LoggerFactory.getLogger(DataSourceAopInDao.class);
//
//	@Before("execution(* com.zhangtao.dao..*.find*(..)) "
//			+ " or execution(* com.zhangtao.dao..*.get*(..)) "
//			+ " or execution(* com.zhangtao.dao..*.query*(..))")
//    public void setUserDBReadDataSourceType() {
//        DataSourceContextHolder.setUserDBRead();
//    }
//
//    @Before("execution(* com.zhangtao.dao..*.insert*(..)) "
//    		+ " or execution(* com.zhangtao.dao..*.update*(..))"
//    		+ " or execution(* com.zhangtao.dao..*.add*(..))")
//    public void setUserDBWriteDataSourceType() {
//        DataSourceContextHolder.setWrite();
//    }
//
//
///*    @Before("execution(* com.zhangtao.dao..*.*(..)) "
//			+ " and @annotation(UserDBReadDataSource) ")
//	public void setUserDBReadDataSourceType() {
//		//如果已经开启写事务了，那之后的所有读都从写库读
//		if(!DataSourceType.userDBwrite.getType().equals(DataSourceContextHolder.getReadOrWrite())){
//			DataSourceContextHolder.setUserDBRead();
//		}
//
//	}
//
//	@Before("execution(* com.zhangtao.dao..*.*(..)) "
//			+ " and @annotation(com.zhangtao.annotation.WriteDataSource) ")
//	public void setUserDBWriteDataSourceType() {
//	    DataSourceContextHolder.setWrite();
//	}*/
//}
