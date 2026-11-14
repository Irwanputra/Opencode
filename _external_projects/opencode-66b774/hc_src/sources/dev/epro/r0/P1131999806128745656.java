package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P1131999806128745656 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ G16768067413993841943 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P1131999806128745656(G16768067413993841943 g16768067413993841943, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = g16768067413993841943;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        G16768067413993841943 g16768067413993841943 = this.v;
        switch (b) {
            case 0:
                return new P1131999806128745656(g16768067413993841943, r4833348786910499294, (byte) 0);
            case 1:
                return new P1131999806128745656(g16768067413993841943, r4833348786910499294, (byte) 1);
            default:
                return new P1131999806128745656(g16768067413993841943, r4833348786910499294, (byte) 2);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        W5797197595347441198 w5797197595347441198 = (W5797197595347441198) obj;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj2;
        switch (b) {
        }
        return ((P1131999806128745656) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r7 = r1.f(((dev.epro.r0.P6024466796603310388) r8.c).g() + 1, dev.epro.r0.O4077903568229246.Q(0.0f, 0.0f, null, 7), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r7 = r1.f(((dev.epro.r0.P6024466796603310388) r8.c).g() - 1, dev.epro.r0.O4077903568229246.Q(0.0f, 0.0f, null, 7), r7);
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
            dev.epro.r0.G16768067413993841943 r1 = r7.v
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.Z3437138737604933638 r3 = dev.epro.r0.Z3437138737604933638.a
            r4 = 1
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            r6 = 0
            switch(r0) {
                case 0: goto L73;
                case 1: goto L37;
                default: goto Lf;
            }
        Lf:
            boolean r0 = r7.u
            if (r0 == 0) goto L1f
            if (r0 != r4) goto L1a
            dev.epro.r0.E17665849472693074628.k(r8)
        L18:
            r3 = r5
            goto L36
        L1a:
            dev.epro.r0.S10973172697741180971.m(r2)
            r3 = r6
            goto L36
        L1f:
            dev.epro.r0.E17665849472693074628.k(r8)
            r7.u = r4
            dev.epro.r0.N1485544172264925150 r8 = new dev.epro.r0.N1485544172264925150
            r0 = 2
            r8.<init>(r0, r6, r0)
            dev.epro.r0.D6414970586266598845 r0 = dev.epro.r0.D6414970586266598845.a
            java.lang.Object r7 = dev.epro.r0.X16625187937554653603.q(r1, r0, r8, r7)
            if (r7 != r3) goto L33
            goto L34
        L33:
            r7 = r5
        L34:
            if (r7 != r3) goto L18
        L36:
            return r3
        L37:
            boolean r0 = r7.u
            if (r0 == 0) goto L47
            if (r0 != r4) goto L42
            dev.epro.r0.E17665849472693074628.k(r8)
        L40:
            r3 = r5
            goto L72
        L42:
            dev.epro.r0.S10973172697741180971.m(r2)
            r3 = r6
            goto L72
        L47:
            dev.epro.r0.E17665849472693074628.k(r8)
            dev.epro.r0.N3336634644320470588 r8 = r1.d
            r7.u = r4
            dev.epro.r0.Z5398859297832919716 r0 = dev.epro.r0.G14082206658910936320.a
            java.lang.Object r0 = r8.c
            dev.epro.r0.P6024466796603310388 r0 = (dev.epro.r0.P6024466796603310388) r0
            int r0 = r0.g()
            int r0 = r0 + r4
            int r2 = r1.l()
            if (r0 >= r2) goto L6f
            java.lang.Object r8 = r8.c
            dev.epro.r0.P6024466796603310388 r8 = (dev.epro.r0.P6024466796603310388) r8
            int r8 = r8.g()
            int r8 = r8 + r4
            java.lang.Object r7 = dev.epro.r0.X16625187937554653603.g(r1, r8, r7)
            if (r7 != r3) goto L6f
            goto L70
        L6f:
            r7 = r5
        L70:
            if (r7 != r3) goto L40
        L72:
            return r3
        L73:
            boolean r0 = r7.u
            if (r0 == 0) goto L83
            if (r0 != r4) goto L7e
            dev.epro.r0.E17665849472693074628.k(r8)
        L7c:
            r3 = r5
            goto Laa
        L7e:
            dev.epro.r0.S10973172697741180971.m(r2)
            r3 = r6
            goto Laa
        L83:
            dev.epro.r0.E17665849472693074628.k(r8)
            dev.epro.r0.N3336634644320470588 r8 = r1.d
            r7.u = r4
            dev.epro.r0.Z5398859297832919716 r0 = dev.epro.r0.G14082206658910936320.a
            java.lang.Object r0 = r8.c
            dev.epro.r0.P6024466796603310388 r0 = (dev.epro.r0.P6024466796603310388) r0
            int r0 = r0.g()
            int r0 = r0 - r4
            if (r0 < 0) goto La7
            java.lang.Object r8 = r8.c
            dev.epro.r0.P6024466796603310388 r8 = (dev.epro.r0.P6024466796603310388) r8
            int r8 = r8.g()
            int r8 = r8 - r4
            java.lang.Object r7 = dev.epro.r0.X16625187937554653603.g(r1, r8, r7)
            if (r7 != r3) goto La7
            goto La8
        La7:
            r7 = r5
        La8:
            if (r7 != r3) goto L7c
        Laa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P1131999806128745656.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
