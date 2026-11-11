.class public Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$くし〴〺ぅ;


# instance fields
.field public 〺つふすそ:Landroid/content/Context;

.field public くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〳ぜぞぜべっ;

.field public びぐびあび:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ$げつ〴ぬぐ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;)V

    iput-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〳ぜぞぜべっ;

    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ$〺つふすそ;

    invoke-direct {v0, p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ$〺つふすそ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;)V

    iput-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;->びぐびあび:Landroid/content/ServiceConnection;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/content/Context;)V
    .registers 5

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lde/blinkt/openvpn/core/OpenVPNStatusService;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bi@1g\u001bb9O6gL0f\u001d0g\u001b6gIj:M4f\u0019cm\u001d09Aah@`i\u001b4oMcnAkn\u001bcl\u001ekoH0<M`nK3;Iao"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    iget-object v1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;->びぐびあび:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    iput-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;->〺つふすそ:Landroid/content/Context;

    return-void
.end method

.method public げつ〴ぬぐ(Lde/blinkt/openvpn/core/LogItem;)V
    .registers 4

    .line 1
    iget-object v0, p1, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    .line 2
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_f

    const/4 v1, 0x1

    if-eq v0, v1, :cond_f

    const/4 v1, 0x3

    if-eq v0, v1, :cond_f

    const/4 v1, 0x4

    :cond_f
    iget-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;->〺つふすそ:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lde/blinkt/openvpn/core/LogItem;->〳ぜぞぜべっ(Landroid/content/Context;)Ljava/lang/String;

    return-void
.end method
