package dev.epro.r0;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class I13921432017465566870 {
    public static final Z11244019023321623390 d;
    public final boolean a;
    public final Map b;
    public final List c;

    static {
        int iFvmdckatusca;
        izmyclvb.dpqpjfpoanwt1(326);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iFvmdckatusca = fvmdckatusca(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iFvmdckatusca != 0) {
                switch (iFvmdckatusca) {
                    case 1:
                        d = (Z11244019023321623390) objArr[1];
                        break;
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
    public /* synthetic */ I13921432017465566870(boolean z, Map map, List list, int i, O18369580107802500074 o18369580107802500074) {
        Object[] objArrZdyqvppdoxgi = zdyqvppdoxgi(z, map, list, i, o18369580107802500074);
        this(((Integer) objArrZdyqvppdoxgi[0]).intValue(), (Map) objArrZdyqvppdoxgi[1], (List) objArrZdyqvppdoxgi[2]);
        pscjequulfaj1();
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
