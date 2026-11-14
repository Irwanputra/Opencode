package dev.epro.r0;

import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class L3120623210002840329 extends N3901745123707141715 {
    public final /* synthetic */ S8093187219740136623 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L3120623210002840329(S8093187219740136623 s8093187219740136623, M17133811648581684718 m17133811648581684718) {
        super(m17133811648581684718);
        Objects.requireNonNull(s8093187219740136623);
        this.b = s8093187219740136623;
    }

    @Override // dev.epro.r0.N3901745123707141715
    public final void a(Exception exc) {
        if (!(exc instanceof P16878392633646159868)) {
            super.a(exc);
        } else if (S8093187219740136623.d(this.b)) {
            super.a(new L1893317219943000644(-2, exc));
        } else {
            super.a(new L1893317219943000644(-9, exc));
        }
    }
}
