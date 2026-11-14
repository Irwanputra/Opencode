package dev.epro.r0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R18007921776911563033 extends InputConnectionWrapper {
    public final /* synthetic */ C2811124483977556747 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R18007921776911563033(InputConnection inputConnection, C2811124483977556747 c2811124483977556747) {
        super(inputConnection, false);
        this.a = c2811124483977556747;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        F6942723054099263096 f6942723054099263096 = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            f6942723054099263096 = new F6942723054099263096(new L12119018558356739237(inputContentInfo), (byte) 13);
        }
        if (this.a.b(f6942723054099263096, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
