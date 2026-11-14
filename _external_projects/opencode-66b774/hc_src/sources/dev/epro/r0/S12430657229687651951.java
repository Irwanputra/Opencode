package dev.epro.r0;

import android.os.SystemClock;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S12430657229687651951 extends O4077903568229246 {
    public final AtomicInteger y;
    public final Y14135370110033388552 z;

    public S12430657229687651951() {
        Y14135370110033388552 y14135370110033388552 = new Y14135370110033388552();
        this.y = new AtomicInteger();
        this.z = y14135370110033388552;
    }

    @Override // dev.epro.r0.O4077903568229246
    public final void A(U10534498473358193554 u10534498473358193554) {
        int i;
        int i2;
        U1748733558996603759.b("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo");
        try {
            long j = u10534498473358193554.a;
            int A = L11610354117192841236.A(u10534498473358193554.b);
            int i3 = 2;
            int i4 = 1;
            if (A == 0) {
                i = 0;
                i2 = 1;
            } else if (A != 1) {
                i2 = 0;
                i = 0;
            } else {
                i2 = 2;
                i = 0;
            }
            int i5 = u10534498473358193554.c;
            int ordinal = u10534498473358193554.d.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    i3 = 3;
                    if (ordinal != 3) {
                        i3 = 4;
                        if (ordinal != 4) {
                            i4 = i;
                        }
                    }
                }
                i4 = i3;
            }
            byte b = G11450220448113054352.b(G11450220448113054352.a(u10534498473358193554.e));
            K17906237317018138803 k17906237317018138803 = u10534498473358193554.f;
            int i6 = k17906237317018138803.a;
            int i7 = k17906237317018138803.b;
            int i8 = k17906237317018138803.c;
            int i9 = k17906237317018138803.d;
            K17906237317018138803 k179062373170181388032 = u10534498473358193554.g;
            int i10 = -1;
            int i11 = k179062373170181388032 == null ? -1 : k179062373170181388032.a;
            int i12 = k179062373170181388032 == null ? -1 : k179062373170181388032.b;
            int i13 = k179062373170181388032 == null ? -1 : k179062373170181388032.c;
            if (k179062373170181388032 != null) {
                i10 = k179062373170181388032.d;
            }
            J12032226664423879920.a(j, i2, i5, i4, b, i6, i7, i8, i9, i11, i12, i13, i10, u10534498473358193554.h);
            Trace.endSection();
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // dev.epro.r0.O4077903568229246
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(long r47, dev.epro.r0.D11398891543882352014 r49, dev.epro.r0.K17906237317018138803 r50) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S12430657229687651951.B(long, dev.epro.r0.D11398891543882352014, dev.epro.r0.K17906237317018138803):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // dev.epro.r0.O4077903568229246
    public final void C(long j, L3824616114245370575 l3824616114245370575) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        long millis;
        long millis2;
        byte[] bytes;
        Y14135370110033388552 y14135370110033388552 = this.z;
        synchronized (y14135370110033388552.a) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (y14135370110033388552.c + 1000 <= elapsedRealtime) {
                    y14135370110033388552.b = 1;
                    y14135370110033388552.c = elapsedRealtime;
                } else {
                    int i6 = y14135370110033388552.b;
                    if (i6 >= 1) {
                        this.y.incrementAndGet();
                        return;
                    }
                    y14135370110033388552.b = i6 + 1;
                }
                ?? r2 = this.y;
                int andSet = r2.getAndSet(0);
                try {
                    try {
                        U1748733558996603759.b("CronetLoggerImpl#writeCronetTrafficReported");
                        try {
                            long j2 = l3824616114245370575.a;
                            P1789376955961125859.f(j2, "Request header size is negative");
                            double d = j2 / 1024.0d;
                            i = P1789376955961125859.j(d, 0, 1) ? 1 : P1789376955961125859.j(d, 1, 10) ? 2 : P1789376955961125859.j(d, 10, 25) ? 3 : P1789376955961125859.j(d, 25, 50) ? 4 : P1789376955961125859.j(d, 50, 100) ? 5 : 6;
                            long j3 = l3824616114245370575.b;
                            P1789376955961125859.f(j3, "Request body size is negative");
                            double d2 = j3 / 1024.0d;
                            i2 = d2 == 0.0d ? 1 : (d2 <= 0.0d || d2 >= 10.0d) ? P1789376955961125859.j(d2, 10, 50) ? 3 : P1789376955961125859.j(d2, 50, 200) ? 4 : P1789376955961125859.j(d2, 200, 500) ? 5 : P1789376955961125859.j(d2, 500, 1000) ? 6 : P1789376955961125859.j(d2, 1000, 5000) ? 7 : 8 : 2;
                            long j4 = l3824616114245370575.c;
                            P1789376955961125859.f(j4, "Response header size is negative");
                            double d3 = j4 / 1024.0d;
                            i3 = P1789376955961125859.j(d3, 0, 1) ? 1 : P1789376955961125859.j(d3, 1, 10) ? 2 : P1789376955961125859.j(d3, 10, 25) ? 3 : P1789376955961125859.j(d3, 25, 50) ? 4 : P1789376955961125859.j(d3, 50, 100) ? 5 : 6;
                            long j5 = l3824616114245370575.d;
                            P1789376955961125859.f(j5, "Response body size is negative");
                            double d4 = j5 / 1024.0d;
                            i4 = d4 == 0.0d ? 1 : (d4 <= 0.0d || d4 >= 10.0d) ? P1789376955961125859.j(d4, 10, 50) ? 3 : P1789376955961125859.j(d4, 50, 200) ? 4 : P1789376955961125859.j(d4, 200, 500) ? 5 : P1789376955961125859.j(d4, 500, 1000) ? 6 : P1789376955961125859.j(d4, 1000, 5000) ? 7 : 8 : 2;
                            i5 = l3824616114245370575.e;
                            str = l3824616114245370575.h;
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            MessageDigest messageDigest = I18336162372952118409.a;
                            long j6 = 0;
                            if (messageDigest != null && str != null && !str.isEmpty() && (bytes = str.getBytes(StandardCharsets.UTF_8)) != null && bytes.length != 0) {
                                j6 = ByteBuffer.wrap(messageDigest.digest(bytes)).getLong();
                            }
                            millis = l3824616114245370575.f.toMillis();
                            int i7 = (int) millis;
                            millis2 = l3824616114245370575.g.toMillis();
                            int i8 = (int) millis2;
                            int A = L11610354117192841236.A(l3824616114245370575.i);
                            int i9 = A != 0 ? A != 1 ? A != 2 ? 0 : 3 : 2 : 1;
                            int i10 = l3824616114245370575.j;
                            int i11 = l3824616114245370575.k;
                            int i12 = l3824616114245370575.l;
                            Boolean bool = Boolean.FALSE;
                            byte b = G11450220448113054352.b(G11450220448113054352.a(bool));
                            byte b2 = G11450220448113054352.b(G11450220448113054352.a(Boolean.valueOf(l3824616114245370575.m)));
                            int i13 = l3824616114245370575.n;
                            int i14 = i;
                            int A2 = L11610354117192841236.A(1);
                            J12032226664423879920.b(j, i14, i2, i3, i4, i5, j6, i7, i8, andSet, i9, i10, i11, i12, b, b2, i13, 0, A2 != 1 ? A2 != 2 ? 0 : 100 : 1, G11450220448113054352.b(G11450220448113054352.a(bool)), l3824616114245370575.f347o, 3);
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th = th2;
                            r2 = andSet;
                            Throwable th3 = th;
                            try {
                                Trace.endSection();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Exception unused) {
                        this.y.addAndGet(r2);
                    }
                } catch (Exception unused2) {
                    r2 = andSet;
                    this.y.addAndGet(r2);
                }
            } finally {
            }
        }
    }
}
