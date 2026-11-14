package dev.epro.r0;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F12843666193012269065 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ U12005525216752176281 a;

    public F12843666193012269065(U12005525216752176281 u12005525216752176281) {
        this.a = u12005525216752176281;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        U12005525216752176281 u12005525216752176281 = this.a;
        Dialog dialog = u12005525216752176281.b0;
        if (dialog != null) {
            u12005525216752176281.onDismiss(dialog);
        }
    }
}
