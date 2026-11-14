package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F9886074403848142923 {
    public final /* synthetic */ byte a;
    public final F4096073349764486348 b;
    public final V697849047308847220 c;
    public final V697849047308847220 d;
    public final B4739506393801054036 e;
    public final O15319392248629494012 f;
    public final O15319392248629494012 g;
    public final V697849047308847220 h;
    public F4096073349764486348 i;
    public B13729205492206812220 j;
    public Object k;
    public Object l;
    public final Object m;
    public final Y14161449526678499798 n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f241o;

    public F9886074403848142923(F16729560403295819437 f16729560403295819437, F12973702345246855607 f12973702345246855607, B13729205492206812220 b13729205492206812220, N8306548196372912291 n8306548196372912291, F4096073349764486348 f4096073349764486348) {
        this.a = (byte) 0;
        this.i = f12973702345246855607;
        this.j = b13729205492206812220;
        this.k = n8306548196372912291;
        this.b = f4096073349764486348;
        this.l = new H14327603681095415766();
        this.m = new H9049518308677093740(this);
        this.c = V4416135141588678913.t(f16729560403295819437);
        this.e = Z3658309082448601011.b(new C8204629009676477017(this, (byte) 0));
        this.n = Z3658309082448601011.b(new C8204629009676477017(this, (byte) 1));
        this.f = new O15319392248629494012(Float.NaN);
        Z3658309082448601011.c(new C8204629009676477017(this, (byte) 2));
        this.g = new O15319392248629494012(0.0f);
        this.d = V4416135141588678913.t(null);
        this.h = V4416135141588678913.t(new D17840030713596081464(X9852054718446117252.a));
        this.f241o = new P11273374321045165714(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(dev.epro.r0.D6414970586266598845 r13, dev.epro.r0.J10413379891765758296 r14, dev.epro.r0.K14749510448791472029 r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof dev.epro.r0.Z1247676955732798295
            if (r0 == 0) goto L13
            r0 = r15
            dev.epro.r0.Z1247676955732798295 r0 = (dev.epro.r0.Z1247676955732798295) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dev.epro.r0.Z1247676955732798295 r0 = new dev.epro.r0.Z1247676955732798295
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.t
            int r1 = r0.v
            dev.epro.r0.O15319392248629494012 r2 = r12.f
            dev.epro.r0.F4096073349764486348 r3 = r12.b
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            if (r1 == 0) goto L35
            if (r1 != r5) goto L2e
            dev.epro.r0.E17665849472693074628.k(r15)     // Catch: java.lang.Throwable -> L2b
            goto L59
        L2b:
            r0 = move-exception
            r13 = r0
            goto L8e
        L2e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r12)
            r12 = 0
            return r12
        L35:
            dev.epro.r0.E17665849472693074628.k(r15)
            java.lang.Object r15 = r12.l     // Catch: java.lang.Throwable -> L2b
            r8 = r15
            dev.epro.r0.H14327603681095415766 r8 = (dev.epro.r0.H14327603681095415766) r8     // Catch: java.lang.Throwable -> L2b
            dev.epro.r0.P10410169637657332617 r9 = new dev.epro.r0.P10410169637657332617     // Catch: java.lang.Throwable -> L2b
            r15 = 0
            r10 = 0
            r9.<init>(r12, r14, r10, r15)     // Catch: java.lang.Throwable -> L2b
            r0.v = r5     // Catch: java.lang.Throwable -> L2b
            r8.getClass()     // Catch: java.lang.Throwable -> L2b
            dev.epro.r0.X14700554270388218583 r6 = new dev.epro.r0.X14700554270388218583     // Catch: java.lang.Throwable -> L2b
            r11 = 0
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r13 = dev.epro.r0.O8620973563946607355.B(r6, r0)     // Catch: java.lang.Throwable -> L2b
            dev.epro.r0.Z3437138737604933638 r14 = dev.epro.r0.Z3437138737604933638.a
            if (r13 != r14) goto L59
            return r14
        L59:
            dev.epro.r0.D17840030713596081464 r13 = r12.e()
            float r14 = r2.g()
            java.lang.Object r13 = r13.a(r14)
            if (r13 == 0) goto L8b
            float r14 = r2.g()
            dev.epro.r0.D17840030713596081464 r15 = r12.e()
            float r15 = r15.d(r13)
            float r14 = r14 - r15
            float r14 = java.lang.Math.abs(r14)
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 > 0) goto L8b
            java.lang.Object r14 = r3.invoke(r13)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L8b
            r12.j(r13)
        L8b:
            dev.epro.r0.O9245300239821758723 r12 = dev.epro.r0.O9245300239821758723.a
            return r12
        L8e:
            dev.epro.r0.D17840030713596081464 r14 = r12.e()
            float r15 = r2.g()
            java.lang.Object r14 = r14.a(r15)
            if (r14 == 0) goto Lc0
            float r15 = r2.g()
            dev.epro.r0.D17840030713596081464 r0 = r12.e()
            float r0 = r0.d(r14)
            float r15 = r15 - r0
            float r15 = java.lang.Math.abs(r15)
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 > 0) goto Lc0
            java.lang.Object r15 = r3.invoke(r14)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto Lc0
            r12.j(r14)
        Lc0:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F9886074403848142923.a(dev.epro.r0.D6414970586266598845, dev.epro.r0.J10413379891765758296, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r20, dev.epro.r0.D6414970586266598845 r21, dev.epro.r0.G13792465322404021864 r22, dev.epro.r0.K14749510448791472029 r23) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F9886074403848142923.b(java.lang.Object, dev.epro.r0.D6414970586266598845, dev.epro.r0.G13792465322404021864, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public Object c(float f, float f2, Object obj) {
        F12973702345246855607 f12973702345246855607 = (F12973702345246855607) this.i;
        D17840030713596081464 e = e();
        float d = e.d(obj);
        float floatValue = ((Number) this.j.invoke()).floatValue();
        if (d != f && !Float.isNaN(d)) {
            if (d < f) {
                if (f2 >= floatValue) {
                    Object b = e.b(f, true);
                    b.getClass();
                    return b;
                }
                Object b2 = e.b(f, true);
                b2.getClass();
                if (f >= Math.abs(Math.abs(((Number) f12973702345246855607.invoke(Float.valueOf(Math.abs(e.d(b2) - d)))).floatValue()) + d)) {
                    return b2;
                }
            } else {
                if (f2 <= (-floatValue)) {
                    Object b3 = e.b(f, false);
                    b3.getClass();
                    return b3;
                }
                Object b4 = e.b(f, false);
                b4.getClass();
                float abs = Math.abs(d - Math.abs(((Number) f12973702345246855607.invoke(Float.valueOf(Math.abs(d - e.d(b4))))).floatValue()));
                if (f >= 0.0f ? f <= abs : Math.abs(f) >= abs) {
                    return b4;
                }
            }
        }
        return obj;
    }

    public V4351601219763732262 d() {
        return (V4351601219763732262) ((V697849047308847220) this.n).getValue();
    }

    public D17840030713596081464 e() {
        return (D17840030713596081464) this.h.getValue();
    }

    public boolean f() {
        return (((V10450421848591554621) this.i) == null || ((S464754454553842217) this.j) == null || ((M15459437176959963354) this.k) == null || ((X14364139104409853146) this.l) == null) ? false : true;
    }

    public float g(float f) {
        float f2;
        O15319392248629494012 o15319392248629494012 = this.f;
        float g = (Float.isNaN(o15319392248629494012.g()) ? 0.0f : o15319392248629494012.g()) + f;
        float[] fArr = d().b;
        float f3 = Float.NaN;
        int i = 1;
        if (fArr.length == 0) {
            f2 = Float.NaN;
        } else {
            f2 = fArr[0];
            int length = fArr.length - 1;
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    f2 = Math.min(f2, fArr[i2]);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        float[] fArr2 = d().b;
        if (fArr2.length != 0) {
            f3 = fArr2[0];
            int length2 = fArr2.length - 1;
            if (1 <= length2) {
                while (true) {
                    f3 = Math.max(f3, fArr2[i]);
                    if (i == length2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return W7808703833045379622.p(g, f2, f3);
    }

    public float h(float f) {
        O15319392248629494012 o15319392248629494012 = this.f;
        float g = (Float.isNaN(o15319392248629494012.g()) ? 0.0f : o15319392248629494012.g()) + f;
        float c = e().c();
        Float N0 = R9411874267597469228.N0(e().a.values());
        return W7808703833045379622.p(g, c, N0 != null ? N0.floatValue() : Float.NaN);
    }

    public final float i() {
        byte b = this.a;
        O15319392248629494012 o15319392248629494012 = this.f;
        switch (b) {
            case 0:
                if (!Float.isNaN(o15319392248629494012.g())) {
                    return o15319392248629494012.g();
                }
                S10973172697741180971.m("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
                return 0.0f;
            default:
                if (Float.isNaN(o15319392248629494012.g())) {
                    Y16081827717826519461.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
                }
                return o15319392248629494012.g();
        }
    }

    public void j(Object obj) {
        this.c.setValue(obj);
    }

    public void k(Object obj) {
        this.d.setValue(obj);
    }

    public F9886074403848142923(S884268727609522965 s884268727609522965, F4096073349764486348 f4096073349764486348) {
        this.a = (byte) 1;
        this.b = new M14716691558468128220((byte) 11);
        this.m = new T17817572153526645469();
        this.c = V4416135141588678913.t(s884268727609522965);
        this.d = V4416135141588678913.t(s884268727609522965);
        this.e = Z3658309082448601011.b(new F4327950643552689(this, (byte) 0));
        this.f = new O15319392248629494012(Float.NaN);
        Z3658309082448601011.c(new F4327950643552689(this, (byte) 1));
        this.g = new O15319392248629494012(0.0f);
        this.h = V4416135141588678913.t(null);
        this.n = V4416135141588678913.t(new V4351601219763732262(O2161699089510411363.a, new float[0]));
        this.f241o = new F18142507606280211225(this);
        this.b = f4096073349764486348;
    }
}
