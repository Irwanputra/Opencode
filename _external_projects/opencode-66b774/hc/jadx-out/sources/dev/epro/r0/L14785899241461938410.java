package dev.epro.r0;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L14785899241461938410 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] d = {MenuItem.class};
    public final /* synthetic */ byte a = 0;
    public Object b;
    public Object c;

    public L14785899241461938410(H2233650693096395599 h2233650693096395599, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.c = h2233650693096395599;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean zBooleanValue;
        switch (this.a) {
            case 0:
                Object obj = this.b;
                Method method = (Method) this.c;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        zBooleanValue = ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    } else {
                        method.invoke(obj, menuItem);
                        zBooleanValue = true;
                    }
                    return zBooleanValue;
                } catch (Exception e) {
                    Q11088980322693754445.k(e);
                    return false;
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.b).onMenuItemClick(((H2233650693096395599) this.c).k(menuItem));
        }
    }

    public /* synthetic */ L14785899241461938410() {
    }
}
