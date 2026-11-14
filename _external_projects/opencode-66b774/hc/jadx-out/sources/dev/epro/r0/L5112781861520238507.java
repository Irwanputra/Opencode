package dev.epro.r0;

import androidx.sqlite.SQLiteConnection;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L5112781861520238507 implements F6741456026889144139, E15320933127936247274 {
    public final L12639328004344855510 a;
    public final SQLiteConnection b;
    public final AtomicInteger c;
    public W12133020733110407383 d;

    public L5112781861520238507(L12639328004344855510 l12639328004344855510, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        this.a = l12639328004344855510;
        this.b = sQLiteConnection;
        this.c = new AtomicInteger(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // dev.epro.r0.G5610643384273062965
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, dev.epro.r0.F4096073349764486348 r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof dev.epro.r0.D13155701706554451064
            if (r0 == 0) goto L13
            r0 = r14
            dev.epro.r0.D13155701706554451064 r0 = (dev.epro.r0.D13155701706554451064) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            dev.epro.r0.D13155701706554451064 r0 = new dev.epro.r0.D13155701706554451064
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            int r1 = r0.x
            r2 = 2
            r3 = 1
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            dev.epro.r0.E17665849472693074628.k(r14)
            return r14
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r11)
            r11 = 0
            return r11
        L31:
            dev.epro.r0.F4096073349764486348 r13 = r0.u
            java.lang.String r12 = r0.t
            dev.epro.r0.E17665849472693074628.k(r14)
        L38:
            r7 = r12
            r8 = r13
            goto L4b
        L3b:
            dev.epro.r0.E17665849472693074628.k(r14)
            r0.t = r12
            r0.u = r13
            r0.x = r3
            java.lang.Boolean r14 = r11.c(r0)
            if (r14 != r4) goto L38
            goto L69
        L4b:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r12 = r14.booleanValue()
            r9 = 0
            if (r12 == 0) goto L6b
            dev.epro.r0.M3461266234580785862 r5 = new dev.epro.r0.M3461266234580785862
            r10 = 0
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r0.t = r9
            r0.u = r9
            r0.x = r2
            dev.epro.r0.L12639328004344855510 r11 = r6.a
            java.lang.Object r11 = r11.invoke(r5, r0)
            if (r11 != r4) goto L6a
        L69:
            return r4
        L6a:
            return r11
        L6b:
            r6 = r11
            androidx.sqlite.SQLiteConnection r11 = r6.b
            androidx.sqlite.SQLiteStatement r11 = r11.prepare(r7)
            java.lang.Object r12 = r8.invoke(r11)     // Catch: java.lang.Throwable -> L7a
            dev.epro.r0.T18016951143603335921.y(r11, r9)
            return r12
        L7a:
            r0 = move-exception
            r12 = r0
            throw r12     // Catch: java.lang.Throwable -> L7d
        L7d:
            r0 = move-exception
            r13 = r0
            dev.epro.r0.T18016951143603335921.y(r11, r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L5112781861520238507.a(java.lang.String, dev.epro.r0.F4096073349764486348, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.E15320933127936247274
    public final SQLiteConnection b() {
        return this.b;
    }

    @Override // dev.epro.r0.F6741456026889144139
    public final Boolean c(R4833348786910499294 r4833348786910499294) {
        return Boolean.valueOf(this.d != null || this.b.inTransaction());
    }

    @Override // dev.epro.r0.F6741456026889144139
    public final Object d(W12133020733110407383 w12133020733110407383, L12639328004344855510 l12639328004344855510, R14062301455140331524 r14062301455140331524) {
        return this.a.invoke(new Y14712737278372885690(this, w12133020733110407383, l12639328004344855510, null, (byte) 6), r14062301455140331524);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(dev.epro.r0.W12133020733110407383 r8, dev.epro.r0.L12639328004344855510 r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof dev.epro.r0.A1857135312955578969
            if (r0 == 0) goto L13
            r0 = r10
            dev.epro.r0.A1857135312955578969 r0 = (dev.epro.r0.A1857135312955578969) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.A1857135312955578969 r0 = new dev.epro.r0.A1857135312955578969
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.u
            int r1 = r0.w
            java.lang.String r2 = "ROLLBACK TRANSACTION"
            r3 = 0
            java.util.concurrent.atomic.AtomicInteger r4 = r7.c
            r5 = 1
            androidx.sqlite.SQLiteConnection r6 = r7.b
            if (r1 == 0) goto L36
            if (r1 != r5) goto L30
            boolean r5 = r0.t
            dev.epro.r0.E17665849472693074628.k(r10)     // Catch: java.lang.Throwable -> L2e
            goto L74
        L2e:
            r8 = move-exception
            goto L88
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r3
        L36:
            dev.epro.r0.E17665849472693074628.k(r10)
            int r10 = r8.ordinal()
            if (r10 == 0) goto L54
            if (r10 == r5) goto L4e
            r1 = 2
            if (r10 != r1) goto L4a
            java.lang.String r10 = "BEGIN EXCLUSIVE TRANSACTION"
            dev.epro.r0.P13747563277035175218.f(r6, r10)
            goto L59
        L4a:
            dev.epro.r0.Z3383101362411723454.g()
            return r3
        L4e:
            java.lang.String r10 = "BEGIN IMMEDIATE TRANSACTION"
            dev.epro.r0.P13747563277035175218.f(r6, r10)
            goto L59
        L54:
            java.lang.String r10 = "BEGIN DEFERRED TRANSACTION"
            dev.epro.r0.P13747563277035175218.f(r6, r10)
        L59:
            int r10 = r4.incrementAndGet()
            if (r10 <= 0) goto L61
            r7.d = r8
        L61:
            dev.epro.r0.B1062434985168244363 r8 = new dev.epro.r0.B1062434985168244363     // Catch: java.lang.Throwable -> L2e
            r10 = 0
            r8.<init>(r7, r10)     // Catch: java.lang.Throwable -> L2e
            r0.t = r5     // Catch: java.lang.Throwable -> L2e
            r0.w = r5     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = r9.invoke(r8, r0)     // Catch: java.lang.Throwable -> L2e
            dev.epro.r0.Z3437138737604933638 r8 = dev.epro.r0.Z3437138737604933638.a
            if (r10 != r8) goto L74
            return r8
        L74:
            int r8 = r4.decrementAndGet()
            if (r8 != 0) goto L7c
            r7.d = r3
        L7c:
            if (r5 == 0) goto L84
            java.lang.String r7 = "END TRANSACTION"
            dev.epro.r0.P13747563277035175218.f(r6, r7)
            return r10
        L84:
            dev.epro.r0.P13747563277035175218.f(r6, r2)
            return r10
        L88:
            throw r8     // Catch: java.lang.Throwable -> L89
        L89:
            r9 = move-exception
            int r10 = r4.decrementAndGet()     // Catch: android.database.SQLException -> L93
            if (r10 != 0) goto L95
            r7.d = r3     // Catch: android.database.SQLException -> L93
            goto L95
        L93:
            r7 = move-exception
            goto L99
        L95:
            dev.epro.r0.P13747563277035175218.f(r6, r2)     // Catch: android.database.SQLException -> L93
            goto L9c
        L99:
            dev.epro.r0.O8620973563946607355.m(r8, r7)
        L9c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L5112781861520238507.e(dev.epro.r0.W12133020733110407383, dev.epro.r0.L12639328004344855510, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
