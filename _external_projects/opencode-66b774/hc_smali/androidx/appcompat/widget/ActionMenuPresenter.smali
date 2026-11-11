.class public Landroidx/appcompat/widget/ActionMenuPresenter;
.super Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ$げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ActionMenuPresenter$〺つふすそ;,
        Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;,
        Landroidx/appcompat/widget/ActionMenuPresenter$なぎぱいぢぎ;,
        Landroidx/appcompat/widget/ActionMenuPresenter$げつ〴ぬぐ;,
        Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;,
        Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;,
        Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;
    }
.end annotation


# instance fields
.field public 〻ぞまぎな〻:Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;

.field public final ぇ〳〲〺すっ:Landroidx/appcompat/widget/ActionMenuPresenter$なぎぱいぢぎ;

.field public ぇぬぎばつ:I

.field public ぉ〲なぱぽた:Landroidx/appcompat/widget/ActionMenuPresenter$〺つふすそ;

.field public ぉざぅち〻:I

.field public おぐぴう〸ず:Z

.field public ごづごきえ:I

.field public final ざっざへづ:Landroid/util/SparseBooleanArray;

.field public ざとぅぼこ〺:I

.field public てぜきぽく:Landroid/graphics/drawable/Drawable;

.field public でどあくず:Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;

.field public のぷのちつ:Z

.field public は〲ぱなで:Z

.field public びえぁぜい:I

.field public ぶでにく〼〳:Landroidx/appcompat/widget/ActionMenuPresenter$げつ〴ぬぐ;

.field public へぬ〴づぞ:Z

