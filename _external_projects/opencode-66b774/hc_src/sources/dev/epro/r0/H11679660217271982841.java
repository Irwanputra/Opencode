package dev.epro.r0;

import androidx.sqlite.SQLiteConnection;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H11679660217271982841 implements P1476829555860395776 {
    public final A986668957555509901 a;
    public final A986668957555509901 b;
    public final T15504973625601650233 c;
    public final ThreadLocal d;
    public volatile boolean e;
    public final long f;

    public H11679660217271982841(final W8455343525638953052 w8455343525638953052, final String str, int i) {
        str.getClass();
        this.c = new T15504973625601650233((byte) 7);
        this.d = new ThreadLocal();
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.f = M9216324016624295870.Z(30, N13798149404328803870.SECONDS);
        if (i <= 0) {
            S10973172697741180971.j("Maximum number of readers must be greater than 0");
            throw null;
        }
        final byte b = 0;
        this.a = new A986668957555509901(i, new B13729205492206812220() { // from class: dev.epro.r0.O4968444499917323421
            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                byte b2 = b;
                String str2 = str;
                W8455343525638953052 w84553435256389530522 = w8455343525638953052;
                switch (b2) {
                    case 0:
                        SQLiteConnection open = w84553435256389530522.open(str2);
                        P13747563277035175218.f(open, "PRAGMA query_only = 1");
                        return open;
                    default:
                        return w84553435256389530522.open(str2);
                }
            }
        });
        final byte b2 = 1;
        this.b = new A986668957555509901(1, new B13729205492206812220() { // from class: dev.epro.r0.O4968444499917323421
            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                byte b22 = b2;
                String str2 = str;
                W8455343525638953052 w84553435256389530522 = w8455343525638953052;
                switch (b22) {
                    case 0:
                        SQLiteConnection open = w84553435256389530522.open(str2);
                        P13747563277035175218.f(open, "PRAGMA query_only = 1");
                        return open;
                    default:
                        return w84553435256389530522.open(str2);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.c();
        this.b.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147 A[Catch: all -> 0x01a1, TRY_LEAVE, TryCatch #0 {all -> 0x01a1, blocks: (B:55:0x0120, B:59:0x013c, B:61:0x0147, B:65:0x01a5, B:66:0x01ac), top: B:54:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a5 A[Catch: all -> 0x01a1, TRY_ENTER, TryCatch #0 {all -> 0x01a1, blocks: (B:55:0x0120, B:59:0x013c, B:61:0x0147, B:65:0x01a5, B:66:0x01ac), top: B:54:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // dev.epro.r0.P1476829555860395776
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(boolean r18, dev.epro.r0.L12639328004344855510 r19, dev.epro.r0.K14749510448791472029 r20) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H11679660217271982841.l(boolean, dev.epro.r0.L12639328004344855510, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public H11679660217271982841(W8455343525638953052 w8455343525638953052) {
        this.c = new T15504973625601650233((byte) 7);
        this.d = new ThreadLocal();
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.f = M9216324016624295870.Z(30, N13798149404328803870.SECONDS);
        A986668957555509901 a986668957555509901 = new A986668957555509901(1, new S464754454553842217(w8455343525638953052, (byte) 17));
        this.a = a986668957555509901;
        this.b = a986668957555509901;
    }
}
