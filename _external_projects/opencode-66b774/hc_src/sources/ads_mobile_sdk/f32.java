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

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class f32 implements S1392253949846343516, L17385865533161060024 {
    public final Context a;
    public final ExecutorService b;
    public NetworkCapabilities c = null;
    public Network d = null;

    public f32(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void a(HashMap hashMap) {
        NetworkCapabilities networkCapabilities;
        long j;
        synchronized (this) {
            networkCapabilities = this.c;
        }
        hashMap.put("ntc", networkCapabilities);
        synchronized (this) {
            try {
                NetworkCapabilities networkCapabilities2 = this.c;
                if (networkCapabilities2 != null) {
                    if (networkCapabilities2.hasTransport(4)) {
                        j = 2;
                    } else if (this.c.hasTransport(1)) {
                        j = 1;
                    } else if (this.c.hasTransport(0)) {
                        j = 0;
                    }
                }
                j = -1;
            } finally {
            }
        }
        hashMap.put("nt", Long.valueOf(j));
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void a(HashMap hashMap, Context context, View view) {
    }

    @Override // dev.epro.r0.L17385865533161060024
    public final D16915945238461757356 a() {
        H8027516537527559298 h8027516537527559298 = new H8027516537527559298(Executors.callable(new C439001677970731857(this, (byte) 1), null));
        this.b.execute(h8027516537527559298);
        return h8027516537527559298;
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void b(HashMap hashMap) {
    }
}
