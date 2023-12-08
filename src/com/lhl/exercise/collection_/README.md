# 开发中如何选择集合实现类？

在实际开发中，选择什么集合实现类，取决于业务操作特点，具体分析如下：

- 先判断存储类型
  - 单列：一组对象
  - 双列：一组键值对
- 单列：Collection 接口
  - 允许重复：List
    - 增删多：LinkedList（底层维护了一个双向链表）
    - 改查多：ArrayList（底层维护了一个 Object 可变数组）
  - 不允许重复：Set
    - 无序：HashSet（底层是HashMap，维护了一个哈希表，即`数组+链表+红黑树`）
    - 排序：TreeSet（底层是TreeMap）
    - 插入和取出顺序一致：LinkedHashSet（底层是LinkedHashMap，维护了一个数组+双向链表）
- 双列：Map 接口
  - 键无序：HashMap（底层是哈希表，即`数组+链表+红黑树`）
  - 键排序：TreeMap（直接实现 Map）
  - 键插入和取出顺序一致：LinkedHashMap
  - 读取文件：Properties（实现了 HashTable）