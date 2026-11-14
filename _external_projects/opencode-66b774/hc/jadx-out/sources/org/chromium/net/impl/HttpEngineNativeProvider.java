package org.chromium.net.impl;

import android.content.Context;
import android.net.http.HttpEngine;
import android.os.Build;
import android.os.Trace;
import android.os.ext.SdkExtensions;
import dev.epro.r0.J14472086795230312938;
import dev.epro.r0.U1748733558996603759;
import dev.epro.r0.Y16199236766096997787;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public class HttpEngineNativeProvider extends CronetProvider {
    public HttpEngineNativeProvider(Context context) {
        super(context);
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(31) >= 7;
    }

    @Override // org.chromium.net.CronetProvider
    public final CronetEngine.Builder createBuilder() {
        U1748733558996603759.b("HttpEngineNativeProvider#createBuilder");
        try {
            J14472086795230312938.r();
            ExperimentalCronetEngine.Builder builder = new ExperimentalCronetEngine.Builder(new Y16199236766096997787(J14472086795230312938.l(this.mContext)));
            Trace.endSection();
            return builder;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.CronetProvider
    public final String getName() {
        return "HttpEngine-Native-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    public final String getVersion() {
        return HttpEngine.getVersionString();
    }

    @Override // org.chromium.net.CronetProvider
    public final boolean isEnabled() {
        return a();
    }
}
