package p131.p161.p162.p163.p164.p165;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p034.p050.p051.C1153;
import p131.p161.p162.p163.C2111;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〺でおいここ.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2112 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final int[] f8914 = {R.attr.theme, C2111.theme};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final int[] f8913 = {C2111.materialThemeOverlay};

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Context m4210(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8913, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z = (context instanceof C1153) && ((C1153) context).f5694 == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C1153 c1153 = new C1153(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f8914);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c1153.getTheme().applyStyle(resourceId2, true);
        }
        return c1153;
    }
}
