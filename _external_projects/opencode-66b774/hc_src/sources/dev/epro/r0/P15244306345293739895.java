package dev.epro.r0;

import android.content.Context;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P15244306345293739895 extends O10944101174480148852 {
    public final V697849047308847220 j;
    public boolean k;

    public P15244306345293739895(Context context) {
        super(context);
        this.j = V4416135141588678913.t(X7836141768918399705.a);
    }

    @Override // dev.epro.r0.O10944101174480148852
    public final void a(int i, M3727281027331139839 m3727281027331139839) {
        m3727281027331139839.b0(576708319);
        int i2 = (m3727281027331139839.h(this) ? 4 : 2) | i;
        if (m3727281027331139839.R(i2 & 1, (i2 & 3) != 2)) {
            ((L12639328004344855510) this.j.getValue()).invoke(m3727281027331139839, 0);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new Q15027034467569330017(this, i, (byte) 0);
        }
    }

    @Override // dev.epro.r0.O10944101174480148852
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.k;
    }
}
