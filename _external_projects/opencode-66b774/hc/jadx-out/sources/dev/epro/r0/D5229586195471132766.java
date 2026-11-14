package dev.epro.r0;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D5229586195471132766 {
    public final U15597528598182133107[] a;
    public final String b;
    public final byte[] c;
    public final boolean d;

    public D5229586195471132766(byte[] bArr, U15597528598182133107[] u15597528598182133107Arr) {
        Objects.requireNonNull(bArr);
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
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        sb.append(z ? !z ? "Unknown" : "ArrayBuffer" : "String");
        sb.append(" expected, but got ");
        sb.append(i != 0 ? i != 1 ? "Unknown" : "ArrayBuffer" : "String");
        throw new IllegalStateException(sb.toString());
    }

    public D5229586195471132766(String str, U15597528598182133107[] u15597528598182133107Arr) {
        this.b = str;
        this.c = null;
        this.a = u15597528598182133107Arr;
        this.d = false;
    }
}
