package test;

import java.util.TreeMap;

public class TreeMapTest {
        public static void main(String[] args){
            TreeMap<Character, Integer> treeMap = new TreeMap<>();
            for (int i = 0; i < 26; i++) {
                treeMap.put((char) ('a' + i), i);
            }

            System.out.println(treeMap);

            // 小于key的最大值  b -> a    c -> b
            System.out.println(treeMap.lowerEntry('b').getKey());
            System.out.println(treeMap.lowerKey('c'));

            // 大于key的最小值  b -> c    c -> d
            System.out.println(treeMap.higherEntry('b').getKey());
            System.out.println(treeMap.higherKey('c'));

            // 大于或等于key的最小值 b -> b     c -> c
            System.out.println(treeMap.ceilingEntry('b').getKey());
            System.out.println(treeMap.ceilingKey('c'));

            // 小于或等于key的最大值 b -> b     c -> c
            System.out.println(treeMap.floorEntry('b').getKey());
            System.out.println(treeMap.floorKey('c'));

            // 二叉树顶部 a
            System.out.println(treeMap.firstEntry().getKey());
            System.out.println(treeMap.firstKey());

            // 二叉树底部 z
            System.out.println(treeMap.lastEntry().getKey());
            System.out.println(treeMap.lastKey());

            // 移除头部
            // a
            System.out.println(treeMap.pollFirstEntry());
            // b
            System.out.println(treeMap.firstEntry().getKey());
            // 移除尾部
            System.out.println(treeMap.pollLastEntry());
            System.out.println(treeMap.lastEntry().getKey());

            // 反转Map
            System.out.println(treeMap.descendingMap());

            // [b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y]
            System.out.println(treeMap.navigableKeySet());
            // 反转keySet
            // [y, x, w, v, u, t, s, r, q, p, o, n, m, l, k, j, i, h, g, f, e, d, c, b]
            System.out.println(treeMap.descendingKeySet());

            // NavigableMap<K,V> subMap(K fromKey, boolean fromInclusive,K toKey,   boolean toInclusive);
            // {e=4, f=5, g=6, h=7, i=8, j=9, k=10, l=11, m=12, n=13, o=14}
            System.out.println(treeMap.subMap('e',true,'p',false));
            // {b=1, c=2, d=3, e=4, f=5, g=6}
            System.out.println(treeMap.headMap('g',true));
            // {r=17, s=18, t=19, u=20, v=21, w=22, x=23, y=24}
            System.out.println(treeMap.tailMap('r'));


        }
    }

