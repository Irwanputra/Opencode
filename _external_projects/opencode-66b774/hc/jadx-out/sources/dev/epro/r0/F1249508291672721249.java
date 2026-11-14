package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F1249508291672721249 extends T7441316690157960089 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F1249508291672721249(Object obj, R4833348786910499294 r4833348786910499294, byte b) {
        super(r4833348786910499294);
        this.t = b;
        this.w = obj;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                F1249508291672721249 f1249508291672721249 = new F1249508291672721249((J17191566391535857141) obj2, r4833348786910499294, (byte) 0);
                f1249508291672721249.v = obj;
                return f1249508291672721249;
            case 1:
                F1249508291672721249 f12495082916727212492 = new F1249508291672721249((F4096073349764486348) obj2, r4833348786910499294, (byte) 1);
                f12495082916727212492.v = obj;
                return f12495082916727212492;
            default:
                F1249508291672721249 f12495082916727212493 = new F1249508291672721249((D2717688760023469083) obj2, r4833348786910499294, (byte) 2);
                f12495082916727212493.v = obj;
                return f12495082916727212493;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z7637734454282223795 z7637734454282223795 = (Z7637734454282223795) obj;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                ((F1249508291672721249) create(r4833348786910499294, z7637734454282223795)).invokeSuspend(o9245300239821758723);
                break;
            default:
                ((F1249508291672721249) create(r4833348786910499294, z7637734454282223795)).invokeSuspend(o9245300239821758723);
                break;
        }
        return z3437138737604933638;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0031 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0065 -> B:25:0x0069). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            byte r0 = r7.t
            dev.epro.r0.J17191566391535857141 r1 = dev.epro.r0.J17191566391535857141.a
            java.lang.Object r2 = r7.w
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            r6 = 1
            switch(r0) {
                case 0: goto L7b;
                case 1: goto L43;
                default: goto Lf;
            }
        Lf:
            boolean r0 = r7.u
            if (r0 == 0) goto L21
            if (r0 != r6) goto L1d
            java.lang.Object r0 = r7.v
            dev.epro.r0.Z7637734454282223795 r0 = (dev.epro.r0.Z7637734454282223795) r0
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L35
        L1d:
            dev.epro.r0.S10973172697741180971.m(r4)
            goto L34
        L21:
            dev.epro.r0.E17665849472693074628.k(r8)
            java.lang.Object r8 = r7.v
            dev.epro.r0.Z7637734454282223795 r8 = (dev.epro.r0.Z7637734454282223795) r8
            r0 = r8
        L29:
            r7.v = r0
            r7.u = r6
            java.lang.Object r8 = r0.a(r1, r7)
            if (r8 != r5) goto L35
            r3 = r5
        L34:
            return r3
        L35:
            dev.epro.r0.Y1086209215650239921 r8 = (dev.epro.r0.Y1086209215650239921) r8
            r3 = r2
            dev.epro.r0.D2717688760023469083 r3 = (dev.epro.r0.D2717688760023469083) r3
            boolean r8 = dev.epro.r0.B5337019243287431766.a(r8)
            r8 = r8 ^ r6
            r3.v(r8)
            goto L29
        L43:
            boolean r0 = r7.u
            if (r0 == 0) goto L55
            if (r0 != r6) goto L51
            java.lang.Object r0 = r7.v
            dev.epro.r0.Z7637734454282223795 r0 = (dev.epro.r0.Z7637734454282223795) r0
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L69
        L51:
            dev.epro.r0.S10973172697741180971.m(r4)
            goto L68
        L55:
            dev.epro.r0.E17665849472693074628.k(r8)
            java.lang.Object r8 = r7.v
            dev.epro.r0.Z7637734454282223795 r8 = (dev.epro.r0.Z7637734454282223795) r8
            r0 = r8
        L5d:
            r7.v = r0
            r7.u = r6
            java.lang.Object r8 = r0.a(r1, r7)
            if (r8 != r5) goto L69
            r3 = r5
        L68:
            return r3
        L69:
            dev.epro.r0.Y1086209215650239921 r8 = (dev.epro.r0.Y1086209215650239921) r8
            r3 = r2
            dev.epro.r0.F4096073349764486348 r3 = (dev.epro.r0.F4096073349764486348) r3
            boolean r8 = dev.epro.r0.B5337019243287431766.a(r8)
            r8 = r8 ^ r6
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r3.invoke(r8)
            goto L5d
        L7b:
            boolean r0 = r7.u
            if (r0 == 0) goto L8a
            if (r0 != r6) goto L85
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L9c
        L85:
            dev.epro.r0.S10973172697741180971.m(r4)
            r8 = r3
            goto L9c
        L8a:
            dev.epro.r0.E17665849472693074628.k(r8)
            java.lang.Object r8 = r7.v
            dev.epro.r0.Z7637734454282223795 r8 = (dev.epro.r0.Z7637734454282223795) r8
            dev.epro.r0.J17191566391535857141 r2 = (dev.epro.r0.J17191566391535857141) r2
            r7.u = r6
            java.lang.Object r8 = dev.epro.r0.U2645994142831146282.j(r8, r2, r7)
            if (r8 != r5) goto L9c
            r8 = r5
        L9c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F1249508291672721249.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
