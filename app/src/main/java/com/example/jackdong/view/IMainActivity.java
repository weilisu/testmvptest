package com.example.jackdong.view;

/**
 * Created by jack.dong on 2016/12/20.
 */

/**
 * 一个activity或者一个fragment对应一个接口：
 * IMainPresenter是presenter的接口，里面都是一个实现
 * IMainView是Activity和Fragment里的一些方法，都是设置界面上的一些方法
 * 比如请求数据的回调，在回调里面初始化界面等
 */
public interface IMainActivity {
    interface IMainPresenter {
        void loadData(String url); // 请求数据
    }

    interface IMainView {
        void initData(); // 请求数据成功回来后初始化数据
        void requestFailed(); // 请求失败的回调
    }
}
