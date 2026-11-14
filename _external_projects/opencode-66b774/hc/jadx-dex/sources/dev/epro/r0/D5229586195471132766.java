package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D5229586195471132766 {
    public final dev.epro.r0.U15597528598182133107[] a;
    public final java.lang.String b;
    public final byte[] c;
    public final boolean d;

    public D5229586195471132766(byte[] bArr, dev.epro.r0.U15597528598182133107[] u15597528598182133107Arr) {
        java.util.Objects.requireNonNull(bArr);
        this.c = bArr;
        this.b = null;
        this.a = u15597528598182133107Arr;
        this.d = true;
    }

    public final void a(int i) {
        boolean z = this.d;
        if (i == z) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong data accessor type detected. ");
        sb.append(z ? !z ? "Unknown" : "ArrayBuffer" : "String");
        sb.append(" expected, but got ");
        sb.append(i != 0 ? i != 1 ? "Unknown" : "ArrayBuffer" : "String");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public D5229586195471132766(java.lang.String str, dev.epro.r0.U15597528598182133107[] u15597528598182133107Arr) {
        this.b = str;
        this.c = null;
        this.a = u15597528598182133107Arr;
        this.d = false;
    }
}
