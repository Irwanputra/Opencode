package dev.epro.r0;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S8418098248327900568 {
    public final TextView a;
    public final F6942723054099263096 b;

    public S8418098248327900568(TextView textView) {
        this.a = textView;
        this.b = new F6942723054099263096(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, Y17304307076558258116.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z) {
        ((U16229988784104357932) this.b.b).O(z);
    }

    public final void c(boolean z) {
        ((U16229988784104357932) this.b.b).P(z);
    }
}
