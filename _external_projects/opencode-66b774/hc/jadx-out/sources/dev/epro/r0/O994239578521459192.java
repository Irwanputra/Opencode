package dev.epro.r0;

import java.util.ArrayList;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class O994239578521459192 {
    public static final O994239578521459192 a;

    static {
        int iKputvsepanpo;
        izmyclvb.dpqpjfpoanwt1(816);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iKputvsepanpo = kputvsepanpo(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iKputvsepanpo != 0) {
                switch (iKputvsepanpo) {
                    case 1:
                        a = (O994239578521459192) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native String a(String str);

    public static native Object b(String str);

    public static native Integer c(String str, JSONObject jSONObject);

    public static native E5476434278640767445 d(JSONObject jSONObject);

    public static native ArrayList e(JSONArray jSONArray);

    public static native Object f(String str, F4096073349764486348 f4096073349764486348);

    private static native int kputvsepanpo(Object[] objArr);

    private native void wzgmkgflqjnu();

    private O994239578521459192() {
        wzgmkgflqjnu();
    }
}
