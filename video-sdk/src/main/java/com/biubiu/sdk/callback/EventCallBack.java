package com.biubiu.sdk.callback;


import com.biubiu.sdk.data.CommandTasker;

/**
 * 事件回调
 *
 * @author zhangyule1993@sina.com
 * @version 2020年06月26日
 * @since jdk1.8
 */
public interface EventCallBack {

    /**
     * 命令行执行开始事件
     *
     * @param t      -事件类型
     * @param tasker -任务信息
     */
    boolean callback(EventCallBackType t, CommandTasker tasker);
}
