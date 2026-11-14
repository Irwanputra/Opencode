package dev.epro.r0;

import java.io.IOException;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class Y14506346404175699626 implements H17290033108192114773 {
    public final /* synthetic */ U15014152283416496379 a;
    public final /* synthetic */ D5801834531757281099 b;

    static {
        izmyclvb.qgayjvbiagej2(298);
    }

    private native void fnfnmrodsvbp(U15014152283416496379 u15014152283416496379, D5801834531757281099 d5801834531757281099);

    @Override // dev.epro.r0.H17290033108192114773
    public final native void onFailure(V16360509766617756755 v16360509766617756755, IOException iOException);

    @Override // dev.epro.r0.H17290033108192114773
    public final native void onResponse(V16360509766617756755 v16360509766617756755, P10917817599008460069 p10917817599008460069);

    public Y14506346404175699626(U15014152283416496379 u15014152283416496379, D5801834531757281099 d5801834531757281099) {
        this.a = u15014152283416496379;
        this.b = d5801834531757281099;
        fnfnmrodsvbp(u15014152283416496379, d5801834531757281099);
    }
}
