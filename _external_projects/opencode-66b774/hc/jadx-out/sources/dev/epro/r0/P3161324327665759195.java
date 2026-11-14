package dev.epro.r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P3161324327665759195 extends F11254987978987383037 {
    public V8767056641518014226 f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;

    public P3161324327665759195(int i) {
        super(i);
        this.f = null;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    @Override // dev.epro.r0.F11254987978987383037
    public final boolean a() {
        if (!this.i.isEmpty()) {
            return true;
        }
        ArrayList arrayList = this.g;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((P5799335319119159120) obj).b()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // dev.epro.r0.F11254987978987383037
    public final boolean b() {
        if (!this.h.isEmpty()) {
            return true;
        }
        ArrayList arrayList = this.g;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((P5799335319119159120) obj).c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d(G15471856606567993098 g15471856606567993098, Object... objArr) {
        this.i.add(new L14430836125261710634(g15471856606567993098, objArr));
    }
}
