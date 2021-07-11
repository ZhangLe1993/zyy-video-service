package com.biubiu.sdk.util;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ：张音乐
 * @date ：Created in 2021/7/8 下午5:21
 * @description：LRU最近最少使用淘汰策略缓存
 * @email: zhangyule1993@sina.com
 * @version:
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    /**
     * 指定缓存大小
     */
    private final int CACHE_SIZE;

    /**
     * 构造缓存
     * @param cacheSize 缓存大小
     */
    public LRUCache(int cacheSize) {
        super((int) Math.ceil(cacheSize / 0.75) + 1, 0.75f, true);
        CACHE_SIZE = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        // 当 map 中的数据大于指定 size 的时候 , 执行删除, LinkedHashMap 中使用的删除策略是 最近最少使用淘汰策略
        return size() > CACHE_SIZE;
    }


    public static void main(String[] args) {
        LRUCache<String, String> cacheMap = new LRUCache<>(16);
        cacheMap.put("key", "value");
    }
}