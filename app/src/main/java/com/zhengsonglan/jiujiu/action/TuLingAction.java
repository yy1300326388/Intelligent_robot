package com.zhengsonglan.jiujiu.action;

/**
 * Created by zsl on 2014/12/13.
 */
public class TuLingAction {

    private static TuLingAction tuLingAction;
    //单例模式
    public static TuLingAction getInstance(){
        if (tuLingAction==null){
            tuLingAction=new TuLingAction();
        }
        return  tuLingAction;
    }


}
