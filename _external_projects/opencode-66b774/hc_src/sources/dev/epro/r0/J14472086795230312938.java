package dev.epro.r0;

import android.app.sdksandbox.sdkprovider.SdkSandboxController;
import android.content.Context;
import android.net.http.HttpEngine;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.SelectRangeGesture;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class J14472086795230312938 {
    public static /* bridge */ /* synthetic */ boolean B(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean D(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ SdkSandboxController g(Object obj) {
        return (SdkSandboxController) obj;
    }

    public static /* synthetic */ HttpEngine.Builder l(Context context) {
        return new HttpEngine.Builder(context);
    }

    public static /* bridge */ /* synthetic */ DeleteGesture m(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture n(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture o(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class p() {
        return SdkSandboxController.class;
    }

    public static /* synthetic */ void r() {
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof DeleteGesture;
    }
}
