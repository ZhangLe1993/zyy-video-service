package com.biubiu.sdk.commandbuidler;

import java.util.Map;

/**
 * 命令组装器接口
 *
 * @author zhangyule1993@sina.com
 * @version 2020年06月26日
 * @since jdk1.8
 */
public interface CommandAssembly {
    /**
     * 将参数转为ffmpeg命令
     *
     * @param paramMap
     * @return
     */
    public String assembly(Map<String, String> paramMap);

    public String assembly();
}
