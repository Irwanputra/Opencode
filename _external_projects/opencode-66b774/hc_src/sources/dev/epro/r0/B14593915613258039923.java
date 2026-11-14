package dev.epro.r0;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B14593915613258039923 extends T3817383632789307090 {
    private static final B14593915613258039923 DEFAULT_INSTANCE;
    private static volatile X11083265167116078764 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private D11116981298317247998 strings_ = H7410314698464292688.d;

    static {
        B14593915613258039923 b14593915613258039923 = new B14593915613258039923();
        DEFAULT_INSTANCE = b14593915613258039923;
        T3817383632789307090.j(B14593915613258039923.class, b14593915613258039923);
    }

    public static B14593915613258039923 m() {
        return DEFAULT_INSTANCE;
    }

    public static A12186326491919036017 o() {
        return (A12186326491919036017) ((Y11622804996820966392) DEFAULT_INSTANCE.c(5));
    }

    @Override // dev.epro.r0.T3817383632789307090
    public final Object c(int i) {
        X11083265167116078764 x11083265167116078764;
        switch (L11610354117192841236.A(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new J12688447796732847593(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new B14593915613258039923();
            case 4:
                return new A12186326491919036017(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X11083265167116078764 x110832651671160787642 = PARSER;
                if (x110832651671160787642 != null) {
                    return x110832651671160787642;
                }
                synchronized (B14593915613258039923.class) {
                    try {
                        x11083265167116078764 = PARSER;
                        if (x11083265167116078764 == null) {
                            x11083265167116078764 = new Y16467866395019052000();
                            PARSER = x11083265167116078764;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return x11083265167116078764;
            default:
                Z3383101362411723454.t();
                return null;
        }
    }

    public final void l(Iterable iterable) {
        D11116981298317247998 d11116981298317247998 = this.strings_;
        boolean z = ((H7410314698464292688) d11116981298317247998).a;
        D11116981298317247998 d111169812983172479982 = d11116981298317247998;
        if (!z) {
            H7410314698464292688 h7410314698464292688 = (H7410314698464292688) d11116981298317247998;
            int i = h7410314698464292688.c;
            H7410314698464292688 i2 = h7410314698464292688.i(i == 0 ? 10 : i * 2);
            this.strings_ = i2;
            d111169812983172479982 = i2;
        }
        Charset charset = A9187767737237685029.a;
        if (iterable instanceof V6791345594253748120) {
            ((V6791345594253748120) iterable).d();
            Z3383101362411723454.s();
            return;
        }
        if (iterable instanceof I16207106522106600590) {
            ((H7410314698464292688) d111169812983172479982).addAll((Collection) iterable);
            return;
        }
        if ((d111169812983172479982 instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) d111169812983172479982).ensureCapacity(((Collection) iterable).size() + ((H7410314698464292688) d111169812983172479982).c);
        }
        H7410314698464292688 h74103146984642926882 = (H7410314698464292688) d111169812983172479982;
        int i3 = h74103146984642926882.c;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (h74103146984642926882.c - i3) + " is null.";
                for (int i4 = h74103146984642926882.c - 1; i4 >= i3; i4--) {
                    h74103146984642926882.remove(i4);
                }
                Z3383101362411723454.k(str);
                return;
            }
            h74103146984642926882.add(obj);
        }
    }

    public final D11116981298317247998 n() {
        return this.strings_;
    }
}
