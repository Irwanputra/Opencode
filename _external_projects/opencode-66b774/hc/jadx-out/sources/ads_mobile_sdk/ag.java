package ads_mobile_sdk;

import dev.epro.r0.A13333228626634894082;
import dev.epro.r0.B8669154544800329371;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.H17686692708284905246;
import dev.epro.r0.I3887072968740112330;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.O12043144740933444288;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X7175349259954592591;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ag extends c61 implements B8669154544800329371 {
    public final W5797197595347441198 c;
    public final W5797197595347441198 d;
    public final jr0 e;
    public final O16637889491137121389 f;
    public final O12043144740933444288 g;
    public final we h;
    public final df i;
    public final kz2 j;
    public long k;
    public long l;
    public long m;
    public final AtomicBoolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public X7175349259954592591 f7o;
    public X7175349259954592591 p;
    public Cif q;
    public final A13333228626634894082 r;
    public kv0 s;
    public String t;
    public final H15186625828076266306 u;
    public long v;
    public final H17686692708284905246 w;
    public final H15186625828076266306 x;
    public boolean y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(W5797197595347441198 w5797197595347441198, W5797197595347441198 w57971975953474411982, jr0 jr0Var, O16637889491137121389 o16637889491137121389, O12043144740933444288 o12043144740933444288, we weVar, df dfVar, kz2 kz2Var) {
        super((wv0) null, 1);
        w5797197595347441198.getClass();
        w57971975953474411982.getClass();
        jr0Var.getClass();
        o16637889491137121389.getClass();
        o12043144740933444288.getClass();
        weVar.getClass();
        dfVar.getClass();
        kz2Var.getClass();
        this.c = w5797197595347441198;
        this.d = w57971975953474411982;
        this.e = jr0Var;
        this.f = o16637889491137121389;
        this.g = o12043144740933444288;
        this.h = weVar;
        this.i = dfVar;
        this.j = kz2Var;
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.n = new AtomicBoolean(false);
        this.q = Cif.a;
        this.r = qv0.o();
        this.u = new H15186625828076266306();
        this.v = 0L;
        this.w = I3887072968740112330.a(0, 7, null);
        this.x = new H15186625828076266306();
        this.y = true;
        this.z = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.ag r10, long r11, dev.epro.r0.K14749510448791472029 r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof ads_mobile_sdk.mf
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.mf r0 = (ads_mobile_sdk.mf) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.mf r0 = new ads_mobile_sdk.mf
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.d
            int r1 = r0.f
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            r3 = 2
            r4 = 1
            r5 = 0
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L47
            if (r1 == r4) goto L39
            if (r1 != r3) goto L33
            java.lang.Object r10 = r0.a
            dev.epro.r0.R8015591507171738907 r10 = (dev.epro.r0.R8015591507171738907) r10
            dev.epro.r0.E17665849472693074628.k(r13)     // Catch: java.lang.Throwable -> L31
            goto L7c
        L31:
            r11 = move-exception
            goto L82
        L33:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r10)
            return r5
        L39:
            long r11 = r0.c
            dev.epro.r0.H15186625828076266306 r10 = r0.b
            java.lang.Object r1 = r0.a
            ads_mobile_sdk.ag r1 = (ads_mobile_sdk.ag) r1
            dev.epro.r0.E17665849472693074628.k(r13)
            r13 = r10
            r10 = r1
            goto L5b
        L47:
            dev.epro.r0.E17665849472693074628.k(r13)
            dev.epro.r0.H15186625828076266306 r13 = r10.x
            r0.a = r10
            r0.b = r13
            r0.c = r11
            r0.f = r4
            java.lang.Object r1 = r13.c(r0)
            if (r1 != r6) goto L5b
            goto L78
        L5b:
            long r7 = r10.z     // Catch: java.lang.Throwable -> L84
            int r1 = dev.epro.r0.E17093345031926825464.c(r11, r7)     // Catch: java.lang.Throwable -> L84
            if (r1 <= 0) goto L87
            boolean r1 = r10.y     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L68
            goto L87
        L68:
            r10.y = r4     // Catch: java.lang.Throwable -> L84
            r10.z = r11     // Catch: java.lang.Throwable -> L84
            r0.a = r13     // Catch: java.lang.Throwable -> L84
            r0.b = r5     // Catch: java.lang.Throwable -> L84
            r0.f = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r10 = d(r10, r0)     // Catch: java.lang.Throwable -> L84
            if (r10 != r6) goto L79
        L78:
            return r6
        L79:
            r9 = r13
            r13 = r10
            r10 = r9
        L7c:
            dev.epro.r0.M16184408391440927034 r13 = (dev.epro.r0.M16184408391440927034) r13     // Catch: java.lang.Throwable -> L31
            r10.b(r5)
            return r2
        L82:
            r13 = r10
            goto L8b
        L84:
            r10 = move-exception
            r11 = r10
            goto L8b
        L87:
            r13.b(r5)
            return r2
        L8b:
            r13.b(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ag.b(ads_mobile_sdk.ag, long, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[PHI: r9
      0x0042: PHI (r9v3 ads_mobile_sdk.ag) = (r9v1 ads_mobile_sdk.ag), (r9v5 ads_mobile_sdk.ag) binds: [B:14:0x002c, B:28:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088 A[PHI: r9
      0x0088: PHI (r9v5 ads_mobile_sdk.ag) = (r9v2 ads_mobile_sdk.ag), (r9v7 ads_mobile_sdk.ag) binds: [B:25:0x0085, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0090 -> B:19:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(ads_mobile_sdk.ag r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.xf
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.xf r0 = (ads_mobile_sdk.xf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.xf r0 = new ads_mobile_sdk.xf
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            ads_mobile_sdk.ag r9 = r0.a
        L2c:
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L42
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r2
        L36:
            ads_mobile_sdk.ag r9 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L88
        L3c:
            ads_mobile_sdk.ag r9 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L55
        L42:
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.n
            boolean r10 = r10.get()
            if (r10 == 0) goto L93
            r0.a = r9
            r0.d = r5
            java.lang.Object r10 = r9.r(r0)
            if (r10 != r6) goto L55
            goto L92
        L55:
            dev.epro.r0.E17093345031926825464 r10 = (dev.epro.r0.E17093345031926825464) r10
            long r7 = r10.a
            dev.epro.r0.O3606826322388932410 r10 = new dev.epro.r0.O3606826322388932410
            dev.epro.r0.G8001132634698687269 r1 = r0.getContext()
            r10.<init>(r1)
            dev.epro.r0.X3021557769346799559 r1 = new dev.epro.r0.X3021557769346799559
            r1.<init>(r5, r2, r5)
            long r7 = dev.epro.r0.J8045362843799184672.v0(r7)
            dev.epro.r0.G16660188620551127941.D(r10, r7, r1)
            dev.epro.r0.H17686692708284905246 r1 = r9.w
            dev.epro.r0.J15730374346044043770 r1 = r1.q()
            dev.epro.r0.N1485544172264925150 r7 = new dev.epro.r0.N1485544172264925150
            r8 = 7
            r7.<init>(r4, r2, r8)
            r10.g(r1, r7)
            r0.a = r9
            r0.d = r4
            java.lang.Object r10 = dev.epro.r0.O3606826322388932410.d(r10, r0)
            if (r10 != r6) goto L88
            goto L92
        L88:
            r0.a = r9
            r0.d = r3
            java.lang.Object r10 = r9.s(r0)
            if (r10 != r6) goto L42
        L92:
            return r6
        L93:
            dev.epro.r0.O9245300239821758723 r9 = dev.epro.r0.O9245300239821758723.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ag.c(ads_mobile_sdk.ag, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(ads_mobile_sdk.ag r16, dev.epro.r0.K14749510448791472029 r17) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ag.d(ads_mobile_sdk.ag, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a4, code lost:
    
        if (r8 == r6) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, ads_mobile_sdk.kv0 r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.qf
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.qf r0 = (ads_mobile_sdk.qf) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.qf r0 = new ads_mobile_sdk.qf
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            r3 = 0
            r4 = 2
            r5 = 1
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3e
            if (r1 == r5) goto L36
            if (r1 != r4) goto L30
            ads_mobile_sdk.ag r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto La7
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r3
        L36:
            java.lang.String r8 = r0.b
            ads_mobile_sdk.ag r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L7e
        L3e:
            dev.epro.r0.E17665849472693074628.k(r10)
            r9.getClass()
            dev.epro.r0.T14972362143719499691 r10 = ads_mobile_sdk.pv0.o()
            r10.getClass()
            r10.b()
            ads_mobile_sdk.cu0 r1 = r10.b
            ads_mobile_sdk.pv0 r1 = (ads_mobile_sdk.pv0) r1
            r1.a(r9)
            ads_mobile_sdk.cu0 r9 = r10.a()
            ads_mobile_sdk.pv0 r9 = (ads_mobile_sdk.pv0) r9
            dev.epro.r0.A13333228626634894082 r10 = r7.r
            r10.b()
            ads_mobile_sdk.cu0 r1 = r10.b
            ads_mobile_sdk.qv0 r1 = (ads_mobile_sdk.qv0) r1
            r1.a(r9)
            ads_mobile_sdk.cu0 r9 = r10.a()
            ads_mobile_sdk.qv0 r9 = (ads_mobile_sdk.qv0) r9
            byte[] r9 = r9.a()
            r0.a = r7
            r0.b = r8
            r0.e = r5
            java.lang.Object r10 = r7.a(r9, r0)
            if (r10 != r6) goto L7e
            goto La6
        L7e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto La7
            ads_mobile_sdk.df r9 = r7.i
            r0.a = r7
            r0.b = r3
            r0.e = r4
            dev.epro.r0.A8094652504661216977 r9 = r9.a
            java.lang.Object r9 = r9.get()
            dev.epro.r0.A5401921815192175371 r9 = (dev.epro.r0.A5401921815192175371) r9
            ads_mobile_sdk.bf r10 = new ads_mobile_sdk.bf
            r1 = 0
            r10.<init>(r8, r3, r1)
            java.lang.Object r8 = r9.a(r10, r0)
            if (r8 != r6) goto La3
            goto La4
        La3:
            r8 = r2
        La4:
            if (r8 != r6) goto La7
        La6:
            return r6
        La7:
            dev.epro.r0.A13333228626634894082 r7 = r7.r
            r7.b()
            ads_mobile_sdk.cu0 r7 = r7.b
            ads_mobile_sdk.qv0 r7 = (ads_mobile_sdk.qv0) r7
            r7.getClass()
            ads_mobile_sdk.in2 r8 = ads_mobile_sdk.in2.e
            ads_mobile_sdk.qv0.b(r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ag.a(java.lang.String, ads_mobile_sdk.kv0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        return d(this, (K14749510448791472029) r4833348786910499294);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(dev.epro.r0.R4833348786910499294 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.jf
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.jf r0 = (ads_mobile_sdk.jf) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.jf r0 = new ads_mobile_sdk.jf
            dev.epro.r0.K14749510448791472029 r6 = (dev.epro.r0.K14749510448791472029) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            ads_mobile_sdk.ag r5 = r0.b
            ads_mobile_sdk.ag r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            r4 = r6
            r6 = r5
            r5 = r0
            r0 = r4
            goto L4c
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            r5 = 0
            return r5
        L36:
            dev.epro.r0.E17665849472693074628.k(r6)
            r0.a = r5
            r0.b = r5
            r0.e = r2
            ads_mobile_sdk.we r6 = r5.h
            java.lang.Object r6 = r6.a(r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r6 != r0) goto L4a
            return r0
        L4a:
            r0 = r6
            r6 = r5
        L4c:
            ads_mobile_sdk.kv0 r0 = (ads_mobile_sdk.kv0) r0
            r6.s = r0
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
            r5.t = r6
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ag.k(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(dev.epro.r0.K14749510448791472029 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.kf
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.kf r0 = (ads_mobile_sdk.kf) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.kf r0 = new ads_mobile_sdk.kf
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            long r4 = r0.c
            dev.epro.r0.H15186625828076266306 r6 = r0.b
            ads_mobile_sdk.ag r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            r7 = r6
            r6 = r0
            goto L5b
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r3
        L34:
            dev.epro.r0.E17665849472693074628.k(r7)
            dev.epro.r0.E17149812035295265804 r7 = dev.epro.r0.E17093345031926825464.b
            dev.epro.r0.O16637889491137121389 r7 = r6.f
            r7.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            dev.epro.r0.N13798149404328803870 r7 = dev.epro.r0.N13798149404328803870.MILLISECONDS
            long r4 = dev.epro.r0.M9216324016624295870.a0(r4, r7)
            r0.a = r6
            dev.epro.r0.H15186625828076266306 r7 = r6.u
            r0.b = r7
            r0.c = r4
            r0.f = r2
            java.lang.Object r0 = r7.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L5b
            return r1
        L5b:
            long r0 = r6.v     // Catch: java.lang.Throwable -> L99
            r7.b(r3)
            long r0 = dev.epro.r0.E17093345031926825464.g(r4, r0)
            ads_mobile_sdk.if r7 = r6.q
            int r7 = r7.ordinal()
            if (r7 == 0) goto L7f
            if (r7 == r2) goto L78
            r0 = 2
            if (r7 != r0) goto L74
            long r6 = r6.m
            goto L85
        L74:
            dev.epro.r0.Z3383101362411723454.g()
            return r3
        L78:
            long r6 = r6.l
            long r6 = dev.epro.r0.E17093345031926825464.g(r6, r0)
            goto L85
        L7f:
            long r6 = r6.k
            long r6 = dev.epro.r0.E17093345031926825464.g(r6, r0)
        L85:
            dev.epro.r0.E17093345031926825464 r0 = new dev.epro.r0.E17093345031926825464
            r1 = 0
            r0.<init>(r1)
            dev.epro.r0.E17093345031926825464 r1 = new dev.epro.r0.E17093345031926825464
            r1.<init>(r6)
            int r6 = r0.compareTo(r1)
            if (r6 < 0) goto L98
            return r0
        L98:
            return r1
        L99:
            r6 = move-exception
            r7.b(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ag.r(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cf A[Catch: all -> 0x01db, TryCatch #7 {all -> 0x01db, blocks: (B:107:0x01c8, B:109:0x01cf, B:111:0x01d3, B:113:0x01d7, B:116:0x01de, B:118:0x01e2, B:120:0x01e6, B:122:0x01ea, B:123:0x01eb, B:124:0x01f0, B:125:0x01f1, B:126:0x01f8, B:127:0x01f9, B:128:0x0200, B:129:0x0201), top: B:156:0x01c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0201 A[Catch: all -> 0x01db, TRY_LEAVE, TryCatch #7 {all -> 0x01db, blocks: (B:107:0x01c8, B:109:0x01cf, B:111:0x01d3, B:113:0x01d7, B:116:0x01de, B:118:0x01e2, B:120:0x01e6, B:122:0x01ea, B:123:0x01eb, B:124:0x01f0, B:125:0x01f1, B:126:0x01f8, B:127:0x01f9, B:128:0x0200, B:129:0x0201), top: B:156:0x01c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0173 A[Catch: all -> 0x017f, TryCatch #8 {all -> 0x017f, blocks: (B:71:0x016c, B:73:0x0173, B:75:0x0177, B:77:0x017b, B:80:0x0182, B:82:0x0186, B:84:0x018a, B:86:0x018e, B:87:0x018f, B:88:0x0194, B:89:0x0195, B:90:0x019c, B:91:0x019d, B:92:0x01a4, B:93:0x01a5), top: B:157:0x016c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a5 A[Catch: all -> 0x017f, TRY_LEAVE, TryCatch #8 {all -> 0x017f, blocks: (B:71:0x016c, B:73:0x0173, B:75:0x0177, B:77:0x017b, B:80:0x0182, B:82:0x0186, B:84:0x018a, B:86:0x018e, B:87:0x018f, B:88:0x0194, B:89:0x0195, B:90:0x019c, B:91:0x019d, B:92:0x01a4, B:93:0x01a5), top: B:157:0x016c }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(dev.epro.r0.K14749510448791472029 r17) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ag.s(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final Object b(long j, R14062301455140331524 r14062301455140331524) {
        return b(this, j, r14062301455140331524);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r7 == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ads_mobile_sdk.ag r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.wf
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.wf r0 = (ads_mobile_sdk.wf) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.wf r0 = new ads_mobile_sdk.wf
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            java.util.Iterator r6 = r0.c
            java.util.Map r1 = r0.b
            ads_mobile_sdk.ag r3 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L5c
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            r6 = 0
            return r6
        L37:
            ads_mobile_sdk.ag r6 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L4d
        L3d:
            dev.epro.r0.E17665849472693074628.k(r7)
            ads_mobile_sdk.df r7 = r6.i
            r0.a = r6
            r0.f = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r4) goto L4d
            goto L82
        L4d:
            r1 = r7
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L83
            java.util.Set r7 = r1.entrySet()
            java.util.Iterator r7 = r7.iterator()
            r3 = r6
            r6 = r7
        L5c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L83
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r5 = r7.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r7 = r7.getValue()
            ads_mobile_sdk.kv0 r7 = (ads_mobile_sdk.kv0) r7
            r0.a = r3
            r0.b = r1
            r0.c = r6
            r0.f = r2
            java.lang.Object r7 = r3.a(r5, r7, r0)
            if (r7 != r4) goto L5c
        L82:
            return r4
        L83:
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ag.b(ads_mobile_sdk.ag, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.ag r4, long r5, dev.epro.r0.K14749510448791472029 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.lf
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.lf r0 = (ads_mobile_sdk.lf) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.lf r0 = new ads_mobile_sdk.lf
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            long r5 = r0.c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.ag r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            r7 = r4
            r4 = r0
            goto L4a
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L34:
            dev.epro.r0.E17665849472693074628.k(r7)
            dev.epro.r0.H15186625828076266306 r7 = r4.x
            r0.a = r4
            r0.b = r7
            r0.c = r5
            r0.f = r2
            java.lang.Object r0 = r7.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L4a
            return r1
        L4a:
            long r0 = r4.z     // Catch: java.lang.Throwable -> L6b
            int r0 = dev.epro.r0.E17093345031926825464.c(r5, r0)     // Catch: java.lang.Throwable -> L6b
            dev.epro.r0.O9245300239821758723 r1 = dev.epro.r0.O9245300239821758723.a
            if (r0 <= 0) goto L78
            boolean r0 = r4.y     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L59
            goto L78
        L59:
            r0 = 0
            r4.y = r0     // Catch: java.lang.Throwable -> L6b
            r4.z = r5     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.n     // Catch: java.lang.Throwable -> L6b
            r5.set(r0)     // Catch: java.lang.Throwable -> L6b
            dev.epro.r0.X7175349259954592591 r5 = r4.f7o     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L6d
            r5.c(r3)     // Catch: java.lang.Throwable -> L6b
            goto L6d
        L6b:
            r4 = move-exception
            goto L7c
        L6d:
            dev.epro.r0.X7175349259954592591 r4 = r4.p     // Catch: java.lang.Throwable -> L6b
            if (r4 == 0) goto L74
            r4.c(r3)     // Catch: java.lang.Throwable -> L6b
        L74:
            r7.b(r3)
            return r1
        L78:
            r7.b(r3)
            return r1
        L7c:
            r7.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ag.a(ads_mobile_sdk.ag, long, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.ag r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.nf
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.nf r0 = (ads_mobile_sdk.nf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.nf r0 = new ads_mobile_sdk.nf
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 != r3) goto L28
            ads_mobile_sdk.ag r6 = r0.a
        L24:
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L2e
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r2
        L2e:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.n
            boolean r7 = r7.get()
            if (r7 == 0) goto L52
            dev.epro.r0.W5797197595347441198 r7 = r6.d
            dev.epro.r0.H4546125934900659656 r1 = new dev.epro.r0.H4546125934900659656
            r4 = 17
            r1.<init>(r6, r2, r4)
            r4 = 3
            dev.epro.r0.R7033599853981556291.E(r7, r2, r2, r1, r4)
            long r4 = r6.m
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = dev.epro.r0.J8045362843799184672.J(r4, r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r7 != r1) goto L2e
            return r1
        L52:
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ag.a(ads_mobile_sdk.ag, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(byte[] r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.vf
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.vf r0 = (ads_mobile_sdk.vf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.vf r0 = new ads_mobile_sdk.vf
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            dev.epro.r0.E17665849472693074628.k(r9)     // Catch: java.lang.Exception -> L66
            goto L5d
        L26:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r2
        L2c:
            dev.epro.r0.E17665849472693074628.k(r9)
            ads_mobile_sdk.x11 r9 = new ads_mobile_sdk.x11     // Catch: java.lang.Exception -> L66
            r9.<init>()     // Catch: java.lang.Exception -> L66
            ads_mobile_sdk.jr0 r1 = r7.e     // Catch: java.lang.Exception -> L66
            java.lang.String r4 = "gads:remote_capture_service_url"
            java.lang.String r5 = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1"
            ads_mobile_sdk.ao r6 = ads_mobile_sdk.ao.a$6     // Catch: java.lang.Exception -> L66
            java.lang.Object r1 = r1.a(r4, r5, r6)     // Catch: java.lang.Exception -> L66
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L66
            r9.b(r1)     // Catch: java.lang.Exception -> L66
            java.lang.String r1 = "application/x-protobuf"
            r9.b(r1, r8)     // Catch: java.lang.Exception -> L66
            ads_mobile_sdk.y11 r8 = r9.a()     // Catch: java.lang.Exception -> L66
            dev.epro.r0.O12043144740933444288 r7 = r7.g     // Catch: java.lang.Exception -> L66
            r0.c = r3     // Catch: java.lang.Exception -> L66
            r9 = 30
            java.lang.Object r9 = dev.epro.r0.O12043144740933444288.b(r7, r8, r2, r0, r9)     // Catch: java.lang.Exception -> L66
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r9 != r7) goto L5d
            return r7
        L5d:
            dev.epro.r0.M16184408391440927034 r9 = (dev.epro.r0.M16184408391440927034) r9     // Catch: java.lang.Exception -> L66
            boolean r7 = r9 instanceof ads_mobile_sdk.xu0     // Catch: java.lang.Exception -> L66
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Exception -> L66
            return r7
        L66:
            r7 = move-exception
            r7.toString()
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ag.a(byte[], dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final Object d(long j, R14062301455140331524 r14062301455140331524) {
        return a(this, j, r14062301455140331524);
    }
}
