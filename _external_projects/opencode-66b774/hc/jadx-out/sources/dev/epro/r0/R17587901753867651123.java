package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R17587901753867651123 {
    public final String a;
    public final S8977162183056139880 b;

    public R17587901753867651123(String str, S8977162183056139880 s8977162183056139880) {
        this.a = str;
        this.b = s8977162183056139880;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R17587901753867651123)) {
            return false;
        }
        R17587901753867651123 r17587901753867651123 = (R17587901753867651123) obj;
        return S10823041268949770285.t(this.a, r17587901753867651123.a) && S10823041268949770285.t(this.b, r17587901753867651123.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        S8977162183056139880 s8977162183056139880 = this.b;
        return iHashCode + (s8977162183056139880 != null ? s8977162183056139880.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ")";
    }
}
