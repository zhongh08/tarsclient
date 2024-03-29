// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.haowei.tarsclient.client.testapp;

import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.annotation.*;
import com.qq.tars.common.support.Holder;

@Servant
public interface HelloPrx {

	public String hello(int no, String name);

	public String hello(int no, String name, @TarsContext java.util.Map<String, String> ctx);

	public void async_hello(@TarsCallback HelloPrxCallback callback, int no, String name);

	public void async_hello(@TarsCallback HelloPrxCallback callback, int no, String name, @TarsContext java.util.Map<String, String> ctx);

	public String hello2(String name);

	public String hello2(String name, @TarsContext java.util.Map<String, String> ctx);

	public void async_hello2(@TarsCallback HelloPrxCallback callback, String name);

	public void async_hello2(@TarsCallback HelloPrxCallback callback, String name, @TarsContext java.util.Map<String, String> ctx);
}
