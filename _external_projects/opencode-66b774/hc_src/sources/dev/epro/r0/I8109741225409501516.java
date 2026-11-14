package dev.epro.r0;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I8109741225409501516 extends N7756202525712935399 {
    public final /* synthetic */ B18372450834991815898 c;

    public I8109741225409501516(B18372450834991815898 b18372450834991815898) {
        this.c = b18372450834991815898;
    }

    @Override // java.util.List
    public final Object get(int i) {
        B18372450834991815898 b18372450834991815898 = this.c;
        U15853425786981391261.w(i, b18372450834991815898.f);
        Object[] objArr = b18372450834991815898.e;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
