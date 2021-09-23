import com.xiuwei.pojo.Books;
import com.xiuwei.service.BooksService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {

    //可以用来快速service配置的对不对
    @Test
    public void testService(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService booksService = context.getBean("booksServiceImpl", BooksService.class);
        for (Books selectBook : booksService.selectBooks()) {
            System.out.println(selectBook);
        }
    }
}
