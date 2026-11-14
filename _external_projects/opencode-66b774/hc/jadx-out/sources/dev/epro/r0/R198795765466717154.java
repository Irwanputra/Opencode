package dev.epro.r0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R198795765466717154 implements TextWatcher {
    public final EditText a;
    public L6247643214555492915 b;
    public boolean c = true;

    public R198795765466717154(EditText editText) {
        this.a = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            D3638978315442423989 d3638978315442423989A = D3638978315442423989.a();
            if (editableText == null) {
                length = 0;
            } else {
                d3638978315442423989A.getClass();
                length = editableText.length();
            }
            d3638978315442423989A.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.a;
        if (!editText.isInEditMode() && this.c && D3638978315442423989.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iC = D3638978315442423989.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    D3638978315442423989.a().g(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            D3638978315442423989 d3638978315442423989A = D3638978315442423989.a();
            L6247643214555492915 l6247643214555492915 = this.b;
            if (l6247643214555492915 == null) {
                l6247643214555492915 = new L6247643214555492915(editText);
                this.b = l6247643214555492915;
            }
            d3638978315442423989A.h(l6247643214555492915);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
