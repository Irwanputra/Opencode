package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U4180701753337592613 extends U1864172318023436692 {
    public boolean e;
    public final /* synthetic */ Object f;

    public U4180701753337592613(Object obj) {
        super((byte) 0);
        this.f = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.e;
    }

    @Override // dev.epro.r0.U1864172318023436692, java.util.Iterator
    public final Object next() {
        if (this.e) {
            Z3383101362411723454.u();
            return null;
        }
        this.e = true;
        return this.f;
    }
}
