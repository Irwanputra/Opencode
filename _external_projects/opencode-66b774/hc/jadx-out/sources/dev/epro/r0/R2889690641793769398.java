package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R2889690641793769398 implements Appendable {
    public final StringBuilder a;
    public final ArrayList b;
    public final ArrayList c;

    public R2889690641793769398() {
        this.a = new StringBuilder(16);
        this.b = new ArrayList();
        this.c = new ArrayList();
        new ArrayList();
    }

    public final void a(W1742516786250891319 w1742516786250891319, int i, int i2) {
        this.c.add(new P2629705021614852310(w1742516786250891319, i, i2, 8));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof M11181104712105445833) {
            c((M11181104712105445833) charSequence);
            return this;
        }
        this.a.append(charSequence);
        return this;
    }

    public final void b(char c) {
        this.a.append(c);
    }

    public final void c(M11181104712105445833 m11181104712105445833) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append(m11181104712105445833.b);
        List list = m11181104712105445833.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                F14378331124810887321 f14378331124810887321 = (F14378331124810887321) list.get(i);
                this.c.add(new P2629705021614852310(f14378331124810887321.a, f14378331124810887321.b + length, f14378331124810887321.c + length, f14378331124810887321.d));
            }
        }
    }

    public final void d(M11181104712105445833 m11181104712105445833, int i, int i2) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append((CharSequence) m11181104712105445833.b, i, i2);
        List listA = Z15472362586437216226.a(m11181104712105445833, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                F14378331124810887321 f14378331124810887321 = (F14378331124810887321) listA.get(i3);
                this.c.add(new P2629705021614852310(f14378331124810887321.a, f14378331124810887321.b + length, f14378331124810887321.c + length, f14378331124810887321.d));
            }
        }
    }

    public final void e(String str) {
        this.a.append(str);
    }

    public final void f() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            T12055643479535528558.b("Nothing to pop.");
        }
        ((P2629705021614852310) arrayList.remove(arrayList.size() - 1)).c = this.a.length();
    }

    public final void g(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            T12055643479535528558.b(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            f();
        }
    }

    public final int h(W1742516786250891319 w1742516786250891319) {
        P2629705021614852310 p2629705021614852310 = new P2629705021614852310(w1742516786250891319, this.a.length(), 0, 12);
        this.b.add(p2629705021614852310);
        this.c.add(p2629705021614852310);
        return r5.size() - 1;
    }

    public final M11181104712105445833 i() {
        StringBuilder sb = this.a;
        String string = sb.toString();
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((P2629705021614852310) arrayList.get(i)).a(sb.length()));
        }
        return new M11181104712105445833(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof M11181104712105445833) {
            d((M11181104712105445833) charSequence, i, i2);
            return this;
        }
        this.a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.a.append(c);
        return this;
    }

    public R2889690641793769398(M11181104712105445833 m11181104712105445833) {
        this();
        c(m11181104712105445833);
    }
}
