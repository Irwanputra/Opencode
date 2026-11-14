package dev.epro.r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G3762749879526332652 {
    public final String a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public G3762749879526332652(String str, String str2, String str3) {
        this.a = str;
    }

    public final void a(G15471856606567993098 g15471856606567993098, Object... objArr) {
        this.d.add(new L14430836125261710634(g15471856606567993098, objArr));
    }

    public final void b(G15471856606567993098 g15471856606567993098, Object... objArr) {
        this.c.add(new L14430836125261710634(g15471856606567993098, objArr));
    }

    public final boolean c() {
        return !this.d.isEmpty();
    }
}
