package dev.epro.r0;

import android.widget.AbsListView;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H2403852577558633051 implements AbsListView.OnScrollListener {
    public final /* synthetic */ M10701816181309613444 a;

    public H2403852577558633051(M10701816181309613444 m10701816181309613444) {
        this.a = m10701816181309613444;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        M10701816181309613444 m10701816181309613444 = this.a;
        O1721407113567964106 o1721407113567964106 = m10701816181309613444.r;
        F6594473573882211675 f6594473573882211675 = m10701816181309613444.z;
        if (i != 1 || f6594473573882211675.getInputMethodMode() == 2 || f6594473573882211675.getContentView() == null) {
            return;
        }
        m10701816181309613444.v.removeCallbacks(o1721407113567964106);
        o1721407113567964106.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
