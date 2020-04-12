package ityulkanov;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;

public class HelloOtus {
    public static void main(String[] args) {
        Map items = ImmutableMap.of("test", 4, "test1", 3, "test2", 2);
        items.entrySet()
                .stream()
                .forEach(System.out::println);

        List<String> furniture = Lists.newArrayList("chair", "table", "wardrobe");
        for (String item : furniture) {
            System.out.println(item);
        }

    }

}
