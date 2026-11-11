.class public Lde/blinkt/openvpn/core/OpenVPNService$くし〴〺ぅ;
.super Landroid/os/Binder;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lde/blinkt/openvpn/core/OpenVPNService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lde/blinkt/openvpn/core/OpenVPNService;


# direct methods
.method public constructor <init>(Lde/blinkt/openvpn/core/OpenVPNService;Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lde/blinkt/openvpn/core/OpenVPNService$くし〴〺ぅ;->〺つふすそ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 6

    const v0, 0xffffff

    if-ne p1, v0, :cond_c

    .line 1
    iget-object p1, p0, Lde/blinkt/openvpn/core/OpenVPNService$くし〴〺ぅ;->〺つふすそ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-virtual {p1}, Lde/blinkt/openvpn/core/OpenVPNService;->onRevoke()V

    const/4 p1, 0x1

    return p1

    .line 2
    :cond_c
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1
.end method
