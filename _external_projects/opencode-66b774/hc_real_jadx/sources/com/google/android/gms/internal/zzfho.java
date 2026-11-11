package com.google.android.gms.internal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfho<E> extends zzfeo<E> {
    private static final zzfho<Object> zzpje;
    private final List<E> zzpjf;

    static {
        zzfho<Object> zzfhoVar = new zzfho<>();
        zzpje = zzfhoVar;
        zzfhoVar.zzbiy();
    }

    public zzfho() {
        this(new ArrayList(10));
    }

    private zzfho(List<E> list) {
        this.zzpjf = list;
    }

    public static <E> zzfho<E> zzcza() {
        return (zzfho<E>) zzpje;
    }

    @Override // com.google.android.gms.internal.zzfeo, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        zzcvj();
        this.zzpjf.add(i, e);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        return this.zzpjf.get(i);
    }

    @Override // com.google.android.gms.internal.zzfeo, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        zzcvj();
        E remove = this.zzpjf.remove(i);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // com.google.android.gms.internal.zzfeo, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zzcvj();
        E e2 = this.zzpjf.set(i, e);
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzpjf.size();
    }

    @Override // com.google.android.gms.internal.zzfgd
    public final /* synthetic */ zzfgd zzly(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzpjf);
        return new zzfho(arrayList);
    }
}
