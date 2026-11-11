.class public Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 〺つふすそ:Lcom/github/clans/fab/FloatingActionMenu;


# direct methods
.method public constructor <init>(Lcom/github/clans/fab/FloatingActionMenu;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;->〺つふすそ:Lcom/github/clans/fab/FloatingActionMenu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 12

    iget-object p1, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;->〺つふすそ:Lcom/github/clans/fab/FloatingActionMenu;

    .line 1
    iget-boolean v0, p1, Lcom/github/clans/fab/FloatingActionMenu;->ぇとしたべど:Z

    .line 2
    iget-boolean v1, p1, Lcom/github/clans/fab/FloatingActionMenu;->ぺふねづ〺:Z

    if-eqz v1, :cond_c

    .line 3
    invoke-virtual {p1, v0}, Lcom/github/clans/fab/FloatingActionMenu;->げつ〴ぬぐ(Z)V

    goto :goto_70

    :cond_c
    if-nez v1, :cond_70

    .line 4
    iget v1, p1, Lcom/github/clans/fab/FloatingActionMenu;->〴ねぷぐくぼ:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_16

    const/4 v1, 0x1

    goto :goto_17

    :cond_16
    const/4 v1, 0x0

    :goto_17
    if-eqz v1, :cond_1e

    .line 5
    iget-object v1, p1, Lcom/github/clans/fab/FloatingActionMenu;->ずまげせび〳:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    :cond_1e
    iget-boolean v1, p1, Lcom/github/clans/fab/FloatingActionMenu;->ばおぢでぎか:Z

    if-eqz v1, :cond_31

    iget-object v1, p1, Lcom/github/clans/fab/FloatingActionMenu;->びぐびあび:Landroid/animation/AnimatorSet;

    if-eqz v1, :cond_27

    goto :goto_2e

    :cond_27
    iget-object v1, p1, Lcom/github/clans/fab/FloatingActionMenu;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->cancel()V

    iget-object v1, p1, Lcom/github/clans/fab/FloatingActionMenu;->〺つふすそ:Landroid/animation/AnimatorSet;

    :goto_2e
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    :cond_31
    iput-boolean v3, p1, Lcom/github/clans/fab/FloatingActionMenu;->てぜきぽく:Z

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    sub-int/2addr v1, v3

    const/4 v4, 0x0

    :goto_39
    if-ltz v1, :cond_60

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    instance-of v6, v5, Lcom/github/clans/fab/FloatingActionButton;

    if-eqz v6, :cond_5d

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    const/16 v7, 0x8

    if-eq v6, v7, :cond_5d

    add-int/lit8 v2, v2, 0x1

    check-cast v5, Lcom/github/clans/fab/FloatingActionButton;

    iget-object v6, p1, Lcom/github/clans/fab/FloatingActionMenu;->のぷのちつ:Landroid/os/Handler;

    new-instance v7, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;

    invoke-direct {v7, p1, v5, v0}, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;-><init>(Lcom/github/clans/fab/FloatingActionMenu;Lcom/github/clans/fab/FloatingActionButton;Z)V

    int-to-long v8, v4

    invoke-virtual {v6, v7, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget v5, p1, Lcom/github/clans/fab/FloatingActionMenu;->けときぜと:I

    add-int/2addr v4, v5

    :cond_5d
    add-int/lit8 v1, v1, -0x1

    goto :goto_39

    :cond_60
    iget-object v0, p1, Lcom/github/clans/fab/FloatingActionMenu;->のぷのちつ:Landroid/os/Handler;

    new-instance v1, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    invoke-direct {v1, p1}, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;-><init>(Lcom/github/clans/fab/FloatingActionMenu;)V

    add-int/2addr v2, v3

    iget p1, p1, Lcom/github/clans/fab/FloatingActionMenu;->けときぜと:I

    mul-int v2, v2, p1

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_70
    :goto_70
    return-void
.end method
