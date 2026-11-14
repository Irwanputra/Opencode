package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E10092413133274766026 {
    public static dev.epro.r0.P16142420860494385953 a(dev.epro.r0.B6584454571824948275 b6584454571824948275, dev.epro.r0.P16142420860494385953 p16142420860494385953) {
        java.lang.CharSequence charSequenceCoerceToStyledText;
        dev.epro.r0.J8575954267469244926 j8575954267469244926 = p16142420860494385953.a;
        if (j8575954267469244926.c() == 2) {
            return p16142420860494385953;
        }
        android.content.ClipData clipDataE = j8575954267469244926.e();
        int iM = j8575954267469244926.m();
        android.text.Editable editable = (android.text.Editable) b6584454571824948275.getText();
        android.content.Context context = b6584454571824948275.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataE.getItemCount(); i++) {
            android.content.ClipData.Item itemAt = clipDataE.getItemAt(i);
            if ((iM & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof android.text.Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z) {
                    editable.insert(android.text.Selection.getSelectionEnd(editable), "\n");
                    editable.insert(android.text.Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = android.text.Selection.getSelectionStart(editable);
                    int selectionEnd = android.text.Selection.getSelectionEnd(editable);
                    int iMax = java.lang.Math.max(0, java.lang.Math.min(selectionStart, selectionEnd));
                    int iMax2 = java.lang.Math.max(0, java.lang.Math.max(selectionStart, selectionEnd));
                    android.text.Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z = true;
                }
            }
        }
        return null;
    }
}
