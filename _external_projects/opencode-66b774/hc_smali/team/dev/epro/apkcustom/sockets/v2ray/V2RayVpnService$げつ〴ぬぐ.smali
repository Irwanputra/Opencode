.class public Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService$げつ〴ぬぐ;
.super Landroid/os/Binder;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/げつ〴ぬぐ;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 6

    const v0, 0xffffff

    if-ne p1, v0, :cond_c

    .line 1
    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;

    invoke-virtual {p1}, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->onRevoke()V

    const/4 p1, 0x1

    return p1

    .line 2
    :cond_c
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1
.end method
