package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfgj<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zzmmj;

    public zzfgj(Iterator<Map.Entry<K, Object>> it) {
        this.zzmmj = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzmmj.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.zzmmj.next();
        return next.getValue() instanceof zzfgg ? new zzfgi(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzmmj.remove();
    }
}
