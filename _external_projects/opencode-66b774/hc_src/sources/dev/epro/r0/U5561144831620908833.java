package dev.epro.r0;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public class U5561144831620908833 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final W929662112881511578 h = new W929662112881511578(0);
    public final Object[] a = new Object[2];

    public S15286651319405213936 a(Context context, AttributeSet attributeSet) {
        return new S15286651319405213936(context, attributeSet);
    }

    public R2997011295864497150 b(Context context, AttributeSet attributeSet) {
        return new R2997011295864497150(context, attributeSet, net.zetetic.database.R.attr.buttonStyle);
    }

    public Y14832840975702795122 c(Context context, AttributeSet attributeSet) {
        return new Y14832840975702795122(context, attributeSet);
    }

    public O4306341475499457020 d(Context context, AttributeSet attributeSet) {
        return new O4306341475499457020(context, attributeSet);
    }

    public Q6854864344654328121 e(Context context, AttributeSet attributeSet) {
        return new Q6854864344654328121(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        W929662112881511578 w929662112881511578 = h;
        Constructor constructor = (Constructor) w929662112881511578.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            w929662112881511578.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
