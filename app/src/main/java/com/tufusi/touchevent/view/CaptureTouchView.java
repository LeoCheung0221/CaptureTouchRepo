package com.tufusi.touchevent.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

import com.tufusi.touchevent.util.PrintUtils;

/**
 * Created by 鼠夏目 on 2020/8/13.
 *
 * @author 鼠夏目
 * @description
 * @see
 */
public class CaptureTouchView extends View {

    private static final String TAG = CaptureTouchView.class.getSimpleName();

    public CaptureTouchView(Context context) {
        this(context, null);
    }

    public CaptureTouchView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CaptureTouchView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        PrintUtils.printEvent(TAG, "dispatchTouchEvent", event);
        boolean result = super.dispatchTouchEvent(event);
        PrintUtils.printParam(TAG, "dispatchTouchEvent result is " + result);
        return result;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        PrintUtils.printEvent(TAG, "onTouchEvent", event);
        return true;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(500, 300);
    }
}
