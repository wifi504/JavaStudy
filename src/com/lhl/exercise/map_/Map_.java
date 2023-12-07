package com.lhl.exercise.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/7_17:10
 */
public class Map_ {
    /*
        Map 接口实现类的特点，使用 HashMap 举例
        1. Map 与 Collection 并列存在，用于保存具有映射关系的数据：key-value(双列元素)
        2. Map 中的 Key 和 Value 可以是任意引用类型的数据，会封装进 HashMap$Node 对象中
        3. Map 中的 Key 不允许重复，Value 允许重复
        4. 常用 String 作为 Map 的 Key
        5. k-v 最后是 HashMap$Node node = new Node(hash, key, value, null)
        6. k-v 为了方便遍历，还会创建 EntrySet 集合，该集合存放元素的类型是 Entry
           而一个 Entry 对象就有 k,v EntrySet<Entry<K,V>>
        7. Node 实现了 Entry , 存放是 Entry（向上转型），实际上是 Node
        8. 不保证映射顺序，hashMap 是无序的
        9. hashMap 是线程不安全的
     */
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("No.1", "小明");
        map.put("No.2", "小红");
        map.put("No.1", "小强"); // 当有相同的 Key 时，等价于替换
        map.put("No.3", "小红"); // 允许 Value 重复

        System.out.println(map);
    }
}
