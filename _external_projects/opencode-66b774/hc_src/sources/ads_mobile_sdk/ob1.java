package ads_mobile_sdk;

import dev.epro.r0.B4259731004323267459;
import dev.epro.r0.R17185427375111049466;
import java.util.AbstractList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ob1 extends AbstractList {
    public final R17185427375111049466 a;
    public final B4259731004323267459 b;

    public ob1(R17185427375111049466 r17185427375111049466, B4259731004323267459 b4259731004323267459) {
        this.a = r17185427375111049466;
        this.b = b4259731004323267459;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        jb1 jb1Var = (jb1) this.a;
        jb1Var.d(i);
        return this.b.a(jb1Var.b[i]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((jb1) this.a).c;
    }
}
