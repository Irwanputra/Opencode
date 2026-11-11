package p131.p132.p133;

import android.content.Context;
import java.io.File;
import p131.p132.p133.p134.C1970;
import p131.p155.p156.p157.C2098;

/* renamed from: なぎぱいぢぎ.〳ぜぞぜべっ.げつ〴ぬぐ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1969 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f8585 = true;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Context f8586;

    public C1969(Context context) {
        this.f8586 = context;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean m4086(String str) {
        boolean z = false;
        for (String str2 : C1971.m4090()) {
            String m4205 = C2098.m4205(str2, str);
            if (new File(str2, str).exists()) {
                C1970.m4088(m4205 + " binary detected!");
                z = true;
            }
        }
        return z;
    }
}
