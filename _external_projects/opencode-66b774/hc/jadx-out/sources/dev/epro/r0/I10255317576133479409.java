package dev.epro.r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I10255317576133479409 implements I15982850730816748353 {
    public final ScrollFeedbackProvider a;

    public I10255317576133479409(NestedScrollView nestedScrollView) {
        this.a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // dev.epro.r0.I15982850730816748353
    public final void d(boolean z, int i, int i2, int i3) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    @Override // dev.epro.r0.I15982850730816748353
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }
}
