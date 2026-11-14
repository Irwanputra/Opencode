package dev.epro.r0;

import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q7424593394344484332 implements WebViewStartUpCallbackBoundaryInterface {
    public final L4980660535418402690 a;

    public Q7424593394344484332(L4980660535418402690 l4980660535418402690) {
        this.a = l4980660535418402690;
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface
    public final void onSuccess(InvocationHandler invocationHandler) {
        ArrayList arrayList;
        WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface = (WebViewStartUpResultBoundaryInterface) K5751602218013079365.w(WebViewStartUpResultBoundaryInterface.class, invocationHandler);
        Objects.requireNonNull(webViewStartUpResultBoundaryInterface);
        List<Throwable> blockingStartUpLocations = webViewStartUpResultBoundaryInterface.getBlockingStartUpLocations();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Throwable> it = blockingStartUpLocations.iterator();
        while (it.hasNext()) {
            arrayList2.add(new F3216423858716380738(it.next()));
        }
        if (Q6344330807969154194.s.b()) {
            List<Throwable> asyncStartUpLocations = webViewStartUpResultBoundaryInterface.getAsyncStartUpLocations();
            arrayList = new ArrayList();
            Iterator<Throwable> it2 = asyncStartUpLocations.iterator();
            while (it2.hasNext()) {
                arrayList.add(new F3216423858716380738(it2.next()));
            }
        } else {
            arrayList = null;
        }
        this.a.onSuccess(new I1632105416032993715(arrayList2, arrayList, webViewStartUpResultBoundaryInterface, (byte) 20));
    }
}
