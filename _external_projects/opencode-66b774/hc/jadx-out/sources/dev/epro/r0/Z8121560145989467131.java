package dev.epro.r0;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public class Z8121560145989467131 extends R7938697196150024245 {
    @Override // dev.epro.r0.R7938697196150024245, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
