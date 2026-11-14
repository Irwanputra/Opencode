package dev.epro.r0;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V5142773592757085764 {
    public G4373553504164397325 a;
    public N11829648573770870927 b;
    public J3971902247911265635 c;
    public R7000310675073492254 d;
    public boolean e;
    public P13832034982779129365 f;
    public final U830809347177809305 g;
    public final Y14697639387223402373 h;
    public boolean i;
    public byte j = 1;
    public A7868207189447841291 k = F7156479658963581662.a;
    public final G3869673327990687150 l = new G3869673327990687150(this);
    public final H8734584053421516944 m = new H8734584053421516944(this, (byte) 26);

    public V5142773592757085764(G4373553504164397325 g4373553504164397325, N11829648573770870927 n11829648573770870927, J3971902247911265635 j3971902247911265635, R7000310675073492254 r7000310675073492254, boolean z, P13832034982779129365 p13832034982779129365, U830809347177809305 u830809347177809305, Y14697639387223402373 y14697639387223402373) {
        this.a = g4373553504164397325;
        this.b = n11829648573770870927;
        this.c = j3971902247911265635;
        this.d = r7000310675073492254;
        this.e = z;
        this.f = p13832034982779129365;
        this.g = u830809347177809305;
        this.h = y14697639387223402373;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, dev.epro.r0.K14749510448791472029 r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof dev.epro.r0.O5822338225877485039
            if (r0 == 0) goto L13
            r0 = r13
            dev.epro.r0.O5822338225877485039 r0 = (dev.epro.r0.O5822338225877485039) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.O5822338225877485039 r0 = new dev.epro.r0.O5822338225877485039
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            int r1 = r0.w
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            dev.epro.r0.X4418276304150334445 r11 = r0.t
            dev.epro.r0.E17665849472693074628.k(r13)     // Catch: java.lang.Throwable -> L29
            r5 = r10
            goto L58
        L29:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L68
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r10)
            r10 = 0
            return r10
        L34:
            dev.epro.r0.E17665849472693074628.k(r13)
            dev.epro.r0.X4418276304150334445 r6 = new dev.epro.r0.X4418276304150334445
            r6.<init>()
            r6.a = r11
            r10.i = r3
            dev.epro.r0.D6414970586266598845 r13 = dev.epro.r0.D6414970586266598845.a     // Catch: java.lang.Throwable -> L65
            dev.epro.r0.Z12110367385715918482 r4 = new dev.epro.r0.Z12110367385715918482     // Catch: java.lang.Throwable -> L65
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L62
            r0.t = r6     // Catch: java.lang.Throwable -> L62
            r0.w = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r10 = r5.g(r13, r4, r0)     // Catch: java.lang.Throwable -> L62
            dev.epro.r0.Z3437138737604933638 r11 = dev.epro.r0.Z3437138737604933638.a
            if (r10 != r11) goto L57
            return r11
        L57:
            r11 = r6
        L58:
            r5.i = r2
            long r10 = r11.a
            dev.epro.r0.L9139634373441254073 r12 = new dev.epro.r0.L9139634373441254073
            r12.<init>(r10)
            return r12
        L62:
            r0 = move-exception
        L63:
            r11 = r0
            goto L68
        L65:
            r0 = move-exception
            r5 = r10
            goto L63
        L68:
            r5.i = r2
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V5142773592757085764.a(long, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final boolean b() {
        N11829648573770870927 n11829648573770870927;
        return this.a.c() || this.a.a() || ((n11829648573770870927 = this.b) != null && n11829648573770870927.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r5, boolean r7, dev.epro.r0.R14062301455140331524 r8) {
        /*
            r4 = this;
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
            if (r7 == 0) goto Ld
            dev.epro.r0.J3971902247911265635 r7 = r4.c
            dev.epro.r0.V7750647012098079849 r1 = dev.epro.r0.F7156479658963581662.a
            boolean r7 = r7 instanceof dev.epro.r0.F12226692988277696362
            if (r7 == 0) goto Ld
            goto L43
        Ld:
            dev.epro.r0.R7000310675073492254 r7 = r4.d
            dev.epro.r0.R7000310675073492254 r1 = dev.epro.r0.R7000310675073492254.b
            r2 = 0
            if (r7 != r1) goto L1a
            r7 = 1
        L15:
            long r5 = dev.epro.r0.L9139634373441254073.a(r5, r2, r2, r7)
            goto L1c
        L1a:
            r7 = 2
            goto L15
        L1c:
            dev.epro.r0.S13046716707540739929 r7 = new dev.epro.r0.S13046716707540739929
            r1 = 0
            r7.<init>(r4, r1)
            dev.epro.r0.N11829648573770870927 r1 = r4.b
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L35
            boolean r3 = r4.b()
            if (r3 == 0) goto L35
            java.lang.Object r4 = r1.b(r5, r7, r8)
            if (r4 != r2) goto L43
            return r4
        L35:
            dev.epro.r0.S13046716707540739929 r7 = new dev.epro.r0.S13046716707540739929
            r7.<init>(r4, r8)
            r7.v = r5
            java.lang.Object r4 = r7.invokeSuspend(r0)
            if (r4 != r2) goto L43
            return r4
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V5142773592757085764.c(long, boolean, dev.epro.r0.R14062301455140331524):java.lang.Object");
    }

    public final long d(A7868207189447841291 a7868207189447841291, long j, int i) {
        P4333784458766463545 p4333784458766463545 = this.f.a;
        P4333784458766463545 p4333784458766463545I1 = p4333784458766463545 != null ? p4333784458766463545.i1() : null;
        long jG0 = p4333784458766463545I1 != null ? p4333784458766463545I1.G0(i, j) : 0L;
        long jE = L2216691091636065972.e(j, jG0);
        long jF = f(i(a7868207189447841291.a(h(f(this.d == R7000310675073492254.b ? L2216691091636065972.a(jE, 0.0f, 1) : L2216691091636065972.a(jE, 0.0f, 2))))));
        U830809347177809305 u830809347177809305 = this.g;
        if (u830809347177809305.n) {
            ViewTreeObserver viewTreeObserver = ((S7974369370986781936) R7033599853981556291.S(u830809347177809305)).getViewTreeObserver();
            try {
                Method declaredMethod = S7974369370986781936.N0;
                if (declaredMethod == null) {
                    declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    S7974369370986781936.N0 = declaredMethod;
                }
                declaredMethod.invoke(viewTreeObserver, null);
            } catch (Exception unused) {
            }
        }
        long jE2 = L2216691091636065972.e(jE, jF);
        P4333784458766463545 p43337844587664635452 = this.f.a;
        P4333784458766463545 p4333784458766463545I12 = p43337844587664635452 != null ? p43337844587664635452.i1() : null;
        return L2216691091636065972.f(L2216691091636065972.f(jG0, jF), p4333784458766463545I12 != null ? p4333784458766463545I12.c0(i, jF, jE2) : 0L);
    }

    public final float e(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long f(long j) {
        return this.e ? L2216691091636065972.g(-1.0f, j) : j;
    }

    public final Object g(D6414970586266598845 d6414970586266598845, L12639328004344855510 l12639328004344855510, K14749510448791472029 k14749510448791472029) {
        Object objE = this.a.e(d6414970586266598845, new C288342651169725874((Object) this, (Object) l12639328004344855510, (R4833348786910499294) null, (byte) 19), k14749510448791472029);
        return objE == Z3437138737604933638.a ? objE : O9245300239821758723.a;
    }

    public final float h(long j) {
        return Float.intBitsToFloat((int) (this.d == R7000310675073492254.b ? j >> 32 : j & 4294967295L));
    }

    public final long i(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == R7000310675073492254.b) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float j(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        R7000310675073492254 r7000310675073492254 = this.d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (r7000310675073492254 == R7000310675073492254.a) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (r7000310675073492254 == R7000310675073492254.b) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
