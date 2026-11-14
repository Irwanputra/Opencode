package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class gq3 implements dev.epro.r0.H17290033108192114773 {
    public final /* synthetic */ dev.epro.r0.H7219028874700587498 a;

    public void onFailure(dev.epro.r0.V16360509766617756755 v16360509766617756755, java.io.IOException iOException) {
        java.lang.Object qu0Var;
        if (iOException instanceof java.net.UnknownServiceException) {
            java.lang.String message = iOException.getMessage();
            if (message == null) {
                message = "Non-retryable OkHttp network error";
            }
            qu0Var = new ads_mobile_sdk.vu0(message, iOException);
        } else {
            qu0Var = new ads_mobile_sdk.qu0(iOException, 5, null, 4);
        }
        this.a.d(qu0Var, new dev.epro.r0.X5962375048773394746(v16360509766617756755, (byte) 1));
    }

    public void onResponse(dev.epro.r0.V16360509766617756755 v16360509766617756755, dev.epro.r0.P10917817599008460069 p10917817599008460069) {
        this.a.d(new ads_mobile_sdk.xu0(p10917817599008460069), new dev.epro.r0.X5962375048773394746(v16360509766617756755, (byte) 2));
    }
}
