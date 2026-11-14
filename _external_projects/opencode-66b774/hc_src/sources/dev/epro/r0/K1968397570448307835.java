package dev.epro.r0;

import android.content.Context;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K1968397570448307835 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public K1968397570448307835(Context context) {
        boolean W = S10823041268949770285.W(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        int y = E12775674050813925581.y(context, R.attr.elevationOverlayColor);
        int y2 = E12775674050813925581.y(context, R.attr.elevationOverlayAccentColor);
        int y3 = E12775674050813925581.y(context, R.attr.colorSurface);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = W;
        this.b = y;
        this.c = y2;
        this.d = y3;
        this.e = f2;
    }
}
