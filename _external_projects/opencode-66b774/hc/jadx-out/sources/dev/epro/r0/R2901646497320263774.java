package dev.epro.r0;

import java.util.Collection;
import java.util.Collections;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class R2901646497320263774 extends RequestFinishedInfo {
    public final String a;
    public final Collection b;
    public final I2529023569716020990 c;
    public final byte d;
    public final UrlResponseInfo e;
    public final CronetException f;

    /* JADX WARN: Multi-variable type inference failed */
    public R2901646497320263774(String str, Collection collection, I2529023569716020990 i2529023569716020990, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a = str;
        this.b = collection;
        this.c = i2529023569716020990;
        this.d = i;
        this.e = urlResponseInfo;
        this.f = cronetException;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final Collection getAnnotations() {
        Collection collection = this.b;
        return collection == null ? Collections.EMPTY_LIST : collection;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final CronetException getException() {
        return this.f;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final int getFinishedReason() {
        return this.d;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final UrlResponseInfo getResponseInfo() {
        return this.e;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final String getUrl() {
        return this.a;
    }
}
