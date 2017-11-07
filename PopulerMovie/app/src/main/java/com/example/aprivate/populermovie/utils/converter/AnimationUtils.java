package com.example.aprivate.populermovie.utils.converter;

/**
 * Created by private on 24/10/2017.
 */

import android.view.View;
import android.view.animation.AlphaAnimation;

public class AnimationUtils {
    public static void startAlphaAnimation(View v, long duration, int visibility) {
        AlphaAnimation alphaAnimation = (visibility == View.VISIBLE)
                ? new AlphaAnimation(0f, 1f)
                : new AlphaAnimation(1f, 0f);

        alphaAnimation.setDuration(duration);
        alphaAnimation.setFillAfter(true);
        v.startAnimation(alphaAnimation);
    }
}