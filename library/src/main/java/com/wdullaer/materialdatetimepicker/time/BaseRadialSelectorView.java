package com.wdullaer.materialdatetimepicker.time;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Aamir Abro on 1/27/16.
 */
public abstract class BaseRadialSelectorView extends View {

    public BaseRadialSelectorView(Context context) {
        super(context);
    }

    public BaseRadialSelectorView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseRadialSelectorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public BaseRadialSelectorView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public abstract void initialize(Context context, TimePickerController controller, boolean hasInnerCircle,
                           boolean disappearsOut, int selectionDegrees, boolean isInnerCircle);

    public abstract void setSelection(int selectionDegrees, boolean isInnerCircle, boolean forceDrawDot);

    public abstract int getDegreesFromCoords(float pointX, float pointY, boolean forceLegal,
                                    final Boolean[] isInnerCircle);

    public abstract ObjectAnimator getDisappearAnimator();

    public abstract ObjectAnimator getReappearAnimator();
}
