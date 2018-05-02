package com.example.jackdong.testmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jackdong.presenter.MainViewImpl;
import com.example.jackdong.view.IMainActivity;

public class MainActivity extends AppCompatActivity implements IMainActivity.IMainView{

    MainViewImpl mainViewImpl = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainViewImpl = new MainViewImpl(this);
    }

    @Override
    public void initData() {
        // 请求成功初始化数据
    }

    @Override
    public void requestFailed() {
        // 请求失败初始化界面

    }
}
