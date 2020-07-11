package com.biubiu.sdk.commandbuidler;

/**
 * 默认流式命令构建器工厂类
 *
 * @author zhangyule1993@sina.com
 * @version 2020年06月26日
 * @since jdk1.8
 */
public class CommandBuidlerFactory {

    public static CommandBuidler createBuidler() {
        return new DefaultCommandBuidler();
    }

    ;

    public static CommandBuidler createBuidler(String rootpath) {
        return new DefaultCommandBuidler(rootpath);
    }

    ;
}
