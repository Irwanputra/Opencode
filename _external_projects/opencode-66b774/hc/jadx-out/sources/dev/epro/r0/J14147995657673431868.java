package dev.epro.r0;

import ads_mobile_sdk.pd;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class J14147995657673431868 {
    public static final Z11244019023321623390 g;
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;

    static {
        int iVbgdjkhuiczm;
        izmyclvb.dpqpjfpoanwt1(pd.U0);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iVbgdjkhuiczm = vbgdjkhuiczm(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iVbgdjkhuiczm != 0) {
                switch (iVbgdjkhuiczm) {
                    case 1:
                        g = (Z11244019023321623390) objArr[1];
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
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    public /* synthetic */ J14147995657673431868(String str, String str2, boolean z, String str3, String str4, boolean z2, int i, O18369580107802500074 o18369580107802500074) {
        Object[] objArrZrdykrjsbtwk = zrdykrjsbtwk(str, str2, z, str3, str4, z2, i, o18369580107802500074);
        this((String) objArrZrdykrjsbtwk[0], (String) objArrZrdykrjsbtwk[1], ((Integer) objArrZrdykrjsbtwk[2]).intValue(), (String) objArrZrdykrjsbtwk[3], (String) objArrZrdykrjsbtwk[4], ((Integer) objArrZrdykrjsbtwk[5]).intValue());
        oigdppxdurqm();
    }

    private native void oigdppxdurqm();

    private static native int vbgdjkhuiczm(Object[] objArr);

    private native void xjeerednefdb(String str, String str2, boolean z, String str3, String str4, boolean z2);

    private static native Object[] zrdykrjsbtwk(String str, String str2, boolean z, String str3, String str4, boolean z2, int i, O18369580107802500074 o18369580107802500074);

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(2270);
        }

        public static native void a(String str);

        public static native J14147995657673431868 b(JSONObject jSONObject);

        public static native J14147995657673431868 c(JSONObject jSONObject);

        private native void qiwhhvhhvabb(O18369580107802500074 o18369580107802500074);

        private native void zonxuvarwkdb();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            qiwhhvhhvabb(o18369580107802500074);
        }

        private Z11244019023321623390() {
            zonxuvarwkdb();
        }
    }

    public J14147995657673431868(String str, String str2, boolean z, String str3, String str4, boolean z2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        xjeerednefdb(str, str2, z, str3, str4, z2);
    }
}
