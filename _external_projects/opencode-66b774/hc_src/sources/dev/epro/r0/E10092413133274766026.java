package dev.epro.r0;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E10092413133274766026 {
    public static P16142420860494385953 a(B6584454571824948275 b6584454571824948275, P16142420860494385953 p16142420860494385953) {
        CharSequence coerceToStyledText;
        J8575954267469244926 j8575954267469244926 = p16142420860494385953.a;
        if (j8575954267469244926.c() == 2) {
            return p16142420860494385953;
        }
        ClipData e = j8575954267469244926.e();
        int m = j8575954267469244926.m();
        Editable editable = (Editable) b6584454571824948275.getText();
        Context context = b6584454571824948275.getContext();
        boolean z = false;
        for (int i = 0; i < e.getItemCount(); i++) {
            ClipData.Item itemAt = e.getItemAt(i);
            if ((m & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z = true;
                }
            }
        }
        return null;
    }
}
