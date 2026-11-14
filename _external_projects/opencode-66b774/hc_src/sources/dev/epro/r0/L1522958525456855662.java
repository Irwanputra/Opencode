package dev.epro.r0;

import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L1522958525456855662 extends F4266814510741967107 {
    public final TextClassification b;
    public final int c;
    public final Drawable d;

    public L1522958525456855662(Object obj, TextClassification textClassification, int i, Drawable drawable) {
        super(obj);
        this.b = textClassification;
        this.c = i;
        this.d = drawable;
    }

    public final String toString() {
        return "TextContextMenuTextClassificationItem(key=" + this.a + ", textClassification=" + this.b + ", index=" + this.c + ", icon=" + this.d + ")";
    }
}
