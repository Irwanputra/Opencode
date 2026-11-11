package p034.p035.p045;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1113 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ViewParent f5607;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final View f5608;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public ViewParent f5609;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int[] f5610;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f5611;

    public C1113(View view) {
        this.f5608 = view;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean m2546(int i) {
        return m2548(i) != null;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean m2547(float f, float f2) {
        ViewParent m2548;
        if (!this.f5611 || (m2548 = m2548(0)) == null) {
            return false;
        }
        View view = this.f5608;
        if (Build.VERSION.SDK_INT < 21) {
            if (m2548 instanceof InterfaceC1120) {
                return ((InterfaceC1120) m2548).onNestedPreFling(view, f, f2);
            }
            return false;
        }
        try {
            return m2548.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError unused) {
            String str = "ViewParent " + m2548 + " does not implement interface method onNestedPreFling";
            return false;
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final ViewParent m2548(int i) {
        if (i == 0) {
            return this.f5609;
        }
        if (i != 1) {
            return null;
        }
        return this.f5607;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean m2549(int i, int i2) {
        boolean z;
        if (m2548(i2) != null) {
            return true;
        }
        if (this.f5611) {
            View view = this.f5608;
            for (ViewParent parent = this.f5608.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f5608;
                boolean z2 = parent instanceof InterfaceC1081;
                if (z2) {
                    z = ((InterfaceC1081) parent).mo112(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                z = parent.onStartNestedScroll(view, view2, i);
                            } catch (AbstractMethodError unused) {
                                String str = "ViewParent " + parent + " does not implement interface method onStartNestedScroll";
                            }
                        } else if (parent instanceof InterfaceC1120) {
                            z = ((InterfaceC1120) parent).onStartNestedScroll(view, view2, i);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i2 == 0) {
                        this.f5609 = parent;
                    } else if (i2 == 1) {
                        this.f5607 = parent;
                    }
                    View view3 = this.f5608;
                    if (z2) {
                        ((InterfaceC1081) parent).mo111(view, view3, i, i2);
                    } else if (i2 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                parent.onNestedScrollAccepted(view, view3, i);
                            } catch (AbstractMethodError unused2) {
                                String str2 = "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted";
                            }
                        } else if (parent instanceof InterfaceC1120) {
                            ((InterfaceC1120) parent).onNestedScrollAccepted(view, view3, i);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = parent;
                }
            }
        }
        return false;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean m2550(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent m2548;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f5611 || (m2548 = m2548(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f5608.getLocationInWindow(iArr2);
                i4 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i4 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                if (this.f5610 == null) {
                    this.f5610 = new int[2];
                }
                iArr3 = this.f5610;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.f5608;
            if (m2548 instanceof InterfaceC1081) {
                ((InterfaceC1081) m2548).mo100(view, i, i2, iArr3, i3);
            } else if (i3 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        m2548.onNestedPreScroll(view, i, i2, iArr3);
                    } catch (AbstractMethodError unused) {
                        String str = "ViewParent " + m2548 + " does not implement interface method onNestedPreScroll";
                    }
                } else if (m2548 instanceof InterfaceC1120) {
                    ((InterfaceC1120) m2548).onNestedPreScroll(view, i, i2, iArr3);
                }
            }
            if (iArr2 != null) {
                this.f5608.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i4;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr3[0] != 0 || iArr3[1] != 0) {
                return true;
            }
        } else if (iArr2 != null) {
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        return false;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean m2551(float f, float f2, boolean z) {
        ViewParent m2548;
        if (!this.f5611 || (m2548 = m2548(0)) == null) {
            return false;
        }
        View view = this.f5608;
        if (Build.VERSION.SDK_INT < 21) {
            if (m2548 instanceof InterfaceC1120) {
                return ((InterfaceC1120) m2548).onNestedFling(view, f, f2, z);
            }
            return false;
        }
        try {
            return m2548.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError unused) {
            String str = "ViewParent " + m2548 + " does not implement interface method onNestedFling";
            return false;
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean m2552(int i, int i2, int i3, int i4, int[] iArr) {
        return m2553(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final boolean m2553(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent m2548;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f5611 || (m2548 = m2548(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f5608.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f5610 == null) {
                this.f5610 = new int[2];
            }
            int[] iArr4 = this.f5610;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f5608;
        if (m2548 instanceof InterfaceC1068) {
            ((InterfaceC1068) m2548).mo116(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (m2548 instanceof InterfaceC1081) {
                ((InterfaceC1081) m2548).mo110(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        m2548.onNestedScroll(view, i, i2, i3, i4);
                    } catch (AbstractMethodError unused) {
                        String str = "ViewParent " + m2548 + " does not implement interface method onNestedScroll";
                    }
                } else if (m2548 instanceof InterfaceC1120) {
                    ((InterfaceC1120) m2548).onNestedScroll(view, i, i2, i3, i4);
                }
            }
        }
        if (iArr != null) {
            this.f5608.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m2554(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m2553(i, i2, i3, i4, null, i5, iArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m2555(boolean z) {
        if (this.f5611) {
            View view = this.f5608;
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 21) {
                view.stopNestedScroll();
            } else if (view instanceof InterfaceC1110) {
                ((InterfaceC1110) view).stopNestedScroll();
            }
        }
        this.f5611 = z;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m2556(int i) {
        ViewParent m2548 = m2548(i);
        if (m2548 != null) {
            View view = this.f5608;
            if (m2548 instanceof InterfaceC1081) {
                ((InterfaceC1081) m2548).mo102(view, i);
            } else if (i == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        m2548.onStopNestedScroll(view);
                    } catch (AbstractMethodError unused) {
                        String str = "ViewParent " + m2548 + " does not implement interface method onStopNestedScroll";
                    }
                } else if (m2548 instanceof InterfaceC1120) {
                    ((InterfaceC1120) m2548).onStopNestedScroll(view);
                }
            }
            if (i == 0) {
                this.f5609 = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f5607 = null;
            }
        }
    }
}
