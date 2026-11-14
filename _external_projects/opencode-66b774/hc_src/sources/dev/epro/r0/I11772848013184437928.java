package dev.epro.r0;

import java.io.Serializable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I11772848013184437928 implements Serializable {
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof C10696704014433963524) {
            return ((C10696704014433963524) obj).a;
        }
        return null;
    }

    public static String b(Object obj) {
        if (obj instanceof C10696704014433963524) {
            return ((C10696704014433963524) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof I11772848013184437928) {
            return S10823041268949770285.t(this.a, ((I11772848013184437928) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return b(this.a);
    }
}
