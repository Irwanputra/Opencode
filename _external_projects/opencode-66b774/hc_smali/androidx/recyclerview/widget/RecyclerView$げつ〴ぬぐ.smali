.class public Landroidx/recyclerview/widget/RecyclerView$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$げつ〴ぬぐ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 13

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$げつ〴ぬぐ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->〺でおいここ:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;

    const/4 v1, 0x0

    if-eqz v0, :cond_115

    check-cast v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    .line 1
    iget-object v2, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->〳ぜぞぜべっ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    iget-object v3, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->いいにぽつ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    iget-object v4, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ぺふねづ〺:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    iget-object v5, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ぺぁあねじ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    if-nez v2, :cond_33

    if-nez v3, :cond_33

    if-nez v5, :cond_33

    if-nez v4, :cond_33

    goto/16 :goto_115

    :cond_33
    iget-object v6, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->〳ぜぞぜべっ:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_39
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_68

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    .line 2
    iget-object v8, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v9

    iget-object v10, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ぉざぅち〻:Ljava/util/ArrayList;

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3
    iget-wide v10, v0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->びぐびあび:J

    .line 4
    invoke-virtual {v9, v10, v11}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v10

    new-instance v11, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぎぱいぢぎ;

    invoke-direct {v11, v0, v7, v9, v8}, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぎぱいぢぎ;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V

    invoke-virtual {v10, v11}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_39

    .line 5
    :cond_68
    iget-object v6, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->〳ぜぞぜべっ:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    if-eqz v3, :cond_9d

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iget-object v7, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->いいにぽつ:Ljava/util/ArrayList;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v7, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->のぷのちつ:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v7, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->いいにぽつ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    new-instance v7, Lづざかべべ/ぇぬぎばつ/びぐびあび/くし〴〺ぅ;

    invoke-direct {v7, v0, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/くし〴〺ぅ;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;Ljava/util/ArrayList;)V

    if-eqz v2, :cond_9a

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$〺つふすそ;

    iget-object v6, v6, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$〺つふすそ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    .line 6
    iget-wide v8, v0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->びぐびあび:J

    .line 7
    invoke-static {v6, v7, v8, v9}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->じぜこほぱ(Landroid/view/View;Ljava/lang/Runnable;J)V

    goto :goto_9d

    :cond_9a
    invoke-virtual {v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/くし〴〺ぅ;->run()V

    :cond_9d
    :goto_9d
    if-eqz v4, :cond_cd

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iget-object v7, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ぺふねづ〺:Ljava/util/ArrayList;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v7, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->へぬ〴づぞ:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v7, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ぺふねづ〺:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    new-instance v7, Lづざかべべ/ぇぬぎばつ/びぐびあび/びぐびあび;

    invoke-direct {v7, v0, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/びぐびあび;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;Ljava/util/ArrayList;)V

    if-eqz v2, :cond_ca

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;

    iget-object v6, v6, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    .line 8
    iget-wide v8, v0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->びぐびあび:J

    .line 9
    invoke-static {v6, v7, v8, v9}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->じぜこほぱ(Landroid/view/View;Ljava/lang/Runnable;J)V

    goto :goto_cd

    :cond_ca
    invoke-virtual {v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/びぐびあび;->run()V

    :cond_cd
    :goto_cd
    if-eqz v5, :cond_115

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iget-object v6, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ぺぁあねじ:Ljava/util/ArrayList;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v6, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->てぜきぽく:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ぺぁあねじ:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    new-instance v6, Lづざかべべ/ぇぬぎばつ/びぐびあび/づざかべべ;

    invoke-direct {v6, v0, v5}, Lづざかべべ/ぇぬぎばつ/びぐびあび/づざかべべ;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;Ljava/util/ArrayList;)V

    if-nez v2, :cond_f3

    if-nez v3, :cond_f3

    if-eqz v4, :cond_ef

    goto :goto_f3

    :cond_ef
    invoke-virtual {v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/づざかべべ;->run()V

    goto :goto_115

    :cond_f3
    :goto_f3
    const-wide/16 v7, 0x0

    if-eqz v2, :cond_fa

    .line 10
    iget-wide v9, v0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->びぐびあび:J

    goto :goto_fb

    :cond_fa
    move-wide v9, v7

    :goto_fb
    if-eqz v3, :cond_100

    .line 11
    iget-wide v2, v0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->づざかべべ:J

    goto :goto_101

    :cond_100
    move-wide v2, v7

    :goto_101
    if-eqz v4, :cond_105

    .line 12
    iget-wide v7, v0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->なぎぱいぢぎ:J

    .line 13
    :cond_105
    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    add-long/2addr v2, v9

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-static {v0, v6, v2, v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->じぜこほぱ(Landroid/view/View;Ljava/lang/Runnable;J)V

    .line 14
    :cond_115
    :goto_115
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$げつ〴ぬぐ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->のびぶけせ:Z

    return-void
.end method
