package com.smgeek.gkrpc;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
    表示网络传输的一个端点
 */
@Data
@AllArgsConstructor
public class peer {
    private String host;
    private int port;

}
