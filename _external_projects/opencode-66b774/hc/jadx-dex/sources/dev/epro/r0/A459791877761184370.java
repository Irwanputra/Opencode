package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A459791877761184370 {
    public static final dev.epro.r0.H5336160545165318150 e = new dev.epro.r0.H5336160545165318150("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final dev.epro.r0.H5336160545165318150 f = new dev.epro.r0.H5336160545165318150(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String[] d;

    public A459791877761184370(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = strArr;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof dev.epro.r0.A459791877761184370) && dev.epro.r0.S10823041268949770285.t(((dev.epro.r0.A459791877761184370) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a;
    }
}
