package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class M18082356575916498704 extends N17666688112968464504 {
    public final byte[] d;

    public M18082356575916498704(byte[] bArr) {
        this.a = 0;
        bArr.getClass();
        this.d = bArr;
    }

    @Override // dev.epro.r0.N17666688112968464504
    public byte b(int i) {
        return this.d[i];
    }

    @Override // dev.epro.r0.N17666688112968464504
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof N17666688112968464504) && size() == ((N17666688112968464504) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof M18082356575916498704)) {
                return obj.equals(this);
            }
            M18082356575916498704 m18082356575916498704 = (M18082356575916498704) obj;
            int i = this.a;
            int i2 = m18082356575916498704.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > m18082356575916498704.size()) {
                    Z3383101362411723454.h(size, size());
                    return false;
                }
                if (size > m18082356575916498704.size()) {
                    S10973172697741180971.j(E12098517352909843120.l("Ran off end of other: 0, ", size, m18082356575916498704.size(), ", "));
                    return false;
                }
                byte[] bArr = m18082356575916498704.d;
                int iL = l() + size;
                int iL2 = l();
                int iL3 = m18082356575916498704.l();
                while (iL2 < iL) {
                    if (this.d[iL2] == bArr[iL3]) {
                        iL2++;
                        iL3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new E6859840916608331672(this);
    }

    @Override // dev.epro.r0.N17666688112968464504
    public void j(int i, byte[] bArr) {
        System.arraycopy(this.d, 0, bArr, 0, i);
    }

    public int l() {
        return 0;
    }

    public byte m(int i) {
        return this.d[i];
    }

    @Override // dev.epro.r0.N17666688112968464504
    public int size() {
        return this.d.length;
    }
}
