package p034.p086.p087.p088;

import java.util.ArrayList;
import p034.p086.p087.C1552;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1521 extends C1544 {

    /* renamed from: えみにぃほす, reason: contains not printable characters */
    public ArrayList<C1544> f7035 = new ArrayList<>();

    @Override // p034.p086.p087.p088.C1544
    /* renamed from: ぉひのべい */
    public void mo3342() {
        this.f7035.clear();
        super.mo3342();
    }

    @Override // p034.p086.p087.p088.C1544
    /* renamed from: けときぜと, reason: contains not printable characters */
    public void mo3353(C1552 c1552) {
        super.mo3353(c1552);
        int size = this.f7035.size();
        for (int i = 0; i < size; i++) {
            this.f7035.get(i).mo3353(c1552);
        }
    }

    /* renamed from: こ〲しでおか */
    public void mo3347() {
        ArrayList<C1544> arrayList = this.f7035;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1544 c1544 = this.f7035.get(i);
            if (c1544 instanceof C1521) {
                ((C1521) c1544).mo3347();
            }
        }
    }
}
