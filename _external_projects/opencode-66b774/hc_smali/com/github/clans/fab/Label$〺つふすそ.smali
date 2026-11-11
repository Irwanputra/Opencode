.class public Lcom/github/clans/fab/Label$〺つふすそ;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/clans/fab/Label;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lcom/github/clans/fab/Label;


# direct methods
.method public constructor <init>(Lcom/github/clans/fab/Label;)V
    .registers 2

    iput-object p1, p0, Lcom/github/clans/fab/Label$〺つふすそ;->げつ〴ぬぐ:Lcom/github/clans/fab/Label;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .registers 3

    iget-object v0, p0, Lcom/github/clans/fab/Label$〺つふすそ;->げつ〴ぬぐ:Lcom/github/clans/fab/Label;

    invoke-virtual {v0}, Lcom/github/clans/fab/Label;->くし〴〺ぅ()V

    iget-object v0, p0, Lcom/github/clans/fab/Label$〺つふすそ;->げつ〴ぬぐ:Lcom/github/clans/fab/Label;

    .line 1
    iget-object v0, v0, Lcom/github/clans/fab/Label;->へぬ〴づぞ:Lcom/github/clans/fab/FloatingActionButton;

    if-eqz v0, :cond_e

    .line 2
    invoke-virtual {v0}, Lcom/github/clans/fab/FloatingActionButton;->いいにぽつ()V

    :cond_e
    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onDown(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .registers 3

    iget-object v0, p0, Lcom/github/clans/fab/Label$〺つふすそ;->げつ〴ぬぐ:Lcom/github/clans/fab/Label;

    invoke-virtual {v0}, Lcom/github/clans/fab/Label;->びぐびあび()V

    iget-object v0, p0, Lcom/github/clans/fab/Label$〺つふすそ;->げつ〴ぬぐ:Lcom/github/clans/fab/Label;

    .line 1
    iget-object v0, v0, Lcom/github/clans/fab/Label;->へぬ〴づぞ:Lcom/github/clans/fab/FloatingActionButton;

    if-eqz v0, :cond_e

    .line 2
    invoke-virtual {v0}, Lcom/github/clans/fab/FloatingActionButton;->ぺふねづ〺()V

    :cond_e
    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onSingleTapUp(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
