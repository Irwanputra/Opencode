package p131.p161.p162.p193.p205;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.ざとぅぼこ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2509 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C2509 f9851;

    public C2509(Context context) {
        context.getApplicationContext();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static AbstractBinderC2519 m4525(PackageInfo packageInfo, AbstractBinderC2519... abstractBinderC2519Arr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        BinderC2513 binderC2513 = new BinderC2513(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < abstractBinderC2519Arr.length; i++) {
            if (abstractBinderC2519Arr[i].equals(binderC2513)) {
                return abstractBinderC2519Arr[i];
            }
        }
        return null;
    }
}
