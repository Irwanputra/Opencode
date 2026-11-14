package ads_mobile_sdk;

import dev.epro.r0.C468629748621011703;
import dev.epro.r0.K14765462210213530574;
import dev.epro.r0.S10973172697741180971;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Optional;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ju3 {
    public final ArrayDeque a;

    public ju3(byte b) {
        switch (b) {
            case 1:
                this.a = new ArrayDeque();
                break;
            default:
                int[] iArr = {114723506, 151129280, 1368781114, 134385090, 816173334, -1981646764, 34563124, 1737518944, 282828202};
                int i = iArr[7] % iArr[8];
                this.a = new ArrayDeque();
                break;
        }
    }

    public void a(sq sqVar) {
        if (!sqVar.b()) {
            if (!(sqVar instanceof pz2)) {
                S10973172697741180971.j("Has a new type of ByteString been created? Found ".concat(String.valueOf(sqVar.getClass())));
                return;
            }
            pz2 pz2Var = (pz2) sqVar;
            a(pz2Var.e);
            a(pz2Var.f);
            return;
        }
        int binarySearch = Arrays.binarySearch(pz2.i, sqVar.size());
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int c = pz2.c(binarySearch + 1);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty() || ((sq) arrayDeque.peek()).size() >= c) {
            arrayDeque.push(sqVar);
            return;
        }
        int c2 = pz2.c(binarySearch);
        sq sqVar2 = (sq) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((sq) arrayDeque.peek()).size() < c2) {
            sqVar2 = new pz2((sq) arrayDeque.pop(), sqVar2);
        }
        pz2 pz2Var2 = new pz2(sqVar2, sqVar);
        while (!arrayDeque.isEmpty()) {
            int binarySearch2 = Arrays.binarySearch(pz2.i, pz2Var2.d);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((sq) arrayDeque.peek()).size() >= pz2.c(binarySearch2 + 1)) {
                break;
            } else {
                pz2Var2 = new pz2((sq) arrayDeque.pop(), pz2Var2);
            }
        }
        arrayDeque.push(pz2Var2);
    }

    public gu3 a() {
        return (gu3) Optional.ofNullable((gu3) this.a.peek()).orElseThrow(fu3.b);
    }

    public void a(long j, long j2, long j3) {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int d = C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        gu3 gu3Var = new gu3(j, j2, j3);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.size() >= d) {
            throw new K14765462210213530574();
        }
        arrayDeque.push(gu3Var);
    }
}
