package p034.p050.p053;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1261 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public TextClassifier f6165;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public TextView f6166;

    public C1261(TextView textView) {
        this.f6166 = textView;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public TextClassifier m2927() {
        TextClassifier textClassifier = this.f6165;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f6166.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }
}
