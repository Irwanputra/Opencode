package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class C562114889753412401 {
    public static final android.text.Layout.Alignment a;
    public static final android.text.Layout.Alignment b;

    static {
        android.text.Layout.Alignment[] alignmentArrValues = android.text.Layout.Alignment.values();
        android.text.Layout.Alignment alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
        android.text.Layout.Alignment alignment2 = alignment;
        for (android.text.Layout.Alignment alignment3 : alignmentArrValues) {
            if (dev.epro.r0.S10823041268949770285.t(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (dev.epro.r0.S10823041268949770285.t(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        a = alignment;
        b = alignment2;
    }
}
