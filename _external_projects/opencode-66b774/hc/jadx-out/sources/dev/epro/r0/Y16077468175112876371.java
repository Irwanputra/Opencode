package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y16077468175112876371 implements Runnable {
    public final R4225980552687347745 a;
    public final D16915945238461757356 b;

    public Y16077468175112876371(R4225980552687347745 r4225980552687347745, D16915945238461757356 d16915945238461757356) {
        this.a = r4225980552687347745;
        this.b = d16915945238461757356;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        if (R4225980552687347745.f.w(this.a, this, R4225980552687347745.g(this.b))) {
            R4225980552687347745.e(this.a, false);
        }
    }
}
