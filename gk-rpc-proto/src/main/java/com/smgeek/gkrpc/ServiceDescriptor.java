package com.smgeek.gkrpc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//表示服务
@Data
@AllArgsConstructor
@NoArgsConstructor //默认构造方法
public class ServiceDescriptor {
    //需要四个
    private String clazz; //类名
    private String method; //方法名
    private String returnType; //返回值类型
    private String[] parameterTypes; //返回值类型可能有多个，使用数组


}
