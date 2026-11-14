package dev.epro.r0;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M665231115116566295 extends L17338558938414325155 implements F5641334525175164863, RandomAccess, Serializable {
    public final Enum[] a;

    public M665231115116566295(Enum[] enumArr) {
        enumArr.getClass();
        this.a = enumArr;
    }

    @Override // dev.epro.r0.U2917286957277769200
    public final int a() {
        return this.a.length;
    }

    @Override // dev.epro.r0.U2917286957277769200, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) O5378677881740157249.I0(r3.ordinal(), this.a)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        W4415201450379021245.a(E12098517352909843120.l("index: ", i, length, ", size: "));
        return null;
    }

    @Override // dev.epro.r0.L17338558938414325155, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) O5378677881740157249.I0(iOrdinal, this.a)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // dev.epro.r0.L17338558938414325155, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) O5378677881740157249.I0(iOrdinal, this.a)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
