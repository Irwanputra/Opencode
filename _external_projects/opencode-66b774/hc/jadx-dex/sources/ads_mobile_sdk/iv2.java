package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class iv2 {
    public final dev.epro.r0.V2597580950516131749 a;
    public final dev.epro.r0.O12043144740933444288 b;
    public final ads_mobile_sdk.jr0 c;
    public final dev.epro.r0.K12714355155332733186 d;
    public ads_mobile_sdk.fz e;
    public dev.epro.r0.W5797197595347441198 f;
    public ads_mobile_sdk.hs g;
    public ads_mobile_sdk.cu0 h;
    public final dev.epro.r0.H17686692708284905246 i;
    public final java.util.LinkedList j;

    public iv2(dev.epro.r0.V2597580950516131749 v2597580950516131749, dev.epro.r0.O12043144740933444288 o12043144740933444288, ads_mobile_sdk.jr0 jr0Var, dev.epro.r0.K12714355155332733186 k12714355155332733186) {
        o12043144740933444288.getClass();
        jr0Var.getClass();
        k12714355155332733186.getClass();
        this.a = v2597580950516131749;
        this.b = o12043144740933444288;
        this.c = jr0Var;
        this.d = k12714355155332733186;
        this.i = dev.epro.r0.I3887072968740112330.a(0, 7, (dev.epro.r0.T1542296375665870064) null);
        this.j = new java.util.LinkedList();
    }

    public abstract java.lang.Object a(dev.epro.r0.R14062301455140331524 r14062301455140331524);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(byte[] r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.ev2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.ev2 r0 = (ads_mobile_sdk.ev2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.ev2 r0 = new ads_mobile_sdk.ev2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            dev.epro.r0.E17665849472693074628.k(r9)     // Catch: java.io.IOException -> L5d
            goto L61
        L26:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r2
        L2c:
            dev.epro.r0.E17665849472693074628.k(r9)
            ads_mobile_sdk.x11 r9 = new ads_mobile_sdk.x11     // Catch: java.io.IOException -> L5d
            r9.<init>()     // Catch: java.io.IOException -> L5d
            ads_mobile_sdk.jr0 r1 = r7.c     // Catch: java.io.IOException -> L5d
            java.lang.String r4 = "gads:remote_capture_service_url"
            java.lang.String r5 = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1"
            ads_mobile_sdk.ao r6 = ads_mobile_sdk.ao.a$6     // Catch: java.io.IOException -> L5d
            java.lang.Object r1 = r1.a(r4, r5, r6)     // Catch: java.io.IOException -> L5d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.IOException -> L5d
            r9.b(r1)     // Catch: java.io.IOException -> L5d
            java.lang.String r1 = "application/x-protobuf"
            r9.b(r1, r8)     // Catch: java.io.IOException -> L5d
            ads_mobile_sdk.y11 r8 = r9.a()     // Catch: java.io.IOException -> L5d
            dev.epro.r0.O12043144740933444288 r7 = r7.b     // Catch: java.io.IOException -> L5d
            r0.c = r3     // Catch: java.io.IOException -> L5d
            r9 = 30
            java.lang.Object r7 = dev.epro.r0.O12043144740933444288.b(r7, r8, r2, r0, r9)     // Catch: java.io.IOException -> L5d
            dev.epro.r0.Z3437138737604933638 r8 = dev.epro.r0.Z3437138737604933638.a
            if (r7 != r8) goto L61
            return r8
        L5d:
            r7 = move-exception
            r7.toString()
        L61:
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iv2.a(byte[], dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public long b() {
        ads_mobile_sdk.jr0 jr0Var = this.c;
        jr0Var.getClass();
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        return ((dev.epro.r0.E17093345031926825464) jr0Var.a("gads:exception_monitoring_interval_ms", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(5, dev.epro.r0.N13798149404328803870.f)), ads_mobile_sdk.ao.a)).a;
    }

    public final void a(dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.cu0 cu0Var, ads_mobile_sdk.hs hsVar) {
        w5797197595347441198.getClass();
        this.f = w5797197595347441198;
        this.h = cu0Var;
        java.lang.Object obj = this.a.get();
        obj.getClass();
        this.e = (ads_mobile_sdk.fz) obj;
        this.g = hsVar;
        dev.epro.r0.W5797197595347441198 w57971975953474411982 = this.f;
        if (w57971975953474411982 != null) {
            dev.epro.r0.R7033599853981556291.E(w57971975953474411982, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(new dev.epro.r0.I15284427961769500538(this, (dev.epro.r0.R4833348786910499294) null, (byte) 1), (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        } else {
            dev.epro.r0.S10823041268949770285.b0("backgroundScope");
            throw null;
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this) {
            int size = this.j.size();
            ads_mobile_sdk.jr0 jr0Var = this.c;
            jr0Var.getClass();
            z = size >= ((java.lang.Number) jr0Var.a("gads:exception_buffer_size", (java.lang.Object) 1000, (dev.epro.r0.F4096073349764486348) ads_mobile_sdk.ao.a$18)).intValue();
        }
        return z;
    }

    public final void a(java.lang.Object obj) {
        synchronized (this) {
            this.j.add(obj);
        }
        if (a()) {
            this.i.a(dev.epro.r0.O9245300239821758723.a);
        }
    }
}
