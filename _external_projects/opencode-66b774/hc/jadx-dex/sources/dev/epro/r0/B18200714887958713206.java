package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B18200714887958713206 implements java.util.Iterator, dev.epro.r0.D14639766352081121636 {
    public final int a;
    public boolean b;
    public int c;

    public B18200714887958713206(char c, char c2) {
        this.a = c2;
        boolean z = c <= c2;
        this.b = z;
        this.c = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.c;
        if (i != this.a) {
            this.c = i + 1;
        } else {
            if (!this.b) {
                dev.epro.r0.Z3383101362411723454.u();
                return null;
            }
            this.b = false;
        }
        return java.lang.Character.valueOf((char) i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
