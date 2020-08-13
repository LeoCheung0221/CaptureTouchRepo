package com.tufusi.touchevent.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

import com.tufusi.touchevent.util.PrintUtils;

/**
 * Created by 鼠夏目 on 2020/8/13.
 *
 * @author 鼠夏目
 * @description
 * @see
 */
public class MyScrollView extends ScrollView {

    private static final String TAG = MyScrollView.class.getSimpleName();

    public MyScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        PrintUtils.printEvent(TAG,"onInterceptTouchEvent", ev);
        boolean intercepted = super.onInterceptTouchEvent(ev);
        PrintUtils.printParam(TAG, "MyScrollView intercepted is " + intercepted);
        return intercepted;
    }
}
