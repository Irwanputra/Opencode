package com.codetroopers.betterpickers.numberpicker;

import android.R;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import p131.p221.p222.p223.AnimationAnimationListenerC2684;

/* loaded from: /tmp/opencode/hc_real.dex */
public class NumberPickerErrorTextView extends TextView {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Runnable f2234;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Handler f2235;

    /* renamed from: com.codetroopers.betterpickers.numberpicker.NumberPickerErrorTextView$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0348 implements Runnable {
        public RunnableC0348() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NumberPickerErrorTextView numberPickerErrorTextView = NumberPickerErrorTextView.this;
            numberPickerErrorTextView.f2235.removeCallbacks(numberPickerErrorTextView.f2234);
            Animation loadAnimation = AnimationUtils.loadAnimation(numberPickerErrorTextView.getContext(), R.anim.fade_out);
            loadAnimation.setAnimationListener(new AnimationAnimationListenerC2684(numberPickerErrorTextView));
            numberPickerErrorTextView.startAnimation(loadAnimation);
        }
    }

    public NumberPickerErrorTextView(Context context) {
        super(context);
        this.f2234 = new RunnableC0348();
        this.f2235 = new Handler();
    }

    public NumberPickerErrorTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2234 = new RunnableC0348();
        this.f2235 = new Handler();
    }

    public NumberPickerErrorTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2234 = new RunnableC0348();
        this.f2235 = new Handler();
    }
}
