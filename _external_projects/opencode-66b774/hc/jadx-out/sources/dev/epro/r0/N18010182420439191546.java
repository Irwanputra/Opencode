package dev.epro.r0;

import android.graphics.Paint;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N18010182420439191546 extends TextPaint {
    public O3228356295430981133 a;
    public W7621125212597703960 b;
    public byte c;
    public H7281108764511748709 d;
    public U10174709222559481877 e;
    public D14208870094104617988 f;
    public B4739506393801054036 g;
    public W8572396779607072172 h;
    public Q15653065705375360223 i;

    public final O3228356295430981133 a() {
        O3228356295430981133 o3228356295430981133 = this.a;
        if (o3228356295430981133 != null) {
            return o3228356295430981133;
        }
        O3228356295430981133 o32283562954309811332 = new O3228356295430981133(this);
        this.a = o32283562954309811332;
        return o32283562954309811332;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().n(i);
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(dev.epro.r0.D14208870094104617988 r6, long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.g = r0
            r5.f = r0
            r5.h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof dev.epro.r0.H10765568533039107979
            if (r1 == 0) goto L1d
            dev.epro.r0.H10765568533039107979 r6 = (dev.epro.r0.H10765568533039107979) r6
            long r6 = r6.a
            long r6 = dev.epro.r0.X7410747940286448830.o(r9, r6)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof dev.epro.r0.G2555456398299437723
            if (r1 == 0) goto L6e
            dev.epro.r0.D14208870094104617988 r1 = r5.f
            boolean r1 = dev.epro.r0.S10823041268949770285.t(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            dev.epro.r0.W8572396779607072172 r1 = r5.h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.a
            boolean r1 = dev.epro.r0.W8572396779607072172.a(r3, r7)
        L36:
            if (r1 != 0) goto L55
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L55
            r5.f = r6
            dev.epro.r0.W8572396779607072172 r1 = new dev.epro.r0.W8572396779607072172
            r1.<init>(r7)
            r5.h = r1
            dev.epro.r0.G16724087655879983589 r1 = new dev.epro.r0.G16724087655879983589
            r1.<init>(r6, r7, r2)
            dev.epro.r0.B4739506393801054036 r6 = dev.epro.r0.Z3658309082448601011.b(r1)
            r5.g = r6
        L55:
            dev.epro.r0.O3228356295430981133 r6 = r5.a()
            dev.epro.r0.B4739506393801054036 r7 = r5.g
            if (r7 == 0) goto L64
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L65
        L64:
            r7 = r0
        L65:
            r6.r(r7)
            r5.e = r0
            dev.epro.r0.V12319504402545346730.W(r5, r9)
            return
        L6e:
            dev.epro.r0.Z3383101362411723454.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.N18010182420439191546.c(dev.epro.r0.D14208870094104617988, long, float):void");
    }

    public final void d(long j) {
        U10174709222559481877 u10174709222559481877 = this.e;
        if ((u10174709222559481877 == null ? false : P15388715743159210616.a(u10174709222559481877.a, j)) || j == 16) {
            return;
        }
        this.e = new U10174709222559481877(j);
        setColor(J8045362843799184672.u0(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(Q15653065705375360223 q15653065705375360223) {
        if (q15653065705375360223 == null || S10823041268949770285.t(this.i, q15653065705375360223)) {
            return;
        }
        this.i = q15653065705375360223;
        if (q15653065705375360223.equals(C10274207051762801329.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(q15653065705375360223 instanceof I1470541803076273897)) {
            Z3383101362411723454.g();
            return;
        }
        a().v(1);
        I1470541803076273897 i1470541803076273897 = (I1470541803076273897) q15653065705375360223;
        a().u(i1470541803076273897.a);
        O3228356295430981133 o3228356295430981133A = a();
        ((Paint) o3228356295430981133A.b).setStrokeMiter(i1470541803076273897.b);
        a().t(i1470541803076273897.d);
        a().s(i1470541803076273897.c);
        ((Paint) a().b).setPathEffect(null);
    }

    public final void f(H7281108764511748709 h7281108764511748709) {
        if (h7281108764511748709 == null || S10823041268949770285.t(this.d, h7281108764511748709)) {
            return;
        }
        this.d = h7281108764511748709;
        if (h7281108764511748709.equals(H7281108764511748709.d)) {
            clearShadowLayer();
            return;
        }
        H7281108764511748709 h72811087645117487092 = this.d;
        float f = h72811087645117487092.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (h72811087645117487092.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), J8045362843799184672.u0(this.d.a));
    }

    public final void g(W7621125212597703960 w7621125212597703960) {
        if (w7621125212597703960 == null || S10823041268949770285.t(this.b, w7621125212597703960)) {
            return;
        }
        this.b = w7621125212597703960;
        int i = w7621125212597703960.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
