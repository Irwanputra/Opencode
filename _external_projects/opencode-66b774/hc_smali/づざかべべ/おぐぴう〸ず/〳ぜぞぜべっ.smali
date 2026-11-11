.class public Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

.field public final synthetic ぁごぐすすぃ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

.field public final synthetic くし〴〺ぅ:Ljava/lang/String;

.field public final synthetic づざかべべ:I

.field public final synthetic なぎぱいぢぎ:Landroid/os/Bundle;

.field public final synthetic びぐびあび:I


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;Ljava/lang/String;IILandroid/os/Bundle;)V
    .registers 7

    iput-object p1, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->ぁごぐすすぃ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iput-object p2, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    iput-object p3, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->くし〴〺ぅ:Ljava/lang/String;

    iput p4, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->びぐびあび:I

    iput p5, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->づざかべべ:I

    iput-object p6, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->なぎぱいぢぎ:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 6

    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    check-cast v0, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    invoke-virtual {v0}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;->げつ〴ぬぐ()Landroid/os/IBinder;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->ぁごぐすすぃ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->くし〴〺ぅ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v1, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->ぁごぐすすぃ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iget-object v0, v0, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->くし〴〺ぅ:Ljava/lang/String;

    iget v1, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->びぐびあび:I

    iget v2, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->づざかべべ:I

    .line 1
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 2
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1c

    if-lt v3, v4, :cond_2b

    new-instance v3, Lづざかべべ/おぐぴう〸ず/〻ぞまぎな〻;

    invoke-direct {v3, v0, v1, v2}, Lづざかべべ/おぐぴう〸ず/〻ぞまぎな〻;-><init>(Ljava/lang/String;II)V

    .line 3
    :cond_2b
    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->ぁごぐすすぃ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iget-object v0, v0, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->ぁごぐすすぃ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iget-object v0, v0, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->くし〴〺ぅ:Ljava/lang/String;

    iget v2, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->づざかべべ:I

    iget-object v3, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->なぎぱいぢぎ:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Landroidx/media/MediaBrowserServiceCompat;->〺つふすそ(Ljava/lang/String;ILandroid/os/Bundle;)V

    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->ぁごぐすすぃ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iget-object v0, v0, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-class v0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;

    :try_start_48
    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    check-cast v0, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 4
    invoke-virtual {v0, v1, v2}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;->くし〴〺ぅ(ILandroid/os/Bundle;)V
    :try_end_51
    .catch Landroid/os/RemoteException; {:try_start_48 .. :try_end_51} :catch_51

    :catch_51
    return-void
.end method
