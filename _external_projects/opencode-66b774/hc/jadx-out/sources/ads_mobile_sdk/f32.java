package ads_mobile_sdk;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.view.View;
import dev.epro.r0.C439001677970731857;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.H8027516537527559298;
import dev.epro.r0.L17385865533161060024;
import dev.epro.r0.S1392253949846343516;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class f32 implements S1392253949846343516, L17385865533161060024 {
    public final Context a;
    public final ExecutorService b;
    public NetworkCapabilities c = null;
    public Network d = null;

    public f32(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0035 A[Catch: all -> 0x0019, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x000a, B:10:0x000e, B:12:0x0015, B:16:0x001b, B:18:0x0024, B:20:0x0028, B:22:0x0031, B:24:0x0035), top: B:35:0x000a }] */
    @Override // dev.epro.r0.S1392253949846343516
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.HashMap r3) {
        /*
            r2 = this;
            java.lang.String r0 = "ntc"
            monitor-enter(r2)
            android.net.NetworkCapabilities r1 = r2.c     // Catch: java.lang.Throwable -> L44
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            r3.put(r0, r1)
            monitor-enter(r2)
            android.net.NetworkCapabilities r0 = r2.c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L35
            r1 = 4
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            r0 = 2
            goto L38
        L19:
            r3 = move-exception
            goto L42
        L1b:
            android.net.NetworkCapabilities r0 = r2.c     // Catch: java.lang.Throwable -> L19
            r1 = 1
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L28
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            r0 = 1
            goto L38
        L28:
            android.net.NetworkCapabilities r0 = r2.c     // Catch: java.lang.Throwable -> L19
            r1 = 0
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L35
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            r0 = 0
            goto L38
        L35:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            r0 = -1
        L38:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "nt"
            r3.put(r0, r2)
            return
        L42:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3
        L44:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.f32.a(java.util.HashMap):void");
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void a(HashMap map, Context context, View view) {
    }

    @Override // dev.epro.r0.L17385865533161060024
    public final D16915945238461757356 a() {
        H8027516537527559298 h8027516537527559298 = new H8027516537527559298(Executors.callable(new C439001677970731857(this, (byte) 1), null));
        this.b.execute(h8027516537527559298);
        return h8027516537527559298;
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void b(HashMap map) {
    }
}
