import org.junit.jupiter.api.Test;import java.util.ArrayList;import java.util.Iterator;import java.util.List;/** * @program: spring-demo * @description: 遍历ArrayList * @author: gonghuihui * @create: 2019-03-06 11:28 **/public class TestArrayList {    @Test    public void testArrayList() {        List<String> list = new ArrayList<String>();        list.add("Hello");        list.add("World");        list.add("HAHAHAHAHA");        // foreach遍历        for (String str : list) {            System.out.println(str);        }        // 把链表变为数组相关的内容进行遍历        String[] strArray = new String[list.size()];        list.toArray(strArray);        for (int i=0; i<strArray.length; i++) {            System.out.println(strArray[i]);        }        // 使用迭代器进行遍历        Iterator<String> ite = list.iterator();        while (ite.hasNext()) {            System.out.println(ite.next());        }    }}