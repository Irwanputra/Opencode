package p034.p086.p091.p092;

import java.util.HashMap;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1645 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public HashMap<Object, HashMap<String, float[]>> f7696 = new HashMap<>();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public float m3584(Object obj, String str, int i) {
        if (!this.f7696.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap<String, float[]> hashMap = this.f7696.get(obj);
        if (!hashMap.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = hashMap.get(str);
        if (fArr.length > i) {
            return fArr[i];
        }
        return Float.NaN;
    }
}
