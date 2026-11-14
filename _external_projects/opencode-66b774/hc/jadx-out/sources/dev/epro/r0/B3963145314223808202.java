package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B3963145314223808202 extends R15896830329318850690 implements F16971278462881137815, T975006071468260715 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public R7000310675073492254 f176o;
    public final V5142773592757085764 p;
    public boolean q;
    public D9497773141868343380 r;
    public final Y14697639387223402373 s;
    public boolean u;
    public boolean w;
    public final V12816289154094534935 t = new V12816289154094534935((byte) 0);
    public long v = -1;

    public B3963145314223808202(R7000310675073492254 r7000310675073492254, V5142773592757085764 v5142773592757085764, boolean z, D9497773141868343380 d9497773141868343380, Y14697639387223402373 y14697639387223402373) {
        this.f176o = r7000310675073492254;
        this.p = v5142773592757085764;
        this.q = z;
        this.r = d9497773141868343380;
        this.s = y14697639387223402373;
    }

    public static boolean j1(B3963145314223808202 b3963145314223808202, S6349823729575121924 s6349823729575121924, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = b3963145314223808202.i1();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jL1 = b3963145314223808202.l1(s6349823729575121924, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jL1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jL1 & 4294967295L))) <= 0.5f;
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final boolean W0() {
        return false;
    }

    @Override // dev.epro.r0.T975006071468260715
    public final void d(long j) {
        int iZ;
        long jI1 = i1();
        this.v = j;
        int iOrdinal = this.f176o.ordinal();
        if (iOrdinal == 0) {
            iZ = S10823041268949770285.z((int) (j & 4294967295L), (int) (jI1 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                Z3383101362411723454.g();
                return;
            }
            iZ = S10823041268949770285.z((int) (j >> 32), (int) (jI1 >> 32));
        }
        if (iZ >= 0) {
            return;
        }
        long j2 = !this.q ? this.f176o == R7000310675073492254.a ? ((long) (((int) (jI1 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jI1 >> 32)) - ((int) (j >> 32)))) << 32 : 0L;
        S6349823729575121924 s6349823729575121924 = (S6349823729575121924) this.s.invoke();
        if (s6349823729575121924 == null || this.w || this.u || !j1(this, s6349823729575121924, jI1, 0L, 2) || j1(this, s6349823729575121924, 0L, j2, 1)) {
            return;
        }
        this.u = true;
        k1(j2);
    }

    public final float h1(D9497773141868343380 d9497773141868343380, long j) {
        float f;
        S6349823729575121924 s6349823729575121924;
        int iCompare;
        long j2 = this.v;
        D389890677992184566 d389890677992184566 = this.t.a;
        int i = d389890677992184566.c - 1;
        Object[] objArr = d389890677992184566.a;
        if (i < objArr.length) {
            s6349823729575121924 = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                S6349823729575121924 s63498237295751219242 = (S6349823729575121924) ((U10812473741286294883) objArr[i]).a.invoke();
                if (s63498237295751219242 != null) {
                    long jE = s63498237295751219242.e();
                    long jQ = I3887072968740112330.Q(i1());
                    f = 0.0f;
                    int iOrdinal = this.f176o.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jE & 4294967295L)), Float.intBitsToFloat((int) (jQ & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            Z3383101362411723454.g();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jE >> 32)), Float.intBitsToFloat((int) (jQ >> 32)));
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
            S6349823729575121924 s63498237295751219243 = this.u ? (S6349823729575121924) this.s.invoke() : null;
            if (s63498237295751219243 == null) {
                return f;
            }
            s6349823729575121924 = s63498237295751219243;
        }
        long jQ2 = I3887072968740112330.Q(j2);
        int iOrdinal2 = this.f176o.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = s6349823729575121924.b;
            return d9497773141868343380.a(f2 - ((int) (j & 4294967295L)), s6349823729575121924.d - f2, Float.intBitsToFloat((int) (jQ2 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = s6349823729575121924.a;
            return d9497773141868343380.a(f3 - ((int) (j >> 32)), s6349823729575121924.c - f3, Float.intBitsToFloat((int) (jQ2 >> 32)));
        }
        Z3383101362411723454.g();
        return f;
    }

    public final long i1() {
        long j = this.v;
        if (Q13254524308163418711.a(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void k1(long j) {
        D9497773141868343380 d9497773141868343380 = this.r;
        if (d9497773141868343380 == null) {
            d9497773141868343380 = (D9497773141868343380) B11964701839924937722.o(this, C12851948089043223300.a);
        }
        D9497773141868343380 d94977731418683433802 = d9497773141868343380;
        if (this.w) {
            Y16081827717826519461.c("launchAnimation called when previous animation was running");
        }
        D9497773141868343380 d94977731418683433803 = this.r;
        if (d94977731418683433803 == null) {
            d94977731418683433803 = (D9497773141868343380) B11964701839924937722.o(this, C12851948089043223300.a);
        }
        d94977731418683433803.getClass();
        D9497773141868343380.a.getClass();
        F2939855867946572554 f2939855867946572554 = new F2939855867946572554(P1022676644246799251.b);
        R7033599853981556291.E(V0(), null, L856869997670741194.d, new G11195681474449167459(this, f2939855867946572554, d94977731418683433802, j, null), 1);
    }

    public final long l1(S6349823729575121924 s6349823729575121924, long j, long j2) {
        long jQ = I3887072968740112330.Q(j);
        int iOrdinal = this.f176o.ordinal();
        if (iOrdinal == 0) {
            D9497773141868343380 d9497773141868343380 = this.r;
            if (d9497773141868343380 == null) {
                d9497773141868343380 = (D9497773141868343380) B11964701839924937722.o(this, C12851948089043223300.a);
            }
            float f = s6349823729575121924.b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(d9497773141868343380.a(f - ((int) (j2 & 4294967295L)), s6349823729575121924.d - f, Float.intBitsToFloat((int) (jQ & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            Z3383101362411723454.g();
            return 0L;
        }
        D9497773141868343380 d94977731418683433802 = this.r;
        if (d94977731418683433802 == null) {
            d94977731418683433802 = (D9497773141868343380) B11964701839924937722.o(this, C12851948089043223300.a);
        }
        float f2 = s6349823729575121924.a;
        return (((long) Float.floatToRawIntBits(d94977731418683433802.a(f2 - ((int) (j2 >> 32)), s6349823729575121924.c - f2, Float.intBitsToFloat((int) (jQ >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }
}
