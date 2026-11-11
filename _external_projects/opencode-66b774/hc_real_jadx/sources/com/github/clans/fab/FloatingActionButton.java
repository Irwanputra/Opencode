package com.github.clans.fab;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import p034.p095.C1687;
import p131.p158.p159.p160.C2099;
import p131.p158.p159.p160.C2101;
import p131.p158.p159.p160.C2102;
import p131.p158.p159.p160.C2109;

/* loaded from: /tmp/opencode/hc_real.dex */
public class FloatingActionButton extends ImageButton {

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public static final Xfermode f2340 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f2341;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f2342;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public int f2343;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public int f2344;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f2345;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public int f2346;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f2347;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public Paint f2348;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public float f2349;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public float f2350;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public String f2351;

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public boolean f2352;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public boolean f2353;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public View.OnClickListener f2354;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public long f2355;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public boolean f2356;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public Animation f2357;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f2358;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public double f2359;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public float f2360;

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public GestureDetector f2361;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public boolean f2362;

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public boolean f2363;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean f2364;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public Drawable f2365;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public Paint f2366;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public float f2367;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public boolean f2368;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f2369;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public boolean f2370;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public Drawable f2371;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f2372;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public RectF f2373;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public float f2374;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f2375;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public boolean f2376;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f2377;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f2378;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public int f2379;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public float f2380;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f2381;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public int f2382;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public long f2383;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public Animation f2384;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f2385;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public boolean f2386;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f2387;

    public static class ProgressSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<ProgressSavedState> CREATOR = new C0354();

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public int f2388;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public float f2389;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f2390;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public boolean f2391;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public boolean f2392;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public float f2393;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f2394;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public boolean f2395;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f2396;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public boolean f2397;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public float f2398;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public boolean f2399;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public boolean f2400;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public boolean f2401;

        /* renamed from: com.github.clans.fab.FloatingActionButton$ProgressSavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0354 implements Parcelable.Creator<ProgressSavedState> {
            @Override // android.os.Parcelable.Creator
            public ProgressSavedState createFromParcel(Parcel parcel) {
                return new ProgressSavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public ProgressSavedState[] newArray(int i) {
                return new ProgressSavedState[i];
            }
        }

        public ProgressSavedState(Parcel parcel, C0357 c0357) {
            super(parcel);
            this.f2389 = parcel.readFloat();
            this.f2393 = parcel.readFloat();
            this.f2400 = parcel.readInt() != 0;
            this.f2398 = parcel.readFloat();
            this.f2394 = parcel.readInt();
            this.f2396 = parcel.readInt();
            this.f2390 = parcel.readInt();
            this.f2388 = parcel.readInt();
            this.f2391 = parcel.readInt() != 0;
            this.f2401 = parcel.readInt() != 0;
            this.f2395 = parcel.readInt() != 0;
            this.f2397 = parcel.readInt() != 0;
            this.f2399 = parcel.readInt() != 0;
            this.f2392 = parcel.readInt() != 0;
        }

        public ProgressSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f2389);
            parcel.writeFloat(this.f2393);
            parcel.writeInt(this.f2400 ? 1 : 0);
            parcel.writeFloat(this.f2398);
            parcel.writeInt(this.f2394);
            parcel.writeInt(this.f2396);
            parcel.writeInt(this.f2390);
            parcel.writeInt(this.f2388);
            parcel.writeInt(this.f2391 ? 1 : 0);
            parcel.writeInt(this.f2401 ? 1 : 0);
            parcel.writeInt(this.f2395 ? 1 : 0);
            parcel.writeInt(this.f2397 ? 1 : 0);
            parcel.writeInt(this.f2399 ? 1 : 0);
            parcel.writeInt(this.f2392 ? 1 : 0);
        }
    }

    /* renamed from: com.github.clans.fab.FloatingActionButton$〺つふすそ, reason: contains not printable characters */
    public class C0355 extends GestureDetector.SimpleOnGestureListener {
        public C0355() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            Label label = (Label) FloatingActionButton.this.getTag(C2102.fab_label);
            if (label != null) {
                label.m1190();
            }
            FloatingActionButton.this.m1176();
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            Label label = (Label) FloatingActionButton.this.getTag(C2102.fab_label);
            if (label != null) {
                label.m1193();
            }
            FloatingActionButton.this.m1186();
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* renamed from: com.github.clans.fab.FloatingActionButton$くし〴〺ぅ, reason: contains not printable characters */
    public class ViewOnClickListenerC0356 implements View.OnClickListener {
        public ViewOnClickListenerC0356() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            View.OnClickListener onClickListener = floatingActionButton.f2354;
            if (onClickListener != null) {
                onClickListener.onClick(floatingActionButton);
            }
        }
    }

