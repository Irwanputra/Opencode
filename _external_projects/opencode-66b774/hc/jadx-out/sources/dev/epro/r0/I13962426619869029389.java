package dev.epro.r0;

import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I13962426619869029389 {
    public static final List a;

    static {
        int iBtfmdgquinsy;
        izmyclvb.dpqpjfpoanwt1(2019);
        Object[] objArr = new Object[36];
        while (true) {
            try {
                iBtfmdgquinsy = btfmdgquinsy(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iBtfmdgquinsy != 0) {
                switch (iBtfmdgquinsy) {
                    case 1:
                        a = (List) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native Boolean a(String str, JSONObject jSONObject);

    public static final native String b(String str, JSONObject jSONObject);

    private static native int btfmdgquinsy(Object[] objArr);

    public static final native Q7430090668634766253 c(Q7430090668634766253 q7430090668634766253, JSONObject jSONObject);

    public static final native void d(Q7430090668634766253 q7430090668634766253, JSONObject jSONObject);
}
