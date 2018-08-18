package com.example.xyzreader.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.support.v7.widget.AppCompatImageView;


public class TwoThreeImageView extends AppCompatImageView {

    public TwoThreeImageView(Context context) {
        super(context);
    }

    public TwoThreeImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TwoThreeImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int threeTwoHeight = MeasureSpec.getSize(widthMeasureSpec) * 2 / 3;
        int threeTwoHeightSpec = MeasureSpec.makeMeasureSpec(threeTwoHeight, MeasureSpec.EXACTLY);

        super.onMeasure(widthMeasureSpec, threeTwoHeightSpec);
    }
}
