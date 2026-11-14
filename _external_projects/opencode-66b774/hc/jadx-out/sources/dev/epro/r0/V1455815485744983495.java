package dev.epro.r0;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V1455815485744983495 {
    public final T14597605096299173136 a;
    public final Y16631409940158714280 b;
    public final Y16631409940158714280 c;
    public final byte[] d;
    public final int e;

    public V1455815485744983495(T14597605096299173136 t14597605096299173136, Y16631409940158714280 y16631409940158714280, Y16631409940158714280 y166314099401587142802, byte[] bArr, int i) {
        this.a = t14597605096299173136;
        this.b = y16631409940158714280;
        this.c = y166314099401587142802;
        this.d = bArr;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V1455815485744983495)) {
            return false;
        }
        V1455815485744983495 v1455815485744983495 = (V1455815485744983495) obj;
        return this.a.equals(v1455815485744983495.a) && this.b == v1455815485744983495.b && this.c == v1455815485744983495.c && Arrays.equals(this.d, v1455815485744983495.d) && this.e == v1455815485744983495.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + (Objects.hash(this.a, this.b, this.c, Integer.valueOf(this.e)) * 31);
    }
}
