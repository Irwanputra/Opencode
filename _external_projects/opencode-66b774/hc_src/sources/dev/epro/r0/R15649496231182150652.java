package dev.epro.r0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R15649496231182150652 extends ContentObserver {
    public final /* synthetic */ H17686692708284905246 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R15649496231182150652(H17686692708284905246 h17686692708284905246, Handler handler) {
        super(handler);
        this.a = h17686692708284905246;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.a(O9245300239821758723.a);
    }
}
