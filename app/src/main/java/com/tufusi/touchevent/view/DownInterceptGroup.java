package com.tufusi.touchevent.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.tufusi.touchevent.util.PrintUtils;

/**
 * Created by 鼠夏目 on 2020/8/13.
 *
 * @author 鼠夏目
 * @description
 * @see
 */
public class DownInterceptGroup extends FrameLayout {

    private static final String TAG = DownInterceptGroup.class.getSimpleName();

    // 此构造函数必须要有，用于反射，没有会报错
    public DownInterceptGroup(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        PrintUtils.printEvent(TAG, "dispatchTouchEvent", ev);
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        PrintUtils.printEvent(TAG, "onInterceptTouchEvent", ev);
        return super.onInterceptTouchEvent(ev);
    }
}
