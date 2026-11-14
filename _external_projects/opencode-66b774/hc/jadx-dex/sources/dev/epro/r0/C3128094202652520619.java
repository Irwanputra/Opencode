package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class C3128094202652520619 {
    public static final dev.epro.r0.P14992748401341948828 a = new dev.epro.r0.P14992748401341948828("MagnifierPositionInRoot");

    public static boolean a() {
        return android.os.Build.VERSION.SDK_INT >= 28;
    }

    public static dev.epro.r0.I1722681268793429505 b(dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.F4096073349764486348 f40960733497644863482, dev.epro.r0.V9509531021431440752 v9509531021431440752) {
        return a() ? new dev.epro.r0.K15474290647318393716(f4096073349764486348, f40960733497644863482, v9509531021431440752) : dev.epro.r0.V10993962107938880611.a;
    }
}
