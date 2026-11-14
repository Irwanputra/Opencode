package dev.epro.r0;

import ads_mobile_sdk.f01;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(int r8, dev.epro.r0.D9991952169288007667 r9, java.lang.Object r10) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r9.a
            r1 = 1
            if (r0 != 0) goto La
            r10 = 0
            r7.b(r8, r9, r10)
            return r1
        La:
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto L3a
            java.lang.Object r5 = r0.get(r4)
            boolean r6 = r5 instanceof dev.epro.r0.M7798980774515057476
            if (r6 == 0) goto L21
            if (r5 == r10) goto L1d
            goto L32
        L1d:
            r7.b(r3, r9, r5)
            return r1
        L21:
            boolean r6 = r5 instanceof dev.epro.r0.D9991952169288007667
            if (r6 == 0) goto L35
            r6 = r5
            dev.epro.r0.D9991952169288007667 r6 = (dev.epro.r0.D9991952169288007667) r6
            boolean r6 = r7.a(r8, r6, r10)
            if (r6 == 0) goto L32
            r7.b(r3, r9, r5)
            return r1
        L32:
            int r4 = r4 + 1
            goto L10
        L35:
            java.lang.String r7 = "Unexpected child source info "
            dev.epro.r0.Q11088980322693754445.i(r7, r5)
        L3a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L6855102173777462404.a(int, dev.epro.r0.D9991952169288007667, java.lang.Object):boolean");
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
        List a = l10759904335384498764.a(i);
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((G17613326942144185441) a.get(i2)).d(j));
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
