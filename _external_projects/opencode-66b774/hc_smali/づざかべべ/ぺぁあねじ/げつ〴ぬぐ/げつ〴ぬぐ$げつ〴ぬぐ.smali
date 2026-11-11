.class public Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;
.super Landroid/database/ContentObserver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public deliverSelfNotifications()Z
    .registers 2

    const/4 v0, 0x1

    return v0
.end method

.method public onChange(Z)V
    .registers 3

    iget-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    .line 1
    iget-boolean v0, p1, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_18

    iget-object v0, p1, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    if-eqz v0, :cond_18

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_18

    iget-object v0, p1, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->requery()Z

    move-result v0

    iput-boolean v0, p1, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Z

    :cond_18
    return-void
.end method
