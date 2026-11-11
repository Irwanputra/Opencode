.class public Lde/blinkt/openvpn/core/DeviceStateReceiver$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lde/blinkt/openvpn/core/DeviceStateReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lde/blinkt/openvpn/core/DeviceStateReceiver;


# direct methods
.method public constructor <init>(Lde/blinkt/openvpn/core/DeviceStateReceiver;)V
    .registers 2

    iput-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver$げつ〴ぬぐ;->〺つふすそ:Lde/blinkt/openvpn/core/DeviceStateReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 5

    iget-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver$げつ〴ぬぐ;->〺つふすそ:Lde/blinkt/openvpn/core/DeviceStateReceiver;

    iget-object v1, v0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    sget-object v2, Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;->くし〴〺ぅ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    if-eq v1, v2, :cond_9

    return-void

    :cond_9
    sget-object v1, Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;->びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    iput-object v1, v0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    iget-object v3, v0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->づざかべべ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    if-ne v3, v2, :cond_13

    iput-object v1, v0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->づざかべべ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    .line 1
    :cond_13
    iget-object v1, v0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    .line 2
    invoke-virtual {v0}, Lde/blinkt/openvpn/core/DeviceStateReceiver;->げつ〴ぬぐ()Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;

    move-result-object v0

    .line 3
    invoke-interface {v1, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〺つふすそ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;)V

    return-void
.end method
