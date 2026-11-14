package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C9778412775309886225 implements org.chromium.support_lib_boundary.WebMessageBoundaryInterface {
    public static final java.lang.String[] b = {androidx.webkit.WebViewFeature.WEB_MESSAGE_ARRAY_BUFFER};
    public final dev.epro.r0.D5229586195471132766 a;

    public C9778412775309886225(dev.epro.r0.D5229586195471132766 d5229586195471132766) {
        this.a = d5229586195471132766;
    }

    public final java.lang.String getData() {
        dev.epro.r0.D5229586195471132766 d5229586195471132766 = this.a;
        d5229586195471132766.a(0);
        return d5229586195471132766.b;
    }

    public final java.lang.reflect.InvocationHandler getMessagePayload() {
        dev.epro.r0.V16467367819314239412 v16467367819314239412;
        dev.epro.r0.D5229586195471132766 d5229586195471132766 = this.a;
        boolean z = d5229586195471132766.d;
        if (!z) {
            d5229586195471132766.a(0);
            v16467367819314239412 = new dev.epro.r0.V16467367819314239412(d5229586195471132766.b);
        } else {
            if (!z) {
                throw new java.lang.IllegalStateException("Unknown web message payload type: " + (z ? 1 : 0));
            }
            d5229586195471132766.a(1);
            byte[] bArr = d5229586195471132766.c;
            java.util.Objects.requireNonNull(bArr);
            v16467367819314239412 = new dev.epro.r0.V16467367819314239412(bArr);
        }
        return new dev.epro.r0.J15503348699114933825(v16467367819314239412);
    }

    public final java.lang.reflect.InvocationHandler[] getPorts() {
        dev.epro.r0.L455553177668166676[] l455553177668166676Arr = this.a.a;
        java.lang.reflect.InvocationHandler[] invocationHandlerArr = new java.lang.reflect.InvocationHandler[l455553177668166676Arr.length];
        for (int i = 0; i < l455553177668166676Arr.length; i++) {
            dev.epro.r0.L455553177668166676 l455553177668166676 = l455553177668166676Arr[i];
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface webMessagePortBoundaryInterface = l455553177668166676.b;
            if (webMessagePortBoundaryInterface == null) {
                dev.epro.r0.M204440408817344908 m204440408817344908 = dev.epro.r0.D14855838667584681226.a;
                webMessagePortBoundaryInterface = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) dev.epro.r0.K5751602218013079365.w(org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class, ((org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface) m204440408817344908.b).convertWebMessagePort(l455553177668166676.a));
                l455553177668166676.b = webMessagePortBoundaryInterface;
            }
            invocationHandlerArr[i] = java.lang.reflect.Proxy.getInvocationHandler(webMessagePortBoundaryInterface);
        }
        return invocationHandlerArr;
    }

    public final java.lang.String[] getSupportedFeatures() {
        return b;
    }
}
