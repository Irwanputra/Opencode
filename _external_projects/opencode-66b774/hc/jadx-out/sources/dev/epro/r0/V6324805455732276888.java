package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V6324805455732276888 implements F10290064089087821626 {
    public final T1422539684983103901 a;
    public H1680712944080904022 b;
    public K13194410849201862068 c;
    public U4028013539401150749 d;
    public H13563640512344124027 e;
    public Q13169198992966610970 f;
    public M204440408817344908 g;
    public P11184147566986477297 h;
    public final T17032536773975598836 i;
    public final T17032536773975598836 j;

    public V6324805455732276888(T1422539684983103901 t1422539684983103901) {
        this.a = t1422539684983103901;
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.b = new U9803441765912152712();
        this.i = t17032536773975598836;
        T17032536773975598836 t170325367739755988362 = new T17032536773975598836();
        t170325367739755988362.b = new Q5456326841214199073();
        this.j = t170325367739755988362;
    }

    public static void c(V6324805455732276888 v6324805455732276888, V12527742189361867087 v12527742189361867087, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        T1422539684983103901 t1422539684983103901 = v6324805455732276888.a;
        U4028013539401150749 u4028013539401150749 = v6324805455732276888.d;
        if (u4028013539401150749 == null) {
            u4028013539401150749 = new U4028013539401150749();
            u4028013539401150749.l = null;
            u4028013539401150749.m = Long.MAX_VALUE;
            u4028013539401150749.n = false;
            v6324805455732276888.d = u4028013539401150749;
        }
        u4028013539401150749.l = v12527742189361867087;
        u4028013539401150749.m = j;
        P11184147566986477297 p11184147566986477297 = v6324805455732276888.h;
        R7000310675073492254 r7000310675073492254 = t1422539684983103901.q;
        if (p11184147566986477297 == null) {
            v6324805455732276888.h = new P11184147566986477297(r7000310675073492254, 2);
        } else {
            p11184147566986477297.b = r7000310675073492254;
            p11184147566986477297.a = j2;
        }
        u4028013539401150749.n = false;
        v6324805455732276888.f = u4028013539401150749;
    }

    @Override // dev.epro.r0.V17914047163624077766
    public final String L0() {
        Q13169198992966610970 q13169198992966610970 = this.f;
        return q13169198992966610970 instanceof H1680712944080904022 ? ((H1680712944080904022) q13169198992966610970).n ? "waiting" : "idle" : ((q13169198992966610970 instanceof U4028013539401150749) || (q13169198992966610970 instanceof H13563640512344124027)) ? "waiting" : q13169198992966610970 instanceof K13194410849201862068 ? "recognized" : "idle";
    }

    public final void a() {
        H1680712944080904022 h1680712944080904022 = this.b;
        L4099941323637989549 l4099941323637989549 = L4099941323637989549.c;
        if (h1680712944080904022 == null) {
            h1680712944080904022 = new H1680712944080904022();
            h1680712944080904022.l = l4099941323637989549;
            h1680712944080904022.m = false;
            h1680712944080904022.n = false;
            this.b = h1680712944080904022;
        }
        h1680712944080904022.l = l4099941323637989549;
        h1680712944080904022.m = false;
        h1680712944080904022.n = false;
        this.f = h1680712944080904022;
    }

    public final void b(V12527742189361867087 v12527742189361867087, long j, P11184147566986477297 p11184147566986477297) {
        H13563640512344124027 h13563640512344124027 = this.e;
        if (h13563640512344124027 == null) {
            h13563640512344124027 = new H13563640512344124027();
            h13563640512344124027.l = null;
            h13563640512344124027.m = Long.MAX_VALUE;
            this.e = h13563640512344124027;
        }
        h13563640512344124027.l = v12527742189361867087;
        h13563640512344124027.m = j;
        p11184147566986477297.a = 0L;
        this.f = h13563640512344124027;
    }

    public final M204440408817344908 d() {
        M204440408817344908 m204440408817344908 = this.g;
        if (m204440408817344908 != null) {
            return m204440408817344908;
        }
        S10973172697741180971.j("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(V12527742189361867087 v12527742189361867087, L11375348705951955702 l11375348705951955702, long j) {
        long j2;
        float fIntBitsToFloat;
        long j3 = v12527742189361867087.c;
        T1422539684983103901 t1422539684983103901 = this.a;
        R7000310675073492254 r7000310675073492254 = t1422539684983103901.q;
        r7000310675073492254.getClass();
        V1385751101624195996 v1385751101624195996 = R3964428913610127921.a;
        long j4 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (r7000310675073492254 == R7000310675073492254.a ? j & 4294967295L : j >> 32))) > 2.0f) {
            M204440408817344908 m204440408817344908D = d();
            R7000310675073492254 r70003106750734922542 = t1422539684983103901.q;
            T17032536773975598836 t17032536773975598836 = this.i;
            U9803441765912152712 u9803441765912152712 = (U9803441765912152712) t17032536773975598836.b;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            if (S10823041268949770285.v(v12527742189361867087)) {
                t17032536773975598836.a = 0;
                u9803441765912152712.d();
            }
            float fIntBitsToFloat4 = 0.0f;
            if (S10823041268949770285.w(v12527742189361867087) || S10823041268949770285.v(v12527742189361867087)) {
                j2 = 4294967295L;
            } else {
                if (u9803441765912152712.b == 3) {
                    int i = t17032536773975598836.a;
                    t17032536773975598836.a = i + 1;
                    u9803441765912152712.n(i, v12527742189361867087);
                } else {
                    u9803441765912152712.a(v12527742189361867087);
                }
                if (t17032536773975598836.a == 3) {
                    t17032536773975598836.a = 0;
                }
                Object[] objArr = u9803441765912152712.a;
                int i2 = u9803441765912152712.b;
                int i3 = 0;
                float fIntBitsToFloat5 = 0.0f;
                while (i3 < i2) {
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((V12527742189361867087) objArr[i3]).c >> 32));
                    i3++;
                    j4 = j4;
                }
                j2 = j4;
                int i4 = u9803441765912152712.b;
                fIntBitsToFloat2 = fIntBitsToFloat5 / i4;
                Object[] objArr2 = u9803441765912152712.a;
                float fIntBitsToFloat6 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((V12527742189361867087) objArr2[i5]).c & j2));
                }
                fIntBitsToFloat3 = fIntBitsToFloat6 / u9803441765912152712.b;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
            if (r70003106750734922542 != null) {
                int i6 = l11375348705951955702.a;
                if (i6 == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                } else if (i6 == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                }
                jFloatToRawIntBits = r70003106750734922542 == R7000310675073492254.b ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
            }
            ((H14072535535744303516) m204440408817344908D.b).a(v12527742189361867087.b, jFloatToRawIntBits);
            T17032536773975598836 t170325367739755988362 = this.j;
            Q5456326841214199073 q5456326841214199073 = (Q5456326841214199073) t170325367739755988362.b;
            if (q5456326841214199073.b == 3) {
                int i7 = t170325367739755988362.a;
                t170325367739755988362.a = i7 + 1;
                q5456326841214199073.e(i7, j);
            } else {
                q5456326841214199073.a(j);
            }
            if (t170325367739755988362.a == 3) {
                t170325367739755988362.a = 0;
            }
            long[] jArr = q5456326841214199073.a;
            int i8 = q5456326841214199073.b;
            float fIntBitsToFloat7 = 0.0f;
            for (int i9 = 0; i9 < i8; i9++) {
                fIntBitsToFloat7 += Float.intBitsToFloat((int) (jArr[i9] >> 32));
            }
            int i10 = q5456326841214199073.b;
            float f = fIntBitsToFloat7 / i10;
            long[] jArr2 = q5456326841214199073.a;
            for (int i11 = 0; i11 < i10; i11++) {
                fIntBitsToFloat4 = Float.intBitsToFloat((int) (jArr2[i11] & j2)) + fIntBitsToFloat4;
            }
            t1422539684983103901.p1(new P8765079843515277045((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 / q5456326841214199073.b)) & j2), true));
        }
    }

    public final void f(V12527742189361867087 v12527742189361867087, V12527742189361867087 v125277421893618670872, L11375348705951955702 l11375348705951955702, long j) {
        char c;
        long j2;
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (this.g == null) {
            this.g = new M204440408817344908((byte) 2);
        }
        M204440408817344908 m204440408817344908D = d();
        T1422539684983103901 t1422539684983103901 = this.a;
        R7000310675073492254 r7000310675073492254 = t1422539684983103901.q;
        T17032536773975598836 t17032536773975598836 = this.i;
        U9803441765912152712 u9803441765912152712 = (U9803441765912152712) t17032536773975598836.b;
        char c2 = ' ';
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (v12527742189361867087.c >> 32));
        long j3 = 4294967295L;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (v12527742189361867087.c & 4294967295L));
        if (S10823041268949770285.v(v12527742189361867087)) {
            t17032536773975598836.a = 0;
            u9803441765912152712.d();
        }
        if (S10823041268949770285.w(v12527742189361867087) || S10823041268949770285.v(v12527742189361867087)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (u9803441765912152712.b == 3) {
                int i = t17032536773975598836.a;
                t17032536773975598836.a = i + 1;
                u9803441765912152712.n(i, v12527742189361867087);
            } else {
                u9803441765912152712.a(v12527742189361867087);
            }
            if (t17032536773975598836.a == 3) {
                t17032536773975598836.a = 0;
            }
            Object[] objArr = u9803441765912152712.a;
            int i2 = u9803441765912152712.b;
            int i3 = 0;
            float fIntBitsToFloat4 = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((V12527742189361867087) objArr[i3]).c >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            int i4 = u9803441765912152712.b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = u9803441765912152712.a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((V12527742189361867087) objArr2[i5]).c & j2));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / u9803441765912152712.b;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2);
        if (r7000310675073492254 != null) {
            int i6 = l11375348705951955702.a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> c));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j2));
            }
            if (r7000310675073492254 == R7000310675073492254.b) {
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            } else {
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            }
            jFloatToRawIntBits2 = (jFloatToRawIntBits << c) | (((long) iFloatToRawIntBits) & j2);
        }
        ((H14072535535744303516) m204440408817344908D.b).a(v12527742189361867087.b, jFloatToRawIntBits2);
        long jE = L2216691091636065972.e(S10823041268949770285.Q(v125277421893618670872, t1422539684983103901.q, l11375348705951955702), j);
        if (((Boolean) t1422539684983103901.r.invoke(new O12393276431214249727(1))).booleanValue()) {
            t1422539684983103901.p1(new E14661167550073153335(jE));
        }
        T17032536773975598836 t170325367739755988362 = this.j;
        t170325367739755988362.a = 0;
        ((Q5456326841214199073) t170325367739755988362.b).b = 0;
    }

    @Override // dev.epro.r0.F10290064089087821626
    public final R7000310675073492254 n() {
        return this.a.q;
    }
}
