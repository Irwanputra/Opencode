package p131.p161.p162.p163.p171;

import android.content.Context;
import android.graphics.Color;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p035.p038.C1011;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉ〲なぱぽた.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2156 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int f9023;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int f9024;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final boolean f9025;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final float f9026;

    public C2156(Context context) {
        this.f9025 = C1687.m3715(context, C2111.elevationOverlayEnabled, false);
        this.f9023 = C1687.m3709(context, C2111.elevationOverlayColor, 0);
        this.f9024 = C1687.m3709(context, C2111.colorSurface, 0);
        this.f9026 = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int m4237(int i, float f) {
        if (!this.f9025) {
            return i;
        }
        if (!(C1011.m2351(i, Base64.BASELENGTH) == this.f9024)) {
            return i;
        }
        float f2 = 0.0f;
        if (this.f9026 > 0.0f && f > 0.0f) {
            f2 = Math.min(((((float) Math.log1p(f / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return C1011.m2351(C1687.m3695(C1011.m2351(i, Base64.BASELENGTH), this.f9023, f2), Color.alpha(i));
    }
}
