package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O7746079100106269105 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ X8133657484919231199 f;

    public O7746079100106269105(X8133657484919231199 x8133657484919231199, List list) {
        this.f = x8133657484919231199;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            Y16081827717826519461.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
