package p034.p105.p106;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import p034.p094.AbstractC1680;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぇぬぎばつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1788 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f8033;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f8034;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f8035;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f8036;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public ArrayList<String> f8038;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f8039;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f8041;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f8042;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f8043;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public CharSequence f8044;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f8045;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public ArrayList<String> f8046;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public String f8047;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public CharSequence f8048;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public ArrayList<C1789> f8040 = new ArrayList<>();

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean f8037 = false;

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぇぬぎばつ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C1789 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public AbstractC1680.EnumC1681 f8049;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Fragment f8050;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public AbstractC1680.EnumC1681 f8051;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f8052;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f8053;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f8054;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f8055;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f8056;

        public C1789() {
        }

        public C1789(int i, Fragment fragment) {
            this.f8053 = i;
            this.f8050 = fragment;
            AbstractC1680.EnumC1681 enumC1681 = AbstractC1680.EnumC1681.RESUMED;
            this.f8051 = enumC1681;
            this.f8049 = enumC1681;
        }

        public C1789(int i, Fragment fragment, AbstractC1680.EnumC1681 enumC1681) {
            this.f8053 = i;
            this.f8050 = fragment;
            this.f8051 = fragment.f1200;
            this.f8049 = enumC1681;
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public abstract AbstractC1788 mo3834(Fragment fragment, AbstractC1680.EnumC1681 enumC1681);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3835(C1789 c1789) {
        this.f8040.add(c1789);
        c1789.f8052 = this.f8034;
        c1789.f8056 = this.f8039;
        c1789.f8054 = this.f8045;
        c1789.f8055 = this.f8041;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public abstract AbstractC1788 mo3836(Fragment fragment);

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public abstract int mo3837();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public abstract AbstractC1788 mo3838(Fragment fragment);

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public abstract void mo3839(int i, Fragment fragment, String str, int i2);

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public abstract void mo3840();
}
