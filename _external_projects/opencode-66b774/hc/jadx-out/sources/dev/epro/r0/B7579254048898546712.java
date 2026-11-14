package dev.epro.r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B7579254048898546712 extends F12738319475220657879 {
    public final /* synthetic */ byte d = 0;
    public final transient Object e;

    public B7579254048898546712(Object obj) {
        obj.getClass();
        this.e = obj;
    }

    @Override // dev.epro.r0.F12738319475220657879, dev.epro.r0.H9330595680939527366
    public N7756202525712935399 a() {
        switch (this.d) {
            case 1:
                H13215157385046624211 h13215157385046624211 = N7756202525712935399.b;
                Object[] objArr = {this.e};
                E3422549137300678133.M(1, objArr);
                return N7756202525712935399.m(1, objArr);
            default:
                return super.a();
        }
    }

    @Override // dev.epro.r0.H9330595680939527366
    public int b(Object[] objArr) {
        switch (this.d) {
            case 1:
                objArr[0] = this.e;
                return 1;
            default:
                return super.b(objArr);
        }
    }

    @Override // dev.epro.r0.H9330595680939527366, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.d;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ((S14617281980864379711) obj2).a().get(key);
                    if (collection != null && collection.contains(value)) {
                        return true;
                    }
                }
                return false;
            default:
                return obj2.equals(obj);
        }
    }

    @Override // dev.epro.r0.F12738319475220657879, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.d) {
            case 1:
                return this.e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        switch (this.d) {
        }
        return iterator();
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final boolean k() {
        switch (this.d) {
        }
        return false;
    }

    @Override // dev.epro.r0.H9330595680939527366
    /* JADX INFO: renamed from: l */
    public final U1864172318023436692 iterator() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return new I10863020211828197177((S14617281980864379711) obj);
            default:
                return new U4180701753337592613(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.d) {
            case 0:
                return ((S14617281980864379711) this.e).b;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.d) {
            case 1:
                return "[" + this.e.toString() + ']';
            default:
                return super.toString();
        }
    }

    public B7579254048898546712(S14617281980864379711 s14617281980864379711) {
        this.e = s14617281980864379711;
    }
}
