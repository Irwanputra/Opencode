package com.google.android.material.slider;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.core.app.NotificationCompat;
import com.google.android.material.slider.BaseSlider;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p034.p035.p038.C1011;
import p034.p035.p045.C1096;
import p034.p035.p045.p046.C1084;
import p034.p063.p064.AbstractC1353;
import p034.p095.C1687;
import p131.p155.p156.p157.C2098;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2144;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p169.C2153;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p173.C2186;
import p131.p161.p162.p163.p182.InterfaceC2239;
import p131.p161.p162.p163.p182.InterfaceC2240;
import p131.p161.p162.p163.p182.InterfaceC2241;
import p131.p161.p162.p163.p185.C2252;
import p131.p161.p162.p163.p185.C2255;
import p131.p161.p162.p163.p185.InterfaceC2285;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends InterfaceC2241<S>, T extends InterfaceC2239<S>> extends View {

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public static final String f3365 = BaseSlider.class.getSimpleName();

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public static final int f3366 = C2350.Widget_MaterialComponents_Slider;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final C0458 f3367;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Paint f3368;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public ColorStateList f3369;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public float f3370;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Paint f3371;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public ColorStateList f3372;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public BaseSlider<S, L, T>.RunnableC0457 f3373;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public ArrayList<Float> f3374;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public InterfaceC2240 f3375;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public ColorStateList f3376;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f3377;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public MotionEvent f3378;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int f3379;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public float f3380;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public boolean f3381;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final int f3382;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Paint f3383;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public boolean f3384;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public ColorStateList f3385;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f3386;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public int f3387;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f3388;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public int f3389;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public float[] f3390;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public float f3391;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Paint f3392;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public final C2163 f3393;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final List<C2153> f3394;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f3395;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public float f3396;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public ColorStateList f3397;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Paint f3398;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public float f3399;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final List<L> f3400;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f3401;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public boolean f3402;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Paint f3403;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public int f3404;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public int f3405;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final List<T> f3406;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final AccessibilityManager f3407;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public int f3408;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final InterfaceC0460 f3409;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new C0456();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public float f3410;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public float f3411;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public float f3412;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f3413;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public ArrayList<Float> f3414;

        /* renamed from: com.google.android.material.slider.BaseSlider$SliderState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0456 implements Parcelable.Creator<SliderState> {
            @Override // android.os.Parcelable.Creator
            public SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        }

        public SliderState(Parcel parcel, C0459 c0459) {
            super(parcel);
            this.f3410 = parcel.readFloat();
            this.f3411 = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f3414 = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f3412 = parcel.readFloat();
            this.f3413 = parcel.createBooleanArray()[0];
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f3410);
            parcel.writeFloat(this.f3411);
            parcel.writeList(this.f3414);
            parcel.writeFloat(this.f3412);
            parcel.writeBooleanArray(new boolean[]{this.f3413});
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$〺つふすそ, reason: contains not printable characters */
    public class RunnableC0457 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f3415 = -1;

        public RunnableC0457(C0459 c0459) {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f3367.m3038(this.f3415, 4);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$くし〴〺ぅ, reason: contains not printable characters */
    public static class C0458 extends AbstractC1353 {

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public final BaseSlider<?, ?, ?> f3417;

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public Rect f3418;

        public C0458(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f3418 = new Rect();
            this.f3417 = baseSlider;
        }

        @Override // p034.p063.p064.AbstractC1353
        /* renamed from: ぇぬぎばつ */
        public void mo1121(List<Integer> list) {
            for (int i = 0; i < this.f3417.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // p034.p063.p064.AbstractC1353
        /* renamed from: おぐぴう〸ず */
        public int mo1122(float f, float f2) {
            for (int i = 0; i < this.f3417.getValues().size(); i++) {
                this.f3417.m1465(i, this.f3418);
                if (this.f3418.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        
            if (r8.m1453(r6, r7) != false) goto L17;
         */
        @Override // p034.p063.p064.AbstractC1353
        /* renamed from: ごづごきえ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo1123(int r6, int r7, android.os.Bundle r8) {
            /*
                r5 = this;
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r5.f3417
                boolean r0 = r0.isEnabled()
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                r0 = 4096(0x1000, float:5.74E-42)
                r2 = 1
                r3 = 8192(0x2000, float:1.14794E-41)
                if (r7 == r0) goto L41
                if (r7 == r3) goto L41
                r0 = 16908349(0x102003d, float:2.38774E-38)
                if (r7 == r0) goto L19
                return r1
            L19:
                if (r8 == 0) goto L40
                java.lang.String r7 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
                boolean r0 = r8.containsKey(r7)
                if (r0 != 0) goto L24
                goto L40
            L24:
                float r7 = r8.getFloat(r7)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r8 = r5.f3417
                java.lang.String r0 = com.google.android.material.slider.BaseSlider.f3365
                boolean r7 = r8.m1453(r6, r7)
                if (r7 == 0) goto L40
            L32:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r5.f3417
                r7.m1457()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r5.f3417
                r7.postInvalidate()
                r5.m3040(r6, r1)
                return r2
            L40:
                return r1
            L41:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r8 = r5.f3417
                r0 = 20
                java.lang.String r4 = com.google.android.material.slider.BaseSlider.f3365
                float r8 = r8.m1449(r0)
                if (r7 != r3) goto L4e
                float r8 = -r8
            L4e:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r5.f3417
                boolean r7 = r7.m1468()
                if (r7 == 0) goto L57
                float r8 = -r8
            L57:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r5.f3417
                java.util.List r7 = r7.getValues()
                java.lang.Object r7 = r7.get(r6)
                java.lang.Float r7 = (java.lang.Float) r7
                float r7 = r7.floatValue()
                float r7 = r7 + r8
                com.google.android.material.slider.BaseSlider<?, ?, ?> r8 = r5.f3417
                float r8 = r8.getValueFrom()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r5.f3417
                float r0 = r0.getValueTo()
                float r7 = p237.p238.p239.p241.p242.C2786.m4839(r7, r8, r0)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r8 = r5.f3417
                boolean r7 = r8.m1453(r6, r7)
                if (r7 == 0) goto L81
                goto L32
            L81:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.C0458.mo1123(int, int, android.os.Bundle):boolean");
        }

        @Override // p034.p063.p064.AbstractC1353
        /* renamed from: ぶでにく〼〳 */
        public void mo1126(int i, C1084 c1084) {
            String str;
            Context context;
            int i2;
            c1084.m2455(C1084.C1087.f5556);
            List<Float> values = this.f3417.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.f3417.getValueFrom();
            float valueTo = this.f3417.getValueTo();
            if (this.f3417.isEnabled()) {
                if (floatValue > valueFrom) {
                    c1084.f5550.addAction(8192);
                }
                if (floatValue < valueTo) {
                    c1084.f5550.addAction(NotificationCompat.FLAG_BUBBLE);
                }
            }
            int i3 = Build.VERSION.SDK_INT;
            AccessibilityNodeInfo.RangeInfo obtain = i3 >= 19 ? AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue) : null;
            if (i3 >= 19) {
                c1084.f5550.setRangeInfo(obtain);
            }
            c1084.f5550.setClassName(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f3417.getContentDescription() != null) {
                sb.append(this.f3417.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                if (i == this.f3417.getValues().size() - 1) {
                    context = this.f3417.getContext();
                    i2 = C2144.material_slider_range_end;
                } else if (i == 0) {
                    context = this.f3417.getContext();
                    i2 = C2144.material_slider_range_start;
                } else {
                    str = "";
                    sb.append(str);
                    sb.append(this.f3417.m1450(floatValue));
                }
                str = context.getString(i2);
                sb.append(str);
                sb.append(this.f3417.m1450(floatValue));
            }
            c1084.f5550.setContentDescription(sb.toString());
            this.f3417.m1465(i, this.f3418);
            c1084.f5550.setBoundsInParent(this.f3418);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0459 implements InterfaceC0460 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ int f3419;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ AttributeSet f3421;

        public C0459(AttributeSet attributeSet, int i) {
            this.f3421 = attributeSet;
            this.f3419 = i;
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$びぐびあび, reason: contains not printable characters */
    public interface InterfaceC0460 {
    }

    public BaseSlider(Context context) {
        this(context, null);
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.sliderStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BaseSlider(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f3374.size() == 1) {
            floatValue2 = this.f3399;
        }
        float m1461 = m1461(floatValue2);
        float m14612 = m1461(floatValue);
        return m1468() ? new float[]{m14612, m1461} : new float[]{m1461, m14612};
    }

    private float getValueOfTouchPosition() {
        double d;
        float f = this.f3391;
        float f2 = this.f3380;
        if (f2 > 0.0f) {
            int i = (int) ((this.f3396 - this.f3399) / f2);
            double round = Math.round(f * i);
            double d2 = i;
            Double.isNaN(round);
            Double.isNaN(d2);
            Double.isNaN(round);
            Double.isNaN(d2);
            d = round / d2;
        } else {
            d = f;
        }
        if (m1468()) {
            d = 1.0d - d;
        }
        float f3 = this.f3396;
        float f4 = this.f3399;
        double d3 = f3 - f4;
        Double.isNaN(d3);
        double d4 = f4;
        Double.isNaN(d4);
        return (float) ((d * d3) + d4);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.f3391;
        if (m1468()) {
            f = 1.0f - f;
        }
        float f2 = this.f3396;
        float f3 = this.f3399;
        return C2098.m4188(f2, f3, f, f3);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f3374.size() == arrayList.size() && this.f3374.equals(arrayList)) {
            return;
        }
        this.f3374 = arrayList;
        this.f3381 = true;
        this.f3408 = 0;
        m1457();
        if (this.f3394.size() > this.f3374.size()) {
            List<C2153> subList = this.f3394.subList(this.f3374.size(), this.f3394.size());
            for (C2153 c2153 : subList) {
                if (C1096.m2507(this)) {
                    m1460(c2153);
                }
            }
            subList.clear();
        }
        while (this.f3394.size() < this.f3374.size()) {
            C0459 c0459 = (C0459) this.f3409;
            TypedArray m4408 = C2255.m4408(BaseSlider.this.getContext(), c0459.f3421, C2243.Slider, c0459.f3419, f3366, new int[0]);
            Context context = BaseSlider.this.getContext();
            int resourceId = m4408.getResourceId(C2243.Slider_labelStyle, C2350.Widget_MaterialComponents_Tooltip);
            C2153 c21532 = new C2153(context, null, 0, resourceId);
            TypedArray m44082 = C2255.m4408(c21532.f9018, null, C2243.Tooltip, 0, resourceId, new int[0]);
            c21532.f9013 = c21532.f9018.getResources().getDimensionPixelSize(C2324.mtrl_tooltip_arrowSize);
            C2180 c2180 = c21532.f9045.f9074;
            c2180.getClass();
            C2180.C2181 c2181 = new C2180.C2181(c2180);
            c2181.f9141 = c21532.m4236();
            c21532.f9045.f9074 = c2181.m4291();
            c21532.invalidateSelf();
            CharSequence text = m44082.getText(C2243.Tooltip_android_text);
            if (!TextUtils.equals(c21532.f9010, text)) {
                c21532.f9010 = text;
                c21532.f9016.f9370 = true;
                c21532.invalidateSelf();
            }
            c21532.f9016.m4398(C1687.m3660(c21532.f9018, m44082, C2243.Tooltip_android_textAppearance), c21532.f9018);
            c21532.m4252(ColorStateList.valueOf(m44082.getColor(C2243.Tooltip_backgroundTint, C1011.m2352(C1011.m2351(C1687.m3699(c21532.f9018, C2111.colorOnBackground, C2153.class.getCanonicalName()), 153), C1011.m2351(C1687.m3699(c21532.f9018, R.attr.colorBackground, C2153.class.getCanonicalName()), 229)))));
            c21532.m4261(ColorStateList.valueOf(C1687.m3699(c21532.f9018, C2111.colorSurface, C2153.class.getCanonicalName())));
            c21532.f9020 = m44082.getDimensionPixelSize(C2243.Tooltip_android_padding, 0);
            c21532.f9011 = m44082.getDimensionPixelSize(C2243.Tooltip_android_minWidth, 0);
            c21532.f9015 = m44082.getDimensionPixelSize(C2243.Tooltip_android_minHeight, 0);
            c21532.f9019 = m44082.getDimensionPixelSize(C2243.Tooltip_android_layout_margin, 0);
            m44082.recycle();
            m4408.recycle();
            this.f3394.add(c21532);
            if (C1096.m2507(this)) {
                m1456(c21532);
            }
        }
        int i = this.f3394.size() == 1 ? 0 : 1;
        Iterator<C2153> it = this.f3394.iterator();
        while (it.hasNext()) {
            it.next().m4259(i);
        }
        m1463();
        postInvalidate();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f3367.m3046(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f3368.setColor(m1448(this.f3372));
        this.f3383.setColor(m1448(this.f3397));
        this.f3398.setColor(m1448(this.f3385));
        this.f3371.setColor(m1448(this.f3376));
        for (C2153 c2153 : this.f3394) {
            if (c2153.isStateful()) {
                c2153.setState(getDrawableState());
            }
        }
        if (this.f3393.isStateful()) {
            this.f3393.setState(getDrawableState());
        }
        this.f3392.setColor(m1448(this.f3369));
        this.f3392.setAlpha(63);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f3367.f6473;
    }

    public int getActiveThumbIndex() {
        return this.f3389;
    }

    public int getFocusedThumbIndex() {
        return this.f3408;
    }

    public int getHaloRadius() {
        return this.f3395;
    }

    public ColorStateList getHaloTintList() {
        return this.f3369;
    }

    public int getLabelBehavior() {
        return this.f3379;
    }

    public float getStepSize() {
        return this.f3380;
    }

    public float getThumbElevation() {
        return this.f3393.f9045.f9072;
    }

    public int getThumbRadius() {
        return this.f3387;
    }

    public ColorStateList getThumbTintList() {
        return this.f3393.f9045.f9084;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f3376;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f3385;
    }

    public ColorStateList getTickTintList() {
        if (this.f3385.equals(this.f3376)) {
            return this.f3376;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f3397;
    }

    public int getTrackHeight() {
        return this.f3388;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f3372;
    }

    public int getTrackSidePadding() {
        return this.f3401;
    }

    public ColorStateList getTrackTintList() {
        if (this.f3372.equals(this.f3397)) {
            return this.f3397;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f3405;
    }

    public float getValueFrom() {
        return this.f3399;
    }

    public float getValueTo() {
        return this.f3396;
    }

    public List<Float> getValues() {
        return new ArrayList(this.f3374);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator<C2153> it = this.f3394.iterator();
        while (it.hasNext()) {
            m1456(it.next());
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.RunnableC0457 runnableC0457 = this.f3373;
        if (runnableC0457 != null) {
            removeCallbacks(runnableC0457);
        }
        Iterator<C2153> it = this.f3394.iterator();
        while (it.hasNext()) {
            m1460(it.next());
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f3381) {
            m1458();
            if (this.f3380 > 0.0f) {
                m1455();
            }
        }
        super.onDraw(canvas);
        int m1466 = m1466();
        int i = this.f3405;
        float[] activeRange = getActiveRange();
        int i2 = this.f3401;
        float f = i;
        float f2 = i2 + (activeRange[1] * f);
        float f3 = i2 + i;
        if (f2 < f3) {
            float f4 = m1466;
            canvas.drawLine(f2, f4, f3, f4, this.f3368);
        }
        float f5 = this.f3401;
        float f6 = (activeRange[0] * f) + f5;
        if (f6 > f5) {
            float f7 = m1466;
            canvas.drawLine(f5, f7, f6, f7, this.f3368);
        }
        if (((Float) Collections.max(getValues())).floatValue() > this.f3399) {
            int i3 = this.f3405;
            float[] activeRange2 = getActiveRange();
            float f8 = this.f3401;
            float f9 = i3;
            float f10 = m1466;
            canvas.drawLine((activeRange2[0] * f9) + f8, f10, (activeRange2[1] * f9) + f8, f10, this.f3383);
        }
        if (this.f3380 > 0.0f) {
            float[] activeRange3 = getActiveRange();
            int round = Math.round(activeRange3[0] * ((this.f3390.length / 2) - 1));
            int round2 = Math.round(activeRange3[1] * ((this.f3390.length / 2) - 1));
            int i4 = round * 2;
            canvas.drawPoints(this.f3390, 0, i4, this.f3398);
            int i5 = round2 * 2;
            canvas.drawPoints(this.f3390, i4, i5 - i4, this.f3371);
            float[] fArr = this.f3390;
            canvas.drawPoints(fArr, i5, fArr.length - i5, this.f3398);
        }
        if ((this.f3402 || isFocused()) && isEnabled()) {
            int i6 = this.f3405;
            if (m1452()) {
                int m1461 = (int) ((m1461(this.f3374.get(this.f3408).floatValue()) * i6) + this.f3401);
                if (Build.VERSION.SDK_INT < 28) {
                    int i7 = this.f3395;
                    canvas.clipRect(m1461 - i7, m1466 - i7, m1461 + i7, i7 + m1466, Region.Op.UNION);
                }
                canvas.drawCircle(m1461, m1466, this.f3395, this.f3392);
            }
            if (this.f3389 != -1 && this.f3379 != 2) {
                Iterator<C2153> it = this.f3394.iterator();
                for (int i8 = 0; i8 < this.f3374.size() && it.hasNext(); i8++) {
                    if (i8 != this.f3408) {
                        m1454(it.next(), this.f3374.get(i8).floatValue());
                    }
                }
                if (!it.hasNext()) {
                    throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f3394.size()), Integer.valueOf(this.f3374.size())));
                }
                m1454(it.next(), this.f3374.get(this.f3408).floatValue());
            }
        }
        int i9 = this.f3405;
        if (!isEnabled()) {
            Iterator<Float> it2 = this.f3374.iterator();
            while (it2.hasNext()) {
                canvas.drawCircle((m1461(it2.next().floatValue()) * i9) + this.f3401, m1466, this.f3387, this.f3403);
            }
        }
        Iterator<Float> it3 = this.f3374.iterator();
        while (it3.hasNext()) {
            Float next = it3.next();
            canvas.save();
            int m14612 = this.f3401 + ((int) (m1461(next.floatValue()) * i9));
            int i10 = this.f3387;
            canvas.translate(m14612 - i10, m1466 - i10);
            this.f3393.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.f3389 = -1;
            Iterator<C2153> it = this.f3394.iterator();
            while (it.hasNext()) {
                C1687.m3714(this).mo4436(it.next());
            }
            this.f3367.m3047(this.f3408);
            return;
        }
        if (i == 1) {
            m1451(Integer.MAX_VALUE);
        } else if (i == 2) {
            m1451(Integer.MIN_VALUE);
        } else if (i == 17) {
            m1469(Integer.MAX_VALUE);
        } else if (i == 66) {
            m1469(Integer.MIN_VALUE);
        }
        this.f3367.m3039(this.f3408);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
    
        if (r12 != 81) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00a5, code lost:
    
        if (m1468() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ac, code lost:
    
        if (m1468() != false) goto L57;
     */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f3384 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f3377 + (this.f3379 == 1 ? this.f3394.get(0).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f3399 = sliderState.f3410;
        this.f3396 = sliderState.f3411;
        setValuesInternal(sliderState.f3414);
        this.f3380 = sliderState.f3412;
        if (sliderState.f3413) {
            requestFocus();
        }
        m1463();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f3410 = this.f3399;
        sliderState.f3411 = this.f3396;
        sliderState.f3414 = new ArrayList<>(this.f3374);
        sliderState.f3412 = this.f3380;
        sliderState.f3413 = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f3405 = Math.max(i - (this.f3401 * 2), 0);
        if (this.f3380 > 0.0f) {
            m1455();
        }
        m1457();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - this.f3401) / this.f3405;
        this.f3391 = f;
        float max = Math.max(0.0f, f);
        this.f3391 = max;
        this.f3391 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f3402 = false;
                MotionEvent motionEvent2 = this.f3378;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f3378.getX() - motionEvent.getX()) <= this.f3382 && Math.abs(this.f3378.getY() - motionEvent.getY()) <= this.f3382) {
                    mo1467();
                }
                if (this.f3389 != -1) {
                    m1459();
                    this.f3389 = -1;
                }
                Iterator<C2153> it = this.f3394.iterator();
                while (it.hasNext()) {
                    C1687.m3714(this).mo4436(it.next());
                }
                Iterator<T> it2 = this.f3406.iterator();
                while (it2.hasNext()) {
                    it2.next().m4348(this);
                }
            } else if (actionMasked == 2) {
                if (!this.f3402) {
                    if (Math.abs(x - this.f3370) < this.f3382) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    m1464();
                }
                if (mo1467()) {
                    this.f3402 = true;
                    m1459();
                    m1457();
                }
            }
            invalidate();
        } else {
            this.f3370 = x;
            ViewParent parent = getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo1467()) {
                    requestFocus();
                    this.f3402 = true;
                    m1459();
                    m1457();
                    invalidate();
                    m1464();
                }
            }
        }
        setPressed(this.f3402);
        this.f3378 = MotionEvent.obtain(motionEvent);
        return true;
    }

    public void setActiveThumbIndex(int i) {
        this.f3389 = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f3374.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f3408 = i;
        this.f3367.m3039(i);
        postInvalidate();
    }

    public void setHaloRadius(int i) {
        if (i == this.f3395) {
            return;
        }
        this.f3395 = i;
        Drawable background = getBackground();
        if (m1452() || !(background instanceof RippleDrawable)) {
            postInvalidate();
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) background;
        int i2 = this.f3395;
        if (Build.VERSION.SDK_INT >= 23) {
            rippleDrawable.setRadius(i2);
            return;
        }
        try {
            RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE).invoke(rippleDrawable, Integer.valueOf(i2));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new IllegalStateException("Couldn't set RippleDrawable radius", e);
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f3369)) {
            return;
        }
        this.f3369 = colorStateList;
        Drawable background = getBackground();
        if (!m1452() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f3392.setColor(colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor()));
        this.f3392.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.f3379 != i) {
            this.f3379 = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(InterfaceC2240 interfaceC2240) {
        this.f3375 = interfaceC2240;
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.toString(f), Float.toString(this.f3399), Float.toString(this.f3396)));
        }
        if (this.f3380 != f) {
            this.f3380 = f;
            this.f3381 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        C2163 c2163 = this.f3393;
        C2163.C2164 c2164 = c2163.f9045;
        if (c2164.f9072 != f) {
            c2164.f9072 = f;
            c2163.m4269();
        }
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(int i) {
        if (i == this.f3387) {
            return;
        }
        this.f3387 = i;
        C2163 c2163 = this.f3393;
        C2180.C2181 c2181 = new C2180.C2181();
        float f = this.f3387;
        C2186 m3734 = C1687.m3734(0);
        c2181.f9135 = m3734;
        C2180.C2181.m4288(m3734);
        c2181.f9131 = m3734;
        C2180.C2181.m4288(m3734);
        c2181.f9134 = m3734;
        C2180.C2181.m4288(m3734);
        c2181.f9139 = m3734;
        C2180.C2181.m4288(m3734);
        c2181.m4290(f);
        c2163.f9045.f9074 = c2181.m4291();
        c2163.invalidateSelf();
        C2163 c21632 = this.f3393;
        int i2 = this.f3387;
        c21632.setBounds(0, 0, i2 * 2, i2 * 2);
        postInvalidate();
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3393.m4252(colorStateList);
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f3376)) {
            return;
        }
        this.f3376 = colorStateList;
        this.f3371.setColor(m1448(colorStateList));
        invalidate();
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f3385)) {
            return;
        }
        this.f3385 = colorStateList;
        this.f3398.setColor(m1448(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f3397)) {
            return;
        }
        this.f3397 = colorStateList;
        this.f3383.setColor(m1448(colorStateList));
        invalidate();
    }

    public void setTrackHeight(int i) {
        if (this.f3388 != i) {
            this.f3388 = i;
            this.f3368.setStrokeWidth(i);
            this.f3383.setStrokeWidth(this.f3388);
            this.f3398.setStrokeWidth(this.f3388 / 2.0f);
            this.f3371.setStrokeWidth(this.f3388 / 2.0f);
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f3372)) {
            return;
        }
        this.f3372 = colorStateList;
        this.f3368.setColor(m1448(colorStateList));
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.f3399 = f;
        this.f3381 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f3396 = f;
        this.f3381 = true;
        postInvalidate();
    }

    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final int m1448(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final float m1449(int i) {
        float f = this.f3380;
        if (f == 0.0f) {
            f = 1.0f;
        }
        return (this.f3396 - this.f3399) / f <= i ? f : Math.round(r1 / r4) * f;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final String m1450(float f) {
        InterfaceC2240 interfaceC2240 = this.f3375;
        if (interfaceC2240 != null) {
            return interfaceC2240.m4350(f);
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final boolean m1451(int i) {
        int i2 = this.f3408;
        long j = i2 + i;
        long size = this.f3374.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.f3408 = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.f3389 != -1) {
            this.f3389 = i3;
        }
        m1457();
        postInvalidate();
        return true;
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final boolean m1452() {
        return Build.VERSION.SDK_INT < 21 || !(getBackground() instanceof RippleDrawable);
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final boolean m1453(int i, float f) {
        if (Math.abs(f - this.f3374.get(i).floatValue()) < 1.0E-4d) {
            return false;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        this.f3374.set(i, Float.valueOf(C2786.m4839(f, i3 < 0 ? this.f3399 : this.f3374.get(i3).floatValue(), i2 >= this.f3374.size() ? this.f3396 : this.f3374.get(i2).floatValue())));
        this.f3408 = i;
        Iterator<L> it = this.f3400.iterator();
        while (it.hasNext()) {
            it.next().m4351(this, this.f3374.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f3407;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            BaseSlider<S, L, T>.RunnableC0457 runnableC0457 = this.f3373;
            if (runnableC0457 == null) {
                this.f3373 = new RunnableC0457(null);
            } else {
                removeCallbacks(runnableC0457);
            }
            BaseSlider<S, L, T>.RunnableC0457 runnableC04572 = this.f3373;
            runnableC04572.f3415 = i;
            postDelayed(runnableC04572, 200L);
        }
        return true;
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final void m1454(C2153 c2153, float f) {
        String m1450 = m1450(f);
        if (!TextUtils.equals(c2153.f9010, m1450)) {
            c2153.f9010 = m1450;
            c2153.f9016.f9370 = true;
            c2153.invalidateSelf();
        }
        int m1461 = (this.f3401 + ((int) (m1461(f) * this.f3405))) - (c2153.getIntrinsicWidth() / 2);
        int m1466 = m1466() - (this.f3404 + this.f3387);
        c2153.setBounds(m1461, m1466 - c2153.getIntrinsicHeight(), c2153.getIntrinsicWidth() + m1461, m1466);
        Rect rect = new Rect(c2153.getBounds());
        C2252.m4401(C1687.m3725(this), this, rect);
        c2153.setBounds(rect);
        C1687.m3714(this).mo4437(c2153);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m1455() {
        m1458();
        int min = Math.min((int) (((this.f3396 - this.f3399) / this.f3380) + 1.0f), (this.f3405 / (this.f3388 * 2)) + 1);
        float[] fArr = this.f3390;
        if (fArr == null || fArr.length != min * 2) {
            this.f3390 = new float[min * 2];
        }
        float f = this.f3405 / (min - 1);
        for (int i = 0; i < min * 2; i += 2) {
            float[] fArr2 = this.f3390;
            fArr2[i] = ((i / 2) * f) + this.f3401;
            fArr2[i + 1] = m1466();
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1456(C2153 c2153) {
        ViewGroup m3725 = C1687.m3725(this);
        c2153.getClass();
        if (m3725 == null) {
            return;
        }
        int[] iArr = new int[2];
        m3725.getLocationOnScreen(iArr);
        c2153.f9012 = iArr[0];
        m3725.getWindowVisibleDisplayFrame(c2153.f9014);
        m3725.addOnLayoutChangeListener(c2153.f9009);
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final void m1457() {
        if (m1452() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int m1461 = (int) ((m1461(this.f3374.get(this.f3408).floatValue()) * this.f3405) + this.f3401);
            int m1466 = m1466();
            int i = this.f3395;
            C2786.m4777(background, m1461 - i, m1466 - i, m1461 + i, m1466 + i);
        }
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final void m1458() {
        if (this.f3381) {
            float f = this.f3399;
            float f2 = this.f3396;
            if (f >= f2) {
                throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.toString(this.f3399), Float.toString(this.f3396)));
            }
            if (f2 <= f) {
                throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.toString(this.f3396), Float.toString(this.f3399)));
            }
            if (this.f3380 > 0.0f && !m1462(f2)) {
                throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.toString(this.f3380), Float.toString(this.f3399), Float.toString(this.f3396)));
            }
            Iterator<Float> it = this.f3374.iterator();
            while (it.hasNext()) {
                Float next = it.next();
                if (next.floatValue() < this.f3399 || next.floatValue() > this.f3396) {
                    throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", Float.toString(next.floatValue()), Float.toString(this.f3399), Float.toString(this.f3396)));
                }
                if (this.f3380 > 0.0f && !m1462(next.floatValue())) {
                    throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", Float.toString(next.floatValue()), Float.toString(this.f3399), Float.toString(this.f3380), Float.toString(this.f3380)));
                }
            }
            float f3 = this.f3380;
            if (f3 != 0.0f) {
                if (((int) f3) != f3) {
                    String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", "stepSize", Float.valueOf(f3));
                }
                float f4 = this.f3399;
                if (((int) f4) != f4) {
                    String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", "valueFrom", Float.valueOf(f4));
                }
                float f5 = this.f3396;
                if (((int) f5) != f5) {
                    String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", "valueTo", Float.valueOf(f5));
                }
            }
            this.f3381 = false;
        }
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final boolean m1459() {
        return m1453(this.f3389, getValueOfTouchPosition());
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m1460(C2153 c2153) {
        InterfaceC2285 m3714 = C1687.m3714(this);
        if (m3714 != null) {
            m3714.mo4436(c2153);
            ViewGroup m3725 = C1687.m3725(this);
            c2153.getClass();
            if (m3725 == null) {
                return;
            }
            m3725.removeOnLayoutChangeListener(c2153.f9009);
        }
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final float m1461(float f) {
        float f2 = this.f3399;
        float f3 = (f - f2) / (this.f3396 - f2);
        return m1468() ? 1.0f - f3 : f3;
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final boolean m1462(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.f3399))).divide(new BigDecimal(Float.toString(this.f3380)), MathContext.DECIMAL64).doubleValue();
        double round = Math.round(doubleValue);
        Double.isNaN(round);
        return Math.abs(round - doubleValue) < 1.0E-4d;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m1463() {
        for (L l : this.f3400) {
            Iterator<Float> it = this.f3374.iterator();
            while (it.hasNext()) {
                l.m4351(this, it.next().floatValue(), false);
            }
        }
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final void m1464() {
        Iterator<T> it = this.f3406.iterator();
        while (it.hasNext()) {
            it.next().m4349(this);
        }
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public void m1465(int i, Rect rect) {
        int m1461 = this.f3401 + ((int) (m1461(getValues().get(i).floatValue()) * this.f3405));
        int m1466 = m1466();
        int i2 = this.f3387;
        rect.set(m1461 - i2, m1466 - i2, m1461 + i2, m1466 + i2);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int m1466() {
        return this.f3386 + (this.f3379 == 1 ? this.f3394.get(0).getIntrinsicHeight() : 0);
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean mo1467() {
        if (this.f3389 != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float m1461 = (m1461(valueOfTouchPositionAbsolute) * this.f3405) + this.f3401;
        this.f3389 = 0;
        float abs = Math.abs(this.f3374.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.f3374.size(); i++) {
            float abs2 = Math.abs(this.f3374.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float m14612 = (m1461(this.f3374.get(i).floatValue()) * this.f3405) + this.f3401;
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            boolean z = !m1468() ? m14612 - m1461 >= 0.0f : m14612 - m1461 <= 0.0f;
            if (Float.compare(abs2, abs) >= 0) {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else {
                    if (Math.abs(m14612 - m1461) < this.f3382) {
                        this.f3389 = -1;
                        return false;
                    }
                    if (!z) {
                    }
                }
            }
            this.f3389 = i;
            abs = abs2;
        }
        return this.f3389 != -1;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final boolean m1468() {
        return C1096.m2491(this) == 1;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final boolean m1469(int i) {
        if (m1468()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        return m1451(i);
    }
}
