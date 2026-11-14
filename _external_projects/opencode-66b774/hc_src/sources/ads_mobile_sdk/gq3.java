package ads_mobile_sdk;

import dev.epro.r0.H17290033108192114773;
import dev.epro.r0.H7219028874700587498;
import dev.epro.r0.P10917817599008460069;
import dev.epro.r0.V16360509766617756755;
import dev.epro.r0.X5962375048773394746;
import java.io.IOException;
import java.net.UnknownServiceException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class gq3 implements H17290033108192114773 {
    public final /* synthetic */ H7219028874700587498 a;

    public /* synthetic */ gq3(H7219028874700587498 h7219028874700587498) {
        this.a = h7219028874700587498;
    }

    @Override // dev.epro.r0.H17290033108192114773
    public void onFailure(V16360509766617756755 v16360509766617756755, IOException iOException) {
        Object qu0Var;
        if (iOException instanceof UnknownServiceException) {
            String message = iOException.getMessage();
            if (message == null) {
                message = "Non-retryable OkHttp network error";
            }
            qu0Var = new vu0(message, iOException);
        } else {
            qu0Var = new qu0(iOException, 5, null, 4);
        }
        this.a.d(qu0Var, new X5962375048773394746(v16360509766617756755, (byte) 1));
    }

    @Override // dev.epro.r0.H17290033108192114773
    public void onResponse(V16360509766617756755 v16360509766617756755, P10917817599008460069 p10917817599008460069) {
        this.a.d(new xu0(p10917817599008460069), new X5962375048773394746(v16360509766617756755, (byte) 2));
    }
}
