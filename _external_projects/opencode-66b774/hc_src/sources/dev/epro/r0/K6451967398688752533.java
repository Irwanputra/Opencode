package dev.epro.r0;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K6451967398688752533 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ U12005525216752176281 a;

    public K6451967398688752533(U12005525216752176281 u12005525216752176281) {
        this.a = u12005525216752176281;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        U12005525216752176281 u12005525216752176281 = this.a;
        Dialog dialog = u12005525216752176281.b0;
        if (dialog != null) {
            u12005525216752176281.onCancel(dialog);
        }
    }
}
