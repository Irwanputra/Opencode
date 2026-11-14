package dev.epro.r0;

import ads_mobile_sdk.f01;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class L6855102173777462404 implements B18329032920392634747 {
    public final Object a;

    public L6855102173777462404(byte b) {
        switch (b) {
            case 1:
                Q9908018528090167751 q9908018528090167751 = C4240022152304578596.a;
                this.a = new Q9908018528090167751();
                break;
            case 2:
                this.a = new Object();
                break;
            case 3:
                this.a = V4416135141588678913.t(Boolean.FALSE);
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public boolean a(int i, D9991952169288007667 d9991952169288007667, Object obj) {
        ArrayList arrayList = d9991952169288007667.a;
        if (arrayList == null) {
            b(i, d9991952169288007667, null);
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof M7798980774515057476)) {
                if (!(obj2 instanceof D9991952169288007667)) {
                    Q11088980322693754445.i("Unexpected child source info ", obj2);
                    break;
                }
                if (a(i, (D9991952169288007667) obj2, obj)) {
                    b(0, d9991952169288007667, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                b(0, d9991952169288007667, obj2);
                return true;
            }
            i2++;
        }
        return false;
    }

    public void b(int i, D9991952169288007667 d9991952169288007667, Object obj) {
        ((ArrayList) this.a).add(new M5991154792349372656(i, null, null));
    }

    public abstract void c(N13814068345032586384 n13814068345032586384);

    public abstract void d();

    public abstract void e();

    public abstract I6148490667470006645 f(int i, int i2, int i3, long j);

    public abstract Object g();

    public List h(L10759904335384498764 l10759904335384498764, int i, long j) {
        Q9908018528090167751 q9908018528090167751 = (Q9908018528090167751) this.a;
        List list = (List) q9908018528090167751.b(i);
        if (list != null) {
            return list;
        }
        List listA = l10759904335384498764.a(i);
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((G17613326942144185441) listA.get(i2)).d(j));
        }
        q9908018528090167751.i(i, arrayList);
        return arrayList;
    }

    public abstract Object i();

    public void j(int i, Object obj, D9991952169288007667 d9991952169288007667, Object obj2) {
        if (S10823041268949770285.t(obj, O9023047933786425027.a)) {
            b(i, d9991952169288007667, null);
        }
    }

    public abstract F4096073349764486348 k(N13814068345032586384 n13814068345032586384);

    public abstract void l(E5386183571211952538 e5386183571211952538);

    public abstract void m(Object obj);

    @Override // dev.epro.r0.B18329032920392634747
    public void onDismissed(Bundle bundle) {
        ((f01) this.a).onDismissed(bundle);
    }

    @Override // dev.epro.r0.B18329032920392634747
    public void onError(Bundle bundle) {
        ((f01) this.a).onError(bundle);
    }

    @Override // dev.epro.r0.B18329032920392634747
    public void onShown(Bundle bundle) {
        ((f01) this.a).onShown(bundle);
    }

    public L6855102173777462404(f01 f01Var) {
        this.a = f01Var;
    }

    public void o() {
    }

    public void n(W3656598099029166611 w3656598099029166611) {
    }
}
