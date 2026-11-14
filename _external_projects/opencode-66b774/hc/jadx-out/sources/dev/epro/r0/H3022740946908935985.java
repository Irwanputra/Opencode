package dev.epro.r0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H3022740946908935985 implements M72006348651188775 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public H3022740946908935985(I4293432593871965076 i4293432593871965076, D2114992855359097313 d2114992855359097313, A7209497065939201693 a7209497065939201693) {
        this.a = (byte) 3;
        this.c = i4293432593871965076;
        this.b = d2114992855359097313;
        this.d = a7209497065939201693;
    }

    @Override // dev.epro.r0.M72006348651188775
    public final void a() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((B13729205492206812220) obj3).invoke();
                ((I4293432593871965076) obj2).j().b((F10239625753091103224) obj);
                break;
            case 1:
                ((R5670552972627103399) obj3).remove(obj2);
                ((O7205211285568135375) obj).d.l(obj2);
                break;
            case 2:
                R14289894334981469490 r14289894334981469490 = (R14289894334981469490) obj2;
                ((S11892176994350381461) obj3).b().c(r14289894334981469490);
                ((R5670552972627103399) obj).remove(r14289894334981469490);
                break;
            case 3:
                ((I4293432593871965076) obj2).j().b((D2114992855359097313) obj3);
                H16735746511170924136 h16735746511170924136 = (H16735746511170924136) ((A7209497065939201693) obj).a;
                if (h16735746511170924136 != null) {
                    h16735746511170924136.a();
                }
                break;
            default:
                U12915095113365621352 u12915095113365621352 = (U12915095113365621352) obj3;
                B2326601621622224214 b2326601621622224214 = (B2326601621622224214) obj;
                if (u12915095113365621352.b.l(obj2) == b2326601621622224214) {
                    Map map = u12915095113365621352.a;
                    Map mapD = b2326601621622224214.d();
                    if (!mapD.isEmpty()) {
                        map.put(obj2, mapD);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }

    public /* synthetic */ H3022740946908935985(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
