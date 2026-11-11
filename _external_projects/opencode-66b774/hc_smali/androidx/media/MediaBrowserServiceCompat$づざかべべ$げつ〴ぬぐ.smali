.class public Landroidx/media/MediaBrowserServiceCompat$づざかべべ$げつ〴ぬぐ;
.super Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media/MediaBrowserServiceCompat$づざかべべ;->びぐびあび(Ljava/lang/String;Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$〺つふすそ;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/media/MediaBrowserServiceCompat$\u3033\u305c\u305e\u305c\u3079\u3063<",
        "Ljava/util/List<",
        "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic づざかべべ:Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$〺つふすそ;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat$づざかべべ;Ljava/lang/Object;Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$〺つふすそ;)V
    .registers 4

    iput-object p3, p0, Landroidx/media/MediaBrowserServiceCompat$づざかべべ$げつ〴ぬぐ;->づざかべべ:Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$〺つふすそ;

    invoke-direct {p0, p2}, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(Ljava/lang/Object;)V
    .registers 8

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_26

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_27

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    invoke-virtual {v3, v4, v0}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->writeToParcel(Landroid/os/Parcel;I)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_26
    move-object v2, v1

    :cond_27
    iget-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$づざかべべ$げつ〴ぬぐ;->づざかべべ:Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$〺つふすそ;

    .line 2
    iget v3, p0, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->びぐびあび:I

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_2e
    sget-object v4, Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳;->げつ〴ぬぐ:Ljava/lang/reflect/Field;

    iget-object v5, p1, Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$〺つふすそ;->げつ〴ぬぐ:Landroid/service/media/MediaBrowserService$Result;

    invoke-virtual {v4, v5, v3}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_35
    .catch Ljava/lang/IllegalAccessException; {:try_start_2e .. :try_end_35} :catch_36

    goto :goto_37

    :catch_36
    nop

    :goto_37
    iget-object p1, p1, Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$〺つふすそ;->げつ〴ぬぐ:Landroid/service/media/MediaBrowserService$Result;

    if-nez v2, :cond_3c

    goto :goto_61

    .line 4
    :cond_3c
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_45
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_61

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Parcel;

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    sget-object v4, Landroid/media/browse/MediaBrowser$MediaItem;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, v3}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    goto :goto_45

    .line 5
    :cond_61
    :goto_61
    invoke-virtual {p1, v1}, Landroid/service/media/MediaBrowserService$Result;->sendResult(Ljava/lang/Object;)V

    return-void
.end method
