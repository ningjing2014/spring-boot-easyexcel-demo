import com.itclj.ItcljApplication;
import com.itclj.common.utils.ExcelUtil;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItcljApplication.class)
public class Test {

    @org.junit.Test
    public void readLessThan1000Row(){
        String filePath = "D:\\111.xlsx";
        List<Object> objects = ExcelUtil.readLessThan1000Row(filePath);
        objects.forEach(System.out::println);
    }

    /**
     * 生成excle
     * 带sheet参数的方法可参照测试方法readLessThan1000RowBySheet()
     */
    @org.junit.Test
    public void writeBySimple(){
        String filePath = "D:\\测试.xlsx";
        List<List<Object>> data = new ArrayList<>();
        data.add(Arrays.asList("111","222","333"));
        data.add(Arrays.asList("111","222","333"));
        data.add(Arrays.asList("111","222","333"));
        List<String> head = Arrays.asList("表头1", "表头2", "表头3");
        ExcelUtil.writeBySimple(filePath,data,head);
    }
}
