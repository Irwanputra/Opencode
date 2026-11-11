.class public Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/てぜきぽく;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Lde/blinkt/openvpn/core/OpenVPNService;


# direct methods
.method public constructor <init>(Lde/blinkt/openvpn/core/OpenVPNService;)V
    .registers 2

    iput-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/てぜきぽく;->〺つふすそ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 5

    iget-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/てぜきぽく;->〺つふすそ:Lde/blinkt/openvpn/core/OpenVPNService;

    .line 1
    iget-object v1, v0, Lde/blinkt/openvpn/core/OpenVPNService;->のぷのちつ:Lde/blinkt/openvpn/core/DeviceStateReceiver;

    if-eqz v1, :cond_9

    .line 2
    invoke-virtual {v0}, Lde/blinkt/openvpn/core/OpenVPNService;->ぃぜぶの〸ぃ()V

    :cond_9
    iget-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/てぜきぽく;->〺つふすそ:Lde/blinkt/openvpn/core/OpenVPNService;

    .line 3
    iget-object v1, v0, Lde/blinkt/openvpn/core/OpenVPNService;->ぉざぅち〻:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    .line 4
    monitor-enter v0

    :try_start_e
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    const-string v3, "Ad9A3>\u001deh\u0019emMbgHkjK19Ac=K`gM6l\u001bf=M6=NjnL4hKg=Mfl\u001e`iI0<Hfl\u001cahO`i\u0019`=Lam\u001eb=Iem@k9\u001b`>K1mNgj\u001969\u001e0hNgh"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v3, "L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4<\u001akmMf<L7fHg=\u001cbh\u001dj<Kfk\u001b`i\u001db<Ljo\u001cfm\u001dd:Ajf\u001ddh\u001d39K6fK1fHdiJe9A`nLg:"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v3, "L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4k\u001b`:J4=\u001cj:\u0019`:\u001ddgM0oIcoK1oK4l\u001dbiI"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    new-instance v3, Lde/blinkt/openvpn/core/DeviceStateReceiver;

    invoke-direct {v3, v1}, Lde/blinkt/openvpn/core/DeviceStateReceiver;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;)V

    iput-object v3, v0, Lde/blinkt/openvpn/core/OpenVPNService;->のぷのちつ:Lde/blinkt/openvpn/core/DeviceStateReceiver;

    invoke-virtual {v3, v0}, Lde/blinkt/openvpn/core/DeviceStateReceiver;->くし〴〺ぅ(Landroid/content/Context;)V

    iget-object v1, v0, Lde/blinkt/openvpn/core/OpenVPNService;->のぷのちつ:Lde/blinkt/openvpn/core/DeviceStateReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/net/VpnService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    iget-object v1, v0, Lde/blinkt/openvpn/core/OpenVPNService;->のぷのちつ:Lde/blinkt/openvpn/core/DeviceStateReceiver;

    invoke-static {v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$げつ〴ぬぐ;)V
    :try_end_4e
    .catchall {:try_start_e .. :try_end_4e} :catchall_50

    monitor-exit v0

    return-void

    :catchall_50
    move-exception v1

    monitor-exit v0

    throw v1
.end method
