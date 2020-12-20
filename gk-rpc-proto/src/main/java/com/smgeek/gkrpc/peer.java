package com.smgeek.gkrpc;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
    表示网络传输的一个端点
 */
@Data  //getter setter方法
@AllArgsConstructor  //所有字段的构造方法
public class peer {
    private String host;
    private int port;

}
