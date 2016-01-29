package com.wdullaer.materialdatetimepicker.time;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Aamir Abro on 1/28/16.
 */
public abstract class BaseRadialTextsView extends View {
    public BaseRadialTextsView(Context context) {
        super(context);
    }

    public BaseRadialTextsView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseRadialTextsView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public BaseRadialTextsView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public abstract void initialize(Context context, String[] texts, String[] innerTexts,
               TimePickerController controller, RadialTextsView.SelectionValidator validator, boolean disappearsOut);

    protected abstract void setSelection(int selection);

    public abstract ObjectAnimator getDisappearAnimator();

    public abstract ObjectAnimator getReappearAnimator();
}