.field public ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    sget v0, Lづざかべべ/〺つふすそ/ぁごぐすすぃ;->abc_action_menu_layout:I

    sget v1, Lづざかべべ/〺つふすそ/ぁごぐすすぃ;->abc_action_menu_item_layout:I

    invoke-direct {p0, p1, v0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;-><init>(Landroid/content/Context;II)V

    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ざっざへづ:Landroid/util/SparseBooleanArray;

    new-instance p1, Landroidx/appcompat/widget/ActionMenuPresenter$なぎぱいぢぎ;

    invoke-direct {p1, p0}, Landroidx/appcompat/widget/ActionMenuPresenter$なぎぱいぢぎ;-><init>(Landroidx/appcompat/widget/ActionMenuPresenter;)V

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぇ〳〲〺すっ:Landroidx/appcompat/widget/ActionMenuPresenter$なぎぱいぢぎ;

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ()Z
    .registers 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    const/4 v3, 0x0

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->てぜきぽく()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    goto :goto_12

    :cond_10
    const/4 v1, 0x0

    const/4 v4, 0x0

    :goto_12
    iget v5, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->ざとぅぼこ〺:I

    iget v6, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぉざぅち〻:I

    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    iget-object v8, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    check-cast v8, Landroid/view/ViewGroup;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_22
    const/4 v13, 0x2

    const/4 v14, 0x1

    if-ge v9, v4, :cond_54

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    .line 1
    iget v3, v15, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->ぉ〲なぱぽた:I

    and-int/lit8 v2, v3, 0x2

    if-ne v2, v13, :cond_34

    const/4 v2, 0x1

    goto :goto_35

    :cond_34
    const/4 v2, 0x0

    :goto_35
    if-eqz v2, :cond_3a

    add-int/lit8 v12, v12, 0x1

    goto :goto_47

    :cond_3a
    and-int/lit8 v2, v3, 0x1

    if-ne v2, v14, :cond_40

    const/4 v2, 0x1

    goto :goto_41

    :cond_40
    const/4 v2, 0x0

    :goto_41
    if-eqz v2, :cond_46

    add-int/lit8 v11, v11, 0x1

    goto :goto_47

    :cond_46
    const/4 v10, 0x1

    .line 2
    :goto_47
    iget-boolean v2, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->は〲ぱなで:Z

    if-eqz v2, :cond_50

    .line 3
    iget-boolean v2, v15, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->どぇぞほだ:Z

    if-eqz v2, :cond_50

    const/4 v5, 0x0

    :cond_50
    add-int/lit8 v9, v9, 0x1

    const/4 v3, 0x0

    goto :goto_22

    .line 4
    :cond_54
    iget-boolean v2, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->へぬ〴づぞ:Z

    if-eqz v2, :cond_5f

    if-nez v10, :cond_5d

    add-int/2addr v11, v12

    if-le v11, v5, :cond_5f

    :cond_5d
    add-int/lit8 v5, v5, -0x1

    :cond_5f
    sub-int/2addr v5, v12

    iget-object v2, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->ざっざへづ:Landroid/util/SparseBooleanArray;

    invoke-virtual {v2}, Landroid/util/SparseBooleanArray;->clear()V

    const/4 v3, 0x0

    const/4 v9, 0x0

    :goto_67
    if-ge v3, v4, :cond_107

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    .line 5
    iget v11, v10, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->ぉ〲なぱぽた:I

    and-int/lit8 v12, v11, 0x2

    if-ne v12, v13, :cond_77

    const/4 v12, 0x1

    goto :goto_78

    :cond_77
    const/4 v12, 0x0

    :goto_78
    if-eqz v12, :cond_96

    const/4 v12, 0x0

    .line 6
    invoke-virtual {v0, v10, v12, v8}, Landroidx/appcompat/widget/ActionMenuPresenter;->なぎぱいぢぎ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11, v7, v7}, Landroid/view/View;->measure(II)V

    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v11

    sub-int/2addr v6, v11

    if-nez v9, :cond_8a

    move v9, v11

    .line 7
    :cond_8a
    iget v11, v10, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->〺つふすそ:I

    if-eqz v11, :cond_91

    .line 8
    invoke-virtual {v2, v11, v14}, Landroid/util/SparseBooleanArray;->put(IZ)V

    :cond_91
    invoke-virtual {v10, v14}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->てぜきぽく(Z)V

    goto/16 :goto_fb

    :cond_96
    and-int/lit8 v11, v11, 0x1

    if-ne v11, v14, :cond_9c

    const/4 v11, 0x1

    goto :goto_9d

    :cond_9c
    const/4 v11, 0x0

    :goto_9d
    if-eqz v11, :cond_fd

    .line 9
    iget v11, v10, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->〺つふすそ:I

    .line 10
    invoke-virtual {v2, v11}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v12

    if-gtz v5, :cond_a9

    if-eqz v12, :cond_ad

    :cond_a9
    if-lez v6, :cond_ad

    const/4 v15, 0x1

    goto :goto_ae

    :cond_ad
    const/4 v15, 0x0

    :goto_ae
    const/4 v13, 0x0

    if-eqz v15, :cond_c8

    invoke-virtual {v0, v10, v13, v8}, Landroidx/appcompat/widget/ActionMenuPresenter;->なぎぱいぢぎ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v14

    invoke-virtual {v14, v7, v7}, Landroid/view/View;->measure(II)V

    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    sub-int/2addr v6, v14

    if-nez v9, :cond_c0

    move v9, v14

    :cond_c0
    add-int v14, v6, v9

    if-lez v14, :cond_c6

    const/4 v14, 0x1

    goto :goto_c7

    :cond_c6
    const/4 v14, 0x0

    :goto_c7
    and-int/2addr v15, v14

    :cond_c8
    if-eqz v15, :cond_d1

    if-eqz v11, :cond_d1

    const/4 v14, 0x1

    invoke-virtual {v2, v11, v14}, Landroid/util/SparseBooleanArray;->put(IZ)V

    goto :goto_f4

    :cond_d1
    if-eqz v12, :cond_f4

    const/4 v12, 0x0

    invoke-virtual {v2, v11, v12}, Landroid/util/SparseBooleanArray;->put(IZ)V

    const/4 v12, 0x0

    :goto_d8
    if-ge v12, v3, :cond_f4

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    .line 11
    iget v13, v14, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->〺つふすそ:I

    if-ne v13, v11, :cond_f0

    .line 12
    invoke-virtual {v14}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->ぁごぐすすぃ()Z

    move-result v13

    if-eqz v13, :cond_ec

    add-int/lit8 v5, v5, 0x1

    :cond_ec
    const/4 v13, 0x0

    invoke-virtual {v14, v13}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->てぜきぽく(Z)V

    :cond_f0
    add-int/lit8 v12, v12, 0x1

    const/4 v13, 0x0

    goto :goto_d8

    :cond_f4
    :goto_f4
    if-eqz v15, :cond_f8

    add-int/lit8 v5, v5, -0x1

    :cond_f8
    invoke-virtual {v10, v15}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->てぜきぽく(Z)V

    :goto_fb
    const/4 v11, 0x0

    goto :goto_101

    :cond_fd
    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->てぜきぽく(Z)V

    :goto_101
    add-int/lit8 v3, v3, 0x1

    const/4 v13, 0x2

    const/4 v14, 0x1

    goto/16 :goto_67

    :cond_107
    const/4 v3, 0x1

    return v3
