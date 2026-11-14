package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E4662066703278899418 {
    public static final java.util.Comparator[] a;
    public static final dev.epro.r0.R15397193384711361242 b;

    static {
        java.util.Comparator[] comparatorArr = new java.util.Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new dev.epro.r0.X16708831732427990575(new dev.epro.r0.X16708831732427990575(i == 0 ? dev.epro.r0.J10770752472956524045.f : dev.epro.r0.J10770752472956524045.d, (byte) 2), (byte) 3);
            i++;
        }
        a = comparatorArr;
        b = new dev.epro.r0.R15397193384711361242((byte) 14);
    }

    public static final void a(dev.epro.r0.R6653624393204003746 r6653624393204003746, java.util.ArrayList arrayList, dev.epro.r0.A6662317080022852970 a6662317080022852970, dev.epro.r0.A6662317080022852970 a66623170800228529702, dev.epro.r0.Q9908018528090167751 q9908018528090167751) {
        dev.epro.r0.E10198359844879945462 e10198359844879945462 = r6653624393204003746.d;
        java.lang.Object objG = e10198359844879945462.a.g(dev.epro.r0.D10671166500636893138.n);
        if (objG == null) {
            objG = java.lang.Boolean.FALSE;
        }
        boolean zBooleanValue = ((java.lang.Boolean) objG).booleanValue();
        if ((zBooleanValue || ((java.lang.Boolean) a66623170800228529702.invoke(r6653624393204003746)).booleanValue()) && ((java.lang.Boolean) a6662317080022852970.invoke(r6653624393204003746)).booleanValue()) {
            arrayList.add(r6653624393204003746);
        }
        if (zBooleanValue) {
            q9908018528090167751.i(r6653624393204003746.f, b(r6653624393204003746, a6662317080022852970, a66623170800228529702, dev.epro.r0.R6653624393204003746.j(7, r6653624393204003746)));
            return;
        }
        java.util.List listJ = dev.epro.r0.R6653624393204003746.j(7, r6653624393204003746);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((dev.epro.r0.R6653624393204003746) listJ.get(i), arrayList, a6662317080022852970, a66623170800228529702, q9908018528090167751);
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
