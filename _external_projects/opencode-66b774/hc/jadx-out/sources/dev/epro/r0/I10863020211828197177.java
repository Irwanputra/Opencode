package dev.epro.r0;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I10863020211828197177 extends U1864172318023436692 {
    public final U1864172318023436692 e;
    public Object f;
    public U1864172318023436692 g;

    public I10863020211828197177(S14617281980864379711 s14617281980864379711) {
        super((byte) 0);
        this.e = s14617281980864379711.a.entrySet().iterator();
        this.f = null;
        this.g = X3089982936645672503.h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g.hasNext() || this.e.hasNext();
    }

    @Override // dev.epro.r0.U1864172318023436692, java.util.Iterator
    public final Object next() {
        if (!this.g.hasNext()) {
            Map.Entry entry = (Map.Entry) this.e.next();
            this.f = entry.getKey();
            this.g = ((H9330595680939527366) entry.getValue()).iterator();
        }
        Object obj = this.f;
        Objects.requireNonNull(obj);
        return new W7303226976718824919(obj, this.g.next());
    }
}
