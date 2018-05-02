package com.example.jackdong.demo_su_test.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.jackdong.demo_su_test.presenter.BasePresenter;
import com.example.jackdong.demo_su_test.view.iml.BaseViewIml;
import com.example.jackdong.testmvp.R;

/**
 * Created by weili.su on 2018/4/24.
 */

public class BaseViewActivity extends AppCompatActivity implements BaseViewIml {

    private BasePresenter mPresenter;
    boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new BasePresenter(this);

        Log.e("JS","进入 view 层  1");
        //开始请求服务
        mPresenter.loadData();
        Log.e("JS","进入 view 层  2");
        //加载完成
        mPresenter.loadResult();
    }

    @Override
    public void loading() {
        Log.e("JS","开启  进入view层 iterface 事件");
    }

    @Override
    public void cancelLoading() {
        Log.e("JS","结束  进入view层 iterface 事件");
    }
}