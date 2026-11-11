.class public Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/media/MediaBrowserServiceCompat$〺つふすそ;
.implements Lづざかべべ/おぐぴう〸ず/ごづごきえ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media/MediaBrowserServiceCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public 〺つふすそ:Ljava/lang/Object;

.field public くし〴〺ぅ:Landroid/os/Messenger;

.field public final げつ〴ぬぐ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic びぐびあび:Landroidx/media/MediaBrowserServiceCompat;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat;)V
    .registers 2

    iput-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(Landroid/content/Intent;)Landroid/os/IBinder;
    .registers 3

    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->〺つふすそ:Ljava/lang/Object;

    .line 1
    check-cast v0, Landroid/service/media/MediaBrowserService;

    invoke-virtual {v0, p1}, Landroid/service/media/MediaBrowserService;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method

.method public げつ〴ぬぐ(Ljava/lang/String;Lづざかべべ/おぐぴう〸ず/は〲ぱなで;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "L\u3065\u3056\u304b\u3079\u3079/\u304a\u3050\u3074\u3046\u3038\u305a/\u306f\u3032\u3071\u306a\u3067<",
            "Ljava/util/List<",
            "Landroid/os/Parcel;",
            ">;>;)V"
        }
    .end annotation

    new-instance v0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ$げつ〴ぬぐ;

    invoke-direct {v0, p0, p1, p2}, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ$げつ〴ぬぐ;-><init>(Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;Ljava/lang/Object;Lづざかべべ/おぐぴう〸ず/は〲ぱなで;)V

    iget-object p2, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat;

    invoke-virtual {p2, p1, v0}, Landroidx/media/MediaBrowserServiceCompat;->くし〴〺ぅ(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;)V

    return-void
.end method

.method public づざかべべ()V
    .registers 3

    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat;

    .line 1
    new-instance v1, Lづざかべべ/おぐぴう〸ず/ざとぅぼこ〺;

    invoke-direct {v1, v0, p0}, Lづざかべべ/おぐぴう〸ず/ざとぅぼこ〺;-><init>(Landroid/content/Context;Lづざかべべ/おぐぴう〸ず/ごづごきえ;)V

    .line 2
    iput-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->〺つふすそ:Ljava/lang/Object;

    .line 3
    check-cast v1, Landroid/service/media/MediaBrowserService;

    invoke-virtual {v1}, Landroid/service/media/MediaBrowserService;->onCreate()V

    return-void
.end method

.method public なぎぱいぢぎ(Ljava/lang/String;ILandroid/os/Bundle;)Lづざかべべ/おぐぴう〸ず/ぉざぅち〻;
    .registers 8

    if-eqz p3, :cond_39

    const/4 v0, 0x0

    const-string v1, "extra_client_version"

    invoke-virtual {p3, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_39

    invoke-virtual {p3, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Messenger;

    iget-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;

    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->くし〴〺ぅ:Landroid/os/Messenger;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const/4 v1, 0x2

    const-string v2, "extra_service_version"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->くし〴〺ぅ:Landroid/os/Messenger;

    invoke-virtual {v1}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v1

    const-string v2, "extra_messenger"

    invoke-static {v0, v2, v1}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/なぎぱいぢぎ;->〺つふすそ(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/IBinder;)V

    iget-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_39
    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat;

    const/4 v1, -0x1

    .line 1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 2
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1c

    if-lt v2, v3, :cond_4c

    new-instance v2, Lづざかべべ/おぐぴう〸ず/〻ぞまぎな〻;

    invoke-direct {v2, p1, v1, p2}, Lづざかべべ/おぐぴう〸ず/〻ぞまぎな〻;-><init>(Ljava/lang/String;II)V

    .line 3
    :cond_4c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/media/MediaBrowserServiceCompat;->〺つふすそ(Ljava/lang/String;ILandroid/os/Bundle;)V

    iget-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return-object p1
.end method
