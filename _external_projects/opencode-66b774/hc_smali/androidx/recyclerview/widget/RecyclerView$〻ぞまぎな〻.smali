.class public Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;
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
    name = "\u303b\u305e\u307e\u304e\u306a\u303b"
.end annotation


# instance fields
.field public final synthetic 〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:Z

.field public くし〴〺ぅ:I

.field public づざかべべ:Landroid/view/animation/Interpolator;

.field public なぎぱいぢぎ:Z

.field public びぐびあび:Landroid/widget/OverScroller;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 4

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->ぁにあがあ:Landroid/view/animation/Interpolator;

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->づざかべべ:Landroid/view/animation/Interpolator;

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->なぎぱいぢぎ:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->ぁごぐすすぃ:Z

    new-instance v1, Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->びぐびあび:Landroid/widget/OverScroller;

    return-void
.end method


# virtual methods
.method public run()V
    .registers 23

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->のぷのちつ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    if-nez v2, :cond_c

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->くし〴〺ぅ()V

    return-void

    :cond_c
    const/4 v2, 0x0

    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->ぁごぐすすぃ:Z

    const/4 v3, 0x1

    iput-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->なぎぱいぢぎ:Z

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->へぬ〴づぞ()V

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->びぐびあび:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v4

    if-eqz v4, :cond_1be

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v4

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v5

    iget v6, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〺つふすそ:I

    sub-int v6, v4, v6

    iget v7, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->くし〴〺ぅ:I

    sub-int v13, v5, v7

    iput v4, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〺つふすそ:I

    iput v5, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->くし〴〺ぅ:I

    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v10, v7, Landroidx/recyclerview/widget/RecyclerView;->ぁないぼぎへ:[I

    aput v2, v10, v2

    aput v2, v10, v3

    const/4 v11, 0x0

    const/4 v12, 0x1

    move v8, v6

    move v9, v13

    invoke-virtual/range {v7 .. v12}, Landroidx/recyclerview/widget/RecyclerView;->ごづごきえ(II[I[II)Z

    move-result v4

    if-eqz v4, :cond_4d

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->ぁないぼぎへ:[I

    aget v5, v4, v2

    sub-int/2addr v6, v5

    aget v4, v4, v3

    sub-int/2addr v13, v4

    :cond_4d
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getOverScrollMode()I

    move-result v4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_5b

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4, v6, v13}, Landroidx/recyclerview/widget/RecyclerView;->のぷのちつ(II)V

    :cond_5b
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, v4, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    if-eqz v7, :cond_99

    iget-object v7, v4, Landroidx/recyclerview/widget/RecyclerView;->ぁないぼぎへ:[I

    aput v2, v7, v2

    aput v2, v7, v3

    invoke-virtual {v4, v6, v13, v7}, Landroidx/recyclerview/widget/RecyclerView;->な〱ちぉじ(II[I)V

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, v4, Landroidx/recyclerview/widget/RecyclerView;->ぁないぼぎへ:[I

    aget v8, v7, v2

    aget v7, v7, v3

    sub-int/2addr v6, v8

    sub-int/2addr v13, v7

    iget-object v9, v4, Landroidx/recyclerview/widget/RecyclerView;->のぷのちつ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    iget-object v9, v9, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;

    if-eqz v9, :cond_9b

    .line 1
    iget-boolean v10, v9, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->びぐびあび:Z

    if-nez v10, :cond_9b

    .line 2
    iget-boolean v10, v9, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->づざかべべ:Z

    if-eqz v10, :cond_9b

    .line 3
    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v4

    if-nez v4, :cond_8e

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->くし〴〺ぅ()V

    goto :goto_9b

    .line 4
    :cond_8e
    iget v10, v9, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->げつ〴ぬぐ:I

    if-lt v10, v4, :cond_95

    sub-int/2addr v4, v3

    .line 5
    iput v4, v9, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->げつ〴ぬぐ:I

    .line 6
    :cond_95
    invoke-virtual {v9, v8, v7}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->げつ〴ぬぐ(II)V

    goto :goto_9b

    :cond_99
    const/4 v7, 0x0

    const/4 v8, 0x0

    :cond_9b
    :goto_9b
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->おぐぴう〸ず:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_aa

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->invalidate()V

    :cond_aa
    iget-object v14, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v14, Landroidx/recyclerview/widget/RecyclerView;->ぁないぼぎへ:[I

    aput v2, v4, v2

    aput v2, v4, v3

    const/16 v19, 0x0

    const/16 v20, 0x1

    move v15, v8

    move/from16 v16, v7

    move/from16 v17, v6

    move/from16 v18, v13

    move-object/from16 v21, v4

    invoke-virtual/range {v14 .. v21}, Landroidx/recyclerview/widget/RecyclerView;->ざっざへづ(IIII[II[I)V

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v9, v4, Landroidx/recyclerview/widget/RecyclerView;->ぁないぼぎへ:[I

    aget v10, v9, v2

    sub-int/2addr v6, v10

    aget v9, v9, v3

    sub-int/2addr v13, v9

    if-nez v8, :cond_d0

    if-eqz v7, :cond_d3

    :cond_d0
    invoke-virtual {v4, v8, v7}, Landroidx/recyclerview/widget/RecyclerView;->でどあくず(II)V

    :cond_d3
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView;->びぐびあび(Landroidx/recyclerview/widget/RecyclerView;)Z

    move-result v4

    if-nez v4, :cond_e0

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->invalidate()V

    :cond_e0
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v4

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getFinalX()I

    move-result v9

    if-ne v4, v9, :cond_ec

    const/4 v4, 0x1

    goto :goto_ed

    :cond_ec
    const/4 v4, 0x0

    :goto_ed
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v9

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getFinalY()I

    move-result v10

    if-ne v9, v10, :cond_f9

    const/4 v9, 0x1

    goto :goto_fa

    :cond_f9
    const/4 v9, 0x0

    :goto_fa
    invoke-virtual {v1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v10

    if-nez v10, :cond_10b

    if-nez v4, :cond_104

    if-eqz v6, :cond_109

    :cond_104
    if-nez v9, :cond_10b

    if-eqz v13, :cond_109

    goto :goto_10b

    :cond_109
    const/4 v4, 0x0

    goto :goto_10c

    :cond_10b
    :goto_10b
    const/4 v4, 0x1

    :goto_10c
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v10, v9, Landroidx/recyclerview/widget/RecyclerView;->のぷのちつ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    iget-object v10, v10, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;

    if-eqz v10, :cond_11a

    .line 7
    iget-boolean v10, v10, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->びぐびあび:Z

    if-eqz v10, :cond_11a

    const/4 v10, 0x1

    goto :goto_11b

    :cond_11a
    const/4 v10, 0x0

    :goto_11b
    if-nez v10, :cond_1b2

    if-eqz v4, :cond_1b2

    .line 8
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getOverScrollMode()I

    move-result v4

    if-eq v4, v5, :cond_19f

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v1

    float-to-int v1, v1

    if-gez v6, :cond_12e

    neg-int v4, v1

    goto :goto_133

    :cond_12e
    if-lez v6, :cond_132

    move v4, v1

    goto :goto_133

    :cond_132
    const/4 v4, 0x0

    :goto_133
    if-gez v13, :cond_137

    neg-int v1, v1

    goto :goto_13b

    :cond_137
    if-lez v13, :cond_13a

    goto :goto_13b

    :cond_13a
    const/4 v1, 0x0

    :goto_13b
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-gez v4, :cond_154

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->〻ぞまぎな〻()V

    iget-object v6, v5, Landroidx/recyclerview/widget/RecyclerView;->せづっ〸ちね:Landroid/widget/EdgeEffect;

    invoke-virtual {v6}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v6

    if-eqz v6, :cond_166

    iget-object v6, v5, Landroidx/recyclerview/widget/RecyclerView;->せづっ〸ちね:Landroid/widget/EdgeEffect;

    neg-int v7, v4

    invoke-virtual {v6, v7}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_166

    :cond_154
    if-lez v4, :cond_166

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->ぉ〲なぱぽた()V

    iget-object v6, v5, Landroidx/recyclerview/widget/RecyclerView;->けときぜと:Landroid/widget/EdgeEffect;

    invoke-virtual {v6}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v6

    if-eqz v6, :cond_166

    iget-object v6, v5, Landroidx/recyclerview/widget/RecyclerView;->けときぜと:Landroid/widget/EdgeEffect;

    invoke-virtual {v6, v4}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :cond_166
    :goto_166
    if-gez v1, :cond_17a

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->ぇ〳〲〺すっ()V

    iget-object v6, v5, Landroidx/recyclerview/widget/RecyclerView;->ぷぞてのほき:Landroid/widget/EdgeEffect;

    invoke-virtual {v6}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v6

    if-eqz v6, :cond_18c

    iget-object v6, v5, Landroidx/recyclerview/widget/RecyclerView;->ぷぞてのほき:Landroid/widget/EdgeEffect;

    neg-int v7, v1

    invoke-virtual {v6, v7}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_18c

    :cond_17a
    if-lez v1, :cond_18c

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->ぶでにく〼〳()V

    iget-object v6, v5, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱:Landroid/widget/EdgeEffect;

    invoke-virtual {v6}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v6

    if-eqz v6, :cond_18c

    iget-object v6, v5, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱:Landroid/widget/EdgeEffect;

    invoke-virtual {v6, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :cond_18c
    :goto_18c
    if-nez v4, :cond_190

    if-eqz v1, :cond_19f

    .line 10
    :cond_190
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x10

    if-lt v1, v4, :cond_19c

    invoke-virtual {v5}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_19f

    :cond_19c
    invoke-virtual {v5}, Landroid/view/View;->postInvalidate()V

    .line 11
    :cond_19f
    :goto_19f
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->ぱでかぁ〻〹:Z

    if-eqz v1, :cond_1be

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->かづげぃぁ〺:Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;

    .line 12
    iget-object v4, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->くし〴〺ぅ:[I

    if-eqz v4, :cond_1af

    const/4 v5, -0x1

    invoke-static {v4, v5}, Ljava/util/Arrays;->fill([II)V

    :cond_1af
    iput v2, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->びぐびあび:I

    goto :goto_1be

    .line 13
    :cond_1b2
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->げつ〴ぬぐ()V

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v1, Landroidx/recyclerview/widget/RecyclerView;->ずまげせび〳:Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;

    if-eqz v4, :cond_1be

    invoke-virtual {v4, v1, v8, v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView;II)V

    :cond_1be
    :goto_1be
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->のぷのちつ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;

    if-eqz v1, :cond_1cd

    .line 14
    iget-boolean v4, v1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->びぐびあび:Z

    if-eqz v4, :cond_1cd

    .line 15
    invoke-virtual {v1, v2, v2}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->げつ〴ぬぐ(II)V

    :cond_1cd
    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->なぎぱいぢぎ:Z

    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->ぁごぐすすぃ:Z

    if-eqz v1, :cond_1de

    .line 16
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v1, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぅみぱぎぎ(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_1e8

    .line 17
    :cond_1de
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->へぼ〳〻び(I)V

    :goto_1e8
    return-void
.end method

.method public 〺つふすそ(IIILandroid/view/animation/Interpolator;)V
    .registers 15

    const/4 v0, 0x0

    const/high16 v1, -0x80000000

    if-ne p3, v1, :cond_74

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p3

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-le p3, v1, :cond_11

    const/4 v2, 0x1

    goto :goto_12

    :cond_11
    const/4 v2, 0x0

    :goto_12
    int-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    double-to-int v3, v3

    mul-int v4, p1, p1

    mul-int v5, p2, p2

    add-int/2addr v5, v4

    int-to-double v4, v5

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-int v4, v4

    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v2, :cond_2c

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getWidth()I

    move-result v5

    goto :goto_30

    :cond_2c
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getHeight()I

    move-result v5

    :goto_30
    div-int/lit8 v6, v5, 0x2

    int-to-float v4, v4

    const/high16 v7, 0x3f800000    # 1.0f

    mul-float v4, v4, v7

    int-to-float v5, v5

    div-float/2addr v4, v5

    invoke-static {v7, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    int-to-float v6, v6

    const/high16 v8, 0x3f000000    # 0.5f

    sub-float/2addr v4, v8

    const v8, 0x3ef1463b

    mul-float v4, v4, v8

    float-to-double v8, v4

    .line 2
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    double-to-float v4, v8

    mul-float v4, v4, v6

    add-float/2addr v4, v6

    if-lez v3, :cond_62

    const/high16 p3, 0x447a0000    # 1000.0f

    int-to-float v1, v3

    div-float/2addr v4, v1

    .line 3
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v1

    mul-float v1, v1, p3

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result p3

    mul-int/lit8 p3, p3, 0x4

    goto :goto_6e

    :cond_62
    if-eqz v2, :cond_65

    goto :goto_66

    :cond_65
    move p3, v1

    :goto_66
    int-to-float p3, p3

    div-float/2addr p3, v5

    add-float/2addr p3, v7

    const/high16 v1, 0x43960000    # 300.0f

    mul-float p3, p3, v1

    float-to-int p3, p3

    :goto_6e
    const/16 v1, 0x7d0

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    :cond_74
    move v6, p3

    if-nez p4, :cond_79

    .line 4
    sget-object p4, Landroidx/recyclerview/widget/RecyclerView;->ぁにあがあ:Landroid/view/animation/Interpolator;

    :cond_79
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->づざかべべ:Landroid/view/animation/Interpolator;

    if-eq p3, p4, :cond_8c

    iput-object p4, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->づざかべべ:Landroid/view/animation/Interpolator;

    new-instance p3, Landroid/widget/OverScroller;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p3, v1, p4}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->びぐびあび:Landroid/widget/OverScroller;

    :cond_8c
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->くし〴〺ぅ:I

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〺つふすそ:I

    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p4, 0x2

    invoke-virtual {p3, p4}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->びぐびあび:Landroid/widget/OverScroller;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, p1

    move v5, p2

    invoke-virtual/range {v1 .. v6}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x17

    if-ge p1, p2, :cond_aa

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->びぐびあび:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    :cond_aa
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->げつ〴ぬぐ()V

    return-void
.end method

.method public くし〴〺ぅ()V
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->びぐびあび:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->なぎぱいぢぎ:Z

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->ぁごぐすすぃ:Z

    goto :goto_12

    .line 1
    :cond_8
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぅみぱぎぎ(Landroid/view/View;Ljava/lang/Runnable;)V

    :goto_12
    return-void
.end method
