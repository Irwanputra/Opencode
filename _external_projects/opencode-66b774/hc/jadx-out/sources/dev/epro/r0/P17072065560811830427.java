package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class P17072065560811830427 {
    public final F16470721565862751885 a;
    public final F16470721565862751885 b;

    public P17072065560811830427(F16470721565862751885 f16470721565862751885, F16470721565862751885 f164707215658627518852) {
        this.a = f16470721565862751885;
        this.b = f164707215658627518852;
    }

    public String a() {
        return "";
    }

    public int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof P17072065560811830427) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        return "<" + getClass().getName() + "(" + a() + ")>";
    }
}
