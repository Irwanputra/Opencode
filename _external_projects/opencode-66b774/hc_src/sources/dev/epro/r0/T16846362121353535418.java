package dev.epro.r0;

import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T16846362121353535418 extends V6719956433280724295 {
    public final D14731132657808549702 a;
    public final String b;
    public final D14731132657808549702 c;
    public final V6719956433280724295 d;

    public T16846362121353535418(D14731132657808549702 d14731132657808549702, String str, D14731132657808549702 d147311326578085497022, V6719956433280724295 v6719956433280724295) {
        this.a = d14731132657808549702;
        this.b = str;
        this.c = d147311326578085497022;
        this.d = v6719956433280724295;
    }

    @Override // dev.epro.r0.T5990920249823963282
    public final boolean a() {
        return this.a != D14731132657808549702.d0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T16846362121353535418) {
            T16846362121353535418 t16846362121353535418 = (T16846362121353535418) obj;
            return t16846362121353535418.c == this.c && t16846362121353535418.d.equals(this.d) && t16846362121353535418.b.equals(this.b) && t16846362121353535418.a == this.a;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(T16846362121353535418.class, this.b, this.c, this.d, this.a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        return G6547577305291411977.w(G6547577305291411977.y("LegacyKmsEnvelopeAead Parameters (kekUri: ", this.b, ", dekParsingStrategy: ", valueOf, ", dekParametersForNewKeys: "), String.valueOf(this.d), ", variant: ", String.valueOf(this.a), ")");
    }
}
