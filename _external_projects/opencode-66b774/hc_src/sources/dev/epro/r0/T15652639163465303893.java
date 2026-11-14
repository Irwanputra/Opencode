package dev.epro.r0;

import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T15652639163465303893 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final Q9908018528090167751 e;
    public final O12494175665883759871 f;

    public T15652639163465303893(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            L4738636499147270068.a("Invalid start index");
        }
        this.d = new ArrayList();
        Q9908018528090167751 q9908018528090167751 = new Q9908018528090167751();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            G815828180435804960 g815828180435804960 = (G815828180435804960) this.a.get(i3);
            int i4 = g815828180435804960.c;
            int i5 = g815828180435804960.d;
            q9908018528090167751.i(i4, new D12992807287603020916(i3, i2, i5));
            i2 += i5;
        }
        this.e = q9908018528090167751;
        this.f = new O12494175665883759871(new O3121908666496922193(this, (byte) 1));
    }

    public final boolean a(int i, int i2) {
        D12992807287603020916 d12992807287603020916;
        int i3;
        int i4;
        Q9908018528090167751 q9908018528090167751 = this.e;
        D12992807287603020916 d129928072876030209162 = (D12992807287603020916) q9908018528090167751.b(i);
        if (d129928072876030209162 == null) {
            return false;
        }
        int i5 = d129928072876030209162.b;
        int i6 = i2 - d129928072876030209162.c;
        d129928072876030209162.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = q9908018528090167751.c;
        long[] jArr = q9908018528090167751.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (d12992807287603020916 = (D12992807287603020916) objArr[(i7 << 3) + i9]).b) >= i5 && d12992807287603020916 != d129928072876030209162 && (i4 = i3 + i6) >= 0) {
                        d12992807287603020916.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
