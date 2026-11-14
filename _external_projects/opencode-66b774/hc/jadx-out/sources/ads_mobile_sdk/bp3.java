package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import android.view.View;
import dev.epro.r0.B6805403844224311194;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.H8027516537527559298;
import dev.epro.r0.L17385865533161060024;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.S1392253949846343516;
import dev.epro.r0.W13948953340889349604;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class bp3 implements S1392253949846343516, L17385865533161060024 {
    public static final String[] h = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public final O16637889491137121389 a;
    public final Context b;
    public final ExecutorService c;
    public long d = 0;
    public long e = 0;
    public long f = -1;
    public boolean g = false;

    public bp3(Context context, O16637889491137121389 o16637889491137121389, ExecutorService executorService) {
        this.a = o16637889491137121389;
        this.b = context;
        this.c = executorService;
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void a(HashMap map) {
        long j;
        long j2;
        c();
        synchronized (this) {
            try {
                j = this.g ? this.e - this.d : -1L;
            } finally {
            }
        }
        map.put("vs", Long.valueOf(j));
        synchronized (this) {
            j2 = this.f;
            this.f = -1L;
        }
        map.put("vf", Long.valueOf(j2));
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void b(HashMap map) {
        c();
    }

    public final void c() {
        synchronized (this) {
            try {
                if (this.g) {
                    this.a.getClass();
                    this.e = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void a(HashMap map, Context context, View view) {
        c();
    }

    @Override // dev.epro.r0.L17385865533161060024
    public final D16915945238461757356 a() {
        if (Build.VERSION.SDK_INT < 30) {
            return B6805403844224311194.b;
        }
        H8027516537527559298 h8027516537527559298 = new H8027516537527559298(Executors.callable(new W13948953340889349604(this, (byte) 29), null));
        this.c.execute(h8027516537527559298);
        return h8027516537527559298;
    }
}
