package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E14539443365786243486 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ dev.epro.r0.J7128855986599981135 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E14539443365786243486(dev.epro.r0.J7128855986599981135 j7128855986599981135, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = j7128855986599981135;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.J7128855986599981135 j7128855986599981135 = this.v;
        switch (b) {
            case 0:
                return new dev.epro.r0.E14539443365786243486(j7128855986599981135, r4833348786910499294, (byte) 0);
            default:
                return new dev.epro.r0.E14539443365786243486(j7128855986599981135, r4833348786910499294, (byte) 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) obj;
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = (dev.epro.r0.R4833348786910499294) obj2;
        switch (b) {
        }
        return create(r4833348786910499294, w5797197595347441198).invokeSuspend(o9245300239821758723);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r10 == r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
    
        if (r10.collect(r0, r9) == r4) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.t
            r1 = -1
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            dev.epro.r0.J7128855986599981135 r5 = r9.v
            r6 = 1
            r7 = 2
            switch(r0) {
                case 0: goto L55;
                default: goto Lf;
            }
        Lf:
            dev.epro.r0.R9298828235481065733 r0 = r5.h
            byte r8 = r9.u
            if (r8 == 0) goto L27
            if (r8 == r6) goto L21
            if (r8 != r7) goto L1d
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L4b
        L1d:
            dev.epro.r0.S10973172697741180971.m(r3)
            goto L54
        L21:
            dev.epro.r0.E17665849472693074628.k(r10)     // Catch: java.lang.Throwable -> L25
            goto L40
        L25:
            r9 = move-exception
            goto L4f
        L27:
            dev.epro.r0.E17665849472693074628.k(r10)
            dev.epro.r0.T7367429961324727973 r10 = r0.b()
            boolean r10 = r10 instanceof dev.epro.r0.U8053077249905923784
            if (r10 == 0) goto L37
            dev.epro.r0.T7367429961324727973 r2 = r0.b()
            goto L54
        L37:
            r9.u = r6     // Catch: java.lang.Throwable -> L25
            java.lang.Object r10 = r5.f(r9)     // Catch: java.lang.Throwable -> L25
            if (r10 != r4) goto L40
            goto L49
        L40:
            r9.u = r7
            r10 = 0
            java.lang.Object r10 = r5.g(r10, r9)
            if (r10 != r4) goto L4b
        L49:
            r2 = r4
            goto L54
        L4b:
            r2 = r10
            dev.epro.r0.T7367429961324727973 r2 = (dev.epro.r0.T7367429961324727973) r2
            goto L54
        L4f:
            dev.epro.r0.K4010471808440187464 r2 = new dev.epro.r0.K4010471808440187464
            r2.<init>(r1, r9)
        L54:
            return r2
        L55:
            byte r0 = r9.u
            dev.epro.r0.O9245300239821758723 r8 = dev.epro.r0.O9245300239821758723.a
            if (r0 == 0) goto L6c
            if (r0 == r6) goto L68
            if (r0 != r7) goto L64
            dev.epro.r0.E17665849472693074628.k(r10)
        L62:
            r2 = r8
            goto L9b
        L64:
            dev.epro.r0.S10973172697741180971.m(r3)
            goto L9b
        L68:
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L82
        L6c:
            dev.epro.r0.E17665849472693074628.k(r10)
            dev.epro.r0.J15730374346044043770 r10 = r5.i
            r9.u = r6
            java.lang.Object r10 = r10.d
            dev.epro.r0.A18119328133183277592 r10 = (dev.epro.r0.A18119328133183277592) r10
            java.lang.Object r10 = r10.y(r9)
            if (r10 != r4) goto L7e
            goto L7f
        L7e:
            r10 = r8
        L7f:
            if (r10 != r4) goto L82
            goto L9a
        L82:
            dev.epro.r0.I8259692294117767977 r10 = r5.c()
            dev.epro.r0.G6219617120344415229 r10 = r10.c
            dev.epro.r0.J12043550928838212009 r10 = dev.epro.r0.U16229988784104357932.y(r10, r1)
            dev.epro.r0.S8632326146848653013 r0 = new dev.epro.r0.S8632326146848653013
            r1 = 3
            r0.<init>(r5, r1)
            r9.u = r7
            java.lang.Object r9 = r10.collect(r0, r9)
            if (r9 != r4) goto L62
        L9a:
            r2 = r4
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E14539443365786243486.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
