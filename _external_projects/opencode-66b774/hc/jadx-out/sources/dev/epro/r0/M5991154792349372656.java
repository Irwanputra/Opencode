package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M5991154792349372656 {
    public final int a;
    public final Integer b;

    public M5991154792349372656(int i, B6030175592171028728 b6030175592171028728, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M5991154792349372656)) {
            return false;
        }
        M5991154792349372656 m5991154792349372656 = (M5991154792349372656) obj;
        return this.a == m5991154792349372656.a && S10823041268949770285.t(null, null) && S10823041268949770285.t(this.b, m5991154792349372656.b);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.a) * 31) + 0) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.b + ")";
    }
}
