package com.google.android.gms.net;

import android.content.Context;
import dev.epro.r0.D6397819829364700013;
import dev.epro.r0.J7896828020032272042;
import dev.epro.r0.M18113111391818111737;
import dev.epro.r0.P15471466588239973061;
import dev.epro.r0.S1166108694551160080;
import dev.epro.r0.Z3383101362411723454;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    private void tryToInstallCronetProvider() {
        try {
            J7896828020032272042.a(this.mContext);
        } catch (D6397819829364700013 | S1166108694551160080 unused) {
        }
    }

    @Override // org.chromium.net.CronetProvider
    public CronetEngine.Builder createBuilder() {
        ExperimentalCronetEngine.Builder builder;
        P15471466588239973061 p15471466588239973061;
        try {
            J7896828020032272042.a(this.mContext);
            try {
                synchronized (J7896828020032272042.b) {
                    p15471466588239973061 = J7896828020032272042.c;
                }
                M18113111391818111737.v(p15471466588239973061);
                ClassLoader classLoader = p15471466588239973061.a.getClassLoader();
                M18113111391818111737.v(classLoader);
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext));
                e = null;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                e = e;
                builder = null;
            }
            if (e == null) {
                M18113111391818111737.w("The value of the constructed builder should never be null", builder);
                return builder;
            }
            Z3383101362411723454.m("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
            return null;
        } catch (D6397819829364700013 e2) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e2);
        } catch (S1166108694551160080 e3) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e3);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    public String getVersion() {
        String str;
        tryToInstallCronetProvider();
        synchronized (J7896828020032272042.b) {
            str = J7896828020032272042.d;
        }
        return str;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        P15471466588239973061 p15471466588239973061;
        tryToInstallCronetProvider();
        synchronized (J7896828020032272042.b) {
            p15471466588239973061 = J7896828020032272042.c;
        }
        return p15471466588239973061 != null;
    }
}
