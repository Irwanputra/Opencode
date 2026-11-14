package dev.epro.r0;

import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes4.dex */
public final class Z3229501598171650063 implements Map.Entry, F10586287370236042155 {
    public final String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ G9962891503274545270 c;

    static {
        izmyclvb.qbtpmwoxbgtw3(26);
    }

    private native void tsqxpcccjnez(String str, G9962891503274545270 g9962891503274545270);

    @Override // java.util.Map.Entry
    public final native boolean equals(Object obj);

    @Override // java.util.Map.Entry
    public final native Object getKey();

    @Override // java.util.Map.Entry
    public final native Object getValue();

    @Override // java.util.Map.Entry
    public final native int hashCode();

    @Override // java.util.Map.Entry
    public final native Object setValue(Object obj);

    public Z3229501598171650063(String str, G9962891503274545270 g9962891503274545270) {
        this.b = str;
        this.c = g9962891503274545270;
        tsqxpcccjnez(str, g9962891503274545270);
    }
}
