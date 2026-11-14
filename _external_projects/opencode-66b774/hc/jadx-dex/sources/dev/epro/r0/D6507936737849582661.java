package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D6507936737849582661 extends android.database.DataSetObserver {
    public final /* synthetic */ dev.epro.r0.M10701816181309613444 a;

    public D6507936737849582661(dev.epro.r0.M10701816181309613444 m10701816181309613444) {
        this.a = m10701816181309613444;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        dev.epro.r0.M10701816181309613444 m10701816181309613444 = this.a;
        if (m10701816181309613444.z.isShowing()) {
            m10701816181309613444.e();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
