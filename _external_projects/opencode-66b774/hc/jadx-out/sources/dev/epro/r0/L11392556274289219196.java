package dev.epro.r0;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class L11392556274289219196 implements R9757436368382764378 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TextView b;

    public /* synthetic */ L11392556274289219196(TextView textView, byte b) {
        this.a = b;
        this.b = textView;
    }

    @Override // dev.epro.r0.R9757436368382764378
    public final void accept(Object obj) {
        byte b = this.a;
        TextView textView = this.b;
        switch (b) {
            case 0:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
            case 1:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
            default:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
        }
    }
}
