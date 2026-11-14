package dev.epro.r0;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class A10473301933203002473 implements Iterable, Serializable {
    public static final A10473301933203002473 c = new A10473301933203002473(W16701142256148280421.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i = U9214787009581580404.a;
    }

    public A10473301933203002473(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static void k(int i) {
        if (((i - 47) | 47) >= 0) {
            return;
        }
        W4415201450379021245.a(G6547577305291411977.n(i, "End index: 47 >= "));
    }

    public byte b(int i) {
        return this.b[i];
    }

    public byte c(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A10473301933203002473)) {
            return false;
        }
        A10473301933203002473 a10473301933203002473 = (A10473301933203002473) obj;
        int i = i();
        if (i != a10473301933203002473.i()) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int i2 = this.a;
        int i3 = a10473301933203002473.a;
        if (i2 == 0 || i3 == 0 || i2 == i3) {
            return j(a10473301933203002473);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int i2 = i();
        int i3 = i2;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + this.b[i4];
        }
        if (i3 == 0) {
            i3 = 1;
        }
        this.a = i3;
        return i3;
    }

    public int i() {
        return this.b.length;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new E6859840916608331672(this);
    }

    public final boolean j(A10473301933203002473 a10473301933203002473) {
        if (!(a10473301933203002473 instanceof A10473301933203002473)) {
            return a10473301933203002473.j(this);
        }
        int i = i();
        if (i > a10473301933203002473.i()) {
            Z3383101362411723454.h(i, i());
            return false;
        }
        if (i > a10473301933203002473.i()) {
            S10973172697741180971.j(E12098517352909843120.l("Ran off end of other: 0, ", i, a10473301933203002473.i(), ", "));
            return false;
        }
        byte[] bArr = a10473301933203002473.b;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            if (this.b[i2] != bArr[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int i = i();
        if (i() <= 50) {
            strConcat = L12240044716294895599.q(this);
        } else {
            k(i());
            byte[] bArr = this.b;
            J12743056621057876892 j12743056621057876892 = new J12743056621057876892(bArr);
            k(bArr.length);
            strConcat = L12240044716294895599.q(j12743056621057876892).concat("...");
        }
        return G6547577305291411977.u(G6547577305291411977.x(i, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
    }
}
