package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D2029916669724210805 {
    public final int a;
    public final int b;
    public final C2164091577132444055 c;

    public D2029916669724210805(int i, int i2, C2164091577132444055 c2164091577132444055) {
        this.a = i;
        this.b = i2;
        this.c = c2164091577132444055;
        if (i < 0) {
            Y16081827717826519461.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        Y16081827717826519461.a("size should be > 0");
    }
}