    /* renamed from: com.github.clans.fab.FloatingActionButton$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0357 extends ViewOutlineProvider {
        public C0357(FloatingActionButton floatingActionButton) {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        }
    }

    /* renamed from: com.github.clans.fab.FloatingActionButton$づざかべべ, reason: contains not printable characters */
    public class C0358 extends Drawable {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public float f2405;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Paint f2406 = new Paint(1);

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Paint f2404 = new Paint(1);

        public C0358(C0357 c0357) {
            FloatingActionButton.this.setLayerType(1, null);
            this.f2406.setStyle(Paint.Style.FILL);
            this.f2406.setColor(FloatingActionButton.this.f2341);
            this.f2404.setXfermode(FloatingActionButton.f2340);
            if (!FloatingActionButton.this.isInEditMode()) {
                this.f2406.setShadowLayer(FloatingActionButton.this.f2369, FloatingActionButton.this.f2375, FloatingActionButton.this.f2345, FloatingActionButton.this.f2381);
            }
            float circleSize = FloatingActionButton.this.getCircleSize() / 2;
            this.f2405 = circleSize;
            if (FloatingActionButton.this.f2364 && FloatingActionButton.this.f2363) {
                this.f2405 = circleSize + FloatingActionButton.this.f2372;
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            Xfermode xfermode = FloatingActionButton.f2340;
            canvas.drawCircle(floatingActionButton.m1174(), FloatingActionButton.this.m1178(), this.f2405, this.f2406);
            canvas.drawCircle(FloatingActionButton.this.m1174(), FloatingActionButton.this.m1178(), this.f2405, this.f2404);
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

    /* renamed from: com.github.clans.fab.FloatingActionButton$びぐびあび, reason: contains not printable characters */
    public class C0359 extends ShapeDrawable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f2408;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f2410;

        public C0359(Shape shape, C0357 c0357) {
            super(shape);
            int i;
            int i2 = 0;
            if (FloatingActionButton.this.m1173()) {
                i = Math.abs(FloatingActionButton.this.f2375) + FloatingActionButton.this.f2369;
            } else {
                i = 0;
            }
            this.f2410 = i;
            if (FloatingActionButton.this.m1173()) {
                i2 = Math.abs(FloatingActionButton.this.f2345) + FloatingActionButton.this.f2369;
            }
            this.f2408 = i2;
            if (FloatingActionButton.this.f2364) {
                int i3 = this.f2410;
                int i4 = FloatingActionButton.this.f2372;
                this.f2410 = i3 + i4;
                this.f2408 = i2 + i4;
            }
        }

        @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            int i = this.f2410;
            int i2 = this.f2408;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            Xfermode xfermode = FloatingActionButton.f2340;
            setBounds(i, i2, floatingActionButton.m1179() - this.f2410, FloatingActionButton.this.m1183() - this.f2408);
            super.draw(canvas);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2369 = C1687.m3678(getContext(), 4.0f);
        this.f2375 = C1687.m3678(getContext(), 1.0f);
        this.f2345 = C1687.m3678(getContext(), 3.0f);
        this.f2377 = C1687.m3678(getContext(), 24.0f);
        this.f2372 = C1687.m3678(getContext(), 6.0f);
        this.f2349 = -1.0f;
        this.f2380 = -1.0f;
        this.f2373 = new RectF();
        this.f2348 = new Paint(1);
        this.f2366 = new Paint(1);
        this.f2367 = 195.0f;
        this.f2383 = 0L;
        this.f2356 = true;
        this.f2343 = 16;
        this.f2379 = 100;
        this.f2361 = new GestureDetector(getContext(), new C0355());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2109.FloatingActionButton, i, 0);
        this.f2341 = obtainStyledAttributes.getColor(C2109.FloatingActionButton_fab_colorNormal, -2473162);
        this.f2385 = obtainStyledAttributes.getColor(C2109.FloatingActionButton_fab_colorPressed, -1617853);
        this.f2347 = obtainStyledAttributes.getColor(C2109.FloatingActionButton_fab_colorDisabled, -5592406);
        this.f2387 = obtainStyledAttributes.getColor(C2109.FloatingActionButton_fab_colorRipple, -1711276033);
        this.f2358 = obtainStyledAttributes.getBoolean(C2109.FloatingActionButton_fab_showShadow, true);
        this.f2381 = obtainStyledAttributes.getColor(C2109.FloatingActionButton_fab_shadowColor, 1711276032);
        this.f2369 = obtainStyledAttributes.getDimensionPixelSize(C2109.FloatingActionButton_fab_shadowRadius, this.f2369);
        this.f2375 = obtainStyledAttributes.getDimensionPixelSize(C2109.FloatingActionButton_fab_shadowXOffset, this.f2375);
        this.f2345 = obtainStyledAttributes.getDimensionPixelSize(C2109.FloatingActionButton_fab_shadowYOffset, this.f2345);
        this.f2342 = obtainStyledAttributes.getInt(C2109.FloatingActionButton_fab_size, 0);
        this.f2351 = obtainStyledAttributes.getString(C2109.FloatingActionButton_fab_label);
        this.f2368 = obtainStyledAttributes.getBoolean(C2109.FloatingActionButton_fab_progress_indeterminate, false);
        this.f2382 = obtainStyledAttributes.getColor(C2109.FloatingActionButton_fab_progress_color, -16738680);
        this.f2344 = obtainStyledAttributes.getColor(C2109.FloatingActionButton_fab_progress_backgroundColor, 1291845632);
        this.f2379 = obtainStyledAttributes.getInt(C2109.FloatingActionButton_fab_progress_max, this.f2379);
        this.f2363 = obtainStyledAttributes.getBoolean(C2109.FloatingActionButton_fab_progress_showBackground, true);
        int i2 = C2109.FloatingActionButton_fab_progress;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f2346 = obtainStyledAttributes.getInt(i2, 0);
            this.f2352 = true;
        }
        int i3 = C2109.FloatingActionButton_fab_elevationCompat;
        if (obtainStyledAttributes.hasValue(i3)) {
            float dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(i3, 0);
            if (isInEditMode()) {
                setElevation(dimensionPixelOffset);
            } else {
                setElevationCompat(dimensionPixelOffset);
            }
        }
        this.f2384 = AnimationUtils.loadAnimation(getContext(), obtainStyledAttributes.getResourceId(C2109.FloatingActionButton_fab_showAnimation, C2101.fab_scale_up));
        this.f2357 = AnimationUtils.loadAnimation(getContext(), obtainStyledAttributes.getResourceId(C2109.FloatingActionButton_fab_hideAnimation, C2101.fab_scale_down));
        obtainStyledAttributes.recycle();
        if (isInEditMode()) {
            if (this.f2368) {
                setIndeterminate(true);
            } else if (this.f2352) {
                m1180();
                setProgress(this.f2346, false);
            }
        }
        setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCircleSize() {
        return getResources().getDimensionPixelSize(this.f2342 == 0 ? C2099.fab_size_normal : C2099.fab_size_mini);
    }

