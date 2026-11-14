package com.google.android.libraries.ads.mobile.sdk.internal.webview;

import ads_mobile_sdk.fb;
import ads_mobile_sdk.tx0;
import ads_mobile_sdk.vx0;
import ads_mobile_sdk.zw0;
import android.net.Uri;
import dev.epro.r0.A18119328133183277592;
import dev.epro.r0.C9731525580007922156;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.Y4798753258822141670;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class PerAdNativeJavscriptEngineJsContext implements C9731525580007922156 {
    public final C9731525580007922156 a;
    public final String b;
    public final H15186625828076266306 c;
    private final Set<Y4798753258822141670> perAdGmsgHandlers;

    public PerAdNativeJavscriptEngineJsContext(C9731525580007922156 c9731525580007922156, String str) {
        c9731525580007922156.getClass();
        this.a = c9731525580007922156;
        this.b = str;
        this.c = new H15186625828076266306();
        this.perAdGmsgHandlers = new LinkedHashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c5, code lost:
    
        if (r8.a(r9, r10, r0) == r6) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // dev.epro.r0.C9731525580007922156
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, dev.epro.r0.Y4798753258822141670 r10, dev.epro.r0.K14749510448791472029 r11) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext.a(java.lang.String, dev.epro.r0.Y4798753258822141670, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.C9731525580007922156
    public final Object a(tx0 tx0Var, String str, fb fbVar) {
        return this.a.a(tx0Var, str, fbVar);
    }

    @Override // dev.epro.r0.C9731525580007922156
    public final Object a(tx0 tx0Var, Uri uri, vx0 vx0Var) {
        return this.a.a(tx0Var, uri, vx0Var);
    }

    @Override // dev.epro.r0.C9731525580007922156
    public final Object a(String str, A18119328133183277592 a18119328133183277592, zw0 zw0Var) {
        return this.a.a(str, a18119328133183277592, zw0Var);
    }
}
