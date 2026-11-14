package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class M13667432028435073202 extends W10169912733213502968 {
    public final String d;
    public final boolean e;
    public final M11321907364395208344 f;

    public M13667432028435073202(String str, String str2, boolean z, F16470721565862751885 f16470721565862751885, F16470721565862751885 f164707215658627518852, M11321907364395208344 m11321907364395208344) {
        super(str, f16470721565862751885, f164707215658627518852);
        this.d = str2;
        this.e = z;
        this.f = m11321907364395208344;
    }

    @Override // dev.epro.r0.W10169912733213502968, dev.epro.r0.P17072065560811830427
    public final String a() {
        return super.a() + ", tag=" + this.d + ", implicit=" + this.e;
    }
}