.end method

.method public 〺つふすそ()Z
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->のぷのちつ()Z

    move-result v0

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->へぬ〴づぞ()Z

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public ぁごぐすすぃ(Z)V
    .registers 13

    .line 1
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    check-cast p1, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_b

    goto/16 :goto_7c

    :cond_b
    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz v3, :cond_62

    invoke-virtual {v3}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()V

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v3}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->てぜきぽく()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1e
    if-ge v5, v4, :cond_63

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    .line 2
    invoke-virtual {v7}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->ぁごぐすすぃ()Z

    move-result v8

    if-eqz v8, :cond_5f

    .line 3
    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    instance-of v9, v8, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ$げつ〴ぬぐ;

    if-eqz v9, :cond_3c

    move-object v9, v8

    check-cast v9, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ$げつ〴ぬぐ;

    invoke-interface {v9}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ$げつ〴ぬぐ;->getItemData()Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    move-result-object v9

    goto :goto_3d

    :cond_3c
    move-object v9, v0

    :goto_3d
    invoke-virtual {p0, v7, v8, p1}, Landroidx/appcompat/widget/ActionMenuPresenter;->なぎぱいぢぎ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v10

    if-eq v7, v9, :cond_49

    invoke-virtual {v10, v2}, Landroid/view/View;->setPressed(Z)V

    invoke-virtual {v10}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    :cond_49
    if-eq v10, v8, :cond_5d

    .line 4
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    check-cast v7, Landroid/view/ViewGroup;

    if-eqz v7, :cond_56

    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_56
    iget-object v7, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    check-cast v7, Landroid/view/ViewGroup;

    invoke-virtual {v7, v10, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    :cond_5d
    add-int/lit8 v6, v6, 0x1

    :cond_5f
    add-int/lit8 v5, v5, 0x1

    goto :goto_1e

    :cond_62
    const/4 v6, 0x0

    .line 5
    :cond_63
    :goto_63
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v6, v3, :cond_7c

    .line 6
    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    iget-object v4, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    if-ne v3, v4, :cond_73

    const/4 v3, 0x0

    goto :goto_77

    .line 7
    :cond_73
    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->removeViewAt(I)V

    const/4 v3, 0x1

    :goto_77
    if-nez v3, :cond_63

    add-int/lit8 v6, v6, 0x1

    goto :goto_63

    .line 8
    :cond_7c
    :goto_7c
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz p1, :cond_a2

    .line 9
    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()V

    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ:Ljava/util/ArrayList;

    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_91
    if-ge v4, v3, :cond_a2

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    .line 11
    iget-object v5, v5, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->びえぁぜい:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;

    if-eqz v5, :cond_9f

    .line 12
    iput-object p0, v5, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ$げつ〴ぬぐ;

    :cond_9f
    add-int/lit8 v4, v4, 0x1

    goto :goto_91

    .line 13
    :cond_a2
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz p1, :cond_ab

    .line 14
    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()V

    iget-object v0, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->いいにぽつ:Ljava/util/ArrayList;

    .line 15
    :cond_ab
    iget-boolean p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->へぬ〴づぞ:Z

    if-eqz p1, :cond_c5

    if-eqz v0, :cond_c5

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ne p1, v1, :cond_c2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    .line 16
    iget-boolean p1, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->どぇぞほだ:Z

    xor-int/lit8 v2, p1, 0x1

    goto :goto_c5

    :cond_c2
    if-lez p1, :cond_c5

    const/4 v2, 0x1

    .line 17
    :cond_c5
    :goto_c5
    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    if-eqz v2, :cond_f7

    if-nez p1, :cond_d4

    new-instance p1, Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->〺つふすそ:Landroid/content/Context;

    invoke-direct {p1, p0, v0}, Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;-><init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroid/content/Context;)V

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    :cond_d4
    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    if-eq p1, v0, :cond_108

    if-eqz p1, :cond_e7

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_e7
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    .line 18
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻()Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object v2

    iput-boolean v1, v2, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->くし〴〺ぅ:Z

    .line 19
    invoke-virtual {p1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_108

    :cond_f7
    if-eqz p1, :cond_108

    invoke-virtual {p1}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    if-ne p1, v0, :cond_108

    check-cast v0, Landroid/view/ViewGroup;

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_108
    :goto_108
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->へぬ〴づぞ:Z

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionMenuView;->setOverflowReserved(Z)V

    return-void
.end method

.method public ぇぬぎばつ()Z
    .registers 8

    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->へぬ〴づぞ:Z

    if-eqz v0, :cond_3f

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->おぐぴう〸ず()Z

    move-result v0

    if-nez v0, :cond_3f

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz v0, :cond_3f

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    if-eqz v1, :cond_3f

    iget-object v1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->〻ぞまぎな〻:Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;

    if-nez v1, :cond_3f

    .line 1
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()V

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->いいにぽつ:Ljava/util/ArrayList;

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3f

    new-instance v0, Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->くし〴〺ぅ:Landroid/content/Context;

    iget-object v4, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v5, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    const/4 v6, 0x1

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;-><init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/View;Z)V

    new-instance v1, Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;

    invoke-direct {v1, p0, v0}, Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;-><init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->〻ぞまぎな〻:Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const/4 v0, 0x1

    return v0

    :cond_3f
    const/4 v0, 0x0

    return v0
