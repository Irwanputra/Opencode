package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R10718507438643490505 extends T7441316690157960089 implements L12639328004344855510 {
    public long A;
    public boolean B;
    public /* synthetic */ Object C;
    public final /* synthetic */ V8500408966188516816 D;
    public final /* synthetic */ C13932356399610645840 E;
    public C13932356399610645840 t;
    public V8500408966188516816 u;
    public long[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R10718507438643490505(V8500408966188516816 v8500408966188516816, C13932356399610645840 c13932356399610645840, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.D = v8500408966188516816;
        this.E = c13932356399610645840;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        R10718507438643490505 r10718507438643490505 = new R10718507438643490505(this.D, this.E, r4833348786910499294);
        r10718507438643490505.C = obj;
        return r10718507438643490505;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((R10718507438643490505) create((R4833348786910499294) obj2, (N3180492300688416475) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x0094). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            boolean r1 = r0.B
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.z
            int r5 = r0.y
            long r6 = r0.A
            int r8 = r0.x
            int r9 = r0.w
            long[] r10 = r0.v
            dev.epro.r0.V8500408966188516816 r11 = r0.u
            dev.epro.r0.C13932356399610645840 r12 = r0.t
            java.lang.Object r13 = r0.C
            dev.epro.r0.N3180492300688416475 r13 = (dev.epro.r0.N3180492300688416475) r13
            dev.epro.r0.E17665849472693074628.k(r21)
            goto L94
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            r0 = 0
            return r0
        L2c:
            dev.epro.r0.E17665849472693074628.k(r21)
            java.lang.Object r1 = r0.C
            dev.epro.r0.N3180492300688416475 r1 = (dev.epro.r0.N3180492300688416475) r1
            dev.epro.r0.V8500408966188516816 r5 = r0.D
            dev.epro.r0.E13273723708836014930 r6 = r5.b
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            dev.epro.r0.C13932356399610645840 r8 = r0.E
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.b = r2
            dev.epro.r0.E13273723708836014930 r3 = r11.b
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            r0.C = r13
            r0.t = r12
            r0.u = r11
            r0.v = r10
            r0.w = r9
            r0.x = r8
            r0.A = r6
            r0.y = r5
            r0.z = r1
            r0.B = r4
            r13.c(r0, r2)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R10718507438643490505.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
