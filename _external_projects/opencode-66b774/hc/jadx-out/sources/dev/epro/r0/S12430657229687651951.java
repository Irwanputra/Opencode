package dev.epro.r0;

import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S12430657229687651951 extends O4077903568229246 {
    public final AtomicInteger y;
    public final Y14135370110033388552 z;

    public S12430657229687651951() {
        Y14135370110033388552 y14135370110033388552 = new Y14135370110033388552();
        this.y = new AtomicInteger();
        this.z = y14135370110033388552;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[PHI: r4
      0x0032: PHI (r4v7 int) = (r4v0 int), (r4v8 int), (r4v9 int) binds: [B:11:0x0028, B:13:0x002b, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // dev.epro.r0.O4077903568229246
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(dev.epro.r0.U10534498473358193554 r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "CronetLoggerImpl#logCronetEngineBuilderInitializedInfo"
            dev.epro.r0.U1748733558996603759.b(r1)
            long r2 = r0.a     // Catch: java.lang.Throwable -> L72
            int r1 = r0.b     // Catch: java.lang.Throwable -> L72
            int r1 = dev.epro.r0.L11610354117192841236.A(r1)     // Catch: java.lang.Throwable -> L72
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L1c
            if (r1 == r6) goto L19
            r1 = r5
            r7 = r1
            goto L1e
        L19:
            r1 = r4
            r7 = r5
            goto L1e
        L1c:
            r7 = r5
            r1 = r6
        L1e:
            int r5 = r0.c     // Catch: java.lang.Throwable -> L72
            dev.epro.r0.W13223114868094258148 r8 = r0.d     // Catch: java.lang.Throwable -> L72
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L72
            if (r8 == r6) goto L33
            if (r8 == r4) goto L32
            r4 = 3
            if (r8 == r4) goto L32
            r4 = 4
            if (r8 == r4) goto L32
            r6 = r7
            goto L33
        L32:
            r6 = r4
        L33:
            java.lang.Boolean r4 = r0.e     // Catch: java.lang.Throwable -> L72
            int r4 = dev.epro.r0.G11450220448113054352.a(r4)     // Catch: java.lang.Throwable -> L72
            byte r7 = dev.epro.r0.G11450220448113054352.b(r4)     // Catch: java.lang.Throwable -> L72
            dev.epro.r0.K17906237317018138803 r4 = r0.f     // Catch: java.lang.Throwable -> L72
            int r8 = r4.a     // Catch: java.lang.Throwable -> L72
            int r9 = r4.b     // Catch: java.lang.Throwable -> L72
            int r10 = r4.c     // Catch: java.lang.Throwable -> L72
            int r11 = r4.d     // Catch: java.lang.Throwable -> L72
            dev.epro.r0.K17906237317018138803 r4 = r0.g     // Catch: java.lang.Throwable -> L72
            r12 = -1
            if (r4 != 0) goto L4e
            r13 = r12
            goto L50
        L4e:
            int r13 = r4.a     // Catch: java.lang.Throwable -> L72
        L50:
            if (r4 != 0) goto L54
            r14 = r12
            goto L56
        L54:
            int r14 = r4.b     // Catch: java.lang.Throwable -> L72
        L56:
            if (r4 != 0) goto L5a
            r15 = r12
            goto L5c
        L5a:
            int r15 = r4.c     // Catch: java.lang.Throwable -> L72
        L5c:
            if (r4 != 0) goto L5f
            goto L61
        L5f:
            int r12 = r4.d     // Catch: java.lang.Throwable -> L72
        L61:
            int r0 = r0.h     // Catch: java.lang.Throwable -> L72
            r4 = r15
            r15 = r12
            r12 = r13
            r13 = r14
            r14 = r4
            r16 = r0
            r4 = r1
            dev.epro.r0.J12032226664423879920.a(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L72
            android.os.Trace.endSection()
            return
        L72:
            r0 = move-exception
            r1 = r0
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L78
            goto L7c
        L78:
            r0 = move-exception
            r1.addSuppressed(r0)
        L7c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S12430657229687651951.A(dev.epro.r0.U10534498473358193554):void");
    }

    @Override // dev.epro.r0.O4077903568229246
    public final void B(long j, D11398891543882352014 d11398891543882352014, K17906237317018138803 k17906237317018138803) {
        int i;
        Object objCast;
        try {
            U1748733558996603759.b("CronetLoggerImpl#writeCronetEngineCreation");
            try {
                W9862291181433028285 w9862291181433028285 = new W9862291181433028285(d11398891543882352014.f);
                int i2 = k17906237317018138803.a;
                int i3 = k17906237317018138803.b;
                int i4 = k17906237317018138803.c;
                int i5 = k17906237317018138803.d;
                boolean z = d11398891543882352014.d;
                boolean z2 = d11398891543882352014.c;
                int i6 = d11398891543882352014.e;
                int i7 = 1;
                if (i6 == 0) {
                    i = i7;
                } else if (i6 != 1) {
                    i7 = 3;
                    if (i6 != 2) {
                        if (i6 != 3) {
                            throw new IllegalArgumentException("Expected httpCacheMode to range from 0 to 3");
                        }
                        i7 = 4;
                    }
                    i = i7;
                } else {
                    i = 2;
                }
                boolean z3 = d11398891543882352014.a;
                boolean z4 = d11398891543882352014.b;
                boolean z5 = d11398891543882352014.g;
                String strA = w9862291181433028285.a();
                byte b = G11450220448113054352.b(G11450220448113054352.a((Boolean) w9862291181433028285.b("QUIC", "store_server_configs_in_properties", null, Boolean.class)));
                int iIntValue = ((Integer) w9862291181433028285.b("QUIC", "max_server_configs_stored_in_properties", -1, Integer.class)).intValue();
                int iIntValue2 = ((Integer) w9862291181433028285.b("QUIC", "idle_connection_timeout_seconds", -1, Integer.class)).intValue();
                byte b2 = G11450220448113054352.b(G11450220448113054352.a((Boolean) w9862291181433028285.b("QUIC", "goaway_sessions_on_ip_change", null, Boolean.class)));
                byte b3 = G11450220448113054352.b(G11450220448113054352.a((Boolean) w9862291181433028285.b("QUIC", "close_sessions_on_ip_change", null, Boolean.class)));
                byte b4 = G11450220448113054352.b(G11450220448113054352.a((Boolean) w9862291181433028285.b("QUIC", "migrate_sessions_on_network_change_v2", null, Boolean.class)));
                byte b5 = G11450220448113054352.b(G11450220448113054352.a((Boolean) w9862291181433028285.b("QUIC", "migrate_sessions_early_v2", null, Boolean.class)));
                byte b6 = G11450220448113054352.b(G11450220448113054352.a((Boolean) w9862291181433028285.b("QUIC", "disable_bidirectional_streams", null, Boolean.class)));
                int iIntValue3 = ((Integer) w9862291181433028285.b("QUIC", "max_time_before_crypto_handshake_seconds", -1, Integer.class)).intValue();
                int iIntValue4 = ((Integer) w9862291181433028285.b("QUIC", "max_idle_time_before_crypto_handshake_seconds", -1, Integer.class)).intValue();
                byte b7 = G11450220448113054352.b(G11450220448113054352.a((Boolean) w9862291181433028285.b("QUIC", "enable_socket_recv_optimization", null, Boolean.class)));
                byte b8 = G11450220448113054352.b(G11450220448113054352.a((Boolean) w9862291181433028285.b("AsyncDNS", "enable", null, Boolean.class)));
                byte b9 = G11450220448113054352.b(G11450220448113054352.a((Boolean) w9862291181433028285.b("StaleDNS", "enable", null, Boolean.class)));
                int iIntValue5 = ((Integer) w9862291181433028285.b("StaleDNS", "delay_ms", -1, Integer.class)).intValue();
                int iIntValue6 = ((Integer) w9862291181433028285.b("StaleDNS", "max_expired_time_ms", -1, Integer.class)).intValue();
                int iIntValue7 = ((Integer) w9862291181433028285.b("StaleDNS", "max_stale_uses", -1, Integer.class)).intValue();
                byte b10 = G11450220448113054352.b(G11450220448113054352.a((Boolean) w9862291181433028285.b("StaleDNS", "allow_other_network", null, Boolean.class)));
                byte b11 = G11450220448113054352.b(G11450220448113054352.a((Boolean) w9862291181433028285.b("StaleDNS", "persist_to_disk", null, Boolean.class)));
                int iIntValue8 = ((Integer) w9862291181433028285.b("StaleDNS", "persist_delay_ms", -1, Integer.class)).intValue();
                byte b12 = G11450220448113054352.b(G11450220448113054352.a((Boolean) w9862291181433028285.b("StaleDNS", "use_stale_on_name_not_resolved", null, Boolean.class)));
                JSONObject jSONObject = w9862291181433028285.a;
                if (jSONObject.length() == 0) {
                    objCast = null;
                } else {
                    try {
                        objCast = Boolean.class.cast(jSONObject.get("disable_ipv6_on_wifi"));
                    } catch (ClassCastException | JSONException unused) {
                        objCast = null;
                    }
                }
                J12032226664423879920.c(j, i2, i3, i4, i5, 3, z, z2, i, z3, z4, z5, strA, b, iIntValue, iIntValue2, b2, b3, b4, b5, b6, iIntValue3, iIntValue4, b7, b8, b9, iIntValue5, iIntValue6, iIntValue7, b10, b11, iIntValue8, b12, G11450220448113054352.b(G11450220448113054352.a((Boolean) objCast)), d11398891543882352014.h, Process.myUid());
                Trace.endSection();
            } finally {
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // dev.epro.r0.O4077903568229246
    public final void C(long j, L3824616114245370575 l3824616114245370575) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        byte[] bytes;
        Y14135370110033388552 y14135370110033388552 = this.z;
        synchronized (y14135370110033388552.a) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (y14135370110033388552.c + 1000 <= jElapsedRealtime) {
                    y14135370110033388552.b = 1;
                    y14135370110033388552.c = jElapsedRealtime;
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
                            int millis = (int) l3824616114245370575.f.toMillis();
                            int millis2 = (int) l3824616114245370575.g.toMillis();
                            int iA = L11610354117192841236.A(l3824616114245370575.i);
                            int i7 = iA != 0 ? iA != 1 ? iA != 2 ? 0 : 3 : 2 : 1;
                            int i8 = l3824616114245370575.j;
                            int i9 = l3824616114245370575.k;
                            int i10 = l3824616114245370575.l;
                            Boolean bool = Boolean.FALSE;
                            byte b = G11450220448113054352.b(G11450220448113054352.a(bool));
                            byte b2 = G11450220448113054352.b(G11450220448113054352.a(Boolean.valueOf(l3824616114245370575.m)));
                            int i11 = l3824616114245370575.n;
                            int i12 = i;
                            int iA2 = L11610354117192841236.A(1);
                            J12032226664423879920.b(j, i12, i2, i3, i4, i5, j6, millis, millis2, andSet, i7, i8, i9, i10, b, b2, i11, 0, iA2 != 1 ? iA2 != 2 ? 0 : 100 : 1, G11450220448113054352.b(G11450220448113054352.a(bool)), l3824616114245370575.f347o, 3);
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
