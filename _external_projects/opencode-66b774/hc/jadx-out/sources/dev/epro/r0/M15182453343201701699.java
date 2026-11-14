package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M15182453343201701699 implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public M15182453343201701699(String str, int i, int i2, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        M15182453343201701699 m15182453343201701699 = (M15182453343201701699) obj;
        m15182453343201701699.getClass();
        int i = this.a - m15182453343201701699.a;
        return i == 0 ? this.b - m15182453343201701699.b : i;
    }
}
