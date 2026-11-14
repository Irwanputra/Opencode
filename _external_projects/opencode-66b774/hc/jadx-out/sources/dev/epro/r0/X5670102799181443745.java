package dev.epro.r0;

import ads_mobile_sdk.et0;
import ads_mobile_sdk.rr1;
import ads_mobile_sdk.z03;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class X5670102799181443745 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ X5670102799181443745(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((et0) obj).a$1(2);
                break;
            case 1:
                ((z03) obj).g.set(true);
                break;
            default:
                ((rr1) obj).a(true);
                break;
        }
    }
}
