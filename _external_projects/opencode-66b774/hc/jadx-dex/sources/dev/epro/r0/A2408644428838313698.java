package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A2408644428838313698 implements java.io.FilenameFilter {
    public final java.util.regex.Pattern a;

    public A2408644428838313698(java.util.regex.Pattern pattern) {
        pattern.getClass();
        this.a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File file, java.lang.String str) {
        return this.a.matcher(str).matches();
    }
}
