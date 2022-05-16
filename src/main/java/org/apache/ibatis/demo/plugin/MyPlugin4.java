package org.apache.ibatis.demo.plugin;

import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;

import java.sql.Statement;

@Intercepts({
  @Signature(type = ResultSetHandler.class, method = "handleResultSets", args = {Statement.class})
})
public class MyPlugin4 implements Interceptor {

  @Override
  public Object intercept(Invocation invocation) throws Throwable {
    System.out.println("执行方法前ResultSetHandler。。。");
    Object proceed = invocation.proceed();
    System.out.println("执行方法后ResultSetHandler。。。");
    return proceed;
  }
}
