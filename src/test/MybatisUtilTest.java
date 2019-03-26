import model.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtil;

public class MybatisUtilTest {
    private MybatisUtil mybatisUtil;
    @Test
    public void Testselect() throws Exception {
         SqlSession sqlSession = mybatisUtil.getSqlSession();
         //sqlSession.selectOne()最终结果与映射文件中所匹配的resultType类型
        User user = sqlSession.selectOne("UserMapper.queryById",1);
        System.out.println("姓名: " + user.getUsername());
        sqlSession.close();
    }
}
