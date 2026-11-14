package dev.epro.r0;

import androidx.sqlite.SQLiteConnection;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R13852894593656905185 implements F6741456026889144139, E15320933127936247274 {
    public final T15504973625601650233 a;
    public final D6544101850911802081 b;
    public final boolean c;
    public final N11678082982039175888 d;
    public volatile boolean e;

    public R13852894593656905185(T15504973625601650233 t15504973625601650233, D6544101850911802081 d6544101850911802081, boolean z) {
        t15504973625601650233.getClass();
        this.a = t15504973625601650233;
        this.b = d6544101850911802081;
        this.c = z;
        this.d = new N11678082982039175888();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // dev.epro.r0.G5610643384273062965
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, dev.epro.r0.F4096073349764486348 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof dev.epro.r0.Q12862375746063494660
            if (r0 == 0) goto L13
            r0 = r9
            dev.epro.r0.Q12862375746063494660 r0 = (dev.epro.r0.Q12862375746063494660) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            dev.epro.r0.Q12862375746063494660 r0 = new dev.epro.r0.Q12862375746063494660
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.w
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            int r2 = r0.y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            dev.epro.r0.D6544101850911802081 r7 = r0.v
            dev.epro.r0.F4096073349764486348 r8 = r0.u
            java.lang.String r0 = r0.t
            dev.epro.r0.E17665849472693074628.k(r9)
            r9 = r7
            r7 = r0
            goto L64
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r4
        L36:
            dev.epro.r0.E17665849472693074628.k(r9)
            boolean r9 = r6.e
            r2 = 21
            if (r9 != 0) goto L8d
            dev.epro.r0.G8001132634698687269 r9 = r0.getContext()
            dev.epro.r0.T15504973625601650233 r5 = r6.a
            dev.epro.r0.H7323971265464188398 r9 = r9.get(r5)
            dev.epro.r0.A13074171965360807408 r9 = (dev.epro.r0.A13074171965360807408) r9
            if (r9 == 0) goto L87
            dev.epro.r0.R13852894593656905185 r9 = r9.b
            if (r9 != r6) goto L87
            dev.epro.r0.D6544101850911802081 r9 = r6.b
            r0.t = r7
            r0.u = r8
            r0.v = r9
            r0.y = r3
            dev.epro.r0.R8015591507171738907 r2 = r9.b
            java.lang.Object r0 = r2.c(r0)
            if (r0 != r1) goto L64
            return r1
        L64:
            dev.epro.r0.R17078453977115634759 r0 = new dev.epro.r0.R17078453977115634759     // Catch: java.lang.Throwable -> L7a
            dev.epro.r0.D6544101850911802081 r1 = r6.b     // Catch: java.lang.Throwable -> L7a
            androidx.sqlite.SQLiteStatement r7 = r1.prepare(r7)     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r6 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L7c
            dev.epro.r0.T18016951143603335921.y(r0, r4)     // Catch: java.lang.Throwable -> L7a
            r9.b(r4)
            return r6
        L7a:
            r6 = move-exception
            goto L83
        L7c:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L7e
        L7e:
            r7 = move-exception
            dev.epro.r0.T18016951143603335921.y(r0, r6)     // Catch: java.lang.Throwable -> L7a
            throw r7     // Catch: java.lang.Throwable -> L7a
        L83:
            r9.b(r4)
            throw r6
        L87:
            java.lang.String r6 = "Attempted to use connection on a different coroutine"
            dev.epro.r0.S12227320117525376577.w(r2, r6)
            throw r4
        L8d:
            java.lang.String r6 = "Connection is recycled"
            dev.epro.r0.S12227320117525376577.w(r2, r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R13852894593656905185.a(java.lang.String, dev.epro.r0.F4096073349764486348, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.E15320933127936247274
    public final SQLiteConnection b() {
        return this.b;
    }

    @Override // dev.epro.r0.F6741456026889144139
    public final Boolean c(R4833348786910499294 r4833348786910499294) {
        if (this.e) {
            S12227320117525376577.w(21, "Connection is recycled");
            throw null;
        }
        A13074171965360807408 a13074171965360807408 = (A13074171965360807408) ((K14749510448791472029) r4833348786910499294).getContext().get(this.a);
        if (a13074171965360807408 != null && a13074171965360807408.b == this) {
            return Boolean.valueOf(!this.d.isEmpty() || this.b.a.inTransaction());
        }
        S12227320117525376577.w(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // dev.epro.r0.F6741456026889144139
    public final Object d(W12133020733110407383 w12133020733110407383, L12639328004344855510 l12639328004344855510, R14062301455140331524 r14062301455140331524) {
        if (this.e) {
            S12227320117525376577.w(21, "Connection is recycled");
            throw null;
        }
        A13074171965360807408 a13074171965360807408 = (A13074171965360807408) r14062301455140331524.getContext().get(this.a);
        if (a13074171965360807408 != null && a13074171965360807408.b == this) {
            return g(w12133020733110407383, l12639328004344855510, r14062301455140331524);
        }
        S12227320117525376577.w(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(dev.epro.r0.W12133020733110407383 r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            r6 = this;
            dev.epro.r0.N11678082982039175888 r0 = r6.d
            java.lang.String r1 = "SAVEPOINT '"
            boolean r2 = r8 instanceof dev.epro.r0.W15445696355901194836
            if (r2 == 0) goto L17
            r2 = r8
            dev.epro.r0.W15445696355901194836 r2 = (dev.epro.r0.W15445696355901194836) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.x = r3
            goto L1c
        L17:
            dev.epro.r0.W15445696355901194836 r2 = new dev.epro.r0.W15445696355901194836
            r2.<init>(r6, r8)
        L1c:
            java.lang.Object r8 = r2.v
            int r3 = r2.x
            r4 = 1
            dev.epro.r0.D6544101850911802081 r6 = r6.b
            r5 = 0
            if (r3 == 0) goto L38
            if (r3 != r4) goto L32
            dev.epro.r0.D6544101850911802081 r7 = r2.u
            dev.epro.r0.W12133020733110407383 r2 = r2.t
            dev.epro.r0.E17665849472693074628.k(r8)
            r8 = r7
            r7 = r2
            goto L4d
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r5
        L38:
            dev.epro.r0.E17665849472693074628.k(r8)
            r2.t = r7
            r2.u = r6
            r2.x = r4
            dev.epro.r0.R8015591507171738907 r8 = r6.b
            java.lang.Object r8 = r8.c(r2)
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            if (r8 != r2) goto L4c
            return r2
        L4c:
            r8 = r6
        L4d:
            int r2 = r0.c     // Catch: java.lang.Throwable -> L66
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L7a
            int r7 = r7.ordinal()     // Catch: java.lang.Throwable -> L66
            if (r7 == 0) goto L74
            if (r7 == r4) goto L6e
            r1 = 2
            if (r7 != r1) goto L68
            java.lang.String r7 = "BEGIN EXCLUSIVE TRANSACTION"
            dev.epro.r0.P13747563277035175218.f(r6, r7)     // Catch: java.lang.Throwable -> L66
            goto L8e
        L66:
            r6 = move-exception
            goto L9c
        L68:
            dev.epro.r0.M8821877208104636290 r6 = new dev.epro.r0.M8821877208104636290     // Catch: java.lang.Throwable -> L66
            r6.<init>()     // Catch: java.lang.Throwable -> L66
            throw r6     // Catch: java.lang.Throwable -> L66
        L6e:
            java.lang.String r7 = "BEGIN IMMEDIATE TRANSACTION"
            dev.epro.r0.P13747563277035175218.f(r6, r7)     // Catch: java.lang.Throwable -> L66
            goto L8e
        L74:
            java.lang.String r7 = "BEGIN DEFERRED TRANSACTION"
            dev.epro.r0.P13747563277035175218.f(r6, r7)     // Catch: java.lang.Throwable -> L66
            goto L8e
        L7a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L66
            r7.append(r2)     // Catch: java.lang.Throwable -> L66
            r1 = 39
            r7.append(r1)     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L66
            dev.epro.r0.P13747563277035175218.f(r6, r7)     // Catch: java.lang.Throwable -> L66
        L8e:
            dev.epro.r0.O5387078552390725281 r6 = new dev.epro.r0.O5387078552390725281     // Catch: java.lang.Throwable -> L66
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L66
            r0.addLast(r6)     // Catch: java.lang.Throwable -> L66
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L66
            r8.b(r5)
            return r6
        L9c:
            r8.b(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R13852894593656905185.e(dev.epro.r0.W12133020733110407383, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            r7 = this;
            dev.epro.r0.N11678082982039175888 r0 = r7.d
            java.lang.String r1 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r2 = "RELEASE SAVEPOINT '"
            boolean r3 = r9 instanceof dev.epro.r0.C7518934065547657280
            if (r3 == 0) goto L19
            r3 = r9
            dev.epro.r0.C7518934065547657280 r3 = (dev.epro.r0.C7518934065547657280) r3
            int r4 = r3.x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.x = r4
            goto L1e
        L19:
            dev.epro.r0.C7518934065547657280 r3 = new dev.epro.r0.C7518934065547657280
            r3.<init>(r7, r9)
        L1e:
            java.lang.Object r9 = r3.v
            int r4 = r3.x
            r5 = 1
            dev.epro.r0.D6544101850911802081 r7 = r7.b
            r6 = 0
            if (r4 == 0) goto L38
            if (r4 != r5) goto L32
            boolean r8 = r3.t
            dev.epro.r0.D6544101850911802081 r3 = r3.u
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L4d
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r6
        L38:
            dev.epro.r0.E17665849472693074628.k(r9)
            r3.u = r7
            r3.t = r8
            r3.x = r5
            dev.epro.r0.R8015591507171738907 r9 = r7.b
            java.lang.Object r9 = r9.c(r3)
            dev.epro.r0.Z3437138737604933638 r3 = dev.epro.r0.Z3437138737604933638.a
            if (r9 != r3) goto L4c
            return r3
        L4c:
            r3 = r7
        L4d:
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r9 != 0) goto La9
            java.lang.Object r9 = dev.epro.r0.P17571903987102865660.r0(r0)     // Catch: java.lang.Throwable -> L6c
            dev.epro.r0.O5387078552390725281 r9 = (dev.epro.r0.O5387078552390725281) r9     // Catch: java.lang.Throwable -> L6c
            r4 = 39
            if (r8 == 0) goto L83
            r9.getClass()     // Catch: java.lang.Throwable -> L6c
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r8 == 0) goto L6e
            java.lang.String r8 = "END TRANSACTION"
            dev.epro.r0.P13747563277035175218.f(r7, r8)     // Catch: java.lang.Throwable -> L6c
            goto La3
        L6c:
            r7 = move-exception
            goto Lb1
        L6e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L6c
            int r9 = r9.a     // Catch: java.lang.Throwable -> L6c
            r8.append(r9)     // Catch: java.lang.Throwable -> L6c
            r8.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6c
            dev.epro.r0.P13747563277035175218.f(r7, r8)     // Catch: java.lang.Throwable -> L6c
            goto La3
        L83:
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r8 == 0) goto L8f
            java.lang.String r8 = "ROLLBACK TRANSACTION"
            dev.epro.r0.P13747563277035175218.f(r7, r8)     // Catch: java.lang.Throwable -> L6c
            goto La3
        L8f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L6c
            int r9 = r9.a     // Catch: java.lang.Throwable -> L6c
            r8.append(r9)     // Catch: java.lang.Throwable -> L6c
            r8.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6c
            dev.epro.r0.P13747563277035175218.f(r7, r8)     // Catch: java.lang.Throwable -> L6c
        La3:
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L6c
            r3.b(r6)
            return r7
        La9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = "Not in a transaction"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L6c
            throw r7     // Catch: java.lang.Throwable -> L6c
        Lb1:
            r3.b(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R13852894593656905185.f(boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(dev.epro.r0.W12133020733110407383 r10, dev.epro.r0.L12639328004344855510 r11, dev.epro.r0.K14749510448791472029 r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof dev.epro.r0.H7147630497717346475
            if (r0 == 0) goto L13
            r0 = r12
            dev.epro.r0.H7147630497717346475 r0 = (dev.epro.r0.H7147630497717346475) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            dev.epro.r0.H7147630497717346475 r0 = new dev.epro.r0.H7147630497717346475
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.w
            int r1 = r0.y
            r2 = 0
            r3 = 5
            r4 = 3
            r5 = 2
            r6 = 1
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L5a
            if (r1 == r6) goto L51
            if (r1 == r5) goto L49
            if (r1 == r4) goto L43
            r9 = 4
            if (r1 == r9) goto L43
            if (r1 == r3) goto L36
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r2
        L36:
            java.lang.Throwable r9 = r0.u
            java.lang.Object r10 = r0.t
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            dev.epro.r0.E17665849472693074628.k(r12)     // Catch: android.database.SQLException -> L41
            goto La5
        L41:
            r11 = move-exception
            goto La0
        L43:
            java.lang.Object r9 = r0.t
            dev.epro.r0.E17665849472693074628.k(r12)
            return r9
        L49:
            boolean r6 = r0.v
            dev.epro.r0.E17665849472693074628.k(r12)     // Catch: java.lang.Throwable -> L4f
            goto L7e
        L4f:
            r10 = move-exception
            goto L8a
        L51:
            java.lang.Object r10 = r0.t
            r11 = r10
            dev.epro.r0.L12639328004344855510 r11 = (dev.epro.r0.L12639328004344855510) r11
            dev.epro.r0.E17665849472693074628.k(r12)
            goto L6c
        L5a:
            dev.epro.r0.E17665849472693074628.k(r12)
            if (r10 != 0) goto L61
            dev.epro.r0.W12133020733110407383 r10 = dev.epro.r0.W12133020733110407383.a
        L61:
            r0.t = r11
            r0.y = r6
            java.lang.Object r10 = r9.e(r10, r0)
            if (r10 != r7) goto L6c
            goto L99
        L6c:
            dev.epro.r0.B1062434985168244363 r10 = new dev.epro.r0.B1062434985168244363     // Catch: java.lang.Throwable -> L4f
            r10.<init>(r9, r6)     // Catch: java.lang.Throwable -> L4f
            r0.t = r2     // Catch: java.lang.Throwable -> L4f
            r0.v = r6     // Catch: java.lang.Throwable -> L4f
            r0.y = r5     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r12 = r11.invoke(r10, r0)     // Catch: java.lang.Throwable -> L4f
            if (r12 != r7) goto L7e
            goto L99
        L7e:
            r0.t = r12
            r0.y = r4
            java.lang.Object r9 = r9.f(r6, r0)
            if (r9 != r7) goto L89
            goto L99
        L89:
            return r12
        L8a:
            throw r10     // Catch: java.lang.Throwable -> L8b
        L8b:
            r11 = move-exception
            r0.t = r10     // Catch: android.database.SQLException -> L9c
            r0.u = r11     // Catch: android.database.SQLException -> L9c
            r0.y = r3     // Catch: android.database.SQLException -> L9c
            r12 = 0
            java.lang.Object r9 = r9.f(r12, r0)     // Catch: android.database.SQLException -> L9c
            if (r9 != r7) goto L9a
        L99:
            return r7
        L9a:
            r9 = r11
            goto La5
        L9c:
            r9 = move-exception
            r8 = r11
            r11 = r9
            r9 = r8
        La0:
            if (r10 == 0) goto La6
            dev.epro.r0.O8620973563946607355.m(r10, r11)
        La5:
            throw r9
        La6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R13852894593656905185.g(dev.epro.r0.W12133020733110407383, dev.epro.r0.L12639328004344855510, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
