.class public Lcom/github/clans/fab/FloatingActionMenu$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/github/clans/fab/FloatingActionMenu;->げつ〴ぬぐ(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lcom/github/clans/fab/FloatingActionButton;

.field public final synthetic くし〴〺ぅ:Z

.field public final synthetic びぐびあび:Lcom/github/clans/fab/FloatingActionMenu;


# direct methods
.method public constructor <init>(Lcom/github/clans/fab/FloatingActionMenu;Lcom/github/clans/fab/FloatingActionButton;Z)V
    .registers 4

    iput-object p1, p0, Lcom/github/clans/fab/FloatingActionMenu$げつ〴ぬぐ;->びぐびあび:Lcom/github/clans/fab/FloatingActionMenu;

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu$げつ〴ぬぐ;->〺つふすそ:Lcom/github/clans/fab/FloatingActionButton;

    iput-boolean p3, p0, Lcom/github/clans/fab/FloatingActionMenu$げつ〴ぬぐ;->くし〴〺ぅ:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu$げつ〴ぬぐ;->びぐびあび:Lcom/github/clans/fab/FloatingActionMenu;

    .line 1
    iget-boolean v1, v0, Lcom/github/clans/fab/FloatingActionMenu;->ぺふねづ〺:Z

    if-nez v1, :cond_7

    return-void

    .line 2
    :cond_7
    iget-object v1, p0, Lcom/github/clans/fab/FloatingActionMenu$げつ〴ぬぐ;->〺つふすそ:Lcom/github/clans/fab/FloatingActionButton;

    .line 3
    iget-object v0, v0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    if-eq v1, v0, :cond_12

    .line 4
    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionMenu$げつ〴ぬぐ;->くし〴〺ぅ:Z

    invoke-virtual {v1, v0}, Lcom/github/clans/fab/FloatingActionButton;->ぺぁあねじ(Z)V

    :cond_12
    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu$げつ〴ぬぐ;->〺つふすそ:Lcom/github/clans/fab/FloatingActionButton;

    sget v1, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/いいにぽつ;->fab_label:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/clans/fab/Label;

    if-eqz v0, :cond_38

    .line 5
    iget-boolean v1, v0, Lcom/github/clans/fab/Label;->ざとぅぼこ〺:Z

    if-eqz v1, :cond_38

    .line 6
    iget-boolean v1, p0, Lcom/github/clans/fab/FloatingActionMenu$げつ〴ぬぐ;->くし〴〺ぅ:Z

    if-eqz v1, :cond_34

    .line 7
    iget-object v1, v0, Lcom/github/clans/fab/Label;->ぇぬぎばつ:Landroid/view/animation/Animation;

    if-eqz v1, :cond_34

    iget-object v1, v0, Lcom/github/clans/fab/Label;->おぐぴう〸ず:Landroid/view/animation/Animation;

    invoke-virtual {v1}, Landroid/view/animation/Animation;->cancel()V

    iget-object v1, v0, Lcom/github/clans/fab/Label;->ぇぬぎばつ:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_34
    const/4 v1, 0x4

    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_38
    return-void
.end method
