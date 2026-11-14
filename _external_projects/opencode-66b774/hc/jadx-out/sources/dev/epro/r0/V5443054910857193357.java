package dev.epro.r0;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V5443054910857193357 extends T5990920249823963282 {
    public final I1632105416032993715 a;

    public V5443054910857193357(I1632105416032993715 i1632105416032993715) {
        this.a = i1632105416032993715;
    }

    @Override // dev.epro.r0.T5990920249823963282
    public final boolean a() {
        return !(((D14731132657808549702) this.a.d) == D14731132657808549702.m0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof V5443054910857193357) {
            I1632105416032993715 i1632105416032993715 = ((V5443054910857193357) obj).a;
            I1632105416032993715 i16321054160329937152 = this.a;
            if (((D14731132657808549702) i16321054160329937152.d) == ((D14731132657808549702) i1632105416032993715.d) && ((String) i16321054160329937152.c).equals((String) i1632105416032993715.c) && ((N17666688112968464504) i16321054160329937152.b).equals((N17666688112968464504) i1632105416032993715.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        I1632105416032993715 i1632105416032993715 = this.a;
        return Objects.hash((String) i1632105416032993715.c, (N17666688112968464504) i1632105416032993715.b, (D14731132657808549702) i1632105416032993715.d);
    }

    public final String toString() {
        I1632105416032993715 i1632105416032993715 = this.a;
        return "(typeUrl=" + ((String) i1632105416032993715.c) + ", outputPrefixType=" + ((D14731132657808549702) i1632105416032993715.d) + ")";
    }
}
