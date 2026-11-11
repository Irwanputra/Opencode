package p034.p086.p087.p088.p089;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1536 implements InterfaceC1539 {

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f7124;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f7130;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public AbstractC1530 f7131;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public InterfaceC1539 f7127 = null;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f7123 = false;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f7126 = false;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public EnumC1537 f7128 = EnumC1537.UNKNOWN;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f7122 = 1;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public C1528 f7132 = null;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f7125 = false;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public List<InterfaceC1539> f7133 = new ArrayList();

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public List<C1536> f7129 = new ArrayList();

    /* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
    public enum EnumC1537 {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C1536(AbstractC1530 abstractC1530) {
        this.f7131 = abstractC1530;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7131.f7095.f7172);
        sb.append(":");
        sb.append(this.f7128);
        sb.append("(");
        sb.append(this.f7125 ? Integer.valueOf(this.f7124) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f7129.size());
        sb.append(":d=");
        sb.append(this.f7133.size());
        sb.append(">");
        return sb.toString();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3398() {
        this.f7129.clear();
        this.f7133.clear();
        this.f7125 = false;
        this.f7124 = 0;
        this.f7126 = false;
        this.f7123 = false;
    }

    /* renamed from: くし〴〺ぅ */
    public void mo3373(int i) {
        if (this.f7125) {
            return;
        }
        this.f7125 = true;
        this.f7124 = i;
        for (InterfaceC1539 interfaceC1539 : this.f7133) {
            interfaceC1539.mo3374(interfaceC1539);
        }
    }

    @Override // p034.p086.p087.p088.p089.InterfaceC1539
    /* renamed from: げつ〴ぬぐ */
    public void mo3374(InterfaceC1539 interfaceC1539) {
        Iterator<C1536> it = this.f7129.iterator();
        while (it.hasNext()) {
            if (!it.next().f7125) {
                return;
            }
        }
        this.f7126 = true;
        InterfaceC1539 interfaceC15392 = this.f7127;
        if (interfaceC15392 != null) {
            interfaceC15392.mo3374(this);
        }
        if (this.f7123) {
            this.f7131.mo3374(this);
            return;
        }
        C1536 c1536 = null;
        int i = 0;
        for (C1536 c15362 : this.f7129) {
            if (!(c15362 instanceof C1528)) {
                i++;
                c1536 = c15362;
            }
        }
        if (c1536 != null && i == 1 && c1536.f7125) {
            C1528 c1528 = this.f7132;
            if (c1528 != null) {
                if (!c1528.f7125) {
                    return;
                } else {
                    this.f7130 = this.f7122 * c1528.f7124;
                }
            }
            mo3373(c1536.f7124 + this.f7130);
        }
        InterfaceC1539 interfaceC15393 = this.f7127;
        if (interfaceC15393 != null) {
            interfaceC15393.mo3374(this);
        }
    }
}
