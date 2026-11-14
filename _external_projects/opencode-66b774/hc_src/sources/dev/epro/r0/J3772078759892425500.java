package dev.epro.r0;

import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J3772078759892425500 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ J3772078759892425500(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        InputConnection inputConnection;
        long j;
        boolean z = true;
        switch (this.a) {
            case 0:
                L17223171236090219140 l17223171236090219140 = (L17223171236090219140) this.b;
                synchronized (l17223171236090219140.c) {
                    try {
                        l17223171236090219140.e = true;
                        D389890677992184566 d389890677992184566 = l17223171236090219140.d;
                        Object[] objArr = d389890677992184566.a;
                        int i = d389890677992184566.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            R7938697196150024245 r7938697196150024245 = (R7938697196150024245) ((D3072230964632682649) objArr[i2]).get();
                            if (r7938697196150024245 != null && (inputConnection = r7938697196150024245.b) != null) {
                                inputConnection.closeConnection();
                                r7938697196150024245.b = null;
                            }
                        }
                        l17223171236090219140.d.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Z1884745115210481769 z1884745115210481769 = ((N17834861578880914456) this.c).b;
                z1884745115210481769.b.set(null);
                z1884745115210481769.a.h();
                return O9245300239821758723.a;
            case 1:
                C18359104897526640234 c18359104897526640234 = (C18359104897526640234) this.b;
                W18263852592135540231 w18263852592135540231 = (W18263852592135540231) this.c;
                synchronized (c18359104897526640234.e) {
                    c18359104897526640234.g.remove(w18263852592135540231);
                }
                return O9245300239821758723.a;
            case 2:
                ((Choreographer) ((X13682529397961211704) this.b).b).removeFrameCallback((W18263852592135540231) this.c);
                return O9245300239821758723.a;
            case 3:
                KeyEvent keyEvent = ((Q16871679788547714558) obj).a;
                W1972671267364756056 w1972671267364756056 = (W1972671267364756056) this.c;
                if (!((P5204863746366580363) this.b).b()) {
                    w1972671267364756056.setValue(Boolean.FALSE);
                }
                return Boolean.FALSE;
            case 4:
                KeyEvent keyEvent2 = ((Q16871679788547714558) obj).a;
                if (((I2076339260272013590) this.b).a() == I3645473568512758926.b && keyEvent2.getKeyCode() == 4 && D15445857918358799638.K(keyEvent2) == 1) {
                    ((L9852841107405549527) this.c).d(null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                D7201182503133677242 d7201182503133677242 = (D7201182503133677242) obj;
                synchronized (D459204867321966484.c) {
                    j = D459204867321966484.e;
                    D459204867321966484.e = 1 + j;
                }
                return new A6237865184482427403(j, d7201182503133677242, (F4096073349764486348) this.b, (F4096073349764486348) this.c);
            case 6:
                T558270488962777544 t558270488962777544 = (T558270488962777544) this.b;
                Object obj2 = t558270488962777544.b;
                H7219028874700587498 h7219028874700587498 = (H7219028874700587498) this.c;
                synchronized (obj2) {
                    ((ArrayList) t558270488962777544.c).remove(h7219028874700587498);
                }
                return O9245300239821758723.a;
            case 7:
                KeyEvent keyEvent3 = ((Q16871679788547714558) obj).a;
                T10243012841839397329 t10243012841839397329 = (T10243012841839397329) this.b;
                InputDevice device = keyEvent3.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent3.getSource() == 33554433) && D15445857918358799638.K(keyEvent3) == 2 && keyEvent3.getSource() != 257)) {
                    if (P1789376955961125859.k(19, keyEvent3)) {
                        z = ((D10236220797215130727) t10243012841839397329).h(5, true);
                    } else if (P1789376955961125859.k(20, keyEvent3)) {
                        z = ((D10236220797215130727) t10243012841839397329).h(6, true);
                    } else if (P1789376955961125859.k(21, keyEvent3)) {
                        z = ((D10236220797215130727) t10243012841839397329).h(3, true);
                    } else if (P1789376955961125859.k(22, keyEvent3)) {
                        z = ((D10236220797215130727) t10243012841839397329).h(4, true);
                    } else if (P1789376955961125859.k(23, keyEvent3)) {
                        L2387191309177986288 l2387191309177986288 = ((I2076339260272013590) this.c).c;
                        if (l2387191309177986288 != null) {
                            ((Y3239112907774449419) l2387191309177986288).b();
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            case 8:
                ((N1420218926656397722) this.b).a.h.l((B9299799700722559691) this.c);
                return O9245300239821758723.a;
            default:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof M3766625580725462707) {
                    ((P14960607863193493823) this.b).c.compareAndSet(-256, ((M3766625580725462707) th2).a);
                }
                ((D16915945238461757356) this.c).cancel(false);
                return O9245300239821758723.a;
        }
    }
}
