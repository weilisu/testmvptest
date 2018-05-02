package com.example.jackdong.demo_su_test.view.iml;

/**
 * Created by weili.su on 2018/4/24.
 */

public interface BaseViewIml {

    //UI逻辑接口，一般由activity、fragment实现
    //显示加载进度
    void loading();

    //隐藏加载进度
    void cancelLoading();

}
