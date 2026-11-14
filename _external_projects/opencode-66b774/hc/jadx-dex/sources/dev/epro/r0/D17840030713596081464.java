package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D17840030713596081464 {
    public final java.util.Map a;

    public D17840030713596081464(java.util.Map map) {
        this.a = map;
    }

    public final java.lang.Object a(float f) {
        java.lang.Object next;
        java.util.Iterator it = this.a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = java.lang.Math.abs(f - ((java.lang.Number) ((java.util.Map.Entry) next).getValue()).floatValue());
                do {
                    java.lang.Object next2 = it.next();
                    float fAbs2 = java.lang.Math.abs(f - ((java.lang.Number) ((java.util.Map.Entry) next2).getValue()).floatValue());
                    if (java.lang.Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public final java.lang.Object b(float f, boolean z) {
        java.lang.Object next;
        java.util.Iterator it = this.a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((java.lang.Number) ((java.util.Map.Entry) next).getValue()).floatValue();
                float f2 = z ? fFloatValue - f : f - fFloatValue;
                if (f2 < 0.0f) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    java.lang.Object next2 = it.next();
                    float fFloatValue2 = ((java.lang.Number) ((java.util.Map.Entry) next2).getValue()).floatValue();
                    float f3 = z ? fFloatValue2 - f : f - fFloatValue2;
                    if (f3 < 0.0f) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (java.lang.Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public final float c() {
        java.lang.Float fValueOf;
        java.util.Collection collectionValues = this.a.values();
        collectionValues.getClass();
        java.util.Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((java.lang.Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = java.lang.Math.min(fFloatValue, ((java.lang.Number) it.next()).floatValue());
            }
            fValueOf = java.lang.Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return Float.NaN;
    }

    public final float d(java.lang.Object obj) {
        java.lang.Float f = (java.lang.Float) this.a.get(obj);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.D17840030713596081464)) {
            return false;
        }
        return this.a.equals(((dev.epro.r0.D17840030713596081464) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final java.lang.String toString() {
        return "MapDraggableAnchors(" + this.a + ')';
    }
}
