package com.example.jackdong.demo_su_test.presenter;

import android.util.Log;

import com.example.jackdong.demo_su_test.model.BaseModel;
import com.example.jackdong.demo_su_test.model.iml.BaseModelIml;
import com.example.jackdong.demo_su_test.presenter.iml.BasePresenterIml;
import com.example.jackdong.demo_su_test.view.iml.BaseViewIml;

/**
 * Created by weili.su on 2018/4/24.
 */

public class BasePresenter implements BasePresenterIml {


    private BaseViewIml mView;
    private BaseModelIml mModel;

    public BasePresenter(BaseViewIml view) {
        mModel = new BaseModel();
        this.mView = view;
    }


    // 调用view层和model层来 加载数据
    // 调用view层和model层来 加载数据
    public void loadData() {
        Log.e("JS", "model/view------->presenter ");
        mView.loading();//访问view层
        mModel.RequestService();//访问model层

        Log.e("JS", "-----可得到 view和model return 的数据－－－－－－－");
    }

    @Override
    public void loadResult() {
        Log.e("JS", "presenter --------->  view ");
        mView.cancelLoading();
    }
}
