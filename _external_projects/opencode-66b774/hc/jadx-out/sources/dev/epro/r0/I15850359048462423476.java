package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I15850359048462423476 extends O8620973563946607355 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Y8405992380652585640 f287o;
    public final I4293432593871965076 p;

    public I15850359048462423476(I4293432593871965076 i4293432593871965076, Y8405992380652585640 y8405992380652585640) {
        y8405992380652585640.getClass();
        this.f287o = y8405992380652585640;
        this.p = i4293432593871965076;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I15850359048462423476)) {
            return false;
        }
        I15850359048462423476 i15850359048462423476 = (I15850359048462423476) obj;
        return S10823041268949770285.t(this.f287o, i15850359048462423476.f287o) && S10823041268949770285.t(this.p, i15850359048462423476.p);
    }

    public final int hashCode() {
        int iHashCode = this.f287o.hashCode() * 31;
        I4293432593871965076 i4293432593871965076 = this.p;
        return iHashCode + (i4293432593871965076 == null ? 0 : i4293432593871965076.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f287o + ", owner=" + this.p + ')';
    }
}
