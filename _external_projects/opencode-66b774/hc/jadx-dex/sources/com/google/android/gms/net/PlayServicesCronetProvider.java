package com.google.android.gms.net;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class PlayServicesCronetProvider extends org.chromium.net.CronetProvider {
    private static final java.lang.String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final java.lang.String TAG = "PlayServicesCronet";

    public PlayServicesCronetProvider(android.content.Context context) {
        super(context);
    }

    private void tryToInstallCronetProvider() {
        try {
            dev.epro.r0.J7896828020032272042.a(((org.chromium.net.CronetProvider) this).mContext);
        } catch (dev.epro.r0.S1166108694551160080 | dev.epro.r0.D6397819829364700013 unused) {
        }
    }

    public org.chromium.net.CronetEngine.Builder createBuilder() {
        org.chromium.net.ExperimentalCronetEngine.Builder builder;
        dev.epro.r0.P15471466588239973061 p15471466588239973061;
        try {
            dev.epro.r0.J7896828020032272042.a(((org.chromium.net.CronetProvider) this).mContext);
            try {
                synchronized (dev.epro.r0.J7896828020032272042.b) {
                    p15471466588239973061 = dev.epro.r0.J7896828020032272042.c;
                }
                dev.epro.r0.M18113111391818111737.v(p15471466588239973061);
                java.lang.ClassLoader classLoader = p15471466588239973061.a.getClassLoader();
                dev.epro.r0.M18113111391818111737.v(classLoader);
                builder = new org.chromium.net.ExperimentalCronetEngine.Builder((org.chromium.net.ICronetEngineBuilder) classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(org.chromium.net.ICronetEngineBuilder.class).getConstructor(android.content.Context.class).newInstance(((org.chromium.net.CronetProvider) this).mContext));
                e = null;
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
                e = e;
                builder = null;
            }
            if (e == null) {
                dev.epro.r0.M18113111391818111737.w("The value of the constructed builder should never be null", builder);
                return builder;
            }
            dev.epro.r0.Z3383101362411723454.m("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
            return null;
        } catch (dev.epro.r0.D6397819829364700013 e2) {
            throw new java.lang.IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e2);
        } catch (dev.epro.r0.S1166108694551160080 e3) {
            throw new java.lang.IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e3);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.google.android.gms.net.PlayServicesCronetProvider) && ((org.chromium.net.CronetProvider) this).mContext.equals(((org.chromium.net.CronetProvider) ((com.google.android.gms.net.PlayServicesCronetProvider) obj)).mContext);
        }
        return true;
    }

    public java.lang.String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    public java.lang.String getVersion() {
        java.lang.String str;
        tryToInstallCronetProvider();
        synchronized (dev.epro.r0.J7896828020032272042.b) {
            str = dev.epro.r0.J7896828020032272042.d;
        }
        return str;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{com.google.android.gms.net.PlayServicesCronetProvider.class, ((org.chromium.net.CronetProvider) this).mContext});
    }

    public boolean isEnabled() {
        dev.epro.r0.P15471466588239973061 p15471466588239973061;
        tryToInstallCronetProvider();
        synchronized (dev.epro.r0.J7896828020032272042.b) {
            p15471466588239973061 = dev.epro.r0.J7896828020032272042.c;
        }
        return p15471466588239973061 != null;
    }
}
