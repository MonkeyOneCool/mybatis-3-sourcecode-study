package org.apache.ibatis.demo.plugin;

import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;

@Intercepts({
  @Signature(type = ParameterHandler.class, method = "getParameterObject", args = {})
})
public class MyPlugin3 implements Interceptor {

  @Override
  public Object intercept(Invocation invocation) throws Throwable {
    System.out.println("执行方法前ParameterHandler。。。");
    Object proceed = invocation.proceed();
    System.out.println("执行方法后ParameterHandler。。。");
    return proceed;
  }
}
