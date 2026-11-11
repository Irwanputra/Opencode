package p000.p001.p003;

import java.util.List;
import p000.AbstractC0714;
import p000.C0595;
import p000.C0712;
import p000.InterfaceC0717;
import p000.InterfaceC0720;
import p000.p001.p007.C0643;
import p000.p001.p007.C0645;
import p131.p155.p156.p157.C2098;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぁごぐすすぃ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0615 implements InterfaceC0717.InterfaceC0718 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final AbstractC0714 f4294;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0643 f4295;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final InterfaceC0720 f4296;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final int f4297;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final InterfaceC0612 f4298;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final List<InterfaceC0717> f4299;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int f4300;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f4301;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final C0595 f4302;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C0645 f4303;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final int f4304;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final int f4305;

    public C0615(List<InterfaceC0717> list, C0643 c0643, InterfaceC0612 interfaceC0612, C0645 c0645, int i, C0595 c0595, InterfaceC0720 interfaceC0720, AbstractC0714 abstractC0714, int i2, int i3, int i4) {
        this.f4299 = list;
        this.f4303 = c0645;
        this.f4295 = c0643;
        this.f4298 = interfaceC0612;
        this.f4300 = i;
        this.f4302 = c0595;
        this.f4296 = interfaceC0720;
        this.f4294 = abstractC0714;
        this.f4304 = i2;
        this.f4297 = i3;
        this.f4305 = i4;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C0712 m1776(C0595 c0595, C0643 c0643, InterfaceC0612 interfaceC0612, C0645 c0645) {
        if (this.f4300 >= this.f4299.size()) {
            throw new AssertionError();
        }
        this.f4301++;
        if (this.f4298 != null && !this.f4303.m1859(c0595.f4248)) {
            StringBuilder m4207 = C2098.m4207("network interceptor ");
            m4207.append(this.f4299.get(this.f4300 - 1));
            m4207.append(" must retain the same host and port");
            throw new IllegalStateException(m4207.toString());
        }
        if (this.f4298 != null && this.f4301 > 1) {
            StringBuilder m42072 = C2098.m4207("network interceptor ");
            m42072.append(this.f4299.get(this.f4300 - 1));
            m42072.append(" must call proceed() exactly once");
            throw new IllegalStateException(m42072.toString());
        }
        List<InterfaceC0717> list = this.f4299;
        int i = this.f4300;
        C0615 c0615 = new C0615(list, c0643, interfaceC0612, c0645, i + 1, c0595, this.f4296, this.f4294, this.f4304, this.f4297, this.f4305);
        InterfaceC0717 interfaceC0717 = list.get(i);
        C0712 mo1768 = interfaceC0717.mo1768(c0615);
        if (interfaceC0612 != null && this.f4300 + 1 < this.f4299.size() && c0615.f4301 != 1) {
            throw new IllegalStateException("network interceptor " + interfaceC0717 + " must call proceed() exactly once");
        }
        if (mo1768 == null) {
            throw new NullPointerException("interceptor " + interfaceC0717 + " returned null");
        }
        if (mo1768.f4752 != null) {
            return mo1768;
        }
        throw new IllegalStateException("interceptor " + interfaceC0717 + " returned a response with no body");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C0712 m1777(C0595 c0595) {
        return m1776(c0595, this.f4295, this.f4298, this.f4303);
    }
}
