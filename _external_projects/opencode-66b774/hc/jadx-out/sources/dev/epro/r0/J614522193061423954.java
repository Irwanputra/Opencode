package dev.epro.r0;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class J614522193061423954 implements OnBackInvokedCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ J614522193061423954(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onBackInvoked() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                B13729205492206812220 b13729205492206812220 = (B13729205492206812220) obj;
                if (b13729205492206812220 != null) {
                    b13729205492206812220.invoke();
                }
                break;
            case 1:
                ((L9687083612725928934) obj).B();
                break;
            case 2:
                ((K3543068083010740431) obj).a();
                break;
            default:
                ((D14800445622774319989) obj).run();
                break;
        }
    }
}
