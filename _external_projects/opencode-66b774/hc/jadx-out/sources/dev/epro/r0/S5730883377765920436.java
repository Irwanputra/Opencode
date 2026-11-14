package dev.epro.r0;

import android.content.ClipData;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class S5730883377765920436 implements L12639328004344855510 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ N17102349568798422850 b;

    public /* synthetic */ S5730883377765920436(N17102349568798422850 n17102349568798422850, byte b) {
        this.a = b;
        this.b = n17102349568798422850;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        String string;
        switch (this.a) {
            case 0:
                N17102349568798422850 n17102349568798422850 = this.b;
                n17102349568798422850.m1();
                n17102349568798422850.s.b();
                ClipData clipData = ((P444548812388912419) obj).a;
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
                return Boolean.TRUE;
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                N17102349568798422850 n171023495687984228502 = this.b;
                R7033599853981556291.E(n171023495687984228502.V0(), null, L856869997670741194.d, new E15526304912931078037((byte) 0, null, (T10370494902461206356) obj, n171023495687984228502, zBooleanValue), 1);
                return O9245300239821758723.a;
        }
    }
}
