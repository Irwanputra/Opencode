.class public Lcom/google/android/material/navigation/NavigationView;
.super Lcom/google/android/material/internal/ScrimInsetsFrameLayout;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/navigation/NavigationView$SavedState;,
        Lcom/google/android/material/navigation/NavigationView$〺つふすそ;
    }
.end annotation


# static fields
.field public static final ぇぬぎばつ:I

.field public static final おぐぴう〸ず:[I

.field public static final へぬ〴づぞ:[I


# instance fields
.field public final 〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

.field public final ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/くし〴〺ぅ;

.field public final いいにぽつ:I

.field public てぜきぽく:Landroid/view/MenuInflater;

.field public のぷのちつ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field public ぺぁあねじ:Lcom/google/android/material/navigation/NavigationView$〺つふすそ;

.field public final ぺふねづ〺:[I


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    const/4 v0, 0x1

    new-array v1, v0, [I

    const v2, 0x10100a0

    const/4 v3, 0x0

    aput v2, v1, v3

    sput-object v1, Lcom/google/android/material/navigation/NavigationView;->へぬ〴づぞ:[I

    new-array v0, v0, [I

    const v1, -0x101009e

    aput v1, v0, v3

    sput-object v0, Lcom/google/android/material/navigation/NavigationView;->おぐぴう〸ず:[I

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺふねづ〺;->Widget_Design_NavigationView:I

    sput v0, Lcom/google/android/material/navigation/NavigationView;->ぇぬぎばつ:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/navigation/NavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->navigationViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/navigation/NavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 23

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move/from16 v4, p3

    sget v5, Lcom/google/android/material/navigation/NavigationView;->ぇぬぎばつ:I

    move-object/from16 v1, p1

    invoke-static {v1, v2, v4, v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺でおいここ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v2, v4}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    invoke-direct {v7}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;-><init>()V

    iput-object v7, v0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    const/4 v1, 0x2

    new-array v1, v1, [I

    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->ぺふねづ〺:[I

    invoke-virtual/range {p0 .. p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v8

    new-instance v9, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/くし〴〺ぅ;

    invoke-direct {v9, v8}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/くし〴〺ぅ;-><init>(Landroid/content/Context;)V

    iput-object v9, v0, Lcom/google/android/material/navigation/NavigationView;->ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/くし〴〺ぅ;

    sget-object v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView:[I

    const/4 v10, 0x0

    new-array v6, v10, [I

    move-object v1, v8

    invoke-static/range {v1 .. v6}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->づざかべべ(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    move-result-object v1

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_android_background:I

    invoke-virtual {v1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v3

    const/16 v4, 0x10

    if-eqz v3, :cond_4d

    invoke-virtual {v1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1
    sget-object v3, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v4, :cond_4a

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_4d

    :cond_4a
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    :cond_4d
    :goto_4d
    invoke-virtual/range {p0 .. p0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_5b

    invoke-virtual/range {p0 .. p0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    instance-of v2, v2, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v2, :cond_8e

    :cond_5b
    invoke-virtual/range {p0 .. p0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    new-instance v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    invoke-direct {v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;-><init>()V

    instance-of v5, v2, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v5, :cond_75

    check-cast v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result v2

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v3, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ごづごきえ(Landroid/content/res/ColorStateList;)V

    .line 3
    :cond_75
    iget-object v2, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    new-instance v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;

    invoke-direct {v5, v8}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;-><init>(Landroid/content/Context;)V

    iput-object v5, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;

    invoke-virtual {v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ぺづげぺが()V

    .line 4
    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v4, :cond_8b

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_8e

    :cond_8b
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 5
    :cond_8e
    :goto_8e
    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_elevation:I

    invoke-virtual {v1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v3

    if-eqz v3, :cond_9e

    invoke-virtual {v1, v2, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/NavigationView;->setElevation(F)V

    :cond_9e
    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_android_fitsSystemWindows:I

    invoke-virtual {v1, v2, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->げつ〴ぬぐ(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setFitsSystemWindows(Z)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_android_maxWidth:I

    invoke-virtual {v1, v2, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v2

    iput v2, v0, Lcom/google/android/material/navigation/NavigationView;->いいにぽつ:I

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_itemIconTint:I

    invoke-virtual {v1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v3

    if-eqz v3, :cond_bc

    invoke-virtual {v1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    goto :goto_c3

    :cond_bc
    const v2, 0x1010038

    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/NavigationView;->〺つふすそ(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    :goto_c3
    sget v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_itemTextAppearance:I

    invoke-virtual {v1, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v4

    if-eqz v4, :cond_d1

    invoke-virtual {v1, v3, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v3

    const/4 v4, 0x1

    goto :goto_d3

    :cond_d1
    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_d3
    sget v6, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_itemIconSize:I

    invoke-virtual {v1, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v11

    if-eqz v11, :cond_e2

    invoke-virtual {v1, v6, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v6

    invoke-virtual {v0, v6}, Lcom/google/android/material/navigation/NavigationView;->setItemIconSize(I)V

    :cond_e2
    const/4 v6, 0x0

    sget v11, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_itemTextColor:I

    invoke-virtual {v1, v11}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v12

    if-eqz v12, :cond_ef

    invoke-virtual {v1, v11}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object v6

    :cond_ef
    if-nez v4, :cond_fa

    if-nez v6, :cond_fa

    const v6, 0x1010036

    invoke-virtual {v0, v6}, Lcom/google/android/material/navigation/NavigationView;->〺つふすそ(I)Landroid/content/res/ColorStateList;

    move-result-object v6

    :cond_fa
    sget v11, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_itemBackground:I

    invoke-virtual {v1, v11}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v11

    if-nez v11, :cond_164

    .line 6
    sget v12, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_itemShapeAppearance:I

    invoke-virtual {v1, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v13

    if-nez v13, :cond_115

    sget v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_itemShapeAppearanceOverlay:I

    invoke-virtual {v1, v13}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v13

    if-eqz v13, :cond_113

    goto :goto_115

    :cond_113
    const/4 v13, 0x0

    goto :goto_116

    :cond_115
    :goto_115
    const/4 v13, 0x1

    :goto_116
    if-eqz v13, :cond_164

    .line 7
    invoke-virtual {v1, v12, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v11

    sget v12, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_itemShapeAppearanceOverlay:I

    invoke-virtual {v1, v12, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v12

    new-instance v14, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    invoke-virtual/range {p0 .. p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v13

    .line 8
    new-instance v15, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/げつ〴ぬぐ;

    int-to-float v5, v10

    invoke-direct {v15, v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/げつ〴ぬぐ;-><init>(F)V

    invoke-static {v13, v11, v12, v15}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;->げつ〴ぬぐ(Landroid/content/Context;IILなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/くし〴〺ぅ;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく$〺つふすそ;

    move-result-object v5

    .line 9
    invoke-virtual {v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく$〺つふすそ;->げつ〴ぬぐ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    move-result-object v5

    invoke-direct {v14, v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;)V

    invoke-virtual/range {p0 .. p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    sget v11, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_itemShapeFillColor:I

    invoke-static {v5, v1, v11}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉ〲なぱぽた(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;I)Landroid/content/res/ColorStateList;

    move-result-object v5

    invoke-virtual {v14, v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ごづごきえ(Landroid/content/res/ColorStateList;)V

    sget v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_itemShapeInsetStart:I

    invoke-virtual {v1, v5, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v15

    sget v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_itemShapeInsetTop:I

    invoke-virtual {v1, v5, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v16

    sget v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_itemShapeInsetEnd:I

    invoke-virtual {v1, v5, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v17

    sget v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_itemShapeInsetBottom:I

    invoke-virtual {v1, v5, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v18

    new-instance v11, Landroid/graphics/drawable/InsetDrawable;

    move-object v13, v11

    invoke-direct/range {v13 .. v18}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 10
    :cond_164
    sget v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_itemHorizontalPadding:I

    invoke-virtual {v1, v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v12

    if-eqz v12, :cond_173

    invoke-virtual {v1, v5, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v5

    invoke-virtual {v7, v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->〺つふすそ(I)V

    :cond_173
    sget v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_itemIconPadding:I

    invoke-virtual {v1, v5, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v5

    sget v12, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_itemMaxLines:I

    const/4 v13, 0x1

    invoke-virtual {v1, v12, v13}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result v12

    invoke-virtual {v0, v12}, Lcom/google/android/material/navigation/NavigationView;->setItemMaxLines(I)V

    new-instance v12, Lcom/google/android/material/navigation/NavigationView$げつ〴ぬぐ;

    invoke-direct {v12, v0}, Lcom/google/android/material/navigation/NavigationView$げつ〴ぬぐ;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 11
    iput-object v12, v9, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->づざかべべ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;

    .line 12
    iput v13, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->づざかべべ:I

    .line 13
    invoke-virtual {v7, v8, v9}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->くし〴〺ぅ(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V

    .line 14
    iput-object v2, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぺふねづ〺:Landroid/content/res/ColorStateList;

    invoke-virtual {v7, v10}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぁごぐすすぃ(Z)V

    .line 15
    invoke-virtual/range {p0 .. p0}, Landroid/widget/FrameLayout;->getOverScrollMode()I

    move-result v2

    .line 16
    iput v2, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ざっざへづ:I

    iget-object v8, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->〺つふすそ:Lcom/google/android/material/internal/NavigationMenuView;

    if-eqz v8, :cond_1a1

    invoke-virtual {v8, v2}, Landroid/view/ViewGroup;->setOverScrollMode(I)V

    :cond_1a1
    if-eqz v4, :cond_1ab

    .line 17
    iput v3, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->〳ぜぞぜべっ:I

    const/4 v2, 0x1

    iput-boolean v2, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぺぁあねじ:Z

    invoke-virtual {v7, v10}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぁごぐすすぃ(Z)V

    .line 18
    :cond_1ab
    iput-object v6, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->いいにぽつ:Landroid/content/res/ColorStateList;

    invoke-virtual {v7, v10}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぁごぐすすぃ(Z)V

    .line 19
    iput-object v11, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->てぜきぽく:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v7, v10}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぁごぐすすぃ(Z)V

    .line 20
    invoke-virtual {v7, v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->なぎぱいぢぎ(I)V

    .line 21
    iget-object v2, v9, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-virtual {v9, v7, v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;Landroid/content/Context;)V

    .line 22
    iget-object v2, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->〺つふすそ:Lcom/google/android/material/internal/NavigationMenuView;

    if-nez v2, :cond_201

    iget-object v2, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぁごぐすすぃ:Landroid/view/LayoutInflater;

    sget v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〳ぜぞぜべっ;->design_navigation_menu:I

    invoke-virtual {v2, v3, v0, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/internal/NavigationMenuView;

    iput-object v2, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->〺つふすそ:Lcom/google/android/material/internal/NavigationMenuView;

    new-instance v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび$〳ぜぞぜべっ;

    iget-object v4, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->〺つふすそ:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-direct {v3, v7, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび$〳ぜぞぜべっ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAccessibilityDelegateCompat(Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;)V

    iget-object v2, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび$くし〴〺ぅ;

    if-nez v2, :cond_1e2

    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび$くし〴〺ぅ;

    invoke-direct {v2, v7}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび$くし〴〺ぅ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;)V

    iput-object v2, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび$くし〴〺ぅ;

    :cond_1e2
    iget v2, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ざっざへづ:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1ec

    iget-object v3, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->〺つふすそ:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->setOverScrollMode(I)V

    :cond_1ec
    iget-object v2, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぁごぐすすぃ:Landroid/view/LayoutInflater;

    sget v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〳ぜぞぜべっ;->design_navigation_item_header:I

    iget-object v4, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->〺つふすそ:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v2, v3, v4, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->くし〴〺ぅ:Landroid/widget/LinearLayout;

    iget-object v2, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->〺つふすそ:Lcom/google/android/material/internal/NavigationMenuView;

    iget-object v3, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび$くし〴〺ぅ;

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$びぐびあび;)V

    :cond_201
    iget-object v2, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->〺つふすそ:Lcom/google/android/material/internal/NavigationMenuView;

    .line 23
    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_menu:I

    invoke-virtual {v1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v3

    if-eqz v3, :cond_223

    invoke-virtual {v1, v2, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v2

    const/4 v3, 0x1

    .line 24
    invoke-virtual {v7, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->のぷのちつ(Z)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/navigation/NavigationView;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v3

    invoke-virtual {v3, v2, v9}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    invoke-virtual {v7, v10}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->のぷのちつ(Z)V

    invoke-virtual {v7, v10}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぁごぐすすぃ(Z)V

    .line 25
    :cond_223
    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->NavigationView_headerLayout:I

    invoke-virtual {v1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v3

    if-eqz v3, :cond_245

    invoke-virtual {v1, v2, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v2

    .line 26
    iget-object v3, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぁごぐすすぃ:Landroid/view/LayoutInflater;

    iget-object v4, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->くし〴〺ぅ:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2, v4, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 27
    iget-object v3, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->くし〴〺ぅ:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iget-object v2, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->〺つふすそ:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    invoke-virtual {v2, v10, v10, v10, v3}, Landroid/view/ViewGroup;->setPadding(IIII)V

    .line 28
    :cond_245
    iget-object v1, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 29
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/どぇぞほだ/げつ〴ぬぐ;

    invoke-direct {v1, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/どぇぞほだ/げつ〴ぬぐ;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->のぷのちつ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual/range {p0 .. p0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iget-object v2, v0, Lcom/google/android/material/navigation/NavigationView;->のぷのちつ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method private getMenuInflater()Landroid/view/MenuInflater;
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->てぜきぽく:Landroid/view/MenuInflater;

    if-nez v0, :cond_f

    new-instance v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->てぜきぽく:Landroid/view/MenuInflater;

    :cond_f
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->てぜきぽく:Landroid/view/MenuInflater;

    return-object v0
.end method


# virtual methods
.method public getCheckedItem()Landroid/view/MenuItem;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび$くし〴〺ぅ;

    .line 2
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび$くし〴〺ぅ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    return-object v0
.end method

.method public getHeaderCount()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->くし〴〺ぅ:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->てぜきぽく:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getItemHorizontalPadding()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->のぷのちつ:I

    return v0
.end method

.method public getItemIconPadding()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->へぬ〴づぞ:I

    return v0
.end method

.method public getItemIconTintList()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぺふねづ〺:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getItemMaxLines()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ざとぅぼこ〺:I

    return v0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->いいにぽつ:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getMenu()Landroid/view/Menu;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/くし〴〺ぅ;

    return-object v0
.end method

.method public onAttachedToWindow()V
    .registers 3

    invoke-super {p0}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->onAttachedToWindow()V

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    if-eqz v1, :cond_10

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    invoke-static {p0, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅばづそほせ(Landroid/view/View;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;)V

    :cond_10
    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 3

    invoke-super {p0}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->onDetachedFromWindow()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_13

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->のぷのちつ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_1c

    :cond_13
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->のぷのちつ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :goto_1c
    return-void
.end method

.method public onMeasure(II)V
    .registers 6

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, -0x80000000

    const/high16 v2, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_10

    if-eqz v0, :cond_d

    goto :goto_1e

    :cond_d
    iget p1, p0, Lcom/google/android/material/navigation/NavigationView;->いいにぽつ:I

    goto :goto_1a

    :cond_10
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iget v0, p0, Lcom/google/android/material/navigation/NavigationView;->いいにぽつ:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_1a
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    :goto_1e
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3

    instance-of v0, p1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    if-nez v0, :cond_8

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_8
    check-cast p1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    .line 1
    iget-object v0, p1, Landroidx/customview/view/AbsSavedState;->〺つふすそ:Landroid/os/Parcelable;

    .line 2
    invoke-super {p0, v0}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/くし〴〺ぅ;

    iget-object p1, p1, Lcom/google/android/material/navigation/NavigationView$SavedState;->びぐびあび:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぶでにく〼〳(Landroid/os/Bundle;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 4

    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    invoke-direct {v1, v0}, Lcom/google/android/material/navigation/NavigationView$SavedState;-><init>(Landroid/os/Parcelable;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, v1, Lcom/google/android/material/navigation/NavigationView$SavedState;->びぐびあび:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationView;->ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/くし〴〺ぅ;

    invoke-virtual {v2, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぉ〲なぱぽた(Landroid/os/Bundle;)V

    return-object v1
.end method

.method public setCheckedItem(I)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/くし〴〺ぅ;

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_11

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    check-cast p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび$くし〴〺ぅ;

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび$くし〴〺ぅ;->〳ぜぞぜべっ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;)V

    :cond_11
    return-void
.end method

.method public setCheckedItem(Landroid/view/MenuItem;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/くし〴〺ぅ;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_16

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    check-cast p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    .line 2
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび$くし〴〺ぅ;

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび$くし〴〺ぅ;->〳ぜぞぜべっ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;)V

    return-void

    .line 3
    :cond_16
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Called setCheckedItem(MenuItem) with an item that is not in the current menu."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setElevation(F)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_9

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setElevation(F)V

    :cond_9
    invoke-static {p0, p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->へえどぜせ(Landroid/view/View;F)V

    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->てぜきぽく:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぁごぐすすぃ(Z)V

    return-void
.end method

.method public setItemBackgroundResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->くし〴〺ぅ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setItemHorizontalPadding(I)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->のぷのちつ:I

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぁごぐすすぃ(Z)V

    return-void
.end method

.method public setItemHorizontalPaddingResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->〺つふすそ(I)V

    return-void
.end method

.method public setItemIconPadding(I)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->へぬ〴づぞ:I

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぁごぐすすぃ(Z)V

    return-void
.end method

.method public setItemIconPaddingResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->なぎぱいぢぎ(I)V

    return-void
.end method

.method public setItemIconSize(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iget v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->おぐぴう〸ず:I

    if-eq v1, p1, :cond_f

    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->おぐぴう〸ず:I

    const/4 p1, 0x1

    iput-boolean p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぇぬぎばつ:Z

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぁごぐすすぃ(Z)V

    :cond_f
    return-void
.end method

.method public setItemIconTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぺふねづ〺:Landroid/content/res/ColorStateList;

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぁごぐすすぃ(Z)V

    return-void
.end method

.method public setItemMaxLines(I)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ざとぅぼこ〺:I

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぁごぐすすぃ(Z)V

    return-void
.end method

.method public setItemTextAppearance(I)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->〳ぜぞぜべっ:I

    const/4 p1, 0x1

    iput-boolean p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぺぁあねじ:Z

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぁごぐすすぃ(Z)V

    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->いいにぽつ:Landroid/content/res/ColorStateList;

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぁごぐすすぃ(Z)V

    return-void
.end method

.method public setNavigationItemSelectedListener(Lcom/google/android/material/navigation/NavigationView$〺つふすそ;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->ぺぁあねじ:Lcom/google/android/material/navigation/NavigationView$〺つふすそ;

    return-void
.end method

.method public setOverScrollMode(I)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setOverScrollMode(I)V

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    if-eqz v0, :cond_10

    .line 1
    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ざっざへづ:I

    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->〺つふすそ:Lcom/google/android/material/internal/NavigationMenuView;

    if-eqz v0, :cond_10

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setOverScrollMode(I)V

    :cond_10
    return-void
.end method

.method public final 〺つふすそ(I)Landroid/content/res/ColorStateList;
    .registers 12

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_16

    return-object v1

    :cond_16
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    iget v3, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-static {p1, v3}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    sget v4, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->colorPrimary:I

    invoke-virtual {v3, v4, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v3

    if-nez v3, :cond_31

    return-object v1

    :cond_31
    iget v0, v0, Landroid/util/TypedValue;->data:I

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    new-instance v3, Landroid/content/res/ColorStateList;

    const/4 v4, 0x3

    new-array v5, v4, [[I

    sget-object v6, Lcom/google/android/material/navigation/NavigationView;->おぐぴう〸ず:[I

    const/4 v7, 0x0

    aput-object v6, v5, v7

    sget-object v8, Lcom/google/android/material/navigation/NavigationView;->へぬ〴づぞ:[I

    aput-object v8, v5, v2

    sget-object v8, Landroid/widget/FrameLayout;->EMPTY_STATE_SET:[I

    const/4 v9, 0x2

    aput-object v8, v5, v9

    new-array v4, v4, [I

    invoke-virtual {p1, v6, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    aput p1, v4, v7

    aput v0, v4, v2

    aput v1, v4, v9

    invoke-direct {v3, v5, v4}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v3
.end method

.method public くし〴〺ぅ(I)Landroid/view/View;
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->くし〴〺ぅ:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public げつ〴ぬぐ(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)V
    .registers 7

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->づざかべべ()I

    move-result v1

    iget v2, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->は〲ぱなで:I

    if-eq v2, v1, :cond_12

    iput v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->は〲ぱなで:I

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->へぬ〴づぞ()V

    :cond_12
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->〺つふすそ:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    invoke-virtual {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->〺つふすそ()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v2, v4, v3}, Landroid/view/ViewGroup;->setPadding(IIII)V

    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->くし〴〺ぅ:Landroid/widget/LinearLayout;

    invoke-static {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びぐびあび(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    return-void
.end method
