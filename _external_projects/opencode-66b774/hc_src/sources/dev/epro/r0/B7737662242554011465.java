package dev.epro.r0;

import ads_mobile_sdk.f01;
import android.app.Activity;
import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B7737662242554011465 extends L6855102173777462404 {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Map e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B7737662242554011465(J6457333644812339360 j6457333644812339360, f01 f01Var, Activity activity, String str, String str2, Map map) {
        super(f01Var);
        this.b = activity;
        this.c = str;
        this.d = str2;
        this.e = map;
    }

    @Override // dev.epro.r0.L6855102173777462404, dev.epro.r0.B18329032920392634747
    public final void onError(Bundle bundle) {
        Activity activity = this.b;
        activity.runOnUiThread(new I3522225526927885074(activity, this.c, this.d, this.e, (byte) 3));
        super.onError(bundle);
    }
}