.end method

.method public おぐぴう〸ず()Z
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->でどあくず:Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 v0, 0x1

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    :goto_d
    return v0
.end method

.method public くし〴〺ぅ(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V
    .registers 7

    .line 1
    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->くし〴〺ぅ:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->おぐぴう〸ず:Z

    if-nez v0, :cond_22

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x13

    if-lt v0, v2, :cond_17

    goto :goto_20

    :cond_17
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result v0

    xor-int/2addr v1, v0

    .line 4
    :goto_20
    iput-boolean v1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->へぬ〴づぞ:Z

    .line 5
    :cond_22
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const/4 v1, 0x2

    div-int/2addr v0, v1

    .line 6
    iput v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぇぬぎばつ:I

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget v0, p1, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v2, p1, Landroid/content/res/Configuration;->screenHeightDp:I

    iget p1, p1, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    const/16 v3, 0x258

    if-gt p1, v3, :cond_6a

    if-gt v0, v3, :cond_6a

    const/16 p1, 0x2d0

    const/16 v3, 0x3c0

    if-le v0, v3, :cond_4c

    if-gt v2, p1, :cond_6a

    :cond_4c
    if-le v0, p1, :cond_51

    if-le v2, v3, :cond_51

    goto :goto_6a

    :cond_51
    const/16 p1, 0x1f4

    if-ge v0, p1, :cond_68

    const/16 p1, 0x1e0

    const/16 v3, 0x280

    if-le v0, v3, :cond_5d

    if-gt v2, p1, :cond_68

    :cond_5d
    if-le v0, p1, :cond_62

    if-le v2, v3, :cond_62

    goto :goto_68

    :cond_62
    const/16 p1, 0x168

    if-lt v0, p1, :cond_6b

    const/4 v1, 0x3

    goto :goto_6b

    :cond_68
    :goto_68
    const/4 v1, 0x4

    goto :goto_6b

    :cond_6a
    :goto_6a
    const/4 v1, 0x5

    .line 8
    :cond_6b
    :goto_6b
    iput v1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ざとぅぼこ〺:I

    iget p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぇぬぎばつ:I

    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->へぬ〴づぞ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_a0

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    if-nez v0, :cond_98

    new-instance v0, Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->〺つふすそ:Landroid/content/Context;

    invoke-direct {v0, p0, v2}, Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;-><init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    iget-boolean v2, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->のぷのちつ:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_8f

    iget-object v2, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->てぜきぽく:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->てぜきぽく:Landroid/graphics/drawable/Drawable;

    iput-boolean v3, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->のぷのちつ:Z

    :cond_8f
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    iget-object v1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    invoke-virtual {v1, v0, v0}, Landroid/widget/ImageView;->measure(II)V

    :cond_98
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v0

    sub-int/2addr p1, v0

    goto :goto_a2

    :cond_a0
    iput-object v1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    :goto_a2
    iput p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぉざぅち〻:I

    const/high16 p1, 0x42600000    # 56.0f

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    mul-float p2, p2, p1

    float-to-int p1, p2

    iput p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ごづごきえ:I

    return-void
.end method

.method public げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Z)V
    .registers 4

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->〺つふすそ()Z

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

    if-eqz v0, :cond_a

    invoke-interface {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;->げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Z)V

    :cond_a
    return-void
