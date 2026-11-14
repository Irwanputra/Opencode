package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O12676570754658511684 {

    @O7462376509978667369("instant_app")
    public Boolean a;

    @O7462376509978667369("is_privileged_process")
    public boolean b;

    public O12676570754658511684(int i) {
        this.a = null;
        this.b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O12676570754658511684)) {
            return false;
        }
        O12676570754658511684 o12676570754658511684 = (O12676570754658511684) obj;
        return S10823041268949770285.t(this.a, o12676570754658511684.a) && this.b == o12676570754658511684.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SdkEnvironment(isInstantApp=" + this.a + ", isPrivilegedProcess=" + this.b + ")";
    }

    public O12676570754658511684() {
        this(0);
    }
}
