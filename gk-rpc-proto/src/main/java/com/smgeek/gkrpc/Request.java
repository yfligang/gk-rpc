package com.smgeek.gkrpc;

import lombok.AllArgsConstructor;
import lombok.Data;

//表示RPC的一个请求

@Data
@AllArgsConstructor
public class Request {

    private ServiceDescriptor service;
    private Object[] parameters;
}
