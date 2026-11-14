package dev.epro.r0;

import java.util.Arrays;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M32025249287334993 {
    public static final Set a;

    static {
        int iZtjdqkgsisct;
        izmyclvb.dpqpjfpoanwt1(339);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                iZtjdqkgsisct = ztjdqkgsisct(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iZtjdqkgsisct != 0) {
                switch (iZtjdqkgsisct) {
                    case 1:
                        a = (Set) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native boolean a(JSONArray jSONArray);

    public static final native boolean b(JSONObject jSONObject);

    public static final native String c(String str);

    private static native int ztjdqkgsisct(Object[] objArr);
}
