package com.example.jackdong.demo_su_test.model;

import android.util.Log;

import com.example.jackdong.demo_su_test.model.iml.BaseModelIml;

/**
 * Created by weili.su on 2018/4/24.
 */

public class BaseModel implements BaseModelIml{
    @Override
    public void RequestService() {
        Log.e("JS","开启  进入model层     interface");
    }
}
