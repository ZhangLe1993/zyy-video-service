package com.biubiu.sdk.data;


import com.biubiu.sdk.callback.EventCallBackType;

/**
 * 命令行事件消息
 *
 * @author zhangyule1993@sina.com
 * @version 2020年06月26日
 * @since jdk1.8
 */
public class TaskerEventMsg {
    EventCallBackType ecbt;
    CommandTasker tasker;

    public TaskerEventMsg(EventCallBackType ecbt, CommandTasker tasker) {
        super();
        this.ecbt = ecbt;
        this.tasker = tasker;
    }

    public EventCallBackType getEcbt() {
        return ecbt;
    }

    public void setEcbt(EventCallBackType ecbt) {
        this.ecbt = ecbt;
    }

    public CommandTasker getTasker() {
        return tasker;
    }

    public void setTasker(CommandTasker tasker) {
        this.tasker = tasker;
    }

    @Override
    public String toString() {
        return "CommandEventMsg [ecbt=" + ecbt + ", tasker=" + tasker + "]";
    }

}
