package p131.p161.p162.p163.p173;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p034.p095.C1687;
import p131.p161.p162.p163.C2243;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2180 {

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static final InterfaceC2177 f9117 = new C2168(0.5f);

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public InterfaceC2177 f9118;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2186 f9119;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public InterfaceC2177 f9120;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public C2183 f9121;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C2186 f9122;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C2186 f9123;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public InterfaceC2177 f9124;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C2183 f9125;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public InterfaceC2177 f9126;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C2186 f9127;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public C2183 f9128;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public C2183 f9129;

    public C2180() {
        this.f9123 = new C2189();
        this.f9119 = new C2189();
        this.f9122 = new C2189();
        this.f9127 = new C2189();
        this.f9124 = new C2178(0.0f);
        this.f9126 = new C2178(0.0f);
        this.f9120 = new C2178(0.0f);
        this.f9118 = new C2178(0.0f);
        this.f9128 = new C2183();
        this.f9121 = new C2183();
        this.f9129 = new C2183();
        this.f9125 = new C2183();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static C2181 m4283(Context context, AttributeSet attributeSet, int i, int i2, InterfaceC2177 interfaceC2177) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2243.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C2243.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C2243.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m4285(context, resourceId, resourceId2, interfaceC2177);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static InterfaceC2177 m4284(TypedArray typedArray, int i, InterfaceC2177 interfaceC2177) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return interfaceC2177;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new C2178(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C2168(peekValue.getFraction(1.0f, 1.0f)) : interfaceC2177;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C2181 m4285(Context context, int i, int i2, InterfaceC2177 interfaceC2177) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C2243.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(C2243.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(C2243.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(C2243.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(C2243.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(C2243.ShapeAppearance_cornerFamilyBottomLeft, i3);
            InterfaceC2177 m4284 = m4284(obtainStyledAttributes, C2243.ShapeAppearance_cornerSize, interfaceC2177);
            InterfaceC2177 m42842 = m4284(obtainStyledAttributes, C2243.ShapeAppearance_cornerSizeTopLeft, m4284);
            InterfaceC2177 m42843 = m4284(obtainStyledAttributes, C2243.ShapeAppearance_cornerSizeTopRight, m4284);
            InterfaceC2177 m42844 = m4284(obtainStyledAttributes, C2243.ShapeAppearance_cornerSizeBottomRight, m4284);
            InterfaceC2177 m42845 = m4284(obtainStyledAttributes, C2243.ShapeAppearance_cornerSizeBottomLeft, m4284);
            C2181 c2181 = new C2181();
            C2186 m3734 = C1687.m3734(i4);
            c2181.f9135 = m3734;
            C2181.m4288(m3734);
            c2181.f9136 = m42842;
            C2186 m37342 = C1687.m3734(i5);
            c2181.f9131 = m37342;
            C2181.m4288(m37342);
            c2181.f9138 = m42843;
            C2186 m37343 = C1687.m3734(i6);
            c2181.f9134 = m37343;
            C2181.m4288(m37343);
            c2181.f9132 = m42844;
            C2186 m37344 = C1687.m3734(i7);
            c2181.f9139 = m37344;
            C2181.m4288(m37344);
            c2181.f9130 = m42845;
            return c2181;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C2180 m4286(float f) {
        C2181 c2181 = new C2181(this);
        c2181.m4290(f);
        return c2181.m4291();
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean m4287(RectF rectF) {
        boolean z = this.f9125.getClass().equals(C2183.class) && this.f9121.getClass().equals(C2183.class) && this.f9128.getClass().equals(C2183.class) && this.f9129.getClass().equals(C2183.class);
        float mo4271 = this.f9124.mo4271(rectF);
        return z && ((this.f9126.mo4271(rectF) > mo4271 ? 1 : (this.f9126.mo4271(rectF) == mo4271 ? 0 : -1)) == 0 && (this.f9118.mo4271(rectF) > mo4271 ? 1 : (this.f9118.mo4271(rectF) == mo4271 ? 0 : -1)) == 0 && (this.f9120.mo4271(rectF) > mo4271 ? 1 : (this.f9120.mo4271(rectF) == mo4271 ? 0 : -1)) == 0) && ((this.f9119 instanceof C2189) && (this.f9123 instanceof C2189) && (this.f9122 instanceof C2189) && (this.f9127 instanceof C2189));
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.てぜきぽく$〺つふすそ, reason: contains not printable characters */
    public static final class C2181 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public InterfaceC2177 f9130;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C2186 f9131;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public InterfaceC2177 f9132;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public C2183 f9133;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C2186 f9134;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C2186 f9135;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public InterfaceC2177 f9136;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public C2183 f9137;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public InterfaceC2177 f9138;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public C2186 f9139;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public C2183 f9140;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public C2183 f9141;

        public C2181() {
            this.f9135 = new C2189();
            this.f9131 = new C2189();
            this.f9134 = new C2189();
            this.f9139 = new C2189();
            this.f9136 = new C2178(0.0f);
            this.f9138 = new C2178(0.0f);
            this.f9132 = new C2178(0.0f);
            this.f9130 = new C2178(0.0f);
            this.f9140 = new C2183();
            this.f9133 = new C2183();
            this.f9141 = new C2183();
            this.f9137 = new C2183();
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static float m4288(C2186 c2186) {
            Object obj;
            if (c2186 instanceof C2189) {
                obj = (C2189) c2186;
            } else {
                if (!(c2186 instanceof C2179)) {
                    return -1.0f;
                }
                obj = (C2179) c2186;
            }
            obj.getClass();
            return -1.0f;
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public C2181 m4289(float f) {
            this.f9138 = new C2178(f);
            return this;
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C2181 m4290(float f) {
            this.f9136 = new C2178(f);
            this.f9138 = new C2178(f);
            this.f9132 = new C2178(f);
            this.f9130 = new C2178(f);
            return this;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C2180 m4291() {
            return new C2180(this, null);
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public C2181 m4292(float f) {
            this.f9132 = new C2178(f);
            return this;
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public C2181 m4293(float f) {
            this.f9136 = new C2178(f);
            return this;
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public C2181 m4294(float f) {
            this.f9130 = new C2178(f);
            return this;
        }

        public C2181(C2180 c2180) {
            this.f9135 = new C2189();
            this.f9131 = new C2189();
            this.f9134 = new C2189();
            this.f9139 = new C2189();
            this.f9136 = new C2178(0.0f);
            this.f9138 = new C2178(0.0f);
            this.f9132 = new C2178(0.0f);
            this.f9130 = new C2178(0.0f);
            this.f9140 = new C2183();
            this.f9133 = new C2183();
            this.f9141 = new C2183();
            this.f9137 = new C2183();
            this.f9135 = c2180.f9123;
            this.f9131 = c2180.f9119;
            this.f9134 = c2180.f9122;
            this.f9139 = c2180.f9127;
            this.f9136 = c2180.f9124;
            this.f9138 = c2180.f9126;
            this.f9132 = c2180.f9120;
            this.f9130 = c2180.f9118;
            this.f9140 = c2180.f9128;
            this.f9133 = c2180.f9121;
            this.f9141 = c2180.f9129;
            this.f9137 = c2180.f9125;
        }
    }

    public C2180(C2181 c2181, C2182 c2182) {
        this.f9123 = c2181.f9135;
        this.f9119 = c2181.f9131;
        this.f9122 = c2181.f9134;
        this.f9127 = c2181.f9139;
        this.f9124 = c2181.f9136;
        this.f9126 = c2181.f9138;
        this.f9120 = c2181.f9132;
        this.f9118 = c2181.f9130;
        this.f9128 = c2181.f9140;
        this.f9121 = c2181.f9133;
        this.f9129 = c2181.f9141;
        this.f9125 = c2181.f9137;
    }
}
