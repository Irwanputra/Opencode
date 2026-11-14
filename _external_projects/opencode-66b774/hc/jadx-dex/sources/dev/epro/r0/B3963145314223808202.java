package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B3963145314223808202 extends dev.epro.r0.R15896830329318850690 implements dev.epro.r0.F16971278462881137815, dev.epro.r0.T975006071468260715 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public dev.epro.r0.R7000310675073492254 f176o;
    public final dev.epro.r0.V5142773592757085764 p;
    public boolean q;
    public dev.epro.r0.D9497773141868343380 r;
    public final dev.epro.r0.Y14697639387223402373 s;
    public boolean u;
    public boolean w;
    public final dev.epro.r0.V12816289154094534935 t = new dev.epro.r0.V12816289154094534935((byte) 0);
    public long v = -1;

    public B3963145314223808202(dev.epro.r0.R7000310675073492254 r7000310675073492254, dev.epro.r0.V5142773592757085764 v5142773592757085764, boolean z, dev.epro.r0.D9497773141868343380 d9497773141868343380, dev.epro.r0.Y14697639387223402373 y14697639387223402373) {
        this.f176o = r7000310675073492254;
        this.p = v5142773592757085764;
        this.q = z;
        this.r = d9497773141868343380;
        this.s = y14697639387223402373;
    }

    public static boolean j1(dev.epro.r0.B3963145314223808202 b3963145314223808202, dev.epro.r0.S6349823729575121924 s6349823729575121924, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = b3963145314223808202.i1();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jL1 = b3963145314223808202.l1(s6349823729575121924, j3, j2);
        return java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (jL1 >> 32))) <= 0.5f && java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (jL1 & 4294967295L))) <= 0.5f;
    }

    public final boolean W0() {
        return false;
    }

    public final void d(long j) {
        int iZ;
        long jI1 = i1();
        this.v = j;
        int iOrdinal = this.f176o.ordinal();
        if (iOrdinal == 0) {
            iZ = dev.epro.r0.S10823041268949770285.z((int) (j & 4294967295L), (int) (jI1 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                dev.epro.r0.Z3383101362411723454.g();
                return;
            }
            iZ = dev.epro.r0.S10823041268949770285.z((int) (j >> 32), (int) (jI1 >> 32));
        }
        if (iZ >= 0) {
            return;
        }
        long j2 = !this.q ? this.f176o == dev.epro.r0.R7000310675073492254.a ? ((long) (((int) (jI1 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jI1 >> 32)) - ((int) (j >> 32)))) << 32 : 0L;
        dev.epro.r0.S6349823729575121924 s6349823729575121924 = (dev.epro.r0.S6349823729575121924) this.s.invoke();
        if (s6349823729575121924 == null || this.w || this.u || !j1(this, s6349823729575121924, jI1, 0L, 2) || j1(this, s6349823729575121924, 0L, j2, 1)) {
            return;
        }
        this.u = true;
        k1(j2);
    }

    public final float h1(dev.epro.r0.D9497773141868343380 d9497773141868343380, long j) {
        float f;
        dev.epro.r0.S6349823729575121924 s6349823729575121924;
        int iCompare;
        long j2 = this.v;
        dev.epro.r0.D389890677992184566 d389890677992184566 = this.t.a;
        int i = d389890677992184566.c - 1;
        java.lang.Object[] objArr = d389890677992184566.a;
        if (i < objArr.length) {
            s6349823729575121924 = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                dev.epro.r0.S6349823729575121924 s63498237295751219242 = (dev.epro.r0.S6349823729575121924) ((dev.epro.r0.U10812473741286294883) objArr[i]).a.invoke();
                if (s63498237295751219242 != null) {
                    long jE = s63498237295751219242.e();
                    long jQ = dev.epro.r0.I3887072968740112330.Q(i1());
                    f = 0.0f;
                    int iOrdinal = this.f176o.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = java.lang.Float.compare(java.lang.Float.intBitsToFloat((int) (jE & 4294967295L)), java.lang.Float.intBitsToFloat((int) (jQ & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            dev.epro.r0.Z3383101362411723454.g();
                            return 0.0f;
                        }
                        iCompare = java.lang.Float.compare(java.lang.Float.intBitsToFloat((int) (jE >> 32)), java.lang.Float.intBitsToFloat((int) (jQ >> 32)));
                    }
                    if (iCompare <= 0) {
                        s6349823729575121924 = s63498237295751219242;
                    } else if (s6349823729575121924 == null) {
                        s6349823729575121924 = s63498237295751219242;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            s6349823729575121924 = null;
        }
        if (s6349823729575121924 == null) {
            dev.epro.r0.S6349823729575121924 s63498237295751219243 = this.u ? (dev.epro.r0.S6349823729575121924) this.s.invoke() : null;
            if (s63498237295751219243 == null) {
                return f;
            }
            s6349823729575121924 = s63498237295751219243;
        }
        long jQ2 = dev.epro.r0.I3887072968740112330.Q(j2);
        int iOrdinal2 = this.f176o.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = s6349823729575121924.b;
            return d9497773141868343380.a(f2 - ((int) (j & 4294967295L)), s6349823729575121924.d - f2, java.lang.Float.intBitsToFloat((int) (jQ2 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = s6349823729575121924.a;
            return d9497773141868343380.a(f3 - ((int) (j >> 32)), s6349823729575121924.c - f3, java.lang.Float.intBitsToFloat((int) (jQ2 >> 32)));
        }
        dev.epro.r0.Z3383101362411723454.g();
        return f;
    }

    public final long i1() {
        long j = this.v;
        if (dev.epro.r0.Q13254524308163418711.a(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void k1(long j) {
        dev.epro.r0.D9497773141868343380 d9497773141868343380 = this.r;
        if (d9497773141868343380 == null) {
            d9497773141868343380 = (dev.epro.r0.D9497773141868343380) dev.epro.r0.B11964701839924937722.o(this, dev.epro.r0.C12851948089043223300.a);
        }
        dev.epro.r0.D9497773141868343380 d94977731418683433802 = d9497773141868343380;
        if (this.w) {
            dev.epro.r0.Y16081827717826519461.c("launchAnimation called when previous animation was running");
        }
        dev.epro.r0.D9497773141868343380 d94977731418683433803 = this.r;
        if (d94977731418683433803 == null) {
            d94977731418683433803 = (dev.epro.r0.D9497773141868343380) dev.epro.r0.B11964701839924937722.o(this, dev.epro.r0.C12851948089043223300.a);
        }
        d94977731418683433803.getClass();
        dev.epro.r0.D9497773141868343380.a.getClass();
        dev.epro.r0.F2939855867946572554 f2939855867946572554 = new dev.epro.r0.F2939855867946572554(dev.epro.r0.P1022676644246799251.b);
        dev.epro.r0.R7033599853981556291.E(V0(), (dev.epro.r0.G8001132634698687269) null, dev.epro.r0.L856869997670741194.d, new dev.epro.r0.G11195681474449167459(this, f2939855867946572554, d94977731418683433802, j, (dev.epro.r0.R4833348786910499294) null), 1);
    }

    public final long l1(dev.epro.r0.S6349823729575121924 s6349823729575121924, long j, long j2) {
        long jQ = dev.epro.r0.I3887072968740112330.Q(j);
        int iOrdinal = this.f176o.ordinal();
        if (iOrdinal == 0) {
            dev.epro.r0.D9497773141868343380 d9497773141868343380 = this.r;
            if (d9497773141868343380 == null) {
                d9497773141868343380 = (dev.epro.r0.D9497773141868343380) dev.epro.r0.B11964701839924937722.o(this, dev.epro.r0.C12851948089043223300.a);
            }
            float f = s6349823729575121924.b;
            return (((long) java.lang.Float.floatToRawIntBits(0.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(d9497773141868343380.a(f - ((int) (j2 & 4294967295L)), s6349823729575121924.d - f, java.lang.Float.intBitsToFloat((int) (jQ & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            dev.epro.r0.Z3383101362411723454.g();
            return 0L;
        }
        dev.epro.r0.D9497773141868343380 d94977731418683433802 = this.r;
        if (d94977731418683433802 == null) {
            d94977731418683433802 = (dev.epro.r0.D9497773141868343380) dev.epro.r0.B11964701839924937722.o(this, dev.epro.r0.C12851948089043223300.a);
        }
        float f2 = s6349823729575121924.a;
        return (((long) java.lang.Float.floatToRawIntBits(d94977731418683433802.a(f2 - ((int) (j2 >> 32)), s6349823729575121924.c - f2, java.lang.Float.intBitsToFloat((int) (jQ >> 32))))) << 32) | (((long) java.lang.Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }
}
