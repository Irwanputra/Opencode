package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U9414423904173882634 {
    public final L2387191309177986288 a;
    public O12013896688000893502 b;
    public T10243012841839397329 c;

    public U9414423904173882634(L2387191309177986288 l2387191309177986288) {
        this.a = l2387191309177986288;
    }

    public final O12013896688000893502 a() {
        O12013896688000893502 o12013896688000893502 = this.b;
        if (o12013896688000893502 != null) {
            return o12013896688000893502;
        }
        S10823041268949770285.b0("keyboardActions");
        throw null;
    }

    public final boolean b(int i) {
        F4096073349764486348 f4096073349764486348;
        L2387191309177986288 l2387191309177986288;
        if (i == 7) {
            f4096073349764486348 = a().a;
        } else {
            if (i == 2) {
                a();
            } else if (i == 6) {
                f4096073349764486348 = a().b;
            } else if (i == 5) {
                a();
            } else if (i == 3) {
                a();
            } else if (i == 4) {
                a();
            } else if (i != 1 && i != 0) {
                S10973172697741180971.m("invalid ImeAction");
                return false;
            }
            f4096073349764486348 = null;
        }
        if (f4096073349764486348 != null) {
            f4096073349764486348.invoke(this);
            return true;
        }
        if (i == 6) {
            T10243012841839397329 t10243012841839397329 = this.c;
            if (t10243012841839397329 != null) {
                ((D10236220797215130727) t10243012841839397329).h(1, true);
                return true;
            }
            S10823041268949770285.b0("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (l2387191309177986288 = this.a) == null) {
                return false;
            }
            ((Y3239112907774449419) l2387191309177986288).a();
            return true;
        }
        T10243012841839397329 t102430128418393973292 = this.c;
        if (t102430128418393973292 != null) {
            ((D10236220797215130727) t102430128418393973292).h(2, true);
            return true;
        }
        S10823041268949770285.b0("focusManager");
        throw null;
    }
}
