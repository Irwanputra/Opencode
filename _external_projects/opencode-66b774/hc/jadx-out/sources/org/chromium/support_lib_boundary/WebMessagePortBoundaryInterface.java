package org.chromium.support_lib_boundary;

import android.os.Handler;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public interface WebMessagePortBoundaryInterface {
    void close();

    void postMessage(InvocationHandler invocationHandler);

    void setWebMessageCallback(InvocationHandler invocationHandler);

    void setWebMessageCallback(InvocationHandler invocationHandler, Handler handler);
}
