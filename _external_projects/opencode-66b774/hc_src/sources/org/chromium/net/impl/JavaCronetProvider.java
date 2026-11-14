package org.chromium.net.impl;

import android.content.Context;
import dev.epro.r0.M18113111391818111737;
import dev.epro.r0.Q13169198992966610970;
import dev.epro.r0.R5112989431472712448;
import dev.epro.r0.Z3383101362411723454;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public class JavaCronetProvider extends CronetProvider {
    public JavaCronetProvider(Context context) {
        super(context);
    }

    @Override // org.chromium.net.CronetProvider
    public final CronetEngine.Builder createBuilder() {
        if (HttpEngineNativeProvider.a()) {
            Context context = this.mContext;
            if (Collections.unmodifiableMap((HashMap) Q13169198992966610970.X(context, ImplVersion.getCronetVersion(), M18113111391818111737.F(context).getBoolean("android.net.http.EnableTelemetry", false)).b).get("Cronet_ForceHttpEngineInFallback") != null) {
                Z3383101362411723454.s();
                return null;
            }
        }
        return new ExperimentalCronetEngine.Builder(new R5112989431472712448(this.mContext));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JavaCronetProvider) && this.mContext.equals(((JavaCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public final String getName() {
        return CronetProvider.PROVIDER_NAME_FALLBACK;
    }

    @Override // org.chromium.net.CronetProvider
    public final String getVersion() {
        return ImplVersion.getCronetVersion();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{JavaCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public final boolean isEnabled() {
        return true;
    }
}
