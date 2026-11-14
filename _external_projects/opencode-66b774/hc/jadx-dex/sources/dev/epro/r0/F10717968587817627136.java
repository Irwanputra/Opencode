package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class F10717968587817627136 extends dalvik.system.PathClassLoader {
    @Override // java.lang.ClassLoader
    public final java.lang.Class loadClass(java.lang.String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (java.lang.ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
