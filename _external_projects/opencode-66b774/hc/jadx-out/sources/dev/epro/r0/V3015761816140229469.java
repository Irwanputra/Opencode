package dev.epro.r0;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V3015761816140229469 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ M10701816181309613444 a;

    public V3015761816140229469(M10701816181309613444 m10701816181309613444) {
        this.a = m10701816181309613444;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        S9684361936304835821 s9684361936304835821;
        if (i == -1 || (s9684361936304835821 = this.a.c) == null) {
            return;
        }
        s9684361936304835821.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
