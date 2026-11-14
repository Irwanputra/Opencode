package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U13686587393807097112 {
    public final Object a;
    public final T15443218846549482730 b;

    public U13686587393807097112(V3118049853945785650 v3118049853945785650, T15443218846549482730 t15443218846549482730) {
        this.a = v3118049853945785650;
        this.b = t15443218846549482730;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof U13686587393807097112) {
            U13686587393807097112 u13686587393807097112 = (U13686587393807097112) obj;
            return S10823041268949770285.t(this.a, u13686587393807097112.a) && this.b == u13686587393807097112.b;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
