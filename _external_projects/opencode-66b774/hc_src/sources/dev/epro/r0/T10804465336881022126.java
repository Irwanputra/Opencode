package dev.epro.r0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T10804465336881022126 extends View {
    public static final int[] f = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] g = new int[0];
    public K4782054336219136759 a;
    public Boolean b;
    public Long c;
    public W13948953340889349604 d;
    public S464754454553842217 e;

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.c;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? f : g;
            K4782054336219136759 k4782054336219136759 = this.a;
            if (k4782054336219136759 != null) {
                k4782054336219136759.setState(iArr);
            }
        } else {
            W13948953340889349604 w13948953340889349604 = new W13948953340889349604(this, (byte) 23);
            this.d = w13948953340889349604;
            postDelayed(w13948953340889349604, 50L);
        }
        this.c = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(T10804465336881022126 t10804465336881022126) {
        K4782054336219136759 k4782054336219136759 = t10804465336881022126.a;
        if (k4782054336219136759 != null) {
            k4782054336219136759.setState(g);
        }
        t10804465336881022126.d = null;
    }

    public final void b(L11334185135933894276 l11334185135933894276, boolean z, long j, int i, long j2, S464754454553842217 s464754454553842217) {
        long j3 = l11334185135933894276.a;
        if (this.a == null || !Boolean.valueOf(z).equals(this.b)) {
            K4782054336219136759 k4782054336219136759 = new K4782054336219136759(z);
            setBackground(k4782054336219136759);
            this.a = k4782054336219136759;
            this.b = Boolean.valueOf(z);
        }
        K4782054336219136759 k47820543362191367592 = this.a;
        k47820543362191367592.getClass();
        this.e = s464754454553842217;
        e(i, j, j2);
        if (z) {
            k47820543362191367592.setHotspot(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)));
        } else {
            k47820543362191367592.setHotspot(k47820543362191367592.getBounds().centerX(), k47820543362191367592.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.e = null;
        W13948953340889349604 w13948953340889349604 = this.d;
        if (w13948953340889349604 != null) {
            removeCallbacks(w13948953340889349604);
            W13948953340889349604 w139489533408893496042 = this.d;
            w139489533408893496042.getClass();
            w139489533408893496042.run();
        } else {
            K4782054336219136759 k4782054336219136759 = this.a;
            if (k4782054336219136759 != null) {
                k4782054336219136759.setState(g);
            }
        }
        K4782054336219136759 k47820543362191367592 = this.a;
        if (k47820543362191367592 == null) {
            return;
        }
        k47820543362191367592.setVisible(false, false);
        unscheduleDrawable(k47820543362191367592);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(int i, long j, long j2) {
        K4782054336219136759 k4782054336219136759 = this.a;
        if (k4782054336219136759 == null) {
            return;
        }
        if (k4782054336219136759.getRadius() != i) {
            k4782054336219136759.setRadius(i);
        }
        float f2 = Build.VERSION.SDK_INT < 28 ? 0.2f : 0.1f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        long b = U10174709222559481877.b(f2, j2);
        U10174709222559481877 u10174709222559481877 = k4782054336219136759.b;
        if (!(u10174709222559481877 == null ? false : P15388715743159210616.a(u10174709222559481877.a, b))) {
            k4782054336219136759.b = new U10174709222559481877(b);
            k4782054336219136759.setColor(ColorStateList.valueOf(J8045362843799184672.u0(b)));
        }
        Rect rect = new Rect(0, 0, T18016951143603335921.Z(Float.intBitsToFloat((int) (j >> 32))), T18016951143603335921.Z(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        k4782054336219136759.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        S464754454553842217 s464754454553842217 = this.e;
        if (s464754454553842217 != null) {
            s464754454553842217.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
