package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D6481647950163785171 {
    public final java.lang.CharSequence a;
    public final long b;
    public final android.view.textclassifier.TextClassification c;
    public final java.util.ArrayList d;

    public D6481647950163785171(java.lang.CharSequence charSequence, long j, android.view.textclassifier.TextClassification textClassification, java.util.ArrayList arrayList) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.D6481647950163785171)) {
            return false;
        }
        dev.epro.r0.D6481647950163785171 d6481647950163785171 = (dev.epro.r0.D6481647950163785171) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, d6481647950163785171.a) && dev.epro.r0.F12478849263529740365.c(this.b, d6481647950163785171.b) && dev.epro.r0.S10823041268949770285.t(this.c, d6481647950163785171.c) && this.d.equals(d6481647950163785171.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = dev.epro.r0.F12478849263529740365.c;
        return this.d.hashCode() + ((dev.epro.r0.T15589241373902147015.a(this.c) + dev.epro.r0.G6547577305291411977.j(iHashCode, this.b, 31)) * 31);
    }

    public final java.lang.String toString() {
        return "TextClassificationResult(text=" + ((java.lang.Object) this.a) + ", selection=" + dev.epro.r0.F12478849263529740365.i(this.b) + ", textClassification=" + this.c + ", icons=" + this.d + ")";
    }
}
