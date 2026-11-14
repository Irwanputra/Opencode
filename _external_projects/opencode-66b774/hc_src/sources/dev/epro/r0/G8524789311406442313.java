package dev.epro.r0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G8524789311406442313 extends Drawable.ConstantState {
    public I9906786506247477813 a;
    public float j;
    public ColorStateList c = null;
    public ColorStateList d = null;
    public ColorStateList e = null;
    public PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public Rect g = null;
    public float h = 1.0f;
    public float i = 1.0f;
    public int k = 255;
    public float l = 0.0f;
    public float m = 0.0f;
    public int n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f259o = 0;
    public Paint.Style p = Paint.Style.FILL_AND_STROKE;
    public K1968397570448307835 b = null;

    public G8524789311406442313(I9906786506247477813 i9906786506247477813) {
        this.a = i9906786506247477813;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        I11571046933844109529 i11571046933844109529 = new I11571046933844109529(this);
        i11571046933844109529.f = true;
        i11571046933844109529.g = true;
        return i11571046933844109529;
    }
}
