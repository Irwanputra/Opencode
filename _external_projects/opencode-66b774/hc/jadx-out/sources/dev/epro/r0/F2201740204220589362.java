package dev.epro.r0;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F2201740204220589362 implements N9120060264193354951 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ X7021780317955852078 b;
    public final List c;

    public F2201740204220589362(X7021780317955852078 x7021780317955852078) {
        this.a = (byte) 0;
        this.b = x7021780317955852078;
        this.c = new LinkedList();
    }

    @Override // dev.epro.r0.N9120060264193354951
    public final P17072065560811830427 a() {
        byte b = this.a;
        X7021780317955852078 x7021780317955852078 = this.b;
        List list = this.c;
        switch (b) {
            case 0:
                LinkedList linkedList = (LinkedList) list;
                F8163388105092107628 f8163388105092107628 = x7021780317955852078.a;
                if (f8163388105092107628.c(22)) {
                    linkedList.add((K13664774137076998873) f8163388105092107628.k());
                    return a();
                }
                if (f8163388105092107628.d(15, 20, 3)) {
                    x7021780317955852078.e = new F2201740204220589362(x7021780317955852078, linkedList);
                    return X7021780317955852078.e(f8163388105092107628.m().a);
                }
                if (!linkedList.isEmpty()) {
                    return X7021780317955852078.f((K13664774137076998873) linkedList.remove(0));
                }
                x7021780317955852078.c.m(new Q5919442540881695021(x7021780317955852078, (byte) 1));
                return x7021780317955852078.c(true, true);
            default:
                return !list.isEmpty() ? X7021780317955852078.f((K13664774137076998873) list.remove(0)) : new Q5919442540881695021(x7021780317955852078, (byte) 1).a();
        }
    }

    public F2201740204220589362(X7021780317955852078 x7021780317955852078, LinkedList linkedList) {
        this.a = (byte) 1;
        this.b = x7021780317955852078;
        this.c = linkedList;
    }
}
