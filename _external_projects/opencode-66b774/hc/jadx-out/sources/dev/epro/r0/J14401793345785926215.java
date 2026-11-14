package dev.epro.r0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J14401793345785926215 {
    public final Y5360590127176187529 a;
    public I9906786506247477813 b;
    public Y16108220161693303283 c;
    public L4980660535418402690 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public PorterDuff.Mode k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public I11571046933844109529 f306o;
    public boolean s;
    public RippleDrawable u;
    public int v;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean t = true;

    public J14401793345785926215(Y5360590127176187529 y5360590127176187529, I9906786506247477813 i9906786506247477813) {
        this.a = y5360590127176187529;
        this.b = i9906786506247477813;
    }

    public final I11571046933844109529 a(boolean z) {
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (I11571046933844109529) ((LayerDrawable) ((InsetDrawable) this.u.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2, int i3, int i4) {
        Y5360590127176187529 y5360590127176187529 = this.a;
        int paddingStart = y5360590127176187529.getPaddingStart();
        int paddingTop = y5360590127176187529.getPaddingTop();
        int paddingEnd = y5360590127176187529.getPaddingEnd();
        int paddingBottom = y5360590127176187529.getPaddingBottom();
        int i5 = this.e;
        int i6 = this.g;
        int i7 = this.f;
        int i8 = this.h;
        this.e = i;
        this.g = i2;
        this.f = i3;
        this.h = i4;
        if (!this.q) {
            c();
        }
        y5360590127176187529.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J14401793345785926215.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r3 = this;
            r0 = 0
            dev.epro.r0.I11571046933844109529 r0 = r3.a(r0)
            if (r0 == 0) goto L13
            dev.epro.r0.I9906786506247477813 r1 = r3.b
            r0.k(r1)
            dev.epro.r0.Y16108220161693303283 r1 = r3.c
            if (r1 == 0) goto L13
            r0.j(r1)
        L13:
            r0 = 1
            dev.epro.r0.I11571046933844109529 r0 = r3.a(r0)
            if (r0 == 0) goto L26
            dev.epro.r0.I9906786506247477813 r1 = r3.b
            r0.k(r1)
            dev.epro.r0.Y16108220161693303283 r1 = r3.c
            if (r1 == 0) goto L26
            r0.j(r1)
        L26:
            android.graphics.drawable.RippleDrawable r0 = r3.u
            if (r0 == 0) goto L38
            r1 = 16908334(0x102002e, float:2.3877358E-38)
            android.graphics.drawable.Drawable r0 = r0.findDrawableByLayerId(r1)
            boolean r1 = r0 instanceof dev.epro.r0.G1431963772438413962
            if (r1 == 0) goto L38
            dev.epro.r0.G1431963772438413962 r0 = (dev.epro.r0.G1431963772438413962) r0
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 == 0) goto L55
            boolean r1 = r0 instanceof dev.epro.r0.I11571046933844109529
            dev.epro.r0.I9906786506247477813 r2 = r3.b
            if (r1 == 0) goto L4e
            dev.epro.r0.I11571046933844109529 r0 = (dev.epro.r0.I11571046933844109529) r0
            r0.k(r2)
            dev.epro.r0.Y16108220161693303283 r3 = r3.c
            if (r3 == 0) goto L55
            r0.j(r3)
            return
        L4e:
            dev.epro.r0.A11042752882447342413 r3 = r2.c()
            r0.setShapeAppearanceModel(r3)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J14401793345785926215.d():void");
    }

    public final void e() {
        I11571046933844109529 i11571046933844109529A = a(false);
        I11571046933844109529 i11571046933844109529A2 = a(true);
        if (i11571046933844109529A != null) {
            float f = this.j;
            ColorStateList colorStateList = this.m;
            i11571046933844109529A.b.j = f;
            i11571046933844109529A.invalidateSelf();
            G8524789311406442313 g8524789311406442313 = i11571046933844109529A.b;
            if (g8524789311406442313.d != colorStateList) {
                g8524789311406442313.d = colorStateList;
                i11571046933844109529A.onStateChange(i11571046933844109529A.getState());
            }
            if (i11571046933844109529A2 != null) {
                float f2 = this.j;
                int iZ = this.p ? E12775674050813925581.z(this.a, R.attr.colorSurface) : 0;
                i11571046933844109529A2.b.j = f2;
                i11571046933844109529A2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iZ);
                G8524789311406442313 g85247893114064423132 = i11571046933844109529A2.b;
                if (g85247893114064423132.d != colorStateListValueOf) {
                    g85247893114064423132.d = colorStateListValueOf;
                    i11571046933844109529A2.onStateChange(i11571046933844109529A2.getState());
                }
            }
        }
    }
}
