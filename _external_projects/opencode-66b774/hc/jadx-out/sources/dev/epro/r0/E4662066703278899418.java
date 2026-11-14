package dev.epro.r0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class E4662066703278899418 {
    public static final Comparator[] a;
    public static final R15397193384711361242 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new X16708831732427990575(new X16708831732427990575(i == 0 ? J10770752472956524045.f : J10770752472956524045.d, (byte) 2), (byte) 3);
            i++;
        }
        a = comparatorArr;
        b = new R15397193384711361242((byte) 14);
    }

    public static final void a(R6653624393204003746 r6653624393204003746, ArrayList arrayList, A6662317080022852970 a6662317080022852970, A6662317080022852970 a66623170800228529702, Q9908018528090167751 q9908018528090167751) {
        E10198359844879945462 e10198359844879945462 = r6653624393204003746.d;
        Object objG = e10198359844879945462.a.g(D10671166500636893138.n);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) a66623170800228529702.invoke(r6653624393204003746)).booleanValue()) && ((Boolean) a6662317080022852970.invoke(r6653624393204003746)).booleanValue()) {
            arrayList.add(r6653624393204003746);
        }
        if (zBooleanValue) {
            q9908018528090167751.i(r6653624393204003746.f, b(r6653624393204003746, a6662317080022852970, a66623170800228529702, r6653624393204003746.i((4 & 1) != 0 ? !r6653624393204003746.b : false, (4 & 2) == 0)));
            return;
        }
        List listI = r6653624393204003746.i((4 & 1) != 0 ? !r6653624393204003746.b : false, (4 & 2) == 0);
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            a((R6653624393204003746) listI.get(i), arrayList, a6662317080022852970, a66623170800228529702, q9908018528090167751);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(dev.epro.r0.R6653624393204003746 r17, dev.epro.r0.A6662317080022852970 r18, dev.epro.r0.A6662317080022852970 r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E4662066703278899418.b(dev.epro.r0.R6653624393204003746, dev.epro.r0.A6662317080022852970, dev.epro.r0.A6662317080022852970, java.util.List):java.util.ArrayList");
    }
}
