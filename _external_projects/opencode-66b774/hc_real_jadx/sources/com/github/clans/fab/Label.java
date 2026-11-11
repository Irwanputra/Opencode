package com.github.clans.fab;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.widget.TextView;
import p034.p095.C1687;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Label extends TextView {

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public static final Xfermode f2474 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f2475;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f2476;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f2477;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f2478;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public Animation f2479;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean f2480;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public Animation f2481;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f2482;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean f2483;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f2484;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f2485;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Drawable f2486;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f2487;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public GestureDetector f2488;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f2489;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public FloatingActionButton f2490;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f2491;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f2492;

    /* renamed from: com.github.clans.fab.Label$〺つふすそ, reason: contains not printable characters */
    public class C0363 extends GestureDetector.SimpleOnGestureListener {
        public C0363() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            Label.this.m1190();
            FloatingActionButton floatingActionButton = Label.this.f2490;
            if (floatingActionButton != null) {
                floatingActionButton.m1176();
            }
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            Label.this.m1193();
            FloatingActionButton floatingActionButton = Label.this.f2490;
            if (floatingActionButton != null) {
                floatingActionButton.m1186();
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* renamed from: com.github.clans.fab.Label$くし〴〺ぅ, reason: contains not printable characters */
    public class C0364 extends Drawable {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Paint f2496 = new Paint(1);

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Paint f2494 = new Paint(1);

        public C0364(C0365 c0365) {
            Label.this.setLayerType(1, null);
            this.f2496.setStyle(Paint.Style.FILL);
            this.f2496.setColor(Label.this.f2478);
            this.f2494.setXfermode(Label.f2474);
            if (Label.this.isInEditMode()) {
                return;
            }
            this.f2496.setShadowLayer(Label.this.f2476, Label.this.f2482, Label.this.f2489, Label.this.f2484);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Label label = Label.this;
            float abs = Math.abs(label.f2482) + label.f2476;
            Label label2 = Label.this;
            float abs2 = Math.abs(label2.f2489) + label2.f2476;
            Label label3 = Label.this;
            RectF rectF = new RectF(abs, abs2, label3.f2475, label3.f2491);
            float f = Label.this.f2487;
            canvas.drawRoundRect(rectF, f, f, this.f2496);
            float f2 = Label.this.f2487;
            canvas.drawRoundRect(rectF, f2, f2, this.f2494);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* renamed from: com.github.clans.fab.Label$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0365 extends ViewOutlineProvider {
        public C0365(Label label) {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        }
    }

    public Label(Context context) {
        super(context);
        this.f2477 = true;
        this.f2483 = true;
        this.f2488 = new GestureDetector(getContext(), new C0363());
    }

    public Label(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2477 = true;
        this.f2483 = true;
        this.f2488 = new GestureDetector(getContext(), new C0363());
    }

    public Label(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2477 = true;
        this.f2483 = true;
        this.f2488 = new GestureDetector(getContext(), new C0363());
    }

    @TargetApi(21)
    private void setBackgroundCompat(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    private void setShadow(FloatingActionButton floatingActionButton) {
        this.f2484 = floatingActionButton.getShadowColor();
        this.f2476 = floatingActionButton.getShadowRadius();
        this.f2482 = floatingActionButton.getShadowXOffset();
        this.f2489 = floatingActionButton.getShadowYOffset();
        this.f2477 = floatingActionButton.m1173();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2475 == 0) {
            this.f2475 = getMeasuredWidth();
        }
        int measuredWidth = getMeasuredWidth() + (this.f2477 ? Math.abs(this.f2482) + this.f2476 : 0);
        if (this.f2491 == 0) {
            this.f2491 = getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, getMeasuredHeight() + (this.f2477 ? this.f2476 + Math.abs(this.f2489) : 0));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        FloatingActionButton floatingActionButton = this.f2490;
        if (floatingActionButton == null || floatingActionButton.getOnClickListener() == null || !this.f2490.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            m1193();
            this.f2490.m1186();
        }
        this.f2488.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setCornerRadius(int i) {
        this.f2487 = i;
    }

    public void setFab(FloatingActionButton floatingActionButton) {
        this.f2490 = floatingActionButton;
        setShadow(floatingActionButton);
    }

    public void setHandleVisibilityChanges(boolean z) {
        this.f2483 = z;
    }

    public void setHideAnimation(Animation animation) {
        this.f2479 = animation;
    }

    public void setShowAnimation(Animation animation) {
        this.f2481 = animation;
    }

    public void setShowShadow(boolean z) {
        this.f2477 = z;
    }

    public void setUsingStyle(boolean z) {
        this.f2480 = z;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Drawable m1189(int i) {
        int i2 = this.f2487;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{i2, i2, i2, i2, i2, i2, i2, i2}, null, null));
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    @TargetApi(21)
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m1190() {
        if (this.f2480) {
            this.f2486 = getBackground();
        }
        Drawable drawable = this.f2486;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[]{R.attr.state_pressed});
            return;
        }
        if (C1687.m3691()) {
            Drawable drawable2 = this.f2486;
            if (drawable2 instanceof RippleDrawable) {
                RippleDrawable rippleDrawable = (RippleDrawable) drawable2;
                rippleDrawable.setState(new int[]{R.attr.state_enabled, R.attr.state_pressed});
                rippleDrawable.setHotspot(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
                rippleDrawable.setVisible(true, true);
            }
        }
    }

    @TargetApi(21)
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Drawable m1191() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, m1189(this.f2492));
        stateListDrawable.addState(new int[0], m1189(this.f2478));
        if (!C1687.m3691()) {
            this.f2486 = stateListDrawable;
            return stateListDrawable;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.f2485}), stateListDrawable, null);
        setOutlineProvider(new C0365(this));
        setClipToOutline(true);
        this.f2486 = rippleDrawable;
        return rippleDrawable;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m1192() {
        LayerDrawable layerDrawable;
        if (this.f2477) {
            layerDrawable = new LayerDrawable(new Drawable[]{new C0364(null), m1191()});
            layerDrawable.setLayerInset(1, Math.abs(this.f2482) + this.f2476, Math.abs(this.f2489) + this.f2476, Math.abs(this.f2482) + this.f2476, Math.abs(this.f2489) + this.f2476);
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{m1191()});
        }
        setBackgroundCompat(layerDrawable);
    }

    @TargetApi(21)
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m1193() {
        if (this.f2480) {
            this.f2486 = getBackground();
        }
        Drawable drawable = this.f2486;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[0]);
            return;
        }
        if (C1687.m3691()) {
            Drawable drawable2 = this.f2486;
            if (drawable2 instanceof RippleDrawable) {
                RippleDrawable rippleDrawable = (RippleDrawable) drawable2;
                rippleDrawable.setState(new int[0]);
                rippleDrawable.setHotspot(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
                rippleDrawable.setVisible(true, true);
            }
        }
    }
}
