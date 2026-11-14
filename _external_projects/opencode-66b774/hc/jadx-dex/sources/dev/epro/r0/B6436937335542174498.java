package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B6436937335542174498 extends dev.epro.r0.A1090523267393268132 {
    public final /* synthetic */ java.lang.reflect.Method b;
    public final /* synthetic */ int c;

    public B6436937335542174498(int i, java.lang.reflect.Method method) {
        this.b = method;
        this.c = i;
    }

    @Override // dev.epro.r0.A1090523267393268132
    public final java.lang.Object a(java.lang.Class cls) {
        java.lang.String strB = dev.epro.r0.S790996689653940400.b(cls);
        if (strB != null) {
            throw new java.lang.AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strB));
        }
        return this.b.invoke(null, cls, java.lang.Integer.valueOf(this.c));
    }
}
