package dev.epro.r0;

import android.net.http.BidirectionalStream;
import android.net.http.HttpEngine;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U7451168681643155854 extends ExperimentalBidirectionalStream.Builder {
    public final F10736675061244242991 a;
    public final String b;
    public final BidirectionalStream.Callback c;
    public final Executor d;
    public final ArrayList e = new ArrayList();
    public String f = "POST";
    public int g = 3;
    public boolean h;
    public ArrayList i;
    public boolean j;
    public int k;
    public boolean l;
    public int m;

    public U7451168681643155854(String str, BidirectionalStream.Callback callback, Executor executor, F10736675061244242991 f10736675061244242991) {
        Objects.requireNonNull(str, "URL is required.");
        this.b = str;
        Objects.requireNonNull(callback, "Callback is required.");
        this.c = callback;
        Objects.requireNonNull(executor, "Executor is required.");
        this.d = executor;
        this.a = f10736675061244242991;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder addHeader(String str, String str2) {
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        this.e.add(new AbstractMap.SimpleImmutableEntry(str, str2));
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder addRequestAnnotation(Object obj) {
        Objects.requireNonNull(obj, "Invalid metrics annotation.");
        ArrayList arrayList = this.i;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.i = arrayList;
        }
        arrayList.add(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream build() {
        String str = this.f;
        int i = this.g;
        boolean z = this.h;
        ArrayList arrayList = this.i;
        boolean z2 = this.j;
        int i2 = this.k;
        boolean z3 = this.l;
        int i3 = this.m;
        F10736675061244242991 f10736675061244242991 = this.a;
        f10736675061244242991.getClass();
        B12701124061262717569 b12701124061262717569 = new B12701124061262717569(this.c);
        HttpEngine httpEngine = f10736675061244242991.a;
        String str2 = this.b;
        BidirectionalStream.Builder builderNewBidirectionalStreamBuilder = httpEngine.newBidirectionalStreamBuilder(str2, this.d, b12701124061262717569);
        builderNewBidirectionalStreamBuilder.setHttpMethod(str);
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            Map.Entry entry = (Map.Entry) obj;
            builderNewBidirectionalStreamBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        builderNewBidirectionalStreamBuilder.setPriority(i);
        builderNewBidirectionalStreamBuilder.setDelayRequestHeadersUntilFirstFlushEnabled(z);
        if (z2) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsTag(i2);
        }
        if (z3) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsUid(i3);
        }
        J3014650008080165576 j3014650008080165576 = new J3014650008080165576(builderNewBidirectionalStreamBuilder.build(), f10736675061244242991, str2, arrayList);
        b12701124061262717569.b = j3014650008080165576;
        return j3014650008080165576;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder setHttpMethod(String str) {
        Objects.requireNonNull(str, "Method is required.");
        this.f = str;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder setPriority(int i) {
        this.g = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder setTrafficStatsTag(int i) {
        this.j = true;
        this.k = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder setTrafficStatsUid(int i) {
        this.l = true;
        this.m = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setPriority(int i) {
        this.g = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setTrafficStatsTag(int i) {
        this.j = true;
        this.k = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setTrafficStatsUid(int i) {
        this.l = true;
        this.m = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setHttpMethod(String str) {
        Objects.requireNonNull(str, "Method is required.");
        this.f = str;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder addRequestAnnotation(Object obj) {
        addRequestAnnotation(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder addHeader(String str, String str2) {
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        this.e.add(new AbstractMap.SimpleImmutableEntry(str, str2));
        return this;
    }

    @Override // org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder bindToNetwork(long j) {
        return this;
    }
}
