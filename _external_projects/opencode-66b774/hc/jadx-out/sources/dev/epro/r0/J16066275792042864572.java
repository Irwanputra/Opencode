package dev.epro.r0;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J16066275792042864572 implements M72006348651188775 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ J16066275792042864572(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // dev.epro.r0.M72006348651188775
    public final void a() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                T9913910714059887908 t9913910714059887908 = (T9913910714059887908) obj2;
                Q295190250517022391 q295190250517022391 = (Q295190250517022391) obj;
                if (t9913910714059887908.a != null) {
                    q295190250517022391.b.e();
                } else if (t9913910714059887908.b == null) {
                    S10973172697741180971.m("Unreachable");
                } else {
                    q295190250517022391.a.remove();
                }
                break;
            case 1:
                ((R14289894334981469490) obj2).k.b((V12013952329824586776) obj);
                break;
            case 2:
                ((Y5971758352763163472) obj2).a.l((G13614825504897127889) obj);
                break;
            case 3:
                ((R14311920889508127231) obj2).c.k(obj);
                break;
            case 4:
                Iterator it = ((List) ((L13148442655056575112) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((E405169748098369564) obj).b().c((R14289894334981469490) it.next());
                }
                break;
            case 5:
                I18373600287705206074 i18373600287705206074 = (I18373600287705206074) obj2;
                if (i18373600287705206074.b == ((A15234621907337682254) obj)) {
                    i18373600287705206074.b = null;
                    i18373600287705206074.a.setValue(null);
                }
                break;
            case 6:
                W1972671267364756056 w1972671267364756056 = (W1972671267364756056) obj2;
                L11334185135933894276 l11334185135933894276 = (L11334185135933894276) w1972671267364756056.getValue();
                if (l11334185135933894276 != null) {
                    D10175313246177059481 d10175313246177059481 = new D10175313246177059481(l11334185135933894276);
                    S9385204271696540760 s9385204271696540760 = (S9385204271696540760) obj;
                    if (s9385204271696540760 != null) {
                        s9385204271696540760.c(d10175313246177059481);
                    }
                    w1972671267364756056.setValue(null);
                }
                break;
            case 7:
                ((G429561569752528174) obj2).c.remove((F4096073349764486348) obj);
                break;
            case 8:
                ((W3656598099029166611) obj2).k.remove((W3656598099029166611) obj);
                break;
            case 9:
                W3656598099029166611 w3656598099029166611 = (W3656598099029166611) obj2;
                w3656598099029166611.getClass();
                C1787322630442623407 c1787322630442623407 = (C1787322630442623407) ((O11687042873311337343) obj).b.getValue();
                if (c1787322630442623407 != null) {
                    w3656598099029166611.j.remove(c1787322630442623407.a);
                }
                break;
            case 10:
                ((W3656598099029166611) obj2).j.remove((O4957013336652243483) obj);
                break;
            default:
                L11283005264715124852 l11283005264715124852 = (L11283005264715124852) obj2;
                View view = (View) obj;
                int i = l11283005264715124852.u - 1;
                l11283005264715124852.u = i;
                if (i == 0) {
                    WeakHashMap weakHashMap = W10240872260424387225.a;
                    Q5747078841744593420.c(view, null);
                    Q12598757537405990809.a(view, null);
                    view.removeOnAttachStateChangeListener(l11283005264715124852.v);
                }
                break;
        }
    }
}
