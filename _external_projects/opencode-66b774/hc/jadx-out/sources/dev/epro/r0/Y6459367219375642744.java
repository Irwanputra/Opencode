package dev.epro.r0;

import android.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y6459367219375642744 extends P6965373180190123089 {
    public static final WeakHashMap b = new WeakHashMap();
    public WebViewRendererBoundaryInterface a;

    public static Y6459367219375642744 a(WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap weakHashMap = b;
        Y6459367219375642744 y6459367219375642744 = (Y6459367219375642744) weakHashMap.get(webViewRenderProcess);
        if (y6459367219375642744 != null) {
            return y6459367219375642744;
        }
        Y6459367219375642744 y64593672193756427442 = new Y6459367219375642744();
        new WeakReference(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, y64593672193756427442);
        return y64593672193756427442;
    }

    public static Y6459367219375642744 b(InvocationHandler invocationHandler) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) K5751602218013079365.w(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (Y6459367219375642744) webViewRendererBoundaryInterface.getOrCreatePeer(new J5800360223679855765(webViewRendererBoundaryInterface, (byte) 4));
    }
}
