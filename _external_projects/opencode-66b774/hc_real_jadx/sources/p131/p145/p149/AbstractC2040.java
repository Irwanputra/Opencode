package p131.p145.p149;

import android.view.animation.Interpolator;

/* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2040 implements Cloneable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public float f8804;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Class f8805;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Interpolator f8807 = null;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f8806 = false;

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.ぁごぐすすぃ$〺つふすそ, reason: contains not printable characters */
    public static class C2041 extends AbstractC2040 {

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f8808;

        public C2041(float f, int i) {
            this.f8804 = f;
            this.f8808 = i;
            this.f8805 = Integer.TYPE;
            this.f8806 = true;
        }

        @Override // p131.p145.p149.AbstractC2040
        public Object clone() {
            C2041 c2041 = new C2041(this.f8804, this.f8808);
            c2041.f8807 = this.f8807;
            return c2041;
        }

        @Override // p131.p145.p149.AbstractC2040
        /* renamed from: 〺つふすそ */
        public Object mo4143() {
            return Integer.valueOf(this.f8808);
        }

        @Override // p131.p145.p149.AbstractC2040
        /* renamed from: くし〴〺ぅ */
        public void mo4144(Object obj) {
            if (obj == null || obj.getClass() != Integer.class) {
                return;
            }
            this.f8808 = ((Integer) obj).intValue();
            this.f8806 = true;
        }

        @Override // p131.p145.p149.AbstractC2040
        /* renamed from: げつ〴ぬぐ */
        public AbstractC2040 clone() {
            C2041 c2041 = new C2041(this.f8804, this.f8808);
            c2041.f8807 = this.f8807;
            return c2041;
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C2042 extends AbstractC2040 {

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public float f8809;

        public C2042(float f, float f2) {
            this.f8804 = f;
            this.f8809 = f2;
            this.f8805 = Float.TYPE;
            this.f8806 = true;
        }

        @Override // p131.p145.p149.AbstractC2040
        public Object clone() {
            C2042 c2042 = new C2042(this.f8804, this.f8809);
            c2042.f8807 = this.f8807;
            return c2042;
        }

        @Override // p131.p145.p149.AbstractC2040
        /* renamed from: 〺つふすそ */
        public Object mo4143() {
            return Float.valueOf(this.f8809);
        }

        @Override // p131.p145.p149.AbstractC2040
        /* renamed from: くし〴〺ぅ */
        public void mo4144(Object obj) {
            if (obj == null || obj.getClass() != Float.class) {
                return;
            }
            this.f8809 = ((Float) obj).floatValue();
            this.f8806 = true;
        }

        @Override // p131.p145.p149.AbstractC2040
        /* renamed from: げつ〴ぬぐ */
        public AbstractC2040 clone() {
            C2042 c2042 = new C2042(this.f8804, this.f8809);
            c2042.f8807 = this.f8807;
            return c2042;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public abstract Object mo4143();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public abstract void mo4144(Object obj);

    @Override // 
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public abstract AbstractC2040 clone();
}
