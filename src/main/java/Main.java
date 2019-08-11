import org.apache.commons.lang3.StringUtils;
import org.dom4j.io.XMLWriter;

public class Main {
    public static void main(String[] args) {
        //测试使用本地仓库jar包中的类
        StringUtils.isBlank("abc");
        XMLWriter xmlWriter = new XMLWriter();
        System.out.println("StringUtils.isBlank(\"abc\"):"+StringUtils.isBlank("abc"));
        System.out.println("DONE!");
    }
}
