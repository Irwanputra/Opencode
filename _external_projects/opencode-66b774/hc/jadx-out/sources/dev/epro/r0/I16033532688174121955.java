package dev.epro.r0;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I16033532688174121955 {
    public final N12971976141354546695 a;
    public final H2331361512828203859 b;
    public final E874292296621450842 c;
    public final C236413207748491238 d;
    public final boolean e;
    public final Map f;

    public /* synthetic */ I16033532688174121955(N12971976141354546695 n12971976141354546695, H2331361512828203859 h2331361512828203859, E874292296621450842 e874292296621450842, C236413207748491238 c236413207748491238, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : n12971976141354546695, (i & 2) != 0 ? null : h2331361512828203859, (i & 4) != 0 ? null : e874292296621450842, (i & 8) != 0 ? null : c236413207748491238, (i & 32) == 0, (i & 64) != 0 ? X9852054718446117252.a : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I16033532688174121955)) {
            return false;
        }
        I16033532688174121955 i16033532688174121955 = (I16033532688174121955) obj;
        return S10823041268949770285.t(this.a, i16033532688174121955.a) && S10823041268949770285.t(this.b, i16033532688174121955.b) && S10823041268949770285.t(this.c, i16033532688174121955.c) && S10823041268949770285.t(this.d, i16033532688174121955.d) && this.e == i16033532688174121955.e && S10823041268949770285.t(this.f, i16033532688174121955.f);
    }

    public final int hashCode() {
        N12971976141354546695 n12971976141354546695 = this.a;
        int iHashCode = (n12971976141354546695 == null ? 0 : n12971976141354546695.hashCode()) * 31;
        H2331361512828203859 h2331361512828203859 = this.b;
        int iHashCode2 = (iHashCode + (h2331361512828203859 == null ? 0 : h2331361512828203859.hashCode())) * 31;
        E874292296621450842 e874292296621450842 = this.c;
        int iHashCode3 = (iHashCode2 + (e874292296621450842 == null ? 0 : e874292296621450842.hashCode())) * 31;
        C236413207748491238 c236413207748491238 = this.d;
        return this.f.hashCode() + G6547577305291411977.i((iHashCode3 + (c236413207748491238 != null ? c236413207748491238.hashCode() : 0)) * 961, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ")";
    }

    public I16033532688174121955(N12971976141354546695 n12971976141354546695, H2331361512828203859 h2331361512828203859, E874292296621450842 e874292296621450842, C236413207748491238 c236413207748491238, boolean z, Map map) {
        this.a = n12971976141354546695;
        this.b = h2331361512828203859;
        this.c = e874292296621450842;
        this.d = c236413207748491238;
        this.e = z;
        this.f = map;
    }
}
