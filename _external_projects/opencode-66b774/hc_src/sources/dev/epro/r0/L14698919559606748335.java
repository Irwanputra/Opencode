package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L14698919559606748335 implements M7586588299491030525, Iterable, D14639766352081121636 {
    public final E1092155023341394263 a;
    public final int b;
    public final G2452485859731482384 c;

    public L14698919559606748335(E1092155023341394263 e1092155023341394263, int i, D9991952169288007667 d9991952169288007667, G2452485859731482384 g2452485859731482384) {
        this.a = e1092155023341394263;
        this.b = i;
        this.c = g2452485859731482384;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof L14698919559606748335)) {
            return false;
        }
        L14698919559606748335 l14698919559606748335 = (L14698919559606748335) obj;
        return l14698919559606748335.b == this.b && l14698919559606748335.a == this.a && l14698919559606748335.c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.a.hashCode() + (this.b * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new Z7205542042390363600(this.a, this.b, null, this.c);
    }
}
