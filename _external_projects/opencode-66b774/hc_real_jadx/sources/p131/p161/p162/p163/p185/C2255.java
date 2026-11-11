package p131.p161.p162.p163.p185;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import p034.p050.p053.C1260;
import p131.p155.p156.p157.C2098;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2243;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2255 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final int[] f9387 = {C2111.colorPrimary};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final int[] f9386 = {C2111.colorPrimaryVariant};

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        if (r0.getResourceId(p131.p161.p162.p163.C2243.ThemeEnforcement_android_textAppearance, -1) != (-1)) goto L20;
     */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m4404(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
        /*
            int[] r0 = p131.p161.p162.p163.C2243.ThemeEnforcement
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            int r1 = p131.p161.p162.p163.C2243.ThemeEnforcement_enforceTextAppearance
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L13
            r0.recycle()
            return
        L13:
            r1 = -1
            if (r9 == 0) goto L35
            int r3 = r9.length
            if (r3 != 0) goto L1a
            goto L35
        L1a:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = 0
        L20:
            if (r6 >= r5) goto L31
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r1)
            if (r7 != r1) goto L2e
            r4.recycle()
            goto L3e
        L2e:
            int r6 = r6 + 1
            goto L20
        L31:
            r4.recycle()
            goto L3d
        L35:
            int r4 = p131.p161.p162.p163.C2243.ThemeEnforcement_android_textAppearance
            int r4 = r0.getResourceId(r4, r1)
            if (r4 == r1) goto L3e
        L3d:
            r2 = 1
        L3e:
            r0.recycle()
            if (r2 == 0) goto L44
            return
        L44:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            goto L4d
        L4c:
            throw r4
        L4d:
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p162.p163.p185.C2255.m4404(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static void m4405(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                obtainStyledAttributes.recycle();
                z = true;
                break;
            } else {
                if (!obtainStyledAttributes.hasValue(i)) {
                    obtainStyledAttributes.recycle();
                    break;
                }
                i++;
            }
        }
        if (!z) {
            throw new IllegalArgumentException(C2098.m4187("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m4406(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2243.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C2243.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C2111.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m4405(context, f9386, "Theme.MaterialComponents");
            }
        }
        m4405(context, f9387, "Theme.AppCompat");
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static C1260 m4407(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m4406(context, attributeSet, i, i2);
        m4404(context, attributeSet, iArr, i, i2, iArr2);
        return new C1260(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static TypedArray m4408(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m4406(context, attributeSet, i, i2);
        m4404(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}
