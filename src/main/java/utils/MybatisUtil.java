package utils;

import model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author: martin
 * 写一个工具类来获取 SqlSessionFactory 和 SqlSession
 * SqlSessionFactory
 */
public class MybatisUtil {
    //mybatis配置文件
    private static String resource = "mybatis-config.xml";
    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession sqlSession;
    /**
     * 获得sqlsession
     * @return
     * @throws IOException
     */
    public static SqlSession getSqlSession() throws IOException{
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂，传入mybatis配置文件
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }

    public static void main(String[] args) {
        try {
            SqlSession sqlSession = MybatisUtil.getSqlSession();
            User user = sqlSession.selectOne("UserMapper.queryById",1);
            System.out.println("user " + user.getUsername());
            System.out.println("word " + user.getPassword());
            System.out.println("gender " + user.getGender());
            System.out.println("email " + user.getEmail());
            System.out.println("birthday " + user.getBirthday());
            sqlSession.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
