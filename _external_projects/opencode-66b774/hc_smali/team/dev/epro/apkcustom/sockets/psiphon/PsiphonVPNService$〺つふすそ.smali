.class public Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService$〺つふすそ;
.super Landroid/os/Binder;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService$げつ〴ぬぐ;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService$〺つふすそ;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 6

    const v0, 0xffffff

    if-ne p1, v0, :cond_c

    .line 1
    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService$〺つふすそ;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    invoke-virtual {p1}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->onRevoke()V

    const/4 p1, 0x1

    return p1

    .line 2
    :cond_c
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1
.end method
