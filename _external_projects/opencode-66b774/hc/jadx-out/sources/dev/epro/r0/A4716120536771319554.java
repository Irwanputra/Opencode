package dev.epro.r0;

import android.os.Handler;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A4716120536771319554 extends WebView {
    public static final /* synthetic */ int d = 0;
    public final Handler a;
    public final C4341747165502163559 b;
    public boolean c;

    public A4716120536771319554(O6655543165492094776 o6655543165492094776, Handler handler, C4341747165502163559 c4341747165502163559) {
        super(o6655543165492094776);
        this.c = false;
        this.a = handler;
        this.b = c4341747165502163559;
    }

    public final void a(String str, String str2) {
        this.a.post(new I3863025946240164840(this, G6547577305291411977.t(str, "(", str2, ");"), (byte) 24));
    }
}
