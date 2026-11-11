package p131.p145.p149;

import android.view.View;
import p131.p145.p146.AbstractC2028;
import p131.p145.p146.AbstractC2029;
import p131.p145.p146.AbstractC2030;
import p131.p145.p147.p148.C2031;

/* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2043 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static AbstractC2029<View, Float> f8815 = new C2052("alpha");

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static AbstractC2029<View, Float> f8811 = new C2046("pivotX");

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static AbstractC2029<View, Float> f8814 = new C2044("pivotY");

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static AbstractC2029<View, Float> f8820 = new C2056("translationX");

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static AbstractC2029<View, Float> f8816 = new C2047("translationY");

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static AbstractC2029<View, Float> f8818 = new C2057("rotation");

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static AbstractC2029<View, Float> f8812 = new C2051("rotationX");

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static AbstractC2029<View, Float> f8810 = new C2053("rotationY");

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static AbstractC2029<View, Float> f8822 = new C2055("scaleX");

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static AbstractC2029<View, Float> f8813 = new C2049("scaleY");

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static AbstractC2029<View, Integer> f8823 = new C2045("scrollX");

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static AbstractC2029<View, Integer> f8817 = new C2048("scrollY");

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static AbstractC2029<View, Float> f8819 = new C2054("x");

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static AbstractC2029<View, Float> f8821 = new C2050("y");

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.いいにぽつ$〳ぜぞぜべっ, reason: contains not printable characters */
    public static class C2044 extends AbstractC2030<View> {
        public C2044(String str) {
            super(str);
        }

        @Override // p131.p145.p146.AbstractC2030
        /* renamed from: くし〴〺ぅ */
        public void mo4121(View view, float f) {
            C2031 m4122 = C2031.m4122(view);
            if (m4122.f8771 && m4122.f8761 == f) {
                return;
            }
            m4122.m4124();
            m4122.f8771 = true;
            m4122.f8761 = f;
            m4122.m4123();
        }

        @Override // p131.p145.p146.AbstractC2029
        /* renamed from: げつ〴ぬぐ */
        public Float mo4120(Object obj) {
            return Float.valueOf(C2031.m4122((View) obj).f8761);
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.いいにぽつ$〺つふすそ, reason: contains not printable characters */
    public static class C2045 extends AbstractC2028<View> {
        public C2045(String str) {
            super(str);
        }

        @Override // p131.p145.p146.AbstractC2029
        /* renamed from: げつ〴ぬぐ */
        public Integer mo4120(Object obj) {
            View view = C2031.m4122((View) obj).f8760.get();
            return Integer.valueOf(view == null ? 0 : view.getScrollX());
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.いいにぽつ$ぁごぐすすぃ, reason: contains not printable characters */
    public static class C2046 extends AbstractC2030<View> {
        public C2046(String str) {
            super(str);
        }

        @Override // p131.p145.p146.AbstractC2030
        /* renamed from: くし〴〺ぅ */
        public void mo4121(View view, float f) {
            C2031 m4122 = C2031.m4122(view);
            if (m4122.f8771 && m4122.f8769 == f) {
                return;
            }
            m4122.m4124();
            m4122.f8771 = true;
            m4122.f8769 = f;
            m4122.m4123();
        }

        @Override // p131.p145.p146.AbstractC2029
        /* renamed from: げつ〴ぬぐ */
        public Float mo4120(Object obj) {
            return Float.valueOf(C2031.m4122((View) obj).f8769);
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.いいにぽつ$いいにぽつ, reason: contains not printable characters */
    public static class C2047 extends AbstractC2030<View> {
        public C2047(String str) {
            super(str);
        }

        @Override // p131.p145.p146.AbstractC2030
        /* renamed from: くし〴〺ぅ */
        public void mo4121(View view, float f) {
            C2031 m4122 = C2031.m4122(view);
            if (m4122.f8772 != f) {
                m4122.m4124();
                m4122.f8772 = f;
                m4122.m4123();
            }
        }

        @Override // p131.p145.p146.AbstractC2029
        /* renamed from: げつ〴ぬぐ */
        public Float mo4120(Object obj) {
            return Float.valueOf(C2031.m4122((View) obj).f8772);
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.いいにぽつ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C2048 extends AbstractC2028<View> {
        public C2048(String str) {
            super(str);
        }

        @Override // p131.p145.p146.AbstractC2029
        /* renamed from: げつ〴ぬぐ */
        public Integer mo4120(Object obj) {
            View view = C2031.m4122((View) obj).f8760.get();
            return Integer.valueOf(view == null ? 0 : view.getScrollY());
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.いいにぽつ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C2049 extends AbstractC2030<View> {
        public C2049(String str) {
            super(str);
        }

        @Override // p131.p145.p146.AbstractC2030
        /* renamed from: くし〴〺ぅ */
        public void mo4121(View view, float f) {
            C2031 m4122 = C2031.m4122(view);
            if (m4122.f8768 != f) {
                m4122.m4124();
                m4122.f8768 = f;
                m4122.m4123();
            }
        }

        @Override // p131.p145.p146.AbstractC2029
        /* renamed from: げつ〴ぬぐ */
        public Float mo4120(Object obj) {
            return Float.valueOf(C2031.m4122((View) obj).f8768);
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.いいにぽつ$づざかべべ, reason: contains not printable characters */
    public static class C2050 extends AbstractC2030<View> {
        public C2050(String str) {
            super(str);
        }

        @Override // p131.p145.p146.AbstractC2030
        /* renamed from: くし〴〺ぅ */
        public void mo4121(View view, float f) {
            C2031 m4122 = C2031.m4122(view);
            if (m4122.f8760.get() != null) {
                float top = f - r0.getTop();
                if (m4122.f8772 != top) {
                    m4122.m4124();
                    m4122.f8772 = top;
                    m4122.m4123();
                }
            }
        }

        @Override // p131.p145.p146.AbstractC2029
        /* renamed from: げつ〴ぬぐ */
        public Float mo4120(Object obj) {
            float top;
            C2031 m4122 = C2031.m4122((View) obj);
            if (m4122.f8760.get() == null) {
                top = 0.0f;
            } else {
                top = m4122.f8772 + r0.getTop();
            }
            return Float.valueOf(top);
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.いいにぽつ$てぜきぽく, reason: contains not printable characters */
    public static class C2051 extends AbstractC2030<View> {
        public C2051(String str) {
            super(str);
        }

        @Override // p131.p145.p146.AbstractC2030
        /* renamed from: くし〴〺ぅ */
        public void mo4121(View view, float f) {
            C2031 m4122 = C2031.m4122(view);
            if (m4122.f8759 != f) {
                m4122.m4124();
                m4122.f8759 = f;
                m4122.m4123();
            }
        }

        @Override // p131.p145.p146.AbstractC2029
        /* renamed from: げつ〴ぬぐ */
        public Float mo4120(Object obj) {
            return Float.valueOf(C2031.m4122((View) obj).f8759);
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.いいにぽつ$なぎぱいぢぎ, reason: contains not printable characters */
    public static class C2052 extends AbstractC2030<View> {
        public C2052(String str) {
            super(str);
        }

        @Override // p131.p145.p146.AbstractC2030
        /* renamed from: くし〴〺ぅ */
        public void mo4121(View view, float f) {
            C2031.m4122(view).m4127(f);
        }

        @Override // p131.p145.p146.AbstractC2029
        /* renamed from: げつ〴ぬぐ */
        public Float mo4120(Object obj) {
            return Float.valueOf(C2031.m4122((View) obj).f8767);
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.いいにぽつ$のぷのちつ, reason: contains not printable characters */
    public static class C2053 extends AbstractC2030<View> {
        public C2053(String str) {
            super(str);
        }

        @Override // p131.p145.p146.AbstractC2030
        /* renamed from: くし〴〺ぅ */
        public void mo4121(View view, float f) {
            C2031 m4122 = C2031.m4122(view);
            if (m4122.f8773 != f) {
                m4122.m4124();
                m4122.f8773 = f;
                m4122.m4123();
            }
        }

        @Override // p131.p145.p146.AbstractC2029
        /* renamed from: げつ〴ぬぐ */
        public Float mo4120(Object obj) {
            return Float.valueOf(C2031.m4122((View) obj).f8773);
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.いいにぽつ$びぐびあび, reason: contains not printable characters */
    public static class C2054 extends AbstractC2030<View> {
        public C2054(String str) {
            super(str);
        }

        @Override // p131.p145.p146.AbstractC2030
        /* renamed from: くし〴〺ぅ */
        public void mo4121(View view, float f) {
            C2031 m4122 = C2031.m4122(view);
            if (m4122.f8760.get() != null) {
                float left = f - r0.getLeft();
                if (m4122.f8770 != left) {
                    m4122.m4124();
                    m4122.f8770 = left;
                    m4122.m4123();
                }
            }
        }

        @Override // p131.p145.p146.AbstractC2029
        /* renamed from: げつ〴ぬぐ */
        public Float mo4120(Object obj) {
            float left;
            C2031 m4122 = C2031.m4122((View) obj);
            if (m4122.f8760.get() == null) {
                left = 0.0f;
            } else {
                left = m4122.f8770 + r0.getLeft();
            }
            return Float.valueOf(left);
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.いいにぽつ$へぬ〴づぞ, reason: contains not printable characters */
    public static class C2055 extends AbstractC2030<View> {
        public C2055(String str) {
            super(str);
        }

        @Override // p131.p145.p146.AbstractC2030
        /* renamed from: くし〴〺ぅ */
        public void mo4121(View view, float f) {
            C2031 m4122 = C2031.m4122(view);
            if (m4122.f8774 != f) {
                m4122.m4124();
                m4122.f8774 = f;
                m4122.m4123();
            }
        }

        @Override // p131.p145.p146.AbstractC2029
        /* renamed from: げつ〴ぬぐ */
        public Float mo4120(Object obj) {
            return Float.valueOf(C2031.m4122((View) obj).f8774);
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.いいにぽつ$ぺぁあねじ, reason: contains not printable characters */
    public static class C2056 extends AbstractC2030<View> {
        public C2056(String str) {
            super(str);
        }

        @Override // p131.p145.p146.AbstractC2030
        /* renamed from: くし〴〺ぅ */
        public void mo4121(View view, float f) {
            C2031 m4122 = C2031.m4122(view);
            if (m4122.f8770 != f) {
                m4122.m4124();
                m4122.f8770 = f;
                m4122.m4123();
            }
        }

        @Override // p131.p145.p146.AbstractC2029
        /* renamed from: げつ〴ぬぐ */
        public Float mo4120(Object obj) {
            return Float.valueOf(C2031.m4122((View) obj).f8770);
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.いいにぽつ$ぺふねづ〺, reason: contains not printable characters */
    public static class C2057 extends AbstractC2030<View> {
        public C2057(String str) {
            super(str);
        }

        @Override // p131.p145.p146.AbstractC2030
        /* renamed from: くし〴〺ぅ */
        public void mo4121(View view, float f) {
            C2031 m4122 = C2031.m4122(view);
            if (m4122.f8762 != f) {
                m4122.m4124();
                m4122.f8762 = f;
                m4122.m4123();
            }
        }

        @Override // p131.p145.p146.AbstractC2029
        /* renamed from: げつ〴ぬぐ */
        public Float mo4120(Object obj) {
            return Float.valueOf(C2031.m4122((View) obj).f8762);
        }
    }
}
