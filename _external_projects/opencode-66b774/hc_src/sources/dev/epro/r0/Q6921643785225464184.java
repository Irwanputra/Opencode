package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q6921643785225464184 extends T7441316690157960089 implements L12639328004344855510 {
    public J17191566391535857141 t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ W5797197595347441198 w;
    public final /* synthetic */ P5204863746366580363 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q6921643785225464184(W5797197595347441198 w5797197595347441198, P5204863746366580363 p5204863746366580363, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.w = w5797197595347441198;
        this.x = p5204863746366580363;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        Q6921643785225464184 q6921643785225464184 = new Q6921643785225464184(this.w, this.x, r4833348786910499294);
        q6921643785225464184.v = obj;
        return q6921643785225464184;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        ((Q6921643785225464184) create((R4833348786910499294) obj2, (Z7637734454282223795) obj)).invokeSuspend(O9245300239821758723.a);
        return Z3437138737604933638.a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x002e -> B:5:0x0031). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r7.u
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 != r2) goto L12
            dev.epro.r0.J17191566391535857141 r0 = r7.t
            java.lang.Object r3 = r7.v
            dev.epro.r0.Z7637734454282223795 r3 = (dev.epro.r0.Z7637734454282223795) r3
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L31
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r1
        L18:
            dev.epro.r0.E17665849472693074628.k(r8)
            java.lang.Object r8 = r7.v
            dev.epro.r0.Z7637734454282223795 r8 = (dev.epro.r0.Z7637734454282223795) r8
            dev.epro.r0.J17191566391535857141 r0 = dev.epro.r0.J17191566391535857141.b
            r3 = r8
        L22:
            r7.v = r3
            r7.t = r0
            r7.u = r2
            java.lang.Object r8 = r3.a(r0, r7)
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r8 != r4) goto L31
            return r4
        L31:
            dev.epro.r0.Y1086209215650239921 r8 = (dev.epro.r0.Y1086209215650239921) r8
            java.util.List r4 = r8.a
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            dev.epro.r0.N13196868278329319633 r4 = (dev.epro.r0.N13196868278329319633) r4
            int r4 = r4.i
            r5 = 2
            if (r4 != r5) goto L22
            int r8 = r8.f
            r4 = 4
            dev.epro.r0.P5204863746366580363 r6 = r7.x
            if (r8 != r4) goto L54
            dev.epro.r0.Y15865438964350323730 r8 = new dev.epro.r0.Y15865438964350323730
            r8.<init>(r6, r1, r5)
            r4 = 3
            dev.epro.r0.W5797197595347441198 r5 = r7.w
            dev.epro.r0.R7033599853981556291.E(r5, r1, r1, r8, r4)
            goto L22
        L54:
            r4 = 5
            if (r8 != r4) goto L22
            r6.a()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q6921643785225464184.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