    private int getShadowX() {
        return Math.abs(this.f2375) + this.f2369;
    }

    private int getShadowY() {
        return Math.abs(this.f2345) + this.f2369;
    }

    @TargetApi(16)
    private void setBackgroundCompat(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    public int getButtonSize() {
        return this.f2342;
    }

    public int getColorDisabled() {
        return this.f2347;
    }

    public int getColorNormal() {
        return this.f2341;
    }

    public int getColorPressed() {
        return this.f2385;
    }

    public int getColorRipple() {
        return this.f2387;
    }

    public Animation getHideAnimation() {
        return this.f2357;
    }

    public Drawable getIconDrawable() {
        Drawable drawable = this.f2371;
        return drawable != null ? drawable : new ColorDrawable(0);
    }

    public String getLabelText() {
        return this.f2351;
    }

    public Label getLabelView() {
        return (Label) getTag(C2102.fab_label);
    }

    public int getLabelVisibility() {
        Label labelView = getLabelView();
        if (labelView != null) {
            return labelView.getVisibility();
        }
        return -1;
    }

    public synchronized int getMax() {
        return this.f2379;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f2354;
    }

    public synchronized int getProgress() {
        return this.f2386 ? 0 : this.f2346;
    }

    public int getShadowColor() {
        return this.f2381;
    }

    public int getShadowRadius() {
        return this.f2369;
    }

    public int getShadowXOffset() {
        return this.f2375;
    }

    public int getShadowYOffset() {
        return this.f2345;
    }

    public Animation getShowAnimation() {
        return this.f2384;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f2364) {
            if (this.f2363) {
                canvas.drawArc(this.f2373, 360.0f, 360.0f, false, this.f2348);
            }
            boolean z = false;
            boolean z2 = true;
            if (this.f2386) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.f2355;
                float f3 = (uptimeMillis * this.f2367) / 1000.0f;
                long j = this.f2383;
                if (j >= 200) {
                    double d = this.f2359;
                    double d2 = uptimeMillis;
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    double d3 = d + d2;
                    this.f2359 = d3;
                    if (d3 > 500.0d) {
                        this.f2359 = d3 - 500.0d;
                        this.f2383 = 0L;
                        this.f2356 = !this.f2356;
                    }
                    float cos = (((float) Math.cos(((this.f2359 / 500.0d) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                    float f4 = 270 - this.f2343;
                    if (this.f2356) {
                        this.f2350 = cos * f4;
                    } else {
                        float f5 = (1.0f - cos) * f4;
                        this.f2360 = (this.f2350 - f5) + this.f2360;
                        this.f2350 = f5;
                    }
                } else {
                    this.f2383 = j + uptimeMillis;
                }
                float f6 = this.f2360 + f3;
                this.f2360 = f6;
                if (f6 > 360.0f) {
                    this.f2360 = f6 - 360.0f;
                }
                this.f2355 = SystemClock.uptimeMillis();
                float f7 = this.f2360 - 90.0f;
                float f8 = this.f2343 + this.f2350;
                if (isInEditMode()) {
                    f = 0.0f;
                    f2 = 135.0f;
                } else {
                    f = f7;
                    f2 = f8;
                }
                canvas.drawArc(this.f2373, f, f2, false, this.f2366);
            } else {
                if (this.f2360 != this.f2374) {
                    float uptimeMillis2 = ((SystemClock.uptimeMillis() - this.f2355) / 1000.0f) * this.f2367;
                    float f9 = this.f2360;
                    float f10 = this.f2374;
                    this.f2360 = f9 > f10 ? Math.max(f9 - uptimeMillis2, f10) : Math.min(f9 + uptimeMillis2, f10);
                    this.f2355 = SystemClock.uptimeMillis();
                    z = true;
                }
                canvas.drawArc(this.f2373, -90.0f, this.f2360, false, this.f2366);
                z2 = z;
            }
            if (z2) {
                invalidate();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m1179(), m1183());
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ProgressSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ProgressSavedState progressSavedState = (ProgressSavedState) parcelable;
        super.onRestoreInstanceState(progressSavedState.getSuperState());
        this.f2360 = progressSavedState.f2389;
        this.f2374 = progressSavedState.f2393;
        this.f2367 = progressSavedState.f2398;
        this.f2372 = progressSavedState.f2396;
        this.f2382 = progressSavedState.f2390;
        this.f2344 = progressSavedState.f2388;
        this.f2368 = progressSavedState.f2395;
        this.f2352 = progressSavedState.f2397;
        this.f2346 = progressSavedState.f2394;
        this.f2370 = progressSavedState.f2399;
        this.f2363 = progressSavedState.f2392;
        this.f2355 = SystemClock.uptimeMillis();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ProgressSavedState progressSavedState = new ProgressSavedState(super.onSaveInstanceState());
        progressSavedState.f2389 = this.f2360;
        progressSavedState.f2393 = this.f2374;
        progressSavedState.f2398 = this.f2367;
        progressSavedState.f2396 = this.f2372;
        progressSavedState.f2390 = this.f2382;
        progressSavedState.f2388 = this.f2344;
        boolean z = this.f2386;
        progressSavedState.f2395 = z;
        progressSavedState.f2397 = this.f2364 && this.f2346 > 0 && !z;
        progressSavedState.f2394 = this.f2346;
        progressSavedState.f2399 = this.f2370;
        progressSavedState.f2392 = this.f2363;
        return progressSavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        m1180();
        if (this.f2368) {
            setIndeterminate(true);
            this.f2368 = false;
        } else if (this.f2352) {
            setProgress(this.f2346, this.f2370);
            this.f2352 = false;
        } else if (this.f2353) {
            if (this.f2364) {
                f = this.f2349 > getX() ? getX() + this.f2372 : getX() - this.f2372;
                f2 = this.f2380 > getY() ? getY() + this.f2372 : getY() - this.f2372;
            } else {
                f = this.f2349;
                f2 = this.f2380;
            }
            setX(f);
            setY(f2);
            this.f2353 = false;
        }
        super.onSizeChanged(i, i2, i3, i4);
        m1182();
        this.f2348.setColor(this.f2344);
        this.f2348.setStyle(Paint.Style.STROKE);
        this.f2348.setStrokeWidth(this.f2372);
        this.f2366.setColor(this.f2382);
        this.f2366.setStyle(Paint.Style.STROKE);
        this.f2366.setStrokeWidth(this.f2372);
        m1177();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2354 != null && isEnabled()) {
            Label label = (Label) getTag(C2102.fab_label);
            if (label == null) {
                return super.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 1 || action == 3) {
                label.m1193();
                m1186();
            }
            this.f2361.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setButtonSize(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Use @FabSize constants only!");
        }
        if (this.f2342 != i) {
            this.f2342 = i;
            m1177();
        }
    }

    public void setColorDisabled(int i) {
        if (i != this.f2347) {
            this.f2347 = i;
            m1177();
        }
    }

    public void setColorDisabledResId(int i) {
        setColorDisabled(getResources().getColor(i));
    }

    public void setColorNormal(int i) {
        if (this.f2341 != i) {
            this.f2341 = i;
            m1177();
        }
    }

    public void setColorNormalResId(int i) {
        setColorNormal(getResources().getColor(i));
    }

    public void setColorPressed(int i) {
        if (i != this.f2385) {
            this.f2385 = i;
            m1177();
        }
    }

    public void setColorPressedResId(int i) {
        setColorPressed(getResources().getColor(i));
    }

    public void setColorRipple(int i) {
        if (i != this.f2387) {
            this.f2387 = i;
            m1177();
        }
    }

    public void setColorRippleResId(int i) {
        setColorRipple(getResources().getColor(i));
    }

    @Override // android.view.View
    public void setElevation(float f) {
        if (!C1687.m3691() || f <= 0.0f) {
            return;
        }
        super.setElevation(f);
        if (!isInEditMode()) {
            this.f2378 = true;
            this.f2358 = false;
        }
        m1177();
    }

    @TargetApi(21)
    public void setElevationCompat(float f) {
        this.f2381 = 637534208;
        float f2 = f / 2.0f;
        this.f2369 = Math.round(f2);
        this.f2375 = 0;
        if (this.f2342 == 0) {
            f2 = f;
        }
        this.f2345 = Math.round(f2);
        if (!C1687.m3691()) {
            this.f2358 = true;
            m1177();
            return;
        }
        super.setElevation(f);
        this.f2362 = true;
        this.f2358 = false;
        m1177();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        Label label = (Label) getTag(C2102.fab_label);
        if (label != null) {
            label.setEnabled(z);
        }
    }

    public void setHideAnimation(Animation animation) {
        this.f2357 = animation;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f2371 != drawable) {
            this.f2371 = drawable;
            m1177();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        Drawable drawable = getResources().getDrawable(i);
        if (this.f2371 != drawable) {
            this.f2371 = drawable;
            m1177();
        }
    }

    public synchronized void setIndeterminate(boolean z) {
        if (!z) {
            this.f2360 = 0.0f;
        }
        this.f2364 = z;
        this.f2353 = true;
        this.f2386 = z;
        this.f2355 = SystemClock.uptimeMillis();
        m1182();
        m1177();
    }

    public void setLabelColors(int i, int i2, int i3) {
        Label labelView = getLabelView();
        int paddingLeft = labelView.getPaddingLeft();
        int paddingTop = labelView.getPaddingTop();
        int paddingRight = labelView.getPaddingRight();
        int paddingBottom = labelView.getPaddingBottom();
        labelView.f2478 = i;
        labelView.f2492 = i2;
        labelView.f2485 = i3;
        labelView.m1192();
        labelView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public void setLabelText(String str) {
        this.f2351 = str;
        Label labelView = getLabelView();
        if (labelView != null) {
            labelView.setText(str);
        }
    }

    public void setLabelTextColor(int i) {
        getLabelView().setTextColor(i);
    }

    public void setLabelTextColor(ColorStateList colorStateList) {
        getLabelView().setTextColor(colorStateList);
    }

    public void setLabelVisibility(int i) {
        Label labelView = getLabelView();
        if (labelView != null) {
            labelView.setVisibility(i);
            labelView.setHandleVisibilityChanges(i == 0);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.f2362) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin += getShadowX();
            marginLayoutParams.topMargin += getShadowY();
            marginLayoutParams.rightMargin += getShadowX();
            marginLayoutParams.bottomMargin += getShadowY();
        }
        super.setLayoutParams(layoutParams);
    }

    public synchronized void setMax(int i) {
        this.f2379 = i;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f2354 = onClickListener;
        View view = (View) getTag(C2102.fab_label);
        if (view != null) {
            view.setOnClickListener(new ViewOnClickListenerC0356());
        }
    }

    public synchronized void setProgress(int i, boolean z) {
        if (this.f2386) {
            return;
        }
        this.f2346 = i;
        this.f2370 = z;
        if (!this.f2376) {
            this.f2352 = true;
            return;
        }
        this.f2364 = true;
        this.f2353 = true;
        m1182();
        m1180();
        m1177();
        if (i < 0) {
            i = 0;
        } else {
            int i2 = this.f2379;
            if (i > i2) {
                i = i2;
            }
        }
        float f = i;
        if (f == this.f2374) {
            return;
        }
        int i3 = this.f2379;
        this.f2374 = i3 > 0 ? (f / i3) * 360.0f : 0.0f;
        this.f2355 = SystemClock.uptimeMillis();
        if (!z) {
            this.f2360 = this.f2374;
        }
        invalidate();
    }

    public void setShadowColor(int i) {
        if (this.f2381 != i) {
            this.f2381 = i;
            m1177();
        }
    }

    public void setShadowColorResource(int i) {
        int color = getResources().getColor(i);
        if (this.f2381 != color) {
            this.f2381 = color;
            m1177();
        }
    }

    public void setShadowRadius(float f) {
        this.f2369 = C1687.m3678(getContext(), f);
        requestLayout();
        m1177();
    }

    public void setShadowRadius(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        if (this.f2369 != dimensionPixelSize) {
            this.f2369 = dimensionPixelSize;
            requestLayout();
            m1177();
        }
    }

    public void setShadowXOffset(float f) {
        this.f2375 = C1687.m3678(getContext(), f);
        requestLayout();
        m1177();
    }

    public void setShadowXOffset(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        if (this.f2375 != dimensionPixelSize) {
            this.f2375 = dimensionPixelSize;
            requestLayout();
            m1177();
        }
    }

    public void setShadowYOffset(float f) {
        this.f2345 = C1687.m3678(getContext(), f);
        requestLayout();
        m1177();
    }

    public void setShadowYOffset(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        if (this.f2345 != dimensionPixelSize) {
            this.f2345 = dimensionPixelSize;
            requestLayout();
            m1177();
        }
    }

    public void setShowAnimation(Animation animation) {
        this.f2384 = animation;
    }

    public synchronized void setShowProgressBackground(boolean z) {
        this.f2363 = z;
    }

    public void setShowShadow(boolean z) {
        if (this.f2358 != z) {
            this.f2358 = z;
            m1177();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        Label label = (Label) getTag(C2102.fab_label);
        if (label != null) {
            label.setVisibility(i);
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean m1173() {
        return !this.f2378 && this.f2358;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final float m1174() {
        return getMeasuredWidth() / 2;
    }

    @TargetApi(21)
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Drawable m1175() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, m1181(this.f2347));
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, m1181(this.f2385));
        stateListDrawable.addState(new int[0], m1181(this.f2341));
        if (!C1687.m3691()) {
            this.f2365 = stateListDrawable;
            return stateListDrawable;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.f2387}), stateListDrawable, null);
        setOutlineProvider(new C0357(this));
        setClipToOutline(true);
        this.f2365 = rippleDrawable;
        return rippleDrawable;
    }

    @TargetApi(21)
    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m1176() {
        Drawable drawable = this.f2365;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[]{R.attr.state_enabled, R.attr.state_pressed});
        } else if (C1687.m3691()) {
            RippleDrawable rippleDrawable = (RippleDrawable) this.f2365;
            rippleDrawable.setState(new int[]{R.attr.state_enabled, R.attr.state_pressed});
            rippleDrawable.setHotspot(m1174(), m1178());
            rippleDrawable.setVisible(true, true);
        }
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public void m1177() {
        LayerDrawable layerDrawable = m1173() ? new LayerDrawable(new Drawable[]{new C0358(null), m1175(), getIconDrawable()}) : new LayerDrawable(new Drawable[]{m1175(), getIconDrawable()});
        int max = getIconDrawable() != null ? Math.max(getIconDrawable().getIntrinsicWidth(), getIconDrawable().getIntrinsicHeight()) : -1;
        int circleSize = getCircleSize();
        if (max <= 0) {
            max = this.f2377;
        }
        int i = (circleSize - max) / 2;
        int abs = m1173() ? Math.abs(this.f2375) + this.f2369 : 0;
        int abs2 = m1173() ? this.f2369 + Math.abs(this.f2345) : 0;
        if (this.f2364) {
            int i2 = this.f2372;
            abs += i2;
            abs2 += i2;
        }
        int i3 = abs + i;
        int i4 = abs2 + i;
        layerDrawable.setLayerInset(m1173() ? 2 : 1, i3, i4, i3, i4);
        setBackgroundCompat(layerDrawable);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final float m1178() {
        return getMeasuredHeight() / 2;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int m1179() {
        int circleSize = getCircleSize() + (m1173() ? getShadowX() * 2 : 0);
        return this.f2364 ? circleSize + (this.f2372 * 2) : circleSize;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final void m1180() {
        if (this.f2376) {
            return;
        }
        if (this.f2349 == -1.0f) {
            this.f2349 = getX();
        }
        if (this.f2380 == -1.0f) {
            this.f2380 = getY();
        }
        this.f2376 = true;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Drawable m1181(int i) {
        C0359 c0359 = new C0359(new OvalShape(), null);
        c0359.getPaint().setColor(i);
        return c0359;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final void m1182() {
        int shadowX = m1173() ? getShadowX() : 0;
        int shadowY = m1173() ? getShadowY() : 0;
        int i = this.f2372;
        this.f2373 = new RectF((i / 2) + shadowX, (i / 2) + shadowY, (m1179() - shadowX) - (this.f2372 / 2), (m1183() - shadowY) - (this.f2372 / 2));
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int m1183() {
        int circleSize = getCircleSize() + (m1173() ? getShadowY() * 2 : 0);
        return this.f2364 ? circleSize + (this.f2372 * 2) : circleSize;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void m1184(boolean z) {
        if (getVisibility() == 4) {
            if (z) {
                this.f2357.cancel();
                startAnimation(this.f2384);
            }
            super.setVisibility(0);
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m1185(boolean z) {
        if (getVisibility() == 4) {
            return;
        }
        if (z) {
            this.f2384.cancel();
            startAnimation(this.f2357);
        }
        super.setVisibility(4);
    }

    @TargetApi(21)
    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m1186() {
        Drawable drawable = this.f2365;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[]{R.attr.state_enabled});
        } else if (C1687.m3691()) {
            RippleDrawable rippleDrawable = (RippleDrawable) this.f2365;
            rippleDrawable.setState(new int[]{R.attr.state_enabled});
            rippleDrawable.setHotspot(m1174(), m1178());
            rippleDrawable.setVisible(true, true);
        }
    }
}
