package dev.epro.r0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V17114972836633323622 implements View.OnTouchListener {
    public static final int q = ViewConfiguration.getTapTimeout();
    public final K2139607335583824538 a;
    public final AccelerateInterpolator b;
    public final S9684361936304835821 c;
    public U3594978070141619353 d;
    public final float[] e;
    public final float[] f;
    public final int g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f538o;
    public final S9684361936304835821 p;

    public V17114972836633323622(S9684361936304835821 s9684361936304835821) {
        K2139607335583824538 k2139607335583824538 = new K2139607335583824538();
        k2139607335583824538.e = Long.MIN_VALUE;
        k2139607335583824538.g = -1L;
        k2139607335583824538.f = 0L;
        this.a = k2139607335583824538;
        this.b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.h = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.i = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.j = fArr5;
        this.c = s9684361936304835821;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.g = q;
        k2139607335583824538.a = (short) 500;
        k2139607335583824538.b = (short) 500;
        this.p = s9684361936304835821;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.e
            r0 = r0[r4]
            float[] r1 = r3.f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.h
            r0 = r0[r4]
            float[] r1 = r3.i
            r1 = r1[r4]
            float[] r3 = r3.j
            r3 = r3[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r3 = b(r5, r1, r3)
            return r3
        L51:
            float r4 = -r5
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V17114972836633323622.a(int, float, float, float):float");
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.n) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.l) {
            this.n = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        K2139607335583824538 k2139607335583824538 = this.a;
        int i2 = (int) (currentAnimationTimeMillis - k2139607335583824538.e);
        short s = k2139607335583824538.b;
        if (i2 > s) {
            i = s;
        } else if (i2 >= 0) {
            i = i2;
        }
        k2139607335583824538.i = i;
        k2139607335583824538.h = k2139607335583824538.a(currentAnimationTimeMillis);
        k2139607335583824538.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        S9684361936304835821 s9684361936304835821;
        int count;
        K2139607335583824538 k2139607335583824538 = this.a;
        float f = k2139607335583824538.d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(k2139607335583824538.c);
        if (abs != 0 && (count = (s9684361936304835821 = this.p).getCount()) != 0) {
            int childCount = s9684361936304835821.getChildCount();
            int firstVisiblePosition = s9684361936304835821.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && s9684361936304835821.getChildAt(0).getTop() >= 0)) : !(i >= count && s9684361936304835821.getChildAt(childCount - 1).getBottom() <= s9684361936304835821.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f538o
            r1 = 0
            if (r0 != 0) goto L7
            goto L78
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L78
        L17:
            r7.d()
            return r1
        L1b:
            r7.m = r2
            r7.k = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            dev.epro.r0.S9684361936304835821 r4 = r7.c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            dev.epro.r0.K2139607335583824538 r9 = r7.a
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.n
            if (r8 != 0) goto L78
            boolean r8 = r7.e()
            if (r8 == 0) goto L78
            dev.epro.r0.U3594978070141619353 r8 = r7.d
            if (r8 != 0) goto L60
            dev.epro.r0.U3594978070141619353 r8 = new dev.epro.r0.U3594978070141619353
            r8.<init>(r7, r2)
            r7.d = r8
        L60:
            r7.n = r2
            r7.l = r2
            boolean r9 = r7.k
            if (r9 != 0) goto L73
            int r9 = r7.g
            if (r9 <= 0) goto L73
            long r5 = (long) r9
            java.util.WeakHashMap r9 = dev.epro.r0.W10240872260424387225.a
            r4.postOnAnimationDelayed(r8, r5)
            goto L76
        L73:
            r8.run()
        L76:
            r7.k = r2
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V17114972836633323622.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
