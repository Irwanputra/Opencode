package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ix2 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public long a;
    public byte b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ads_mobile_sdk.v22 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ ads_mobile_sdk.jx2 f;
    public final /* synthetic */ android.net.Uri g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ java.util.Map i;
    public final /* synthetic */ ads_mobile_sdk.y2 j;
    public final /* synthetic */ ads_mobile_sdk.z1 k;
    public final /* synthetic */ java.lang.Boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix2(int i, long j, android.net.Uri uri, ads_mobile_sdk.z1 z1Var, ads_mobile_sdk.y2 y2Var, ads_mobile_sdk.v22 v22Var, ads_mobile_sdk.jx2 jx2Var, java.lang.Boolean bool, java.lang.String str, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.c = i;
        this.d = v22Var;
        this.e = j;
        this.f = jx2Var;
        this.g = uri;
        this.h = str;
        this.i = map;
        this.j = y2Var;
        this.k = z1Var;
        this.l = bool;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        return new ads_mobile_sdk.ix2(this.c, this.e, this.g, this.k, this.j, this.d, this.f, this.l, this.h, this.i, r4833348786910499294);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(dev.epro.r0.O9245300239821758723.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r13.f.a(r13.g, r13.d, r3, r4, r13.h, r13.i, r13.j, r13.k, r13.l, r13) == r12) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.b
            int r1 = r13.c
            r2 = 2
            r3 = 1
            dev.epro.r0.Z3437138737604933638 r12 = dev.epro.r0.Z3437138737604933638.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L19
            if (r0 != r2) goto L12
            dev.epro.r0.E17665849472693074628.k(r14)
            goto L5f
        L12:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            r0 = 0
            return r0
        L19:
            long r4 = r13.a
            dev.epro.r0.E17665849472693074628.k(r14)
            goto L44
        L1f:
            dev.epro.r0.E17665849472693074628.k(r14)
            ads_mobile_sdk.v22 r0 = r13.d
            if (r1 != r3) goto L31
            dev.epro.r0.E17149812035295265804 r4 = dev.epro.r0.E17093345031926825464.b
            int r0 = r0.b
            dev.epro.r0.N13798149404328803870 r4 = dev.epro.r0.N13798149404328803870.d
            long r4 = dev.epro.r0.M9216324016624295870.Z(r0, r4)
            goto L39
        L31:
            long r4 = r13.e
            double r6 = r0.d
            long r4 = dev.epro.r0.E17093345031926825464.j(r4, r6)
        L39:
            r13.a = r4
            r13.b = r3
            java.lang.Object r0 = dev.epro.r0.J8045362843799184672.J(r4, r13)
            if (r0 != r12) goto L44
            goto L5e
        L44:
            int r3 = r3 + r1
            r13.b = r2
            ads_mobile_sdk.jx2 r0 = r13.f
            android.net.Uri r1 = r13.g
            ads_mobile_sdk.v22 r2 = r13.d
            java.lang.String r6 = r13.h
            java.util.Map r7 = r13.i
            ads_mobile_sdk.y2 r8 = r13.j
            ads_mobile_sdk.z1 r9 = r13.k
            java.lang.Boolean r10 = r13.l
            r11 = r13
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            if (r0 != r12) goto L5f
        L5e:
            return r12
        L5f:
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ix2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
