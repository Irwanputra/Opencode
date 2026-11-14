package dev.epro.r0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R2847330884077978889 implements V11923105316530470448 {
    public final Context a;
    public final P17112279574965248524 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public H3351639798230113779 d;

    public R2847330884077978889(Context context, Intent intent) {
        this.a = context;
        if (Z14196540908352053240.a(context)) {
            this.b = new P17112279574965248524(context.getApplicationContext(), "HsdpService", intent, new P5733283974459951585((byte) 19));
        } else {
            S10973172697741180971.m("HSDP service is not available.");
            throw null;
        }
    }

    public static void b(final R2847330884077978889 r2847330884077978889, final String str, final int i, final Runnable runnable) {
        ((Handler) ((H3430986877638506198) r2847330884077978889.b.b).f()).post(new Runnable() { // from class: dev.epro.r0.R15419028218342651128
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2;
                S9286526287894964911 s9286526287894964911 = (S9286526287894964911) R2847330884077978889.this.c.get(str);
                if (s9286526287894964911 == null || !s9286526287894964911.a(i) || (runnable2 = runnable) == null) {
                    return;
                }
                runnable2.run();
            }
        });
    }

    public final void a(String str, String str2, IBinder iBinder, int i, int i2, boolean z, B18329032920392634747 b18329032920392634747) {
        S9286526287894964911 s9286526287894964911 = (S9286526287894964911) this.c.putIfAbsent(str, new S9286526287894964911(str, b18329032920392634747));
        if (s9286526287894964911 != null) {
            s9286526287894964911.b = b18329032920392634747;
        }
        Bundle bundle = new Bundle();
        bundle.putBinder("windowToken", iBinder);
        bundle.putInt("clientWindowWidthPx", i);
        bundle.putInt("clientWindowHeightPx", i2);
        bundle.putString("sdkVersion", "2.0.0");
        bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
        bundle.putBoolean("autoTrigger", z);
        this.b.a(new I3522225526927885074(this, str, str2, bundle, (byte) 4));
    }
}
