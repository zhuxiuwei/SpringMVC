import com.xiuwei.dao.BooksMapper;
import com.xiuwei.pojo.Books;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    private SqlSession getSession() throws IOException {
        String resources = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resources);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
        return sessionFactory.openSession();
    }

    @Test
    public void testInsert() throws IOException {
        SqlSession session = getSession();
        try {
            BooksMapper mapper = session.getMapper(BooksMapper.class);
            int i = mapper.addBook(new Books("山海经", 10, "胡编乱造的"));
            System.out.println(i);
            session.commit();
        }finally {
            session.close();
        }
    }

    @Test
    public void testDelete() throws IOException {
        SqlSession session = getSession();
        try {
            BooksMapper mapper = session.getMapper(BooksMapper.class);
            int i = mapper.deleteBookById(1);
            System.out.println(i);
            session.commit();
        }finally {
            session.close();
        }
    }

    @Test
    public void testSelectBooks() throws IOException {
        SqlSession session = getSession();
        try {
            BooksMapper mapper = session.getMapper(BooksMapper.class);
            List<Books> books = mapper.selectBooks();
            System.out.println(books);
        }finally {
            session.close();
        }
    }
}
