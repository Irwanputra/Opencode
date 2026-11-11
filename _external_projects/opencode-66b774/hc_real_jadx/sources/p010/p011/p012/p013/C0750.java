package p010.p011.p012.p013;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import de.blinkt.openvpn.core.ConnectionStatus;
import de.blinkt.openvpn.core.LogItem;
import de.blinkt.openvpn.core.OpenVPNStatusService;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.LinkedList;
import p010.p011.p012.p013.C0753;
import p010.p011.p012.p013.InterfaceC0728;
import p010.p011.p012.p013.InterfaceC0734;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ごづごきえ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0750 implements C0753.InterfaceC0755 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Context f4864;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public InterfaceC0728 f4865 = new BinderC0752(this);

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ServiceConnection f4866 = new ServiceConnectionC0751();

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ごづごきえ$〺つふすそ, reason: contains not printable characters */
    public class ServiceConnectionC0751 implements ServiceConnection {
        public ServiceConnectionC0751() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InterfaceC0734 c0736;
            int i = InterfaceC0734.AbstractBinderC0735.f4826;
            String a = Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196f\u001acg\u001da:If;I79H1n\u001b7<\u00193m\u001c6<IfhHe=Hjm\u001cagOdl\u001b3>KklN79@dhI0n\u001bbn\u001cgo\u001cgj"));
            if (iBinder == null) {
                c0736 = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface(a);
                c0736 = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0734)) ? new InterfaceC0734.AbstractBinderC0735.C0736(iBinder) : (InterfaceC0734) queryLocalInterface;
            }
            try {
                if (iBinder.queryLocalInterface(a) == null) {
                    C0753.m2044(c0736.mo1599());
                    C0753.f4883 = c0736.mo1597();
                    DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(c0736.mo1598(C0750.this.f4865)));
                    byte[] bArr = new byte[65336];
                    for (short readShort = dataInputStream.readShort(); readShort != Short.MAX_VALUE; readShort = dataInputStream.readShort()) {
                        dataInputStream.readFully(bArr, 0, readShort);
                        C0753.m2041(new LogItem(bArr, readShort), false);
                    }
                    dataInputStream.close();
                }
            } catch (RemoteException | IOException unused) {
                LinkedList<LogItem> linkedList = C0753.f4875;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C0753.m2039(C0750.this);
        }
    }

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ごづごきえ$げつ〴ぬぐ, reason: contains not printable characters */
    public class BinderC0752 extends InterfaceC0728.AbstractBinderC0729 {
        public BinderC0752(C0750 c0750) {
        }

        @Override // p010.p011.p012.p013.InterfaceC0728
        /* renamed from: 〻ぞまぎな〻 */
        public void mo1987(String str) {
            C0753.m2044(str);
        }

        @Override // p010.p011.p012.p013.InterfaceC0728
        /* renamed from: ぇぬぎばつ */
        public void mo1988(long j, long j2) {
            C0753.m2050(j, j2);
        }

        @Override // p010.p011.p012.p013.InterfaceC0728
        /* renamed from: でどあくず */
        public void mo1989(LogItem logItem) {
            C0753.m2041(logItem, false);
        }

        @Override // p010.p011.p012.p013.InterfaceC0728
        /* renamed from: ぶでにく〼〳 */
        public void mo1990(String str, String str2, int i, ConnectionStatus connectionStatus, Intent intent) {
            C0753.m2048(str, str2, i, connectionStatus, intent);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m2026(Context context) {
        Intent intent = new Intent(context, (Class<?>) OpenVPNStatusService.class);
        intent.setAction(Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bi@1g\u001bb9O6gL0f\u001d0g\u001b6gIj:M4f\u0019cm\u001d09Aah@`i\u001b4oMcnAkn\u001bcl\u001ekoH0<M`nK3;Iao")));
        context.getCacheDir();
        context.bindService(intent, this.f4866, 1);
        this.f4864 = context;
    }

    @Override // p010.p011.p012.p013.C0753.InterfaceC0755
    /* renamed from: げつ〴ぬぐ */
    public void mo1596(LogItem logItem) {
        int ordinal = logItem.f3692.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal != 3) {
        }
        logItem.m1574(this.f4864);
    }
}
