.class public abstract Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/なぎぱいぢぎ$げつ〴ぬぐ;
.super Landroid/os/Binder;
.source ""

# interfaces
.implements Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/なぎぱいぢぎ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/なぎぱいぢぎ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/なぎぱいぢぎ$げつ〴ぬぐ$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final synthetic 〺つふすそ:I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196nK3:J1;LfnI6=I39\u001d19LdmAbgK6l\u001benOg>O0m\u001cj<Md<\u001c7nKk:@1k\u001ckj\u001efk\u001bkg\u001d0j"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static 〺つふすそ(Landroid/os/IBinder;)Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/なぎぱいぢぎ;
    .registers 3

    if-nez p0, :cond_4

    const/4 p0, 0x0

    return-object p0

    :cond_4
    const-string v0, "\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196nK3:J1;LfnI6=I39\u001d19LdmAbgK6l\u001benOg>O0m\u001cj<Md<\u001c7nKk:@1k\u001ckj\u001efk\u001bkg\u001d0j"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1b

    instance-of v1, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/なぎぱいぢぎ;

    if-eqz v1, :cond_1b

    check-cast v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/なぎぱいぢぎ;

    return-object v0

    :cond_1b
    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/なぎぱいぢぎ$げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/なぎぱいぢぎ$げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .registers 1

    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 8

    const v0, 0x5f4e5446

    const/4 v1, 0x1

    const-string v2, "\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196nK3:J1;LfnI6=I39\u001d19LdmAbgK6l\u001benOg>O0m\u001cj<Md<\u001c7nKk:@1k\u001ckj\u001efk\u001bkg\u001d0j"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eq p1, v0, :cond_9f

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_a4

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    :pswitch_19
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    move-object p2, p0

    check-cast p2, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;

    .line 1
    iget-object p2, p2, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;->くし〴〺ぅ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-virtual {p2, p1}, Lde/blinkt/openvpn/core/OpenVPNService;->ぺづげぺが(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_2c
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    move-object p2, p0

    check-cast p2, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;

    .line 3
    iget-object p2, p2, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;->くし〴〺ぅ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-virtual {p2, p1}, Lde/blinkt/openvpn/core/OpenVPNService;->おかぷせ〱(Ljava/lang/String;)Z

    move-result p1

    .line 4
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    :pswitch_43
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    move-object p2, p0

    check-cast p2, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;

    .line 5
    iget-object p2, p2, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;->くし〴〺ぅ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-virtual {p2, p1}, Lde/blinkt/openvpn/core/OpenVPNService;->ぉざぅち〻(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_56
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_60

    const/4 v0, 0x1

    :cond_60
    move-object p1, p0

    check-cast p1, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;

    invoke-virtual {p1, v0}, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;->げつ〴ぬぐ(Z)Z

    move-result p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    :pswitch_6e
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_78

    const/4 v0, 0x1

    :cond_78
    move-object p1, p0

    check-cast p1, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;

    .line 7
    iget-object p1, p1, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;->くし〴〺ぅ:Lde/blinkt/openvpn/core/OpenVPNService;

    .line 8
    iget-object p1, p1, Lde/blinkt/openvpn/core/OpenVPNService;->のぷのちつ:Lde/blinkt/openvpn/core/DeviceStateReceiver;

    if-eqz p1, :cond_84

    invoke-virtual {p1, v0}, Lde/blinkt/openvpn/core/DeviceStateReceiver;->づざかべべ(Z)V

    .line 9
    :cond_84
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_88
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    move-object p2, p0

    check-cast p2, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;

    .line 10
    iget-object p2, p2, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;->くし〴〺ぅ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-virtual {p2, p1}, Landroid/net/VpnService;->protect(I)Z

    move-result p1

    .line 11
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    :cond_9f
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    nop

    :pswitch_data_a4
    .packed-switch 0x1
        :pswitch_88
        :pswitch_6e
        :pswitch_56
        :pswitch_43
        :pswitch_2c
        :pswitch_19
    .end packed-switch
.end method
