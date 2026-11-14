package dev.epro.r0;

import androidx.webkit.WebViewFeature;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C9778412775309886225 implements WebMessageBoundaryInterface {
    public static final String[] b = {WebViewFeature.WEB_MESSAGE_ARRAY_BUFFER};
    public final D5229586195471132766 a;

    public C9778412775309886225(D5229586195471132766 d5229586195471132766) {
        this.a = d5229586195471132766;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final String getData() {
        D5229586195471132766 d5229586195471132766 = this.a;
        d5229586195471132766.a(0);
        return d5229586195471132766.b;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final InvocationHandler getMessagePayload() {
        V16467367819314239412 v16467367819314239412;
        D5229586195471132766 d5229586195471132766 = this.a;
        boolean z = d5229586195471132766.d;
        if (!z) {
            d5229586195471132766.a(0);
            v16467367819314239412 = new V16467367819314239412(d5229586195471132766.b);
        } else {
            if (!z) {
                throw new IllegalStateException("Unknown web message payload type: " + (z ? 1 : 0));
            }
            d5229586195471132766.a(1);
            byte[] bArr = d5229586195471132766.c;
            Objects.requireNonNull(bArr);
            v16467367819314239412 = new V16467367819314239412(bArr);
        }
        return new J15503348699114933825(v16467367819314239412);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final InvocationHandler[] getPorts() {
        U15597528598182133107[] u15597528598182133107Arr = this.a.a;
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[u15597528598182133107Arr.length];
        for (int i = 0; i < u15597528598182133107Arr.length; i++) {
            L455553177668166676 l455553177668166676 = (L455553177668166676) u15597528598182133107Arr[i];
            WebMessagePortBoundaryInterface webMessagePortBoundaryInterface = l455553177668166676.b;
            if (webMessagePortBoundaryInterface == null) {
                M204440408817344908 m204440408817344908 = D14855838667584681226.a;
                webMessagePortBoundaryInterface = (WebMessagePortBoundaryInterface) K5751602218013079365.w(WebMessagePortBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) m204440408817344908.b).convertWebMessagePort(l455553177668166676.a));
                l455553177668166676.b = webMessagePortBoundaryInterface;
            }
            invocationHandlerArr[i] = Proxy.getInvocationHandler(webMessagePortBoundaryInterface);
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return b;
    }
}
