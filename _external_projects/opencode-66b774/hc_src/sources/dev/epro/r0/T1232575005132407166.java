package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class T1232575005132407166 implements Cloneable {
    public final I10827619964430248728 a;
    public I10827619964430248728 b;

    public T1232575005132407166(I10827619964430248728 i10827619964430248728) {
        this.a = i10827619964430248728;
        if (i10827619964430248728.e()) {
            S10973172697741180971.j("Default instance must be immutable.");
            throw null;
        }
        this.b = (I10827619964430248728) i10827619964430248728.f(4);
    }

    public final I10827619964430248728 a() {
        boolean e = this.b.e();
        I10827619964430248728 i10827619964430248728 = this.b;
        if (e) {
            i10827619964430248728.getClass();
            F13787414490045888232.c.a(i10827619964430248728.getClass()).b(i10827619964430248728);
            i10827619964430248728.j();
            i10827619964430248728 = this.b;
        }
        i10827619964430248728.getClass();
        boolean z = true;
        byte byteValue = ((Byte) i10827619964430248728.f(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                z = F13787414490045888232.c.a(i10827619964430248728.getClass()).c(i10827619964430248728);
                i10827619964430248728.f(2);
            }
        }
        if (z) {
            return i10827619964430248728;
        }
        throw new M8821877208104636290("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void b() {
        if (this.b.e()) {
            return;
        }
        I10827619964430248728 i10827619964430248728 = (I10827619964430248728) this.a.f(4);
        F13787414490045888232.c.a(i10827619964430248728.getClass()).d(i10827619964430248728, this.b);
        this.b = i10827619964430248728;
    }

    public final Object clone() {
        T1232575005132407166 t1232575005132407166 = (T1232575005132407166) this.a.f(5);
        boolean e = this.b.e();
        I10827619964430248728 i10827619964430248728 = this.b;
        if (e) {
            i10827619964430248728.getClass();
            F13787414490045888232.c.a(i10827619964430248728.getClass()).b(i10827619964430248728);
            i10827619964430248728.j();
            i10827619964430248728 = this.b;
        }
        t1232575005132407166.b = i10827619964430248728;
        return t1232575005132407166;
    }
}
