package dev.epro.r0;

import ads_mobile_sdk.df0;
import ads_mobile_sdk.rf0;
import ads_mobile_sdk.rw0;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class C10112288073830842119 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C10112288073830842119(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        R4833348786910499294 r4833348786910499294 = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                rf0 rf0Var = (rf0) obj;
                rf0Var.getClass();
                rf0Var.k.set(false);
                return;
            case 1:
                rf0 rf0Var2 = (rf0) obj;
                rf0Var2.getClass();
                W5797197595347441198 w5797197595347441198 = rf0Var2.b;
                df0 df0Var = new df0(rf0Var2, r4833348786910499294, (byte) 1);
                w5797197595347441198.getClass();
                R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(df0Var, null, (byte) 1), 2);
                return;
            case 2:
                rf0 rf0Var3 = (rf0) obj;
                rw0 rw0Var = rf0Var3.g;
                Intent intent = new Intent("android.intent.action.VIEW", rf0.q);
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                String str = rf0Var3.p;
                if (str == null) {
                    S10823041268949770285.b0("packageName");
                    throw null;
                }
                bundle.putString("com.android.browser.application_id", str);
                intent.putExtras(bundle);
                rw0Var.a(intent);
                return;
            case 3:
                rf0 rf0Var4 = (rf0) obj;
                rf0Var4.getClass();
                rf0Var4.k.set(false);
                return;
            default:
                ((AtomicInteger) obj).set(i);
                return;
        }
    }
}
