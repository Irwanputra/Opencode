package dev.epro.r0;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P1530735476536904619 implements Iterator {
    public final /* synthetic */ byte a;
    public int b = -1;
    public boolean c;
    public Iterator d;
    public final /* synthetic */ AbstractMap e;

    public /* synthetic */ P1530735476536904619(AbstractMap abstractMap, byte b) {
        this.a = b;
        this.e = abstractMap;
    }

    public Iterator a() {
        Iterator it = this.d;
        if (it != null) {
            return it;
        }
        Iterator it2 = ((E17436120295797655087) this.e).b.entrySet().iterator();
        this.d = it2;
        return it2;
    }

    public Iterator b() {
        Iterator it = this.d;
        if (it != null) {
            return it;
        }
        Iterator it2 = ((E11030406304573768846) this.e).c.entrySet().iterator();
        this.d = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        AbstractMap abstractMap = this.e;
        switch (b) {
            case 0:
                E17436120295797655087 e17436120295797655087 = (E17436120295797655087) abstractMap;
                if (this.b + 1 >= e17436120295797655087.a.size()) {
                    if (e17436120295797655087.b.isEmpty() || !a().hasNext()) {
                        break;
                    }
                }
                break;
            default:
                E11030406304573768846 e11030406304573768846 = (E11030406304573768846) abstractMap;
                if (this.b + 1 >= e11030406304573768846.b) {
                    if (e11030406304573768846.c.isEmpty() || !b().hasNext()) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        AbstractMap abstractMap = this.e;
        switch (b) {
            case 0:
                this.c = true;
                int i = this.b + 1;
                this.b = i;
                E17436120295797655087 e17436120295797655087 = (E17436120295797655087) abstractMap;
                return i < e17436120295797655087.a.size() ? (Map.Entry) e17436120295797655087.a.get(this.b) : (Map.Entry) a().next();
            default:
                this.c = true;
                int i2 = this.b + 1;
                this.b = i2;
                E11030406304573768846 e11030406304573768846 = (E11030406304573768846) abstractMap;
                return i2 < e11030406304573768846.b ? (L16776831627675862909) e11030406304573768846.a[i2] : (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.a;
        AbstractMap abstractMap = this.e;
        switch (b) {
            case 0:
                E17436120295797655087 e17436120295797655087 = (E17436120295797655087) abstractMap;
                if (!this.c) {
                    S10973172697741180971.m("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    int i = E17436120295797655087.f;
                    e17436120295797655087.b();
                    if (this.b >= e17436120295797655087.a.size()) {
                        a().remove();
                        break;
                    } else {
                        int i2 = this.b;
                        this.b = i2 - 1;
                        e17436120295797655087.h(i2);
                        break;
                    }
                }
            default:
                if (!this.c) {
                    S10973172697741180971.m("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    E11030406304573768846 e11030406304573768846 = (E11030406304573768846) abstractMap;
                    int i3 = E11030406304573768846.g;
                    e11030406304573768846.g();
                    int i4 = this.b;
                    if (i4 >= e11030406304573768846.b) {
                        b().remove();
                        break;
                    } else {
                        this.b = i4 - 1;
                        e11030406304573768846.e(i4);
                        break;
                    }
                }
        }
    }
}
