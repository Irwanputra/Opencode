package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B7737662242554011465 extends dev.epro.r0.L6855102173777462404 {
    public final /* synthetic */ android.app.Activity b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ java.util.Map e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B7737662242554011465(dev.epro.r0.J6457333644812339360 j6457333644812339360, ads_mobile_sdk.f01 f01Var, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.util.Map map) {
        super(f01Var);
        this.b = activity;
        this.c = str;
        this.d = str2;
        this.e = map;
    }

    public final void onError(android.os.Bundle bundle) {
        java.util.Map map = this.e;
        android.app.Activity activity = this.b;
        activity.runOnUiThread(new dev.epro.r0.I3522225526927885074(activity, this.c, this.d, map, (byte) 3));
        super.onError(bundle);
    }
}
