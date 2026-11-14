package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G289902487923560982 extends U1864172318023436692 {
    public final Object e;
    public boolean f;

    public G289902487923560982(Object obj) {
        super((byte) 4);
        this.e = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f;
    }

    @Override // dev.epro.r0.U1864172318023436692, java.util.Iterator
    public final Object next() {
        if (this.f) {
            Z3383101362411723454.u();
            return null;
        }
        this.f = true;
        return this.e;
    }
}
