.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Ljava/util/ArrayList;

.field public final synthetic くし〴〺ぅ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;


# direct methods
.method public constructor <init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;Ljava/util/ArrayList;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/びぐびあび;->くし〴〺ぅ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    iput-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/びぐびあび;->〺つふすそ:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 10

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/びぐびあび;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;

    iget-object v2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/びぐびあび;->くし〴〺ぅ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    .line 1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    const/4 v4, 0x0

    if-nez v3, :cond_1e

    move-object v3, v4

    goto :goto_20

    :cond_1e
    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    :goto_20
    iget-object v5, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    if-eqz v5, :cond_26

    iget-object v4, v5, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    :cond_26
    const/4 v5, 0x0

    if-eqz v3, :cond_5c

    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v6

    .line 2
    iget-wide v7, v2, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->なぎぱいぢぎ:J

    .line 3
    invoke-virtual {v6, v7, v8}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v6

    iget-object v7, v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ざとぅぼこ〺:Ljava/util/ArrayList;

    iget-object v8, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v7, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->づざかべべ:I

    iget v8, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->くし〴〺ぅ:I

    sub-int/2addr v7, v8

    int-to-float v7, v7

    invoke-virtual {v6, v7}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    iget v7, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->なぎぱいぢぎ:I

    iget v8, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->びぐびあび:I

    sub-int/2addr v7, v8

    int-to-float v7, v7

    invoke-virtual {v6, v7}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    invoke-virtual {v6, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v7

    new-instance v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺぁあねじ;

    invoke-direct {v8, v2, v1, v6, v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺぁあねじ;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V

    invoke-virtual {v7, v8}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->start()V

    :cond_5c
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    iget-object v6, v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ざとぅぼこ〺:Ljava/util/ArrayList;

    iget-object v7, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v5}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v5

    .line 4
    iget-wide v6, v2, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->なぎぱいぢぎ:J

    .line 5
    invoke-virtual {v5, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v5

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-virtual {v5, v6}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v5

    new-instance v6, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;

    invoke-direct {v6, v2, v1, v3, v4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V

    invoke-virtual {v5, v6}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    goto/16 :goto_6

    .line 6
    :cond_8b
    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/びぐびあび;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/びぐびあび;->くし〴〺ぅ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->へぬ〴づぞ:Ljava/util/ArrayList;

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/びぐびあび;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
