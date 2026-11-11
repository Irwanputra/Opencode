package com.codetroopers.betterpickers.radialtimepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p131.p145.p147.C2032;
import p131.p145.p149.C2034;
import p131.p145.p149.C2034.C2035;
import p131.p145.p149.C2073;
import p131.p221.p222.C2680;

/* loaded from: /tmp/opencode/hc_real.dex */
public class RadialPickerLayout extends FrameLayout implements View.OnTouchListener {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f2255;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int f2256;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public C2034 f2257;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f2258;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public AmPmCirclesView f2259;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int[] f2260;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public Handler f2261;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean f2262;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public View f2263;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int f2264;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f2265;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public float f2266;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f2267;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public InterfaceC0349 f2268;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public RadialTextsView f2269;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public float f2270;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f2271;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public RadialSelectorView f2272;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f2273;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f2274;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public AccessibilityManager f2275;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public RadialSelectorView f2276;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public CircleView f2277;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public RadialTextsView f2278;

    /* renamed from: com.codetroopers.betterpickers.radialtimepicker.RadialPickerLayout$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC0349 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void m1163(int i, int i2, boolean z);
    }

    public RadialPickerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2267 = -1;
        this.f2261 = new Handler();
        setOnTouchListener(this);
        this.f2256 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f2264 = ViewConfiguration.getTapTimeout();
        int i = 0;
        this.f2273 = false;
        CircleView circleView = new CircleView(context);
        this.f2277 = circleView;
        addView(circleView);
        AmPmCirclesView amPmCirclesView = new AmPmCirclesView(context);
        this.f2259 = amPmCirclesView;
        addView(amPmCirclesView);
        RadialTextsView radialTextsView = new RadialTextsView(context);
        this.f2278 = radialTextsView;
        addView(radialTextsView);
        RadialTextsView radialTextsView2 = new RadialTextsView(context);
        this.f2269 = radialTextsView2;
        addView(radialTextsView2);
        RadialSelectorView radialSelectorView = new RadialSelectorView(context);
        this.f2272 = radialSelectorView;
        addView(radialSelectorView);
        RadialSelectorView radialSelectorView2 = new RadialSelectorView(context);
        this.f2276 = radialSelectorView2;
        addView(radialSelectorView2);
        this.f2260 = new int[361];
        int i2 = 0;
        int i3 = 8;
        int i4 = 1;
        while (true) {
            int i5 = 4;
            if (i >= 361) {
                this.f2274 = -1;
                this.f2262 = true;
                View view = new View(context);
                this.f2263 = view;
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.f2263.setBackgroundColor(getResources().getColor(C2680.bpTransparent_black));
                this.f2263.setVisibility(4);
                addView(this.f2263);
                this.f2275 = (AccessibilityManager) context.getSystemService("accessibility");
                return;
            }
            this.f2260[i] = i2;
            if (i4 == i3) {
                i2 += 6;
                if (i2 == 360) {
                    i5 = 7;
                } else if (i2 % 30 == 0) {
                    i5 = 14;
                }
                i3 = i5;
                i4 = 1;
            } else {
                i4++;
            }
            i++;
        }
    }

    private int getCurrentlyShowingValue() {
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            return this.f2271;
        }
        if (currentItemShowing == 1) {
            return this.f2258;
        }
        return -1;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        accessibilityEvent.getText().clear();
        Time time = new Time();
        time.hour = getHours();
        time.minute = getMinutes();
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), time.normalize(true), 1));
        return true;
    }

    public int getCurrentItemShowing() {
        int i = this.f2255;
        if (i == 0 || i == 1) {
            return i;
        }
        return -1;
    }

    public int getHours() {
        return this.f2271;
    }

    public int getIsCurrentlyAmOrPm() {
        int i = this.f2271;
        if (i < 12) {
            return 0;
        }
        return i < 24 ? 1 : -1;
    }

    public int getMinutes() {
        return this.f2258;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(NotificationCompat.FLAG_BUBBLE);
        accessibilityNodeInfo.addAction(8192);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int min = Math.min(size, size2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, mode), View.MeasureSpec.makeMeasureSpec(min, mode2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r11 <= r7) goto L49;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codetroopers.betterpickers.radialtimepicker.RadialPickerLayout.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2;
        int i3;
        int i4;
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        int i5 = i == 4096 ? 1 : i == 8192 ? -1 : 0;
        if (i5 == 0) {
            return false;
        }
        int currentlyShowingValue = getCurrentlyShowingValue();
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            i2 = 30;
            currentlyShowingValue %= 12;
        } else {
            i2 = currentItemShowing == 1 ? 6 : 0;
        }
        int m1162 = m1162(currentlyShowingValue * i2, i5) / i2;
        if (currentItemShowing == 0) {
            i3 = 12;
            i4 = 1;
        } else {
            i3 = 55;
            i4 = 0;
        }
        if (m1162 > i3) {
            m1162 = i4;
        } else if (m1162 < i4) {
            m1162 = i3;
        }
        m1159(currentItemShowing, m1162);
        this.f2268.m1163(currentItemShowing, m1162, false);
        return true;
    }

    public void setAmOrPm(int i) {
        this.f2259.setAmOrPm(i);
        this.f2259.invalidate();
        m1160(2, i);
    }

    public void setCurrentItemShowing(int i, boolean z) {
        C2034.C2035 c2035;
        if (i == 0 || i == 1) {
            int currentItemShowing = getCurrentItemShowing();
            this.f2255 = i;
            if (!z || i == currentItemShowing) {
                int i2 = i == 0 ? Base64.BASELENGTH : 0;
                int i3 = i == 1 ? Base64.BASELENGTH : 0;
                float f = i2;
                C2032.m4128(this.f2278, f);
                C2032.m4128(this.f2272, f);
                float f2 = i3;
                C2032.m4128(this.f2269, f2);
                C2032.m4128(this.f2276, f2);
                return;
            }
            C2073[] c2073Arr = new C2073[4];
            if (i == 1) {
                c2073Arr[0] = this.f2278.getDisappearAnimator();
                c2073Arr[1] = this.f2272.getDisappearAnimator();
                c2073Arr[2] = this.f2269.getReappearAnimator();
                c2073Arr[3] = this.f2276.getReappearAnimator();
            } else if (i == 0) {
                c2073Arr[0] = this.f2278.getReappearAnimator();
                c2073Arr[1] = this.f2272.getReappearAnimator();
                c2073Arr[2] = this.f2269.getDisappearAnimator();
                c2073Arr[3] = this.f2276.getDisappearAnimator();
            }
            C2034 c2034 = this.f2257;
            if (c2034 != null && c2034.mo4136()) {
                this.f2257.mo4134();
            }
            C2034 c20342 = new C2034();
            this.f2257 = c20342;
            c20342.f8782 = true;
            C2073 c2073 = c2073Arr[0];
            if (c2073 != null) {
                c20342.f8782 = true;
                c2035 = c20342.new C2035(c2073);
            } else {
                c2035 = null;
            }
            for (int i4 = 1; i4 < 4; i4++) {
                C2073 c20732 = c2073Arr[i4];
                C2034.C2038 c2038 = C2034.this.f8787.get(c20732);
                if (c2038 == null) {
                    c2038 = new C2034.C2038(c20732);
                    C2034.this.f8787.put(c20732, c2038);
                    C2034.this.f8785.add(c2038);
                }
                c2038.m4141(new C2034.C2036(c2035.f8790, 0));
            }
            this.f2257.mo4135();
        }
    }

    public void setOnValueSelectedListener(InterfaceC0349 interfaceC0349) {
        this.f2268 = interfaceC0349;
    }

    public void setTheme(TypedArray typedArray) {
        this.f2277.setTheme(typedArray);
        this.f2259.setTheme(typedArray);
        this.f2278.setTheme(typedArray);
        this.f2269.setTheme(typedArray);
        this.f2272.setTheme(typedArray);
        this.f2276.setTheme(typedArray);
    }

    public void setTime(int i, int i2) {
        m1159(0, i);
        m1159(1, i2);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1159(int i, int i2) {
        RadialSelectorView radialSelectorView;
        if (i == 0) {
            m1160(0, i2);
            this.f2272.setSelection((i2 % 12) * 30, false, false);
            radialSelectorView = this.f2272;
        } else {
            if (i != 1) {
                return;
            }
            m1160(1, i2);
            this.f2276.setSelection(i2 * 6, false, false);
            radialSelectorView = this.f2276;
        }
        radialSelectorView.invalidate();
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m1160(int i, int i2) {
        int i3;
        if (i == 0) {
            this.f2271 = i2;
            return;
        }
        if (i == 1) {
            this.f2258 = i2;
            return;
        }
        if (i == 2) {
            if (i2 == 0) {
                i3 = this.f2271 % 12;
            } else if (i2 != 1) {
                return;
            } else {
                i3 = (this.f2271 % 12) + 12;
            }
            this.f2271 = i3;
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final int m1161(float f, float f2, boolean z, Boolean[] boolArr) {
        RadialSelectorView radialSelectorView;
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            radialSelectorView = this.f2272;
        } else {
            if (currentItemShowing != 1) {
                return -1;
            }
            radialSelectorView = this.f2276;
        }
        radialSelectorView.getClass();
        return -1;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int m1162(int i, int i2) {
        int i3 = (i / 30) * 30;
        int i4 = i3 + 30;
        if (i2 != 1) {
            if (i2 == -1) {
                return i == i3 ? i3 - 30 : i3;
            }
            if (i - i3 < i4 - i) {
                return i3;
            }
        }
        return i4;
    }
}
