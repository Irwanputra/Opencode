package p131.p161.p162.p163.p181;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p035.p038.C1011;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.じぜこほぱ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2235 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final int[] f9285;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final int[] f9286;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final int[] f9287;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final int[] f9288;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final int[] f9289;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final boolean f9290;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final int[] f9291;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static final String f9292;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final int[] f9293;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final int[] f9294;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final int[] f9295;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static final int[] f9296;

    static {
        f9290 = Build.VERSION.SDK_INT >= 21;
        f9286 = new int[]{R.attr.state_pressed};
        f9289 = new int[]{R.attr.state_hovered, R.attr.state_focused};
        f9294 = new int[]{R.attr.state_focused};
        f9291 = new int[]{R.attr.state_hovered};
        f9293 = new int[]{R.attr.state_selected, R.attr.state_pressed};
        f9287 = new int[]{R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
        f9285 = new int[]{R.attr.state_selected, R.attr.state_focused};
        f9295 = new int[]{R.attr.state_selected, R.attr.state_hovered};
        f9288 = new int[]{R.attr.state_selected};
        f9296 = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        f9292 = C2235.class.getSimpleName();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static int m4344(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f9290 ? C1011.m2351(colorForState, Math.min(Color.alpha(colorForState) * 2, Base64.BASELENGTH)) : colorForState;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static ColorStateList m4345(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f9296, 0));
        }
        return colorStateList;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static ColorStateList m4346(ColorStateList colorStateList) {
        if (f9290) {
            return new ColorStateList(new int[][]{f9288, StateSet.NOTHING}, new int[]{m4344(colorStateList, f9293), m4344(colorStateList, f9286)});
        }
        int[] iArr = f9293;
        int[] iArr2 = f9287;
        int[] iArr3 = f9285;
        int[] iArr4 = f9295;
        int[] iArr5 = f9286;
        int[] iArr6 = f9289;
        int[] iArr7 = f9294;
        int[] iArr8 = f9291;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f9288, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m4344(colorStateList, iArr), m4344(colorStateList, iArr2), m4344(colorStateList, iArr3), m4344(colorStateList, iArr4), 0, m4344(colorStateList, iArr5), m4344(colorStateList, iArr6), m4344(colorStateList, iArr7), m4344(colorStateList, iArr8), 0});
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static boolean m4347(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
