package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R6694982557896913324 implements Comparable {
    public static final R6694982557896913324 b;
    public static final R6694982557896913324 c;
    public static final R6694982557896913324 d;
    public static final R6694982557896913324 e;
    public static final R6694982557896913324 f;
    public final int a;

    static {
        R6694982557896913324 r6694982557896913324 = new R6694982557896913324(100);
        R6694982557896913324 r66949825578969133242 = new R6694982557896913324(200);
        R6694982557896913324 r66949825578969133243 = new R6694982557896913324(300);
        R6694982557896913324 r66949825578969133244 = new R6694982557896913324(400);
        R6694982557896913324 r66949825578969133245 = new R6694982557896913324(500);
        R6694982557896913324 r66949825578969133246 = new R6694982557896913324(600);
        b = r66949825578969133246;
        R6694982557896913324 r66949825578969133247 = new R6694982557896913324(700);
        R6694982557896913324 r66949825578969133248 = new R6694982557896913324(800);
        R6694982557896913324 r66949825578969133249 = new R6694982557896913324(900);
        c = r66949825578969133244;
        d = r66949825578969133245;
        e = r66949825578969133246;
        f = r66949825578969133247;
        K5751602218013079365.V(r6694982557896913324, r66949825578969133242, r66949825578969133243, r66949825578969133244, r66949825578969133245, r66949825578969133246, r66949825578969133247, r66949825578969133248, r66949825578969133249);
    }

    public R6694982557896913324(int i) {
        this.a = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        T12055643479535528558.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return S10823041268949770285.z(this.a, ((R6694982557896913324) obj).a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof R6694982557896913324) {
            return this.a == ((R6694982557896913324) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return G6547577305291411977.o(this.a, "FontWeight(weight=", ")");
    }
}
