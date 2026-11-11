.class public Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;
.super Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/なぎぱいぢぎ$げつ〴ぬぐ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lde/blinkt/openvpn/core/OpenVPNService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic くし〴〺ぅ:Lde/blinkt/openvpn/core/OpenVPNService;


# direct methods
.method public constructor <init>(Lde/blinkt/openvpn/core/OpenVPNService;)V
    .registers 2

    iput-object p1, p0, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;->くし〴〺ぅ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-direct {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/なぎぱいぢぎ$げつ〴ぬぐ;-><init>()V

    return-void
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 6

    const v0, 0xffffff

    if-ne p1, v0, :cond_c

    .line 1
    iget-object p1, p0, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;->くし〴〺ぅ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-virtual {p1}, Lde/blinkt/openvpn/core/OpenVPNService;->onRevoke()V

    const/4 p1, 0x1

    return p1

    .line 2
    :cond_c
    invoke-super {p0, p1, p2, p3, p4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/なぎぱいぢぎ$げつ〴ぬぐ;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1
.end method

.method public ぉざぅち〻(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;->くし〴〺ぅ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-virtual {v0, p1}, Lde/blinkt/openvpn/core/OpenVPNService;->ぉざぅち〻(Ljava/lang/String;)V

    return-void
.end method

.method public げつ〴ぬぐ(Z)Z
    .registers 3

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;->くし〴〺ぅ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-virtual {v0, p1}, Lde/blinkt/openvpn/core/OpenVPNService;->げつ〴ぬぐ(Z)Z

    move-result p1

    return p1
.end method
