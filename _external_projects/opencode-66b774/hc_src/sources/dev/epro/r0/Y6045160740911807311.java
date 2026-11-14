package dev.epro.r0;

import android.webkit.ValueCallback;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class Y6045160740911807311 implements ValueCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ J15525459402216671908 b;

    public /* synthetic */ Y6045160740911807311(J15525459402216671908 j15525459402216671908, byte b) {
        this.a = b;
        this.b = j15525459402216671908;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                new B7417075504873050935("Prerender operation failed", (Throwable) obj);
                this.b.getClass();
                break;
            case 2:
                this.b.getClass();
                break;
            default:
                new B7417075504873050935("Prerender operation failed", (Throwable) obj);
                this.b.getClass();
                break;
        }
    }
}
