.class public Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$〺つふすそ;,
        Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$げつ〴ぬぐ;

.field public final げつ〴ぬぐ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_16

    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$〺つふすそ;

    invoke-direct {v0, p0}, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$〺つふすそ;-><init>(Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;)V

    .line 1
    new-instance v1, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    invoke-direct {v1, v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;-><init>(Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;)V

    .line 2
    iput-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;->げつ〴ぬぐ:Ljava/lang/Object;

    goto :goto_19

    :cond_16
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;->げつ〴ぬぐ:Ljava/lang/Object;

    :goto_19
    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()V
    .registers 1

    const p0, 0x0

    throw p0
.end method
