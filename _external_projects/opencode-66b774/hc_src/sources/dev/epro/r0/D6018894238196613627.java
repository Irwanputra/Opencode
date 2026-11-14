package dev.epro.r0;

import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D6018894238196613627 {
    public final T14597605096299173136 a;
    public final Y16631409940158714280 b;
    public final Y16631409940158714280 c;
    public final byte[] d;
    public final int e;

    public D6018894238196613627(T14597605096299173136 t14597605096299173136, Y16631409940158714280 y16631409940158714280, Y16631409940158714280 y166314099401587142802, byte[] bArr, int i) {
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
        if (!(obj instanceof D6018894238196613627)) {
            return false;
        }
        D6018894238196613627 d6018894238196613627 = (D6018894238196613627) obj;
        return this.a.equals(d6018894238196613627.a) && this.b == d6018894238196613627.b && this.c == d6018894238196613627.c && Arrays.equals(this.d, d6018894238196613627.d) && this.e == d6018894238196613627.e;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 31) * 31;
        Y16631409940158714280 y16631409940158714280 = this.b;
        int hashCode2 = (hashCode + (y16631409940158714280 == null ? 0 : y16631409940158714280.hashCode())) * 31;
        Y16631409940158714280 y166314099401587142802 = this.c;
        return ((Arrays.hashCode(this.d) + ((hashCode2 + (y166314099401587142802 != null ? y166314099401587142802.hashCode() : 0)) * 31)) * 31) + this.e;
    }
}
