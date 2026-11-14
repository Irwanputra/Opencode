package dev.epro.r0;

import android.content.ClipData;
import android.os.Build;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T2834513763987957608 implements L3957284589981577691 {
    public final W8455343525638953052 a;

    public T2834513763987957608(W8455343525638953052 w8455343525638953052) {
        this.a = w8455343525638953052;
    }

    public final P444548812388912419 a() {
        ClipData primaryClip = this.a.A().getPrimaryClip();
        if (primaryClip != null) {
            return new P444548812388912419(primaryClip);
        }
        return null;
    }

    public final void b(P444548812388912419 p444548812388912419) {
        W8455343525638953052 w8455343525638953052 = this.a;
        if (p444548812388912419 != null) {
            w8455343525638953052.A().setPrimaryClip(p444548812388912419.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            w8455343525638953052.A().clearPrimaryClip();
        } else {
            w8455343525638953052.A().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
