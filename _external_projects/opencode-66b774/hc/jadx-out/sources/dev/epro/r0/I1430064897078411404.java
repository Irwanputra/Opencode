package dev.epro.r0;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I1430064897078411404 extends C12135989508407940960 {
    public static final I1430064897078411404 g = new I1430064897078411404(new Object[0]);
    public final transient Object[] f;

    public I1430064897078411404(Object[] objArr) {
        super((byte) 0);
        this.f = objArr;
    }

    @Override // dev.epro.r0.C12135989508407940960, dev.epro.r0.G10942763614670705019
    public final int a(Object[] objArr) {
        System.arraycopy(this.f, 0, objArr, 0, 0);
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        E2166724654553415323.d(i, 0);
        Object obj = this.f[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final Object[] i() {
        return this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