.end method

.method public づざかべべ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ざとぅぼこ〺;)Z
    .registers 10

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return v1

    :cond_8
    move-object v0, p1

    .line 1
    :goto_9
    iget-object v2, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ざとぅぼこ〺;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    .line 2
    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eq v2, v3, :cond_13

    move-object v0, v2

    check-cast v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ざとぅぼこ〺;

    goto :goto_9

    .line 3
    :cond_13
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ざとぅぼこ〺;->びえぁぜい:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    .line 4
    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    check-cast v2, Landroid/view/ViewGroup;

    const/4 v3, 0x0

    if-nez v2, :cond_1d

    goto :goto_3a

    :cond_1d
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    const/4 v5, 0x0

    :goto_22
    if-ge v5, v4, :cond_3a

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    instance-of v7, v6, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ$げつ〴ぬぐ;

    if-eqz v7, :cond_37

    move-object v7, v6

    check-cast v7, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ$げつ〴ぬぐ;

    invoke-interface {v7}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ$げつ〴ぬぐ;->getItemData()Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    move-result-object v7

    if-ne v7, v0, :cond_37

    move-object v3, v6

    goto :goto_3a

    :cond_37
    add-int/lit8 v5, v5, 0x1

    goto :goto_22

    :cond_3a
    :goto_3a
    if-nez v3, :cond_3d

    return v1

    .line 5
    :cond_3d
    iget-object v0, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ざとぅぼこ〺;->びえぁぜい:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    .line 6
    iget v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->げつ〴ぬぐ:I

    .line 7
    iput v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->びえぁぜい:I

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_48
    const/4 v4, 0x1

    if-ge v2, v0, :cond_60

    invoke-virtual {p1, v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v5

    invoke-interface {v5}, Landroid/view/MenuItem;->isVisible()Z

    move-result v6

    if-eqz v6, :cond_5d

    invoke-interface {v5}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_5d

    const/4 v1, 0x1

    goto :goto_60

    :cond_5d
    add-int/lit8 v2, v2, 0x1

    goto :goto_48

    :cond_60
    :goto_60
    new-instance v0, Landroidx/appcompat/widget/ActionMenuPresenter$げつ〴ぬぐ;

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->くし〴〺ぅ:Landroid/content/Context;

    invoke-direct {v0, p0, v2, p1, v3}, Landroidx/appcompat/widget/ActionMenuPresenter$げつ〴ぬぐ;-><init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ざとぅぼこ〺;Landroid/view/View;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぶでにく〼〳:Landroidx/appcompat/widget/ActionMenuPresenter$げつ〴ぬぐ;

    .line 8
    iput-boolean v1, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->〳ぜぞぜべっ:Z

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->いいにぽつ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;

    if-eqz v0, :cond_72

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;->ぉざぅち〻(Z)V

    .line 9
    :cond_72
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぶでにく〼〳:Landroidx/appcompat/widget/ActionMenuPresenter$げつ〴ぬぐ;

    .line 10
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->なぎぱいぢぎ()Z

    move-result v0

    if-eqz v0, :cond_82

    .line 11
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

    if-eqz v0, :cond_81

    invoke-interface {v0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;->〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)Z

    :cond_81
    return v4

    .line 12
    :cond_82
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "MenuPopupHelper cannot be used without an anchor"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_8b

    :goto_8a
    throw p1

    :goto_8b
    goto :goto_8a
.end method

.method public なぎぱいぢぎ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 7

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->getActionView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_d

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->なぎぱいぢぎ()Z

    move-result v2

    if-eqz v2, :cond_3e

    .line 1
    :cond_d
    instance-of v0, p2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ$げつ〴ぬぐ;

    if-eqz v0, :cond_14

    check-cast p2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ$げつ〴ぬぐ;

    goto :goto_1e

    .line 2
    :cond_14
    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->づざかべべ:Landroid/view/LayoutInflater;

    iget v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->〳ぜぞぜべっ:I

    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ$げつ〴ぬぐ;

    .line 3
    :goto_1e
    invoke-interface {p2, p1, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ$げつ〴ぬぐ;->びぐびあび(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;I)V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    check-cast v0, Landroidx/appcompat/widget/ActionMenuView;

    move-object v2, p2

    check-cast v2, Landroidx/appcompat/view/menu/ActionMenuItemView;

    invoke-virtual {v2, v0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setItemInvoker(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$〺つふすそ;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぉ〲なぱぽた:Landroidx/appcompat/widget/ActionMenuPresenter$〺つふすそ;

    if-nez v0, :cond_36

    new-instance v0, Landroidx/appcompat/widget/ActionMenuPresenter$〺つふすそ;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ActionMenuPresenter$〺つふすそ;-><init>(Landroidx/appcompat/widget/ActionMenuPresenter;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぉ〲なぱぽた:Landroidx/appcompat/widget/ActionMenuPresenter$〺つふすそ;

    :cond_36
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぉ〲なぱぽた:Landroidx/appcompat/widget/ActionMenuPresenter$〺つふすそ;

    invoke-virtual {v2, v0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setPopupCallback(Landroidx/appcompat/view/menu/ActionMenuItemView$〺つふすそ;)V

    .line 4
    move-object v0, p2

    check-cast v0, Landroid/view/View;

    .line 5
    :cond_3e
    iget-boolean p1, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->どぇぞほだ:Z

    if-eqz p1, :cond_44

    const/16 v1, 0x8

    .line 6
    :cond_44
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    check-cast p3, Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroidx/appcompat/widget/ActionMenuView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result p2

    if-nez p2, :cond_5a

    invoke-virtual {p3, p1}, Landroidx/appcompat/widget/ActionMenuView;->ざとぅぼこ〺(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_5a
    return-object v0
.end method

.method public のぷのちつ()Z
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->〻ぞまぎな〻:Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;

    const/4 v1, 0x1

    if-eqz v0, :cond_12

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    if-eqz v2, :cond_12

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->〻ぞまぎな〻:Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;

    return v1

    :cond_12
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->でどあくず:Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;

    if-eqz v0, :cond_22

    .line 1
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->〺つふすそ()Z

    move-result v2

    if-eqz v2, :cond_21

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->いいにぽつ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぇぬぎばつ;->dismiss()V

    :cond_21
    return v1

    :cond_22
    const/4 v0, 0x0

    return v0
.end method

.method public びぐびあび(Landroid/os/Parcelable;)V
    .registers 3

    instance-of v0, p1, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;

    if-nez v0, :cond_5

    return-void

    :cond_5
    check-cast p1, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;

    iget p1, p1, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;->〺つふすそ:I

    if-lez p1, :cond_1c

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_1c

    invoke-interface {p1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object p1

    check-cast p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ざとぅぼこ〺;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionMenuPresenter;->づざかべべ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ざとぅぼこ〺;)Z

    :cond_1c
    return-void
.end method

.method public へぬ〴づぞ()Z
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぶでにく〼〳:Landroidx/appcompat/widget/ActionMenuPresenter$げつ〴ぬぐ;

    if-eqz v0, :cond_11

    .line 1
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->〺つふすそ()Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->いいにぽつ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぇぬぎばつ;->dismiss()V

    :cond_f
    const/4 v0, 0x1

    return v0

    :cond_11
    const/4 v0, 0x0

    return v0
.end method

.method public ぺぁあねじ()Landroid/os/Parcelable;
    .registers 3

    new-instance v0, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;

    invoke-direct {v0}, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;-><init>()V

    iget v1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->びえぁぜい:I

    iput v1, v0, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;->〺つふすそ:I

    return-object v0
.end method
