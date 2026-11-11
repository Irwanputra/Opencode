.class public Lde/blinkt/openvpn/core/OpenVPNStatusService$〺つふすそ;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lde/blinkt/openvpn/core/OpenVPNStatusService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public げつ〴ぬぐ:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lde/blinkt/openvpn/core/OpenVPNStatusService;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lde/blinkt/openvpn/core/OpenVPNStatusService$げつ〴ぬぐ;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lde/blinkt/openvpn/core/OpenVPNStatusService$〺つふすそ;->げつ〴ぬぐ:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .registers 12

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNStatusService$〺つふすそ;->げつ〴ぬぐ:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_68

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_b

    goto :goto_68

    :cond_b
    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNStatusService$〺つふすそ;->げつ〴ぬぐ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde/blinkt/openvpn/core/OpenVPNStatusService;

    sget-object v0, Lde/blinkt/openvpn/core/OpenVPNStatusService;->〺つふすそ:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v1

    const/4 v2, 0x0

    :goto_1a
    if-ge v2, v1, :cond_65

    :try_start_1c
    invoke-virtual {v0, v2}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〳ぜぞぜべっ;

    iget v3, p1, Landroid/os/Message;->what:I

    packed-switch v3, :pswitch_data_6a

    goto :goto_62

    :pswitch_29
    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-interface {v4, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〳ぜぞぜべっ;->〻ぞまぎな〻(Ljava/lang/String;)V

    goto :goto_62

    :pswitch_31
    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v3, Landroid/util/Pair;

    iget-object v5, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-interface {v4, v5, v6, v7, v8}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〳ぜぞぜべっ;->ぇぬぎばつ(JJ)V

    goto :goto_62

    :pswitch_49
    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v3, Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;

    .line 1
    iget-object v5, v3, Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/lang/String;

    iget-object v6, v3, Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;->〺つふすそ:Ljava/lang/String;

    iget v7, v3, Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;->づざかべべ:I

    iget-object v8, v3, Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;->くし〴〺ぅ:Lde/blinkt/openvpn/core/ConnectionStatus;

    iget-object v9, v3, Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;->びぐびあび:Landroid/content/Intent;

    invoke-interface/range {v4 .. v9}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〳ぜぞぜべっ;->ぶでにく〼〳(Ljava/lang/String;Ljava/lang/String;ILde/blinkt/openvpn/core/ConnectionStatus;Landroid/content/Intent;)V

    goto :goto_62

    .line 2
    :pswitch_5b
    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v3, Lde/blinkt/openvpn/core/LogItem;

    invoke-interface {v4, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〳ぜぞぜべっ;->でどあくず(Lde/blinkt/openvpn/core/LogItem;)V
    :try_end_62
    .catch Landroid/os/RemoteException; {:try_start_1c .. :try_end_62} :catch_62

    :catch_62
    :goto_62
    add-int/lit8 v2, v2, 0x1

    goto :goto_1a

    :cond_65
    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    :cond_68
    :goto_68
    return-void

    nop

    :pswitch_data_6a
    .packed-switch 0x64
        :pswitch_5b
        :pswitch_49
        :pswitch_31
        :pswitch_29
    .end packed-switch
.end method
