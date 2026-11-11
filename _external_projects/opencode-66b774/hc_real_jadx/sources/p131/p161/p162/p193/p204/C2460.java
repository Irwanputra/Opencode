package p131.p161.p162.p193.p204;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.なぎぱいぢぎ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2460 implements DynamiteModule.InterfaceC0384 {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC0384
    /* renamed from: げつ〴ぬぐ */
    public final C2464 mo1257(Context context, String str, InterfaceC2466 interfaceC2466) {
        C2464 c2464 = new C2464();
        int mo1256 = interfaceC2466.mo1256(context, str, true);
        c2464.f9804 = mo1256;
        if (mo1256 != 0) {
            c2464.f9805 = 1;
        } else {
            int mo1255 = interfaceC2466.mo1255(context, str);
            c2464.f9806 = mo1255;
            if (mo1255 != 0) {
                c2464.f9805 = -1;
            }
        }
        return c2464;
    }
}
