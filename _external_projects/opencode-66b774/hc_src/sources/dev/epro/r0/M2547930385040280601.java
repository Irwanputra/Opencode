package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M2547930385040280601 extends B18437066071346442440 implements T10320069907180517450 {
    @Override // dev.epro.r0.T10320069907180517450
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.h;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.i + ((int) ((o() + this.k) - this.i))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void v(int i) {
        synchronized (this) {
            Object[] objArr = this.h;
            objArr.getClass();
            h(Integer.valueOf(((Number) objArr[((int) ((this.i + ((int) ((o() + this.k) - this.i))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
