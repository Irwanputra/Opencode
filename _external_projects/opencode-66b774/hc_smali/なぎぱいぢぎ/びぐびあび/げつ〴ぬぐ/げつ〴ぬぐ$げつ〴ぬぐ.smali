.class public Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;
.super Landroid/database/ContentObserver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;Landroid/os/Handler;)V
    .registers 3

    iput-object p1, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onChange(Z)V
    .registers 5

    iget-object p1, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;

    .line 1
    iget-object v0, p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/content/Context;

    .line 2
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "haptic_feedback_enabled"

    invoke-static {v0, v2, v1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_13

    const/4 v1, 0x1

    .line 3
    :cond_13
    iput-boolean v1, p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Z

    return-void
.end method
