.class public Lづざかべべ/おぐぴう〸ず/のぷのちつ;
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

    iput-object p1, p0, Lづざかべべ/おぐぴう〸ず/のぷのちつ;->ぁごぐすすぃ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iput-object p2, p0, Lづざかべべ/おぐぴう〸ず/のぷのちつ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    iput-object p3, p0, Lづざかべべ/おぐぴう〸ず/のぷのちつ;->くし〴〺ぅ:Ljava/lang/String;

    iput p4, p0, Lづざかべべ/おぐぴう〸ず/のぷのちつ;->びぐびあび:I

    iput p5, p0, Lづざかべべ/おぐぴう〸ず/のぷのちつ;->づざかべべ:I

    iput-object p6, p0, Lづざかべべ/おぐぴう〸ず/のぷのちつ;->なぎぱいぢぎ:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 10

    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/のぷのちつ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    check-cast v0, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    invoke-virtual {v0}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;->げつ〴ぬぐ()Landroid/os/IBinder;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/おぐぴう〸ず/のぷのちつ;->ぁごぐすすぃ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->くし〴〺ぅ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v1, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;

    iget-object v2, p0, Lづざかべべ/おぐぴう〸ず/のぷのちつ;->ぁごぐすすぃ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iget-object v3, v2, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v4, p0, Lづざかべべ/おぐぴう〸ず/のぷのちつ;->くし〴〺ぅ:Ljava/lang/String;

    iget v5, p0, Lづざかべべ/おぐぴう〸ず/のぷのちつ;->びぐびあび:I

    iget v6, p0, Lづざかべべ/おぐぴう〸ず/のぷのちつ;->づざかべべ:I

    iget-object v7, p0, Lづざかべべ/おぐぴう〸ず/のぷのちつ;->なぎぱいぢぎ:Landroid/os/Bundle;

    iget-object v8, p0, Lづざかべべ/おぐぴう〸ず/のぷのちつ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;-><init>(Landroidx/media/MediaBrowserServiceCompat;Ljava/lang/String;IILandroid/os/Bundle;Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;)V

    iget-object v2, p0, Lづざかべべ/おぐぴう〸ず/のぷのちつ;->ぁごぐすすぃ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iget-object v2, v2, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v2, v2, Landroidx/media/MediaBrowserServiceCompat;->くし〴〺ぅ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v2, v0, v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x0

    :try_start_2f
    invoke-interface {v0, v1, v2}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_32
    .catch Landroid/os/RemoteException; {:try_start_2f .. :try_end_32} :catch_32

    :catch_32
    return-void
.end method
