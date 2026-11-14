package dev.epro.r0;

import java.util.Arrays;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class J9899161796985587052 {
    public static final Set a;

    static {
        int iGicqimnshfbw;
        izmyclvb.dpqpjfpoanwt1(230);
        Object[] objArr = new Object[8];
        while (true) {
            try {
                iGicqimnshfbw = gicqimnshfbw(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iGicqimnshfbw != 0) {
                switch (iGicqimnshfbw) {
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

    public static final native H9390398899829886498 a(JSONObject jSONObject);

    public static final native boolean b(JSONObject jSONObject, String str, int i);

    public static final native JSONObject c(int i, String str);

    public static final native JSONObject d(String str, L9627466093322137192 l9627466093322137192);

    private static native int gicqimnshfbw(Object[] objArr);
}
