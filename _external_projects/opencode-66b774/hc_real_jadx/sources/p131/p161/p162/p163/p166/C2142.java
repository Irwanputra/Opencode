package p131.p161.p162.p163.p166;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import p034.p095.C1687;
import p034.p105.p106.DialogInterfaceOnCancelListenerC1781;
import p131.p161.p162.p163.C2111;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2142<S> extends DialogInterfaceOnCancelListenerC1781 {
    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public static boolean m4229(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1687.m3699(context, C2111.materialCalendarStyle, C2132.class.getCanonicalName()), new int[]{R.attr.windowFullscreen});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }
}
