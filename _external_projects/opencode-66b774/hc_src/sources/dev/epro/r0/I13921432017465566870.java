package dev.epro.r0;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class I13921432017465566870 {
    public static final Z11244019023321623390 d;
    public final boolean a;
    public final Map b;
    public final List c;

    static {
        int fvmdckatusca;
        izmyclvb.dpqpjfpoanwt1(326);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                fvmdckatusca = fvmdckatusca(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (fvmdckatusca != 0) {
                switch (fvmdckatusca) {
                    case 1:
                        d = (Z11244019023321623390) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ I13921432017465566870(boolean r18, java.util.Map r19, java.util.List r20, int r21, dev.epro.r0.O18369580107802500074 r22) {
        /*
            r17 = this;
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r4
            java.lang.Object[] r0 = zdyqvppdoxgi(r18, r19, r20, r21, r22)
            r1 = 0
            r2 = r0[r1]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r5 = r2
            r1 = 1
            r2 = r0[r1]
            java.util.Map r2 = (java.util.Map) r2
            r6 = r2
            r1 = 2
            r2 = r0[r1]
            java.util.List r2 = (java.util.List) r2
            r7 = r2
            r4 = r10
            r11 = r4
            r12 = r5
            r13 = r6
            r14 = r7
            r11.<init>(r12, r13, r14)
            r11 = r4
            r11.pscjequulfaj1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I13921432017465566870.<init>(boolean, java.util.Map, java.util.List, int, dev.epro.r0.O18369580107802500074):void");
    }

    private native void fndcijzunsjm(boolean z, Map<J17212163343241671962, P10423701687056397566> map, List<B10102034111097409077> list);

    private static native int fvmdckatusca(Object[] objArr);

    private native void pscjequulfaj();

    private native void pscjequulfaj1();

    private static native Object[] zdyqvppdoxgi(boolean z, Map map, List list, int i, O18369580107802500074 o18369580107802500074);

    public final native String a();

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(2107);
        }

        public static native I13921432017465566870 a(String str);

        public static native List b(JSONArray jSONArray);

        public static native Map c(JSONObject jSONObject);

        private native void eiyvckzopyed(O18369580107802500074 o18369580107802500074);

        private native void jgbdnheudyxv();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            eiyvckzopyed(o18369580107802500074);
        }

        private Z11244019023321623390() {
            jgbdnheudyxv();
        }
    }

    public I13921432017465566870(boolean z, Map<J17212163343241671962, P10423701687056397566> map, List<B10102034111097409077> list) {
        map.getClass();
        list.getClass();
        fndcijzunsjm(z, map, list);
    }

    public I13921432017465566870() {
        this(false, null, null, 7, null);
        pscjequulfaj();
    }
}
