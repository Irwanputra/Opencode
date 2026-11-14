package dev.epro.r0;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G10370325506019749574 extends InputConnectionWrapper {
    public final TextView a;

    public G10370325506019749574(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        super(inputConnection, false);
        this.a = textView;
        if (D3638978315442423989.d()) {
            D3638978315442423989.a().i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return Q7316561721656982910.G(this, this.a.getEditableText(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return Q7316561721656982910.G(this, this.a.getEditableText(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
