package com.microape.wifihelper.callback;

/**
 * Created by pengle on 2018-06-28.
 * email:pengle609@163.com
 */

public interface OnWifiConnCallBack {

    void onWifiConnectFail();

    //设备
    void onWifiConnected();

    void onWifiDisConnected();

}
