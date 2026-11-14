package dev.epro.r0;

import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final class D7933297377389314260 extends TextView {
    public Spanned a;
    public float b;
    public float c;

    static {
        izmyclvb.oeynnivvrnts0(17);
    }

    private native void xmpfaxjednif(Context context);

    @Override // android.widget.TextView, android.view.View
    public final native void onMeasure(int i, int i2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D7933297377389314260(Context context) {
        super(context);
        context.getClass();
        xmpfaxjednif(context);
    }
}
