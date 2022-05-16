package org.apache.ibatis.demo;

import org.apache.ibatis.demo.entity.UserDO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @author Robert Hou
 * @since 2022年05月03日 22:19
 **/
public class Test {

  public static void main(String[] args) throws IOException {
    String resource = "org/apache/ibatis/demo/mybatis-config.xml";
    Reader reader = Resources.getResourceAsReader(resource);
    //将配置文件中的配置内容加载进Configuration对象中
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    SqlSession session = sqlSessionFactory.openSession();
    try {
      List<UserDO> list = session.selectList("org.apache.ibatis.demo.dao.UserDAO.list", UserDO.class);
      System.out.println(list);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      session.close();
    }
  }
}
