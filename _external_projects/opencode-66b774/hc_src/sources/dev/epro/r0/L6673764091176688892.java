package dev.epro.r0;

import ads_mobile_sdk.rf0;
import android.content.DialogInterface;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class L6673764091176688892 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rf0 b;

    public /* synthetic */ L6673764091176688892(rf0 rf0Var, byte b) {
        this.a = b;
        this.b = rf0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        rf0 rf0Var = this.b;
        switch (b) {
            case 0:
                rf0Var.k.set(false);
                break;
            case 1:
                rf0Var.getClass();
                rf0Var.k.set(false);
                break;
            default:
                rf0Var.getClass();
                rf0Var.k.set(false);
                break;
        }
    }
}
