package dev.epro.r0;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X14609209722283718243 extends M2066880349381062048 {
    public final /* synthetic */ byte W;

    @Override // dev.epro.r0.M2066880349381062048
    public N2113054325721141872 v(Context context, Looper looper, B16853324304735504143 b16853324304735504143, Object obj, U11179075180450893832 u11179075180450893832, R3599537314284374589 r3599537314284374589) {
        switch (this.W) {
            case 0:
                Object obj2 = b16853324304735504143.f;
                Integer num = (Integer) b16853324304735504143.a;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new D1932759943349054292(context, looper, b16853324304735504143, bundle, u11179075180450893832, r3599537314284374589);
            case 1:
                throw G6547577305291411977.m(obj);
            default:
                return super.v(context, looper, b16853324304735504143, obj, u11179075180450893832, r3599537314284374589);
        }
    }

    @Override // dev.epro.r0.M2066880349381062048
    public N2113054325721141872 w(Context context, Looper looper, B16853324304735504143 b16853324304735504143, Object obj, Z102412548944701279 z102412548944701279, Z102412548944701279 z1024125489447012792) {
        switch (this.W) {
            case 2:
                return new Y9876475513294825521(context, looper, b16853324304735504143, (C216269635322847295) obj, z102412548944701279, z1024125489447012792);
            case 3:
                return new E17451188492285078839(context, looper, 300, b16853324304735504143, z102412548944701279, z1024125489447012792);
            default:
                return super.w(context, looper, b16853324304735504143, obj, z102412548944701279, z1024125489447012792);
        }
    }
}
