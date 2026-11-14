package dev.epro.r0;

import android.content.Context;
import android.net.DnsResolver;
import android.net.ssl.EchConfigMismatchException;
import android.os.Looper;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class K5395552668562208334 {
    public static /* synthetic */ DnsResolver a(Context context, Looper looper) {
        return new DnsResolver(context, looper);
    }

    public static /* bridge */ /* synthetic */ EchConfigMismatchException d(Object obj) {
        return (EchConfigMismatchException) obj;
    }

    public static /* bridge */ /* synthetic */ boolean h(Object obj) {
        return obj instanceof EchConfigMismatchException;
    }
}
