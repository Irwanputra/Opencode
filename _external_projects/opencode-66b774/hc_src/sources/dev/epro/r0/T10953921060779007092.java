package dev.epro.r0;

import ads_mobile_sdk.cs1;
import ads_mobile_sdk.fq1;
import ads_mobile_sdk.tx0;
import android.content.DialogInterface;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class T10953921060779007092 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tx0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ T10953921060779007092(Object obj, tx0 tx0Var, byte b) {
        this.a = b;
        this.c = obj;
        this.b = tx0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                fq1 fq1Var = (fq1) obj;
                R7033599853981556291.E(fq1Var.d, null, null, new H4546125934900659656(fq1Var, this.b, "Operation denied by user.", (R4833348786910499294) null, (byte) 2), 3);
                break;
            default:
                H5336160545165318150 h5336160545165318150 = cs1.i;
                ((cs1) obj).a("User canceled the download.", this.b, false);
                break;
        }
    }
}
