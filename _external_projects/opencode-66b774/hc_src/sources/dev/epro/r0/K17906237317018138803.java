package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K17906237317018138803 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public K17906237317018138803(String str) {
        String[] split = str.split("\\.");
        this.a = Integer.parseInt(split[0]);
        this.b = Integer.parseInt(split[1]);
        this.c = Integer.parseInt(split[2]);
        this.d = Integer.parseInt(split[3]);
    }

    public final String toString() {
        return this.a + "." + this.b + "." + this.c + "." + this.d;
    }
}
