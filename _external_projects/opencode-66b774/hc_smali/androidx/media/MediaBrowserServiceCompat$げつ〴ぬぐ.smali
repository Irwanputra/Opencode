.class public Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media/MediaBrowserServiceCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final 〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

.field public final くし〴〺ぅ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u3066\u305c\u304d\u307d\u304f/\u303a\u3064\u3075\u3059\u305d<",
            "Landroid/os/IBinder;",
            "Landroid/os/Bundle;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public final げつ〴ぬぐ:Ljava/lang/String;

.field public final synthetic びぐびあび:Landroidx/media/MediaBrowserServiceCompat;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat;Ljava/lang/String;IILandroid/os/Bundle;Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;)V
    .registers 7

    iput-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/util/HashMap;

    iput-object p2, p0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    .line 1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p5, 0x1c

    if-lt p1, p5, :cond_19

    new-instance p1, Lづざかべべ/おぐぴう〸ず/〻ぞまぎな〻;

    invoke-direct {p1, p2, p3, p4}, Lづざかべべ/おぐぴう〸ず/〻ぞまぎな〻;-><init>(Ljava/lang/String;II)V

    .line 2
    :cond_19
    iput-object p6, p0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    return-void
.end method


# virtual methods
.method public binderDied()V
    .registers 3

    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v0, v0, Landroidx/media/MediaBrowserServiceCompat;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;

    new-instance v1, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {v1, p0}, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
