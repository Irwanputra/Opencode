package dev.epro.r0;

import android.content.ClipData;
import android.view.DragEvent;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A8343247053991953801 implements S10968390115446410054 {
    public final /* synthetic */ L2088545775067967710 a;
    public final /* synthetic */ S5730883377765920436 b;
    public final /* synthetic */ L2088545775067967710 c;
    public final /* synthetic */ L2088545775067967710 d;
    public final /* synthetic */ L2088545775067967710 e;
    public final /* synthetic */ L2088545775067967710 f;

    public A8343247053991953801(L2088545775067967710 l2088545775067967710, S5730883377765920436 s5730883377765920436, L2088545775067967710 l20885457750679677102, L2088545775067967710 l20885457750679677103, L2088545775067967710 l20885457750679677104, L2088545775067967710 l20885457750679677105) {
        this.a = l2088545775067967710;
        this.b = s5730883377765920436;
        this.c = l20885457750679677102;
        this.d = l20885457750679677103;
        this.e = l20885457750679677104;
        this.f = l20885457750679677105;
    }

    @Override // dev.epro.r0.S10968390115446410054
    public final void U0(Q9265972499284275049 q9265972499284275049) {
        this.f.invoke(q9265972499284275049);
    }

    @Override // dev.epro.r0.S10968390115446410054
    public final void a0(Q9265972499284275049 q9265972499284275049) {
        this.c.invoke(q9265972499284275049);
    }

    @Override // dev.epro.r0.S10968390115446410054
    public final boolean j(Q9265972499284275049 q9265972499284275049) {
        String string;
        this.a.invoke(q9265972499284275049);
        DragEvent dragEvent = q9265972499284275049.a;
        ClipData clipData = dragEvent.getClipData();
        dragEvent.getClipDescription();
        N17102349568798422850 n17102349568798422850 = this.b.b;
        n17102349568798422850.m1();
        n17102349568798422850.s.b();
        int itemCount = clipData.getItemCount();
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            z = z || clipData.getItemAt(i).getText() != null;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            int itemCount2 = clipData.getItemCount();
            boolean z2 = false;
            for (int i2 = 0; i2 < itemCount2; i2++) {
                CharSequence text = clipData.getItemAt(i2).getText();
                if (text != null) {
                    if (z2) {
                        sb.append("\n");
                    }
                    sb.append(text);
                    z2 = true;
                }
            }
            string = sb.toString();
        } else {
            string = null;
        }
        J8045362843799184672.Z(n17102349568798422850);
        if (string != null) {
            N1420218926656397722.h(n17102349568798422850.q, string, false, false, 30);
        }
        return true;
    }

    @Override // dev.epro.r0.S10968390115446410054
    public final void q0(Q9265972499284275049 q9265972499284275049) {
        this.e.invoke(q9265972499284275049);
    }

    @Override // dev.epro.r0.S10968390115446410054
    public final void v(Q9265972499284275049 q9265972499284275049) {
        DragEvent dragEvent = q9265972499284275049.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
        N17102349568798422850 n17102349568798422850 = this.d.b;
        B1029012102904255937 b1029012102904255937B = n17102349568798422850.r.b();
        if (b1029012102904255937B != null && b1029012102904255937B.C()) {
            jFloatToRawIntBits = b1029012102904255937B.g(jFloatToRawIntBits);
        }
        int iD = n17102349568798422850.r.d(jFloatToRawIntBits, true);
        if (iD >= 0) {
            n17102349568798422850.q.j(T1335862270807194835.d(iD, iD));
        }
        n17102349568798422850.s.A(V8323072410254082725.a, jFloatToRawIntBits);
    }

    @Override // dev.epro.r0.S10968390115446410054
    public final void F(Q9265972499284275049 q9265972499284275049) {
    }
}
