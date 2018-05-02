package com.example.jackdong.presenter;

import com.example.jackdong.view.IMainActivity;

/**
 * Created by jack.dong on 2016/12/20.
 */

public class MainViewImpl implements IMainActivity.IMainPresenter {
    IMainActivity.IMainView mView = null;
    public MainViewImpl (IMainActivity.IMainView view) {
        mView = view;
    }

    @Override
    public void loadData(String url) {
//        HashMap<Object, Object> hashMap = new HashMap<>();
//        hashMap.put("cardUkid", mCardUkid);
//        Request<String> request = NoHttpUtils.getRequest(Constant.GETCONTRACT, hashMap);
//        RequestQueue requestQueue = NoHttp.newRequestQueue();
//        requestQueue.add(0, request, new OnLoadListener<String>() {
//            @Override
//            public void onSuccess(int what, Response<String> response) {
//                mView.initData(); // 请求回来初始化数据
//            }
//
//            @Override
//            public void onError(int what, Response<String> response) {
//                mView.requestFailed(); // 请求失败的回调
//            }
//        });
    }
}
