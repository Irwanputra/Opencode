.class public Lcom/github/clans/fab/FloatingActionButton$〺つふすそ;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/clans/fab/FloatingActionButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lcom/github/clans/fab/FloatingActionButton;


# direct methods
.method public constructor <init>(Lcom/github/clans/fab/FloatingActionButton;)V
    .registers 2

    iput-object p1, p0, Lcom/github/clans/fab/FloatingActionButton$〺つふすそ;->げつ〴ぬぐ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .registers 4

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton$〺つふすそ;->げつ〴ぬぐ:Lcom/github/clans/fab/FloatingActionButton;

    sget v1, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/いいにぽつ;->fab_label:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/clans/fab/Label;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lcom/github/clans/fab/Label;->くし〴〺ぅ()V

    :cond_f
    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton$〺つふすそ;->げつ〴ぬぐ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v0}, Lcom/github/clans/fab/FloatingActionButton;->いいにぽつ()V

    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onDown(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .registers 4

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton$〺つふすそ;->げつ〴ぬぐ:Lcom/github/clans/fab/FloatingActionButton;

    sget v1, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/いいにぽつ;->fab_label:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/clans/fab/Label;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lcom/github/clans/fab/Label;->びぐびあび()V

    :cond_f
    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton$〺つふすそ;->げつ〴ぬぐ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v0}, Lcom/github/clans/fab/FloatingActionButton;->ぺふねづ〺()V

    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onSingleTapUp(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
