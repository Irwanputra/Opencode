package dev.epro.r0;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N10542843603712830247 {
    public boolean a;
    public final Object b;
    public Object c;

    public N10542843603712830247() {
        this.b = new Object();
    }

    public boolean a(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((V10300877997588547986) this.c).b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (G16660188620551127941.y(((R9761660112265475292) obj).a, j)) {
                break;
            }
            i++;
        }
        R9761660112265475292 r9761660112265475292 = (R9761660112265475292) obj;
        if (r9761660112265475292 != null) {
            return r9761660112265475292.h;
        }
        return false;
    }

    public void b(I6845661640435175914 i6845661640435175914) {
        synchronized (this.b) {
            try {
                ArrayDeque arrayDeque = (ArrayDeque) this.c;
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.c = arrayDeque;
                }
                arrayDeque.add(i6845661640435175914);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(S14461012662136963693 s14461012662136963693) {
        I6845661640435175914 i6845661640435175914;
        synchronized (this.b) {
            if (((ArrayDeque) this.c) != null && !this.a) {
                this.a = true;
                while (true) {
                    synchronized (this.b) {
                        try {
                            i6845661640435175914 = (I6845661640435175914) ((ArrayDeque) this.c).poll();
                            if (i6845661640435175914 == null) {
                                this.a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    i6845661640435175914.c(s14461012662136963693);
                }
            }
        }
    }

    public N10542843603712830247(A18377563779865231301 a18377563779865231301, V10300877997588547986 v10300877997588547986) {
        this.b = a18377563779865231301;
        this.c = v10300877997588547986;
    }
}
