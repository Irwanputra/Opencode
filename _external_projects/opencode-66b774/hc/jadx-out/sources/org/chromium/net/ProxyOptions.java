package org.chromium.net;

import dev.epro.r0.S10973172697741180971;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class ProxyOptions {
    private final List<Proxy> mProxyList;

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public @interface Experimental {
    }

    public ProxyOptions(List<Proxy> list) {
        Objects.requireNonNull(list);
        if (list.isEmpty()) {
            S10973172697741180971.j("ProxyList cannot be empty");
            throw null;
        }
        int iIndexOf = list.indexOf(null);
        if (iIndexOf == -1 || iIndexOf == list.size() - 1) {
            this.mProxyList = new ArrayList(list);
        } else {
            S10973172697741180971.j("Null is allowed only as the last element in the proxy list");
            throw null;
        }
    }

    public List<Proxy> getProxyList() {
        return Collections.unmodifiableList(this.mProxyList);
    }
}
