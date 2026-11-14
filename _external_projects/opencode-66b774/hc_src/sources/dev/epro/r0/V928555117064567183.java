package dev.epro.r0;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public class V928555117064567183 extends U12005525216752176281 {
    public Dialog g0;
    public DialogInterface.OnCancelListener h0;
    public AlertDialog i0;

    @Override // dev.epro.r0.U12005525216752176281
    public final Dialog B() {
        Dialog dialog = this.g0;
        if (dialog != null) {
            return dialog;
        }
        this.X = false;
        AlertDialog alertDialog = this.i0;
        if (alertDialog != null) {
            return alertDialog;
        }
        C10994625127000459680 c10994625127000459680 = this.s;
        R13227154569034155950 r13227154569034155950 = c10994625127000459680 == null ? null : c10994625127000459680.r;
        M18113111391818111737.v(r13227154569034155950);
        AlertDialog create = new AlertDialog.Builder(r13227154569034155950).create();
        this.i0 = create;
        return create;
    }

    @Override // dev.epro.r0.U12005525216752176281, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.h0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
