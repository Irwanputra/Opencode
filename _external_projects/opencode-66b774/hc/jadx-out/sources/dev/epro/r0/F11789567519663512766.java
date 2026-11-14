package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F11789567519663512766 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ T17817572153526645469 A;
    public final /* synthetic */ L12639328004344855510 B;
    public final /* synthetic */ Object C;
    public R8015591507171738907 t;
    public Object u;
    public Object v;
    public T17817572153526645469 w;
    public byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ D6414970586266598845 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F11789567519663512766(D6414970586266598845 d6414970586266598845, T17817572153526645469 t17817572153526645469, L12639328004344855510 l12639328004344855510, Object obj, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.z = d6414970586266598845;
        this.A = t17817572153526645469;
        this.B = l12639328004344855510;
        this.C = obj;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        F11789567519663512766 f11789567519663512766 = new F11789567519663512766(this.z, this.A, this.B, this.C, r4833348786910499294);
        f11789567519663512766.y = obj;
        return f11789567519663512766;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((F11789567519663512766) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // dev.epro.r0.B401944902727389462
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.x
            r1 = 2
            r2 = 1
            r3 = 0
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r8.u
            dev.epro.r0.T17817572153526645469 r0 = (dev.epro.r0.T17817572153526645469) r0
            dev.epro.r0.R8015591507171738907 r1 = r8.t
            java.lang.Object r8 = r8.y
            dev.epro.r0.D14571609076401178903 r8 = (dev.epro.r0.D14571609076401178903) r8
            dev.epro.r0.E17665849472693074628.k(r9)     // Catch: java.lang.Throwable -> L1c
            goto L90
        L1c:
            r9 = move-exception
            goto Lab
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r3
        L25:
            dev.epro.r0.T17817572153526645469 r0 = r8.w
            java.lang.Object r2 = r8.v
            java.lang.Object r5 = r8.u
            dev.epro.r0.L12639328004344855510 r5 = (dev.epro.r0.L12639328004344855510) r5
            dev.epro.r0.R8015591507171738907 r6 = r8.t
            java.lang.Object r7 = r8.y
            dev.epro.r0.D14571609076401178903 r7 = (dev.epro.r0.D14571609076401178903) r7
            dev.epro.r0.E17665849472693074628.k(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L78
        L3c:
            dev.epro.r0.E17665849472693074628.k(r9)
            java.lang.Object r9 = r8.y
            dev.epro.r0.W5797197595347441198 r9 = (dev.epro.r0.W5797197595347441198) r9
            dev.epro.r0.D14571609076401178903 r0 = new dev.epro.r0.D14571609076401178903
            dev.epro.r0.G8001132634698687269 r9 = r9.h()
            dev.epro.r0.P2382941533350862833 r5 = dev.epro.r0.P2382941533350862833.p
            dev.epro.r0.H7323971265464188398 r9 = r9.get(r5)
            r9.getClass()
            dev.epro.r0.Q15035754882231748864 r9 = (dev.epro.r0.Q15035754882231748864) r9
            dev.epro.r0.D6414970586266598845 r5 = r8.z
            r0.<init>(r5, r9)
            dev.epro.r0.T17817572153526645469 r9 = r8.A
            r9.b(r0)
            dev.epro.r0.H15186625828076266306 r5 = r9.b
            r8.y = r0
            r8.t = r5
            dev.epro.r0.L12639328004344855510 r6 = r8.B
            r8.u = r6
            java.lang.Object r7 = r8.C
            r8.v = r7
            r8.w = r9
            r8.x = r2
            java.lang.Object r2 = r5.c(r8)
            if (r2 != r4) goto L77
            goto L8a
        L77:
            r2 = r7
        L78:
            r8.y = r0     // Catch: java.lang.Throwable -> La5
            r8.t = r5     // Catch: java.lang.Throwable -> La5
            r8.u = r9     // Catch: java.lang.Throwable -> La5
            r8.v = r3     // Catch: java.lang.Throwable -> La5
            r8.w = r3     // Catch: java.lang.Throwable -> La5
            r8.x = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Object r8 = r6.invoke(r2, r8)     // Catch: java.lang.Throwable -> La5
            if (r8 != r4) goto L8b
        L8a:
            return r4
        L8b:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L90:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        L92:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L99
            goto L9f
        L99:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 == r8) goto L92
        L9f:
            r1.b(r3)
            return r9
        La3:
            r8 = move-exception
            goto Lbb
        La5:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        Lab:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        Lad:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 != 0) goto Lba
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 != r8) goto Lba
            goto Lad
        Lba:
            throw r9     // Catch: java.lang.Throwable -> La3
        Lbb:
            r1.b(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F11789567519663512766.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
