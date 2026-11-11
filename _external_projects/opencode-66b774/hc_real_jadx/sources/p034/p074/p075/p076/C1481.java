package p034.p074.p075.p076;

import android.animation.TypeEvaluator;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1481 implements TypeEvaluator {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final C1481 f6851 = new C1481();

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((intValue >> 24) & Base64.BASELENGTH) / 255.0f;
        float f3 = ((intValue >> 16) & Base64.BASELENGTH) / 255.0f;
        float f4 = ((intValue >> 8) & Base64.BASELENGTH) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f5 = ((intValue2 >> 24) & Base64.BASELENGTH) / 255.0f;
        float f6 = ((intValue2 >> 16) & Base64.BASELENGTH) / 255.0f;
        float f7 = ((intValue2 >> 8) & Base64.BASELENGTH) / 255.0f;
        float pow = (float) Math.pow(f3, 2.2d);
        float pow2 = (float) Math.pow(f4, 2.2d);
        float pow3 = (float) Math.pow((intValue & Base64.BASELENGTH) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(f6, 2.2d);
        float pow5 = (float) Math.pow(f7, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & Base64.BASELENGTH) / 255.0f, 2.2d);
        float m4188 = C2098.m4188(f5, f2, f, f2);
        float m41882 = C2098.m4188(pow4, pow, f, pow);
        float m41883 = C2098.m4188(pow5, pow2, f, pow2);
        float m41884 = C2098.m4188(pow6, pow3, f, pow3);
        float pow7 = ((float) Math.pow(m41882, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(m41883, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(m41884, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(m4188 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
