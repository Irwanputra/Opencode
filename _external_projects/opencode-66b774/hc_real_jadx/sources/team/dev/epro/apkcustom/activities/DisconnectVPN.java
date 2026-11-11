package team.dev.epro.apkcustom.activities;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import de.blinkt.openvpn.core.LogItem;
import de.blinkt.openvpn.core.OpenVPNService;
import java.util.LinkedList;
import p010.p011.p012.p013.C0753;
import p010.p011.p012.p013.C0765;
import p010.p011.p012.p013.InterfaceC0761;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class DisconnectVPN extends Activity implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public InterfaceC0761 f3849;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ServiceConnection f3850 = new ServiceConnectionC0524();

    /* renamed from: team.dev.epro.apkcustom.activities.DisconnectVPN$げつ〴ぬぐ, reason: contains not printable characters */
    public class ServiceConnectionC0524 implements ServiceConnection {
        public ServiceConnectionC0524() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            DisconnectVPN.this.f3849 = InterfaceC0761.AbstractBinderC0762.m2056(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            DisconnectVPN.this.f3849 = null;
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            C0765.m2061(this);
            try {
                this.f3849.mo1589(false);
            } catch (RemoteException unused) {
                LinkedList<LogItem> linkedList = C0753.f4875;
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        unbindService(this.f3850);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction(Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bi@1g\u001bb9O6gL0f\u001d0g\u001b6gIj:M4f\u0019cm\u001d09Aah@`i\u001b4oMcnAkn\u001bcl\u001ekoH0<M`nK3;Iao")));
        bindService(intent, this.f3850, 1);
        AlertDialog.Builder builder = new AlertDialog.Builder(this, 2131886321);
        builder.setTitle(2131821363);
        builder.setMessage(2131820676);
        builder.setNegativeButton(R.string.no, this);
        builder.setPositiveButton(R.string.yes, this);
        builder.setOnCancelListener(this);
        builder.show();
    }
}
