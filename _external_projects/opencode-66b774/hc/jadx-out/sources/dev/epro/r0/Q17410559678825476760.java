package dev.epro.r0;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q17410559678825476760 extends V6719956433280724295 {
    public final String a;
    public final D14731132657808549702 b;

    public Q17410559678825476760(String str, D14731132657808549702 d14731132657808549702) {
        this.a = str;
        this.b = d14731132657808549702;
    }

    @Override // dev.epro.r0.T5990920249823963282
    public final boolean a() {
        return this.b != D14731132657808549702.V;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Q17410559678825476760) {
            Q17410559678825476760 q17410559678825476760 = (Q17410559678825476760) obj;
            return q17410559678825476760.a.equals(this.a) && q17410559678825476760.b == this.b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Q17410559678825476760.class, this.a, this.b);
    }

    public final String toString() {
        return E12098517352909843120.m("LegacyKmsAead Parameters (keyUri: ", this.a, ", variant: ", String.valueOf(this.b), ")");
    }
}
