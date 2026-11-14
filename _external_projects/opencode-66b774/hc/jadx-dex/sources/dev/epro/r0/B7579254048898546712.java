package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B7579254048898546712 extends dev.epro.r0.F12738319475220657879 {
    public final /* synthetic */ byte d = 0;
    public final transient java.lang.Object e;

    public B7579254048898546712(java.lang.Object obj) {
        obj.getClass();
        this.e = obj;
    }

    public dev.epro.r0.N7756202525712935399 a() {
        switch (this.d) {
            case 1:
                dev.epro.r0.H13215157385046624211 h13215157385046624211 = dev.epro.r0.N7756202525712935399.b;
                java.lang.Object[] objArr = {this.e};
                dev.epro.r0.E3422549137300678133.M(1, objArr);
                return dev.epro.r0.N7756202525712935399.m(1, objArr);
            default:
                return super.a();
        }
    }

    public int b(java.lang.Object[] objArr) {
        switch (this.d) {
            case 1:
                objArr[0] = this.e;
                return 1;
            default:
                return super/*dev.epro.r0.H9330595680939527366*/.b(objArr);
        }
    }

    public final boolean contains(java.lang.Object obj) {
        byte b = this.d;
        java.lang.Object obj2 = this.e;
        switch (b) {
            case 0:
                if (obj instanceof java.util.Map.Entry) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                    java.lang.Object key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    java.util.Collection collection = (java.util.Collection) ((dev.epro.r0.S14617281980864379711) obj2).a().get(key);
                    if (collection != null && collection.contains(value)) {
                        return true;
                    }
                }
                return false;
            default:
                return obj2.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.d) {
            case 1:
                return this.e.hashCode();
            default:
                return super.hashCode();
        }
    }

    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        switch (this.d) {
        }
        return l();
    }

    public final boolean k() {
        switch (this.d) {
        }
        return false;
    }

    public final dev.epro.r0.U1864172318023436692 l() {
        byte b = this.d;
        java.lang.Object obj = this.e;
        switch (b) {
            case 0:
                return new dev.epro.r0.I10863020211828197177((dev.epro.r0.S14617281980864379711) obj);
            default:
                return new dev.epro.r0.U4180701753337592613(obj);
        }
    }

    public final int size() {
        switch (this.d) {
            case 0:
                return ((dev.epro.r0.S14617281980864379711) this.e).b;
            default:
                return 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String toString() {
        switch (this.d) {
            case 1:
                return "[" + this.e.toString() + ']';
            default:
                return super/*java.util.AbstractCollection*/.toString();
        }
    }

    public B7579254048898546712(dev.epro.r0.S14617281980864379711 s14617281980864379711) {
        this.e = s14617281980864379711;
    }
}
