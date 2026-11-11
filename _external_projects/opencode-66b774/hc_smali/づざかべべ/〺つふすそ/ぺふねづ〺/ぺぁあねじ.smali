.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;
.super Lづざかべべ/〺つふすそ/ぺふねづ〺/ざとぅぼこ〺;
.source ""

# interfaces
.implements Landroid/content/DialogInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public final びぐびあび:Landroidx/appcompat/app/AlertController;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .registers 4

    invoke-static {p1, p2}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;->びぐびあび(Landroid/content/Context;I)I

    move-result p2

    invoke-direct {p0, p1, p2}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざとぅぼこ〺;-><init>(Landroid/content/Context;I)V

    new-instance p1, Landroidx/appcompat/app/AlertController;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-direct {p1, p2, p0, v0}, Landroidx/appcompat/app/AlertController;-><init>(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぺふねづ〺/ざとぅぼこ〺;Landroid/view/Window;)V

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;->びぐびあび:Landroidx/appcompat/app/AlertController;

    return-void
.end method

.method public static びぐびあび(Landroid/content/Context;I)I
    .registers 4

    ushr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x1

    if-lt v0, v1, :cond_8

    return p1

    :cond_8
    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    sget v0, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->alertDialogTheme:I

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p0, p1, Landroid/util/TypedValue;->resourceId:I

    return p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .registers 18

    invoke-super/range {p0 .. p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざとぅぼこ〺;->onCreate(Landroid/os/Bundle;)V

    move-object/from16 v0, p0

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;->びぐびあび:Landroidx/appcompat/app/AlertController;

    .line 1
    iget v2, v1, Landroidx/appcompat/app/AlertController;->おかぷせ〱:I

    iget v2, v1, Landroidx/appcompat/app/AlertController;->けときぜと:I

    .line 2
    iget-object v3, v1, Landroidx/appcompat/app/AlertController;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざとぅぼこ〺;

    invoke-virtual {v3, v2}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざとぅぼこ〺;->setContentView(I)V

    .line 3
    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->くし〴〺ぅ:Landroid/view/Window;

    sget v3, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->parentPanel:I

    invoke-virtual {v2, v3}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v2

    sget v3, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->topPanel:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    sget v5, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->contentPanel:I

    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    sget v7, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->buttonPanel:I

    invoke-virtual {v2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    sget v9, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->customPanel:I

    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    .line 4
    iget-object v9, v1, Landroidx/appcompat/app/AlertController;->〳ぜぞぜべっ:Landroid/view/View;

    const/4 v11, 0x0

    if-eqz v9, :cond_38

    goto :goto_4a

    :cond_38
    iget v9, v1, Landroidx/appcompat/app/AlertController;->ぺぁあねじ:I

    if-eqz v9, :cond_49

    iget-object v9, v1, Landroidx/appcompat/app/AlertController;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-static {v9}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v9

    iget v12, v1, Landroidx/appcompat/app/AlertController;->ぺぁあねじ:I

    invoke-virtual {v9, v12, v2, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v9

    goto :goto_4a

    :cond_49
    const/4 v9, 0x0

    :goto_4a
    if-eqz v9, :cond_4e

    const/4 v13, 0x1

    goto :goto_4f

    :cond_4e
    const/4 v13, 0x0

    :goto_4f
    if-eqz v13, :cond_57

    invoke-static {v9}, Landroidx/appcompat/app/AlertController;->げつ〴ぬぐ(Landroid/view/View;)Z

    move-result v14

    if-nez v14, :cond_5e

    :cond_57
    iget-object v14, v1, Landroidx/appcompat/app/AlertController;->くし〴〺ぅ:Landroid/view/Window;

    const/high16 v15, 0x20000

    invoke-virtual {v14, v15, v15}, Landroid/view/Window;->setFlags(II)V

    :cond_5e
    const/4 v14, -0x1

    const/16 v15, 0x8

    if-eqz v13, :cond_92

    iget-object v13, v1, Landroidx/appcompat/app/AlertController;->くし〴〺ぅ:Landroid/view/Window;

    sget v12, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->custom:I

    invoke-virtual {v13, v12}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/FrameLayout;

    new-instance v13, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v13, v14, v14}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v12, v9, v13}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-boolean v9, v1, Landroidx/appcompat/app/AlertController;->へぬ〴づぞ:Z

    if-eqz v9, :cond_84

    iget v9, v1, Landroidx/appcompat/app/AlertController;->いいにぽつ:I

    iget v13, v1, Landroidx/appcompat/app/AlertController;->ぺふねづ〺:I

    iget v10, v1, Landroidx/appcompat/app/AlertController;->てぜきぽく:I

    iget v14, v1, Landroidx/appcompat/app/AlertController;->のぷのちつ:I

    invoke-virtual {v12, v9, v13, v10, v14}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    :cond_84
    iget-object v9, v1, Landroidx/appcompat/app/AlertController;->ぁごぐすすぃ:Landroid/widget/ListView;

    if-eqz v9, :cond_95

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    const/4 v10, 0x0

    iput v10, v9, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;->げつ〴ぬぐ:F

    goto :goto_95

    :cond_92
    invoke-virtual {v2, v15}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 5
    :cond_95
    :goto_95
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v2, v7}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v1, v3, v4}, Landroidx/appcompat/app/AlertController;->びぐびあび(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v3

    invoke-virtual {v1, v5, v6}, Landroidx/appcompat/app/AlertController;->びぐびあび(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v4

    invoke-virtual {v1, v7, v8}, Landroidx/appcompat/app/AlertController;->びぐびあび(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v5

    .line 6
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->くし〴〺ぅ:Landroid/view/Window;

    sget v7, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->scrollView:I

    invoke-virtual {v6, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroidx/core/widget/NestedScrollView;

    iput-object v6, v1, Landroidx/appcompat/app/AlertController;->びえぁぜい:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v6, v11}, Landroid/widget/FrameLayout;->setFocusable(Z)V

    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->びえぁぜい:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v6, v11}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    const v6, 0x102000b

    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, v1, Landroidx/appcompat/app/AlertController;->ぺづげぺが:Landroid/widget/TextView;

    if-nez v6, :cond_cf

    goto :goto_105

    :cond_cf
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->なぎぱいぢぎ:Ljava/lang/CharSequence;

    if-eqz v7, :cond_d7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_105

    :cond_d7
    invoke-virtual {v6, v15}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->びえぁぜい:Landroidx/core/widget/NestedScrollView;

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->ぺづげぺが:Landroid/widget/TextView;

    invoke-virtual {v6, v7}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->ぁごぐすすぃ:Landroid/widget/ListView;

    if-eqz v6, :cond_102

    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->びえぁぜい:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v6}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup;

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->びえぁぜい:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->removeViewAt(I)V

    iget-object v8, v1, Landroidx/appcompat/app/AlertController;->ぁごぐすすぃ:Landroid/widget/ListView;

    new-instance v9, Landroid/view/ViewGroup$LayoutParams;

    const/4 v10, -0x1

    invoke-direct {v9, v10, v10}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v8, v7, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_105

    :cond_102
    invoke-virtual {v4, v15}, Landroid/view/ViewGroup;->setVisibility(I)V

    :goto_105
    const v6, 0x1020019

    .line 7
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    iput-object v6, v1, Landroidx/appcompat/app/AlertController;->おぐぴう〸ず:Landroid/widget/Button;

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->ち〴みぎ〻び:Landroid/view/View$OnClickListener;

    invoke-virtual {v6, v7}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->ぇぬぎばつ:Ljava/lang/CharSequence;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_128

    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    if-nez v6, :cond_128

    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->おぐぴう〸ず:Landroid/widget/Button;

    invoke-virtual {v6, v15}, Landroid/widget/Button;->setVisibility(I)V

    const/4 v6, 0x0

    goto :goto_146

    :cond_128
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->おぐぴう〸ず:Landroid/widget/Button;

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->ぇぬぎばつ:Ljava/lang/CharSequence;

    invoke-virtual {v6, v7}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    if-eqz v6, :cond_140

    iget v7, v1, Landroidx/appcompat/app/AlertController;->びぐびあび:I

    invoke-virtual {v6, v11, v11, v7, v7}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->おぐぴう〸ず:Landroid/widget/Button;

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v8, v8, v8}, Landroid/widget/Button;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_140
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->おぐぴう〸ず:Landroid/widget/Button;

    invoke-virtual {v6, v11}, Landroid/widget/Button;->setVisibility(I)V

    const/4 v6, 0x1

    :goto_146
    const v7, 0x102001a

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/Button;

    iput-object v7, v1, Landroidx/appcompat/app/AlertController;->は〲ぱなで:Landroid/widget/Button;

    iget-object v8, v1, Landroidx/appcompat/app/AlertController;->ち〴みぎ〻び:Landroid/view/View$OnClickListener;

    invoke-virtual {v7, v8}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->ごづごきえ:Ljava/lang/CharSequence;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_168

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->でどあくず:Landroid/graphics/drawable/Drawable;

    if-nez v7, :cond_168

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->は〲ぱなで:Landroid/widget/Button;

    invoke-virtual {v7, v15}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_187

    :cond_168
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->は〲ぱなで:Landroid/widget/Button;

    iget-object v8, v1, Landroidx/appcompat/app/AlertController;->ごづごきえ:Ljava/lang/CharSequence;

    invoke-virtual {v7, v8}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->でどあくず:Landroid/graphics/drawable/Drawable;

    if-eqz v7, :cond_180

    iget v8, v1, Landroidx/appcompat/app/AlertController;->びぐびあび:I

    invoke-virtual {v7, v11, v11, v8, v8}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->は〲ぱなで:Landroid/widget/Button;

    iget-object v8, v1, Landroidx/appcompat/app/AlertController;->でどあくず:Landroid/graphics/drawable/Drawable;

    const/4 v9, 0x0

    invoke-virtual {v7, v8, v9, v9, v9}, Landroid/widget/Button;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_180
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->は〲ぱなで:Landroid/widget/Button;

    invoke-virtual {v7, v11}, Landroid/widget/Button;->setVisibility(I)V

    or-int/lit8 v6, v6, 0x2

    :goto_187
    const v7, 0x102001b

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/Button;

    iput-object v7, v1, Landroidx/appcompat/app/AlertController;->ぶでにく〼〳:Landroid/widget/Button;

    iget-object v8, v1, Landroidx/appcompat/app/AlertController;->ち〴みぎ〻び:Landroid/view/View$OnClickListener;

    invoke-virtual {v7, v8}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->〻ぞまぎな〻:Ljava/lang/CharSequence;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_1aa

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->ぇ〳〲〺すっ:Landroid/graphics/drawable/Drawable;

    if-nez v7, :cond_1aa

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->ぶでにく〼〳:Landroid/widget/Button;

    invoke-virtual {v7, v15}, Landroid/widget/Button;->setVisibility(I)V

    const/4 v9, 0x0

    goto :goto_1cb

    :cond_1aa
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->ぶでにく〼〳:Landroid/widget/Button;

    iget-object v8, v1, Landroidx/appcompat/app/AlertController;->〻ぞまぎな〻:Ljava/lang/CharSequence;

    invoke-virtual {v7, v8}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->ぇ〳〲〺すっ:Landroid/graphics/drawable/Drawable;

    if-eqz v7, :cond_1c3

    iget v8, v1, Landroidx/appcompat/app/AlertController;->びぐびあび:I

    invoke-virtual {v7, v11, v11, v8, v8}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->ぶでにく〼〳:Landroid/widget/Button;

    iget-object v8, v1, Landroidx/appcompat/app/AlertController;->ぇ〳〲〺すっ:Landroid/graphics/drawable/Drawable;

    const/4 v9, 0x0

    invoke-virtual {v7, v8, v9, v9, v9}, Landroid/widget/Button;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_1c4

    :cond_1c3
    const/4 v9, 0x0

    :goto_1c4
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->ぶでにく〼〳:Landroid/widget/Button;

    invoke-virtual {v7, v11}, Landroid/widget/Button;->setVisibility(I)V

    or-int/lit8 v6, v6, 0x4

    :goto_1cb
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->げつ〴ぬぐ:Landroid/content/Context;

    .line 8
    new-instance v8, Landroid/util/TypedValue;

    invoke-direct {v8}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v7}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    sget v10, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->alertDialogCenterButtons:I

    const/4 v12, 0x1

    invoke-virtual {v7, v10, v8, v12}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v7, v8, Landroid/util/TypedValue;->data:I

    if-eqz v7, :cond_1e2

    const/4 v7, 0x1

    goto :goto_1e3

    :cond_1e2
    const/4 v7, 0x0

    :goto_1e3
    const/4 v8, 0x2

    if-eqz v7, :cond_1f8

    if-ne v6, v12, :cond_1eb

    .line 9
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->おぐぴう〸ず:Landroid/widget/Button;

    goto :goto_1f5

    :cond_1eb
    if-ne v6, v8, :cond_1f0

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->は〲ぱなで:Landroid/widget/Button;

    goto :goto_1f5

    :cond_1f0
    const/4 v7, 0x4

    if-ne v6, v7, :cond_1f8

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->ぶでにく〼〳:Landroid/widget/Button;

    :goto_1f5
    invoke-virtual {v1, v7}, Landroidx/appcompat/app/AlertController;->〺つふすそ(Landroid/widget/Button;)V

    :cond_1f8
    if-eqz v6, :cond_1fc

    const/4 v6, 0x1

    goto :goto_1fd

    :cond_1fc
    const/4 v6, 0x0

    :goto_1fd
    if-nez v6, :cond_202

    invoke-virtual {v5, v15}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 10
    :cond_202
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->ぉひのべい:Landroid/view/View;

    if-eqz v6, :cond_21f

    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    const/4 v7, -0x2

    const/4 v10, -0x1

    invoke-direct {v6, v10, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->ぉひのべい:Landroid/view/View;

    invoke-virtual {v3, v7, v11, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->くし〴〺ぅ:Landroid/view/Window;

    sget v7, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->title_template:I

    invoke-virtual {v6, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6, v15}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_295

    :cond_21f
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->くし〴〺ぅ:Landroid/view/Window;

    const v7, 0x1020006

    invoke-virtual {v6, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, v1, Landroidx/appcompat/app/AlertController;->ぅみぱぎぎ:Landroid/widget/ImageView;

    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->づざかべべ:Ljava/lang/CharSequence;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    const/4 v7, 0x1

    xor-int/2addr v6, v7

    if-eqz v6, :cond_282

    iget-boolean v6, v1, Landroidx/appcompat/app/AlertController;->ぃぜぶの〸ぃ:Z

    if-eqz v6, :cond_282

    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->くし〴〺ぅ:Landroid/view/Window;

    sget v7, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->alertTitle:I

    invoke-virtual {v6, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, v1, Landroidx/appcompat/app/AlertController;->じぜこほぱ:Landroid/widget/TextView;

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->づざかべべ:Ljava/lang/CharSequence;

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget v6, v1, Landroidx/appcompat/app/AlertController;->なぶひせが:I

    if-eqz v6, :cond_255

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->ぅみぱぎぎ:Landroid/widget/ImageView;

    invoke-virtual {v7, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_295

    :cond_255
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->どぇぞほだ:Landroid/graphics/drawable/Drawable;

    if-eqz v6, :cond_25f

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->ぅみぱぎぎ:Landroid/widget/ImageView;

    invoke-virtual {v7, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_295

    :cond_25f
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->じぜこほぱ:Landroid/widget/TextView;

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->ぅみぱぎぎ:Landroid/widget/ImageView;

    invoke-virtual {v7}, Landroid/widget/ImageView;->getPaddingLeft()I

    move-result v7

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->ぅみぱぎぎ:Landroid/widget/ImageView;

    invoke-virtual {v10}, Landroid/widget/ImageView;->getPaddingTop()I

    move-result v10

    iget-object v12, v1, Landroidx/appcompat/app/AlertController;->ぅみぱぎぎ:Landroid/widget/ImageView;

    invoke-virtual {v12}, Landroid/widget/ImageView;->getPaddingRight()I

    move-result v12

    iget-object v13, v1, Landroidx/appcompat/app/AlertController;->ぅみぱぎぎ:Landroid/widget/ImageView;

    invoke-virtual {v13}, Landroid/widget/ImageView;->getPaddingBottom()I

    move-result v13

    invoke-virtual {v6, v7, v10, v12, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->ぅみぱぎぎ:Landroid/widget/ImageView;

    invoke-virtual {v6, v15}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_295

    :cond_282
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->くし〴〺ぅ:Landroid/view/Window;

    sget v7, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->title_template:I

    invoke-virtual {v6, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6, v15}, Landroid/view/View;->setVisibility(I)V

    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->ぅみぱぎぎ:Landroid/widget/ImageView;

    invoke-virtual {v6, v15}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {v3, v15}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 11
    :goto_295
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v2

    if-eq v2, v15, :cond_29d

    const/4 v12, 0x1

    goto :goto_29e

    :cond_29d
    const/4 v12, 0x0

    :goto_29e
    if-eqz v3, :cond_2a8

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v2

    if-eq v2, v15, :cond_2a8

    const/4 v2, 0x1

    goto :goto_2a9

    :cond_2a8
    const/4 v2, 0x0

    :goto_2a9
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v5

    if-eq v5, v15, :cond_2b1

    const/4 v5, 0x1

    goto :goto_2b2

    :cond_2b1
    const/4 v5, 0x0

    :goto_2b2
    if-nez v5, :cond_2bf

    sget v6, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->textSpacerNoButtons:I

    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_2bf

    invoke-virtual {v6, v11}, Landroid/view/View;->setVisibility(I)V

    :cond_2bf
    if-eqz v2, :cond_2dd

    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->びえぁぜい:Landroidx/core/widget/NestedScrollView;

    if-eqz v6, :cond_2c9

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroid/widget/FrameLayout;->setClipToPadding(Z)V

    :cond_2c9
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->なぎぱいぢぎ:Ljava/lang/CharSequence;

    if-nez v6, :cond_2d4

    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->ぁごぐすすぃ:Landroid/widget/ListView;

    if-eqz v6, :cond_2d2

    goto :goto_2d4

    :cond_2d2
    move-object v3, v9

    goto :goto_2da

    :cond_2d4
    :goto_2d4
    sget v6, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->titleDividerNoCustom:I

    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v3

    :goto_2da
    if-eqz v3, :cond_2e8

    goto :goto_2e5

    :cond_2dd
    sget v3, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->textSpacerNoTitle:I

    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_2e8

    :goto_2e5
    invoke-virtual {v3, v11}, Landroid/view/View;->setVisibility(I)V

    :cond_2e8
    iget-object v3, v1, Landroidx/appcompat/app/AlertController;->ぁごぐすすぃ:Landroid/widget/ListView;

    instance-of v6, v3, Landroidx/appcompat/app/AlertController$RecycleListView;

    if-eqz v6, :cond_2f3

    check-cast v3, Landroidx/appcompat/app/AlertController$RecycleListView;

    invoke-virtual {v3, v2, v5}, Landroidx/appcompat/app/AlertController$RecycleListView;->setHasDecor(ZZ)V

    :cond_2f3
    if-nez v12, :cond_37c

    iget-object v3, v1, Landroidx/appcompat/app/AlertController;->ぁごぐすすぃ:Landroid/widget/ListView;

    if-eqz v3, :cond_2fa

    goto :goto_2fc

    :cond_2fa
    iget-object v3, v1, Landroidx/appcompat/app/AlertController;->びえぁぜい:Landroidx/core/widget/NestedScrollView;

    :goto_2fc
    if-eqz v3, :cond_37c

    if-eqz v5, :cond_301

    const/4 v11, 0x2

    :cond_301
    or-int/2addr v2, v11

    const/4 v5, 0x3

    .line 12
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->くし〴〺ぅ:Landroid/view/Window;

    sget v7, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->scrollIndicatorUp:I

    invoke-virtual {v6, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v6

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->くし〴〺ぅ:Landroid/view/Window;

    sget v10, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->scrollIndicatorDown:I

    invoke-virtual {v7, v10}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v7

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x17

    if-lt v10, v11, :cond_328

    .line 13
    sget-object v8, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    if-lt v10, v11, :cond_320

    invoke-virtual {v3, v2, v5}, Landroid/view/View;->setScrollIndicators(II)V

    :cond_320
    if-eqz v6, :cond_325

    .line 14
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_325
    if-eqz v7, :cond_37c

    goto :goto_379

    :cond_328
    if-eqz v6, :cond_332

    and-int/lit8 v3, v2, 0x1

    if-nez v3, :cond_332

    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    move-object v6, v9

    :cond_332
    if-eqz v7, :cond_33c

    and-int/2addr v2, v8

    if-nez v2, :cond_33c

    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    move-object v10, v9

    goto :goto_33d

    :cond_33c
    move-object v10, v7

    :goto_33d
    if-nez v6, :cond_341

    if-eqz v10, :cond_37c

    :cond_341
    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->なぎぱいぢぎ:Ljava/lang/CharSequence;

    if-eqz v2, :cond_35a

    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->びえぁぜい:Landroidx/core/widget/NestedScrollView;

    new-instance v3, Lづざかべべ/〺つふすそ/ぺふねづ〺/びぐびあび;

    invoke-direct {v3, v1, v6, v10}, Lづざかべべ/〺つふすそ/ぺふねづ〺/びぐびあび;-><init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroidx/core/widget/NestedScrollView;->setOnScrollChangeListener(Landroidx/core/widget/NestedScrollView$〺つふすそ;)V

    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->びえぁぜい:Landroidx/core/widget/NestedScrollView;

    new-instance v3, Lづざかべべ/〺つふすそ/ぺふねづ〺/づざかべべ;

    invoke-direct {v3, v1, v6, v10}, Lづざかべべ/〺つふすそ/ぺふねづ〺/づざかべべ;-><init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->post(Ljava/lang/Runnable;)Z

    goto :goto_37c

    :cond_35a
    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->ぁごぐすすぃ:Landroid/widget/ListView;

    if-eqz v2, :cond_371

    new-instance v3, Lづざかべべ/〺つふすそ/ぺふねづ〺/なぎぱいぢぎ;

    invoke-direct {v3, v1, v6, v10}, Lづざかべべ/〺つふすそ/ぺふねづ〺/なぎぱいぢぎ;-><init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->ぁごぐすすぃ:Landroid/widget/ListView;

    new-instance v3, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぁごぐすすぃ;

    invoke-direct {v3, v1, v6, v10}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぁごぐすすぃ;-><init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    goto :goto_37c

    :cond_371
    if-eqz v6, :cond_376

    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_376
    if-eqz v10, :cond_37c

    move-object v7, v10

    :goto_379
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 15
    :cond_37c
    :goto_37c
    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->ぁごぐすすぃ:Landroid/widget/ListView;

    if-eqz v2, :cond_393

    iget-object v3, v1, Landroidx/appcompat/app/AlertController;->せづっ〸ちね:Landroid/widget/ListAdapter;

    if-eqz v3, :cond_393

    invoke-virtual {v2, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget v1, v1, Landroidx/appcompat/app/AlertController;->ぷぞてのほき:I

    const/4 v3, -0x1

    if-le v1, v3, :cond_393

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Landroid/widget/ListView;->setItemChecked(IZ)V

    invoke-virtual {v2, v1}, Landroid/widget/ListView;->setSelection(I)V

    :cond_393
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .registers 5

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;->びぐびあび:Landroidx/appcompat/app/AlertController;

    .line 1
    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->びえぁぜい:Landroidx/core/widget/NestedScrollView;

    const/4 v1, 0x1

    if-eqz v0, :cond_f

    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->おぐぴう〸ず(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_f

    const/4 v0, 0x1

    goto :goto_10

    :cond_f
    const/4 v0, 0x0

    :goto_10
    if-eqz v0, :cond_13

    return v1

    .line 2
    :cond_13
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .registers 5

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;->びぐびあび:Landroidx/appcompat/app/AlertController;

    .line 1
    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->びえぁぜい:Landroidx/core/widget/NestedScrollView;

    const/4 v1, 0x1

    if-eqz v0, :cond_f

    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->おぐぴう〸ず(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_f

    const/4 v0, 0x1

    goto :goto_10

    :cond_f
    const/4 v0, 0x0

    :goto_10
    if-eqz v0, :cond_13

    return v1

    .line 2
    :cond_13
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .registers 3

    invoke-super {p0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざとぅぼこ〺;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;->びぐびあび:Landroidx/appcompat/app/AlertController;

    .line 1
    iput-object p1, v0, Landroidx/appcompat/app/AlertController;->づざかべべ:Ljava/lang/CharSequence;

    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->じぜこほぱ:Landroid/widget/TextView;

    if-eqz v0, :cond_e

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_e
    return-void
.end method

.method public くし〴〺ぅ(I)Landroid/widget/Button;
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;->びぐびあび:Landroidx/appcompat/app/AlertController;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, -0x3

    if-eq p1, v1, :cond_16

    const/4 v1, -0x2

    if-eq p1, v1, :cond_13

    const/4 v1, -0x1

    if-eq p1, v1, :cond_10

    const/4 p1, 0x0

    goto :goto_18

    :cond_10
    iget-object p1, v0, Landroidx/appcompat/app/AlertController;->おぐぴう〸ず:Landroid/widget/Button;

    goto :goto_18

    :cond_13
    iget-object p1, v0, Landroidx/appcompat/app/AlertController;->は〲ぱなで:Landroid/widget/Button;

    goto :goto_18

    :cond_16
    iget-object p1, v0, Landroidx/appcompat/app/AlertController;->ぶでにく〼〳:Landroid/widget/Button;

    :goto_18
    return-object p1
.end method
