package dev.epro.r0;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Z10741541509989645636 {
    public static final Z10741541509989645636 a;
    public static final Set b;
    public static final Set c;
    public static final Set d;
    public static final Set e;
    public static final Set f;

    static {
        int iEuzjtxkblbdj;
        izmyclvb.qgayjvbiagej2(936);
        Object[] objArr = new Object[7];
        while (true) {
            try {
                iEuzjtxkblbdj = euzjtxkblbdj(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iEuzjtxkblbdj != 0) {
                switch (iEuzjtxkblbdj) {
                    case 1:
                        a = (Z10741541509989645636) objArr[1];
                        continue;
                    case 2:
                        b = (Set) objArr[1];
                        continue;
                    case 3:
                        c = (Set) objArr[1];
                        continue;
                    case 4:
                        d = (Set) objArr[1];
                        continue;
                    case 5:
                        e = (Set) objArr[1];
                        continue;
                    case 6:
                        f = (Set) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native boolean a(String str, JSONObject jSONObject);

    public static native void b(int i, boolean z, boolean z2);

    public static native boolean c(JSONObject jSONObject);

    public static native boolean d(String str, List list, String str2, boolean z);

    public static native boolean e(JSONObject jSONObject, int i);

    private static native int euzjtxkblbdj(Object[] objArr);

    public static native A16201730628142697357 f(Q7430090668634766253 q7430090668634766253);

    public static native boolean g(JSONObject jSONObject);

    public static native boolean h(String str, List list, String str2);

    public static native int i(JSONObject jSONObject);

    private native void ytvufynwnxjf();

    private Z10741541509989645636() {
        ytvufynwnxjf();
    }
}
