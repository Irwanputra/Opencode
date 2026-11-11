.class public abstract Landroidx/transition/Visibility;
.super Landroidx/transition/Transition;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/Visibility$げつ〴ぬぐ;,
        Landroidx/transition/Visibility$〺つふすそ;
    }
.end annotation


# static fields
.field public static final びえぁぜい:[Ljava/lang/String;


# instance fields
.field public ぇ〳〲〺すっ:I


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "android:visibility:visibility"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "android:visibility:parent"

    aput-object v2, v0, v1

    sput-object v0, Landroidx/transition/Visibility;->びえぁぜい:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Landroidx/transition/Visibility;->ぇ〳〲〺すっ:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x3

    iput v0, p0, Landroidx/transition/Visibility;->ぇ〳〲〺すっ:I

    sget-object v0, Lづざかべべ/は〲ぱなで/ざとぅぼこ〺;->くし〴〺ぅ:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    check-cast p2, Landroid/content/res/XmlResourceParser;

    const-string v0, "transitionVisibilityMode"

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, v1}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->びぐびあび(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_1d

    invoke-virtual {p0, p2}, Landroidx/transition/Visibility;->ながふずは(I)V

    :cond_1d
    return-void
.end method


# virtual methods
.method public 〺でおいここ(Landroid/view/ViewGroup;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;
    .registers 8

    iget v0, p0, Landroidx/transition/Visibility;->ぇ〳〲〺すっ:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2d

    if-nez p3, :cond_a

    goto :goto_2d

    :cond_a
    if-nez p2, :cond_26

    iget-object v0, p3, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroidx/transition/Transition;->おぐぴう〸ず(Landroid/view/View;Z)Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    move-result-object v3

    invoke-virtual {p0, v0, v1}, Landroidx/transition/Transition;->ざとぅぼこ〺(Landroid/view/View;Z)Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    move-result-object v0

    invoke-virtual {p0, v3, v0}, Landroidx/transition/Visibility;->けときぜと(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroidx/transition/Visibility$〺つふすそ;

    move-result-object v0

    iget-boolean v0, v0, Landroidx/transition/Visibility$〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_26

    return-object v2

    :cond_26
    iget-object v0, p3, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p0, p1, v0, p2, p3}, Landroidx/transition/Visibility;->おかぷせ〱(Landroid/view/ViewGroup;Landroid/view/View;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;

    move-result-object p1

    return-object p1

    :cond_2d
    :goto_2d
    return-object v2
.end method

.method public ぁごぐすすぃ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/transition/Visibility;->ぷぞてのほき(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    return-void
.end method

.method public ぇとしたべど(Landroid/view/ViewGroup;Landroid/view/View;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;
    .registers 5

    const/4 p1, 0x0

    return-object p1
.end method

.method public ぉざぅち〻()[Ljava/lang/String;
    .registers 2

    sget-object v0, Landroidx/transition/Visibility;->びえぁぜい:[Ljava/lang/String;

    return-object v0
.end method

.method public おかぷせ〱(Landroid/view/ViewGroup;Landroid/view/View;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;
    .registers 5

    const/4 p1, 0x0

    return-object p1
.end method

.method public final けときぜと(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroidx/transition/Visibility$〺つふすそ;
    .registers 10

    new-instance v0, Landroidx/transition/Visibility$〺つふすそ;

    invoke-direct {v0}, Landroidx/transition/Visibility$〺つふすそ;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/transition/Visibility$〺つふすそ;->げつ〴ぬぐ:Z

    iput-boolean v1, v0, Landroidx/transition/Visibility$〺つふすそ;->〺つふすそ:Z

    const-string v2, "android:visibility:parent"

    const/4 v3, 0x0

    const/4 v4, -0x1

    const-string v5, "android:visibility:visibility"

    if-eqz p1, :cond_33

    iget-object v6, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_33

    iget-object v6, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iput v6, v0, Landroidx/transition/Visibility$〺つふすそ;->くし〴〺ぅ:I

    iget-object v6, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup;

    iput-object v6, v0, Landroidx/transition/Visibility$〺つふすそ;->づざかべべ:Landroid/view/ViewGroup;

    goto :goto_37

    :cond_33
    iput v4, v0, Landroidx/transition/Visibility$〺つふすそ;->くし〴〺ぅ:I

    iput-object v3, v0, Landroidx/transition/Visibility$〺つふすそ;->づざかべべ:Landroid/view/ViewGroup;

    :goto_37
    if-eqz p2, :cond_5a

    iget-object v6, p2, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5a

    iget-object v3, p2, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iput v3, v0, Landroidx/transition/Visibility$〺つふすそ;->びぐびあび:I

    iget-object v3, p2, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, v0, Landroidx/transition/Visibility$〺つふすそ;->なぎぱいぢぎ:Landroid/view/ViewGroup;

    goto :goto_5e

    :cond_5a
    iput v4, v0, Landroidx/transition/Visibility$〺つふすそ;->びぐびあび:I

    iput-object v3, v0, Landroidx/transition/Visibility$〺つふすそ;->なぎぱいぢぎ:Landroid/view/ViewGroup;

    :goto_5e
    const/4 v2, 0x1

    if-eqz p1, :cond_82

    if-eqz p2, :cond_82

    iget p1, v0, Landroidx/transition/Visibility$〺つふすそ;->くし〴〺ぅ:I

    iget p2, v0, Landroidx/transition/Visibility$〺つふすそ;->びぐびあび:I

    if-ne p1, p2, :cond_70

    iget-object v3, v0, Landroidx/transition/Visibility$〺つふすそ;->づざかべべ:Landroid/view/ViewGroup;

    iget-object v4, v0, Landroidx/transition/Visibility$〺つふすそ;->なぎぱいぢぎ:Landroid/view/ViewGroup;

    if-ne v3, v4, :cond_70

    return-object v0

    :cond_70
    if-eq p1, p2, :cond_78

    if-nez p1, :cond_75

    goto :goto_93

    :cond_75
    if-nez p2, :cond_96

    goto :goto_88

    :cond_78
    iget-object p1, v0, Landroidx/transition/Visibility$〺つふすそ;->なぎぱいぢぎ:Landroid/view/ViewGroup;

    if-nez p1, :cond_7d

    goto :goto_93

    :cond_7d
    iget-object p1, v0, Landroidx/transition/Visibility$〺つふすそ;->づざかべべ:Landroid/view/ViewGroup;

    if-nez p1, :cond_96

    goto :goto_88

    :cond_82
    if-nez p1, :cond_8d

    iget p1, v0, Landroidx/transition/Visibility$〺つふすそ;->びぐびあび:I

    if-nez p1, :cond_8d

    :goto_88
    iput-boolean v2, v0, Landroidx/transition/Visibility$〺つふすそ;->〺つふすそ:Z

    :goto_8a
    iput-boolean v2, v0, Landroidx/transition/Visibility$〺つふすそ;->げつ〴ぬぐ:Z

    goto :goto_96

    :cond_8d
    if-nez p2, :cond_96

    iget p1, v0, Landroidx/transition/Visibility$〺つふすそ;->くし〴〺ぅ:I

    if-nez p1, :cond_96

    :goto_93
    iput-boolean v1, v0, Landroidx/transition/Visibility$〺つふすそ;->〺つふすそ:Z

    goto :goto_8a

    :cond_96
    :goto_96
    return-object v0
.end method

.method public げがぴうあだ(Landroid/view/ViewGroup;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;I)Landroid/animation/Animator;
    .registers 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    iget v5, v0, Landroidx/transition/Visibility;->ぇ〳〲〺すっ:I

    const/4 v6, 0x2

    and-int/2addr v5, v6

    const/4 v7, 0x0

    if-eq v5, v6, :cond_12

    return-object v7

    :cond_12
    if-nez v2, :cond_15

    return-object v7

    :cond_15
    iget-object v5, v2, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    if-eqz v3, :cond_1c

    iget-object v8, v3, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    goto :goto_1d

    :cond_1c
    move-object v8, v7

    :goto_1d
    sget v9, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->save_overlay_view:I

    invoke-virtual {v5, v9}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    const/4 v12, 0x1

    if-eqz v10, :cond_2d

    move/from16 v20, v9

    const/4 v11, 0x1

    goto/16 :goto_1c4

    :cond_2d
    if-eqz v8, :cond_40

    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v10

    if-nez v10, :cond_36

    goto :goto_40

    :cond_36
    const/4 v10, 0x4

    if-ne v4, v10, :cond_3a

    goto :goto_3c

    :cond_3a
    if-ne v5, v8, :cond_45

    :goto_3c
    move-object v10, v8

    const/4 v13, 0x0

    move-object v8, v7

    goto :goto_48

    :cond_40
    :goto_40
    if-eqz v8, :cond_45

    move-object v10, v7

    const/4 v13, 0x0

    goto :goto_48

    :cond_45
    move-object v8, v7

    move-object v10, v8

    const/4 v13, 0x1

    :goto_48
    if-eqz v13, :cond_1bc

    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v13

    if-nez v13, :cond_57

    move/from16 v20, v9

    move-object v7, v10

    const/4 v11, 0x0

    move-object v10, v5

    goto/16 :goto_1c4

    :cond_57
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v13

    instance-of v13, v13, Landroid/view/View;

    if-eqz v13, :cond_1bc

    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v13

    check-cast v13, Landroid/view/View;

    invoke-virtual {v0, v13, v12}, Landroidx/transition/Transition;->ざとぅぼこ〺(Landroid/view/View;Z)Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    move-result-object v14

    invoke-virtual {v0, v13, v12}, Landroidx/transition/Transition;->おぐぴう〸ず(Landroid/view/View;Z)Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    move-result-object v15

    invoke-virtual {v0, v14, v15}, Landroidx/transition/Visibility;->けときぜと(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroidx/transition/Visibility$〺つふすそ;

    move-result-object v14

    iget-boolean v14, v14, Landroidx/transition/Visibility$〺つふすそ;->げつ〴ぬぐ:Z

    if-nez v14, :cond_1a6

    .line 1
    sget-boolean v8, Lづざかべべ/は〲ぱなで/〻ぞまぎな〻;->げつ〴ぬぐ:Z

    new-instance v8, Landroid/graphics/Matrix;

    invoke-direct {v8}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v13}, Landroid/view/View;->getScrollX()I

    move-result v14

    neg-int v14, v14

    int-to-float v14, v14

    invoke-virtual {v13}, Landroid/view/View;->getScrollY()I

    move-result v13

    neg-int v13, v13

    int-to-float v13, v13

    invoke-virtual {v8, v14, v13}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 2
    sget-object v13, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    invoke-virtual {v13, v5, v8}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->〳ぜぞぜべっ(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 3
    invoke-virtual {v13, v1, v8}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->ぺぁあねじ(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 4
    new-instance v13, Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v14

    int-to-float v14, v14

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v15

    int-to-float v15, v15

    const/4 v7, 0x0

    invoke-direct {v13, v7, v7, v14, v15}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v8, v13}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget v7, v13, Landroid/graphics/RectF;->left:F

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    iget v14, v13, Landroid/graphics/RectF;->top:F

    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    move-result v14

    iget v15, v13, Landroid/graphics/RectF;->right:F

    invoke-static {v15}, Ljava/lang/Math;->round(F)I

    move-result v15

    iget v6, v13, Landroid/graphics/RectF;->bottom:F

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    new-instance v11, Landroid/widget/ImageView;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-direct {v11, v12}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v12, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v11, v12}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 5
    sget-boolean v12, Lづざかべべ/は〲ぱなで/〻ぞまぎな〻;->げつ〴ぬぐ:Z

    if-eqz v12, :cond_e0

    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v12

    const/16 v16, 0x1

    xor-int/lit8 v12, v12, 0x1

    if-nez v1, :cond_db

    goto :goto_e1

    :cond_db
    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->isAttachedToWindow()Z

    move-result v17

    goto :goto_e3

    :cond_e0
    const/4 v12, 0x0

    :goto_e1
    const/16 v17, 0x0

    :goto_e3
    sget-boolean v18, Lづざかべべ/は〲ぱなで/〻ぞまぎな〻;->〺つふすそ:Z

    if-eqz v18, :cond_10e

    if-eqz v12, :cond_10e

    if-nez v17, :cond_f2

    move/from16 v20, v9

    move-object/from16 v19, v10

    const/4 v0, 0x0

    goto/16 :goto_18b

    :cond_f2
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v17

    move-object/from16 v19, v10

    move-object/from16 v10, v17

    check-cast v10, Landroid/view/ViewGroup;

    invoke-virtual {v10, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v17

    move-object/from16 v20, v10

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object v10

    invoke-virtual {v10, v5}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    move/from16 v4, v17

    move-object/from16 v10, v20

    goto :goto_112

    :cond_10e
    move-object/from16 v19, v10

    const/4 v4, 0x0

    const/4 v10, 0x0

    :goto_112
    invoke-virtual {v13}, Landroid/graphics/RectF;->width()F

    move-result v17

    move/from16 v20, v9

    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->round(F)I

    move-result v9

    invoke-virtual {v13}, Landroid/graphics/RectF;->height()F

    move-result v17

    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->round(F)I

    move-result v0

    if-lez v9, :cond_17c

    if-lez v0, :cond_17c

    const/high16 v17, 0x49800000    # 1048576.0f

    mul-int v3, v9, v0

    int-to-float v3, v3

    div-float v3, v17, v3

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    int-to-float v3, v9

    mul-float v3, v3, v2

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-float v0, v0

    mul-float v0, v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v9, v13, Landroid/graphics/RectF;->left:F

    neg-float v9, v9

    iget v13, v13, Landroid/graphics/RectF;->top:F

    neg-float v13, v13

    invoke-virtual {v8, v9, v13}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    invoke-virtual {v8, v2, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    sget-boolean v2, Lづざかべべ/は〲ぱなで/〻ぞまぎな〻;->くし〴〺ぅ:Z

    if-eqz v2, :cond_16a

    new-instance v2, Landroid/graphics/Picture;

    invoke-direct {v2}, Landroid/graphics/Picture;-><init>()V

    invoke-virtual {v2, v3, v0}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    invoke-virtual {v5, v0}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {v2}, Landroid/graphics/Picture;->endRecording()V

    invoke-static {v2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Picture;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_17d

    :cond_16a
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v0, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v2, v8}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    invoke-virtual {v5, v2}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    goto :goto_17d

    :cond_17c
    const/4 v0, 0x0

    :goto_17d
    if-eqz v18, :cond_18b

    if-eqz v12, :cond_18b

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    invoke-virtual {v10, v5, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    :cond_18b
    :goto_18b
    if-eqz v0, :cond_190

    .line 6
    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_190
    sub-int v0, v15, v7

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    sub-int v3, v6, v14

    invoke-static {v3, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v11, v0, v2}, Landroid/widget/ImageView;->measure(II)V

    invoke-virtual {v11, v7, v14, v15, v6}, Landroid/widget/ImageView;->layout(IIII)V

    move-object v10, v11

    goto :goto_1c1

    :cond_1a6
    move/from16 v20, v9

    move-object/from16 v19, v10

    .line 7
    invoke-virtual {v13}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_1c0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1c0

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    goto :goto_1c0

    :cond_1bc
    move/from16 v20, v9

    move-object/from16 v19, v10

    :cond_1c0
    :goto_1c0
    move-object v10, v8

    :goto_1c1
    move-object/from16 v7, v19

    const/4 v11, 0x0

    :goto_1c4
    if-eqz v10, :cond_21f

    move-object/from16 v0, p2

    if-nez v11, :cond_1fd

    iget-object v2, v0, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v3, "android:visibility:screenLocation"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    const/4 v3, 0x0

    aget v4, v2, v3

    const/4 v6, 0x1

    aget v2, v2, v6

    const/4 v7, 0x2

    new-array v7, v7, [I

    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    aget v3, v7, v3

    sub-int/2addr v4, v3

    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    move-result v3

    sub-int/2addr v4, v3

    invoke-virtual {v10, v4}, Landroid/view/View;->offsetLeftAndRight(I)V

    aget v3, v7, v6

    sub-int/2addr v2, v3

    invoke-virtual {v10}, Landroid/view/View;->getTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v10, v2}, Landroid/view/View;->offsetTopAndBottom(I)V

    invoke-static/range {p1 .. p1}, Lづざかべべ/は〲ぱなで/じぜこほぱ;->げつ〴ぬぐ(Landroid/view/ViewGroup;)Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;

    move-result-object v2

    invoke-interface {v2, v10}, Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;->げつ〴ぬぐ(Landroid/view/View;)V

    :cond_1fd
    move-object/from16 v2, p0

    move-object/from16 v3, p3

    invoke-virtual {v2, v1, v10, v0, v3}, Landroidx/transition/Visibility;->ぇとしたべど(Landroid/view/ViewGroup;Landroid/view/View;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;

    move-result-object v0

    if-nez v11, :cond_21e

    if-nez v0, :cond_211

    invoke-static/range {p1 .. p1}, Lづざかべべ/は〲ぱなで/じぜこほぱ;->げつ〴ぬぐ(Landroid/view/ViewGroup;)Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;

    move-result-object v1

    invoke-interface {v1, v10}, Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;->〺つふすそ(Landroid/view/View;)V

    goto :goto_21e

    :cond_211
    move/from16 v3, v20

    invoke-virtual {v5, v3, v10}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    new-instance v3, Lづざかべべ/は〲ぱなで/ながふずは;

    invoke-direct {v3, v2, v1, v10, v5}, Lづざかべべ/は〲ぱなで/ながふずは;-><init>(Landroidx/transition/Visibility;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroidx/transition/Transition;->げつ〴ぬぐ(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    :cond_21e
    :goto_21e
    return-object v0

    :cond_21f
    move-object/from16 v2, p0

    move-object/from16 v0, p2

    move-object/from16 v3, p3

    if-eqz v7, :cond_24d

    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v4

    .line 8
    sget-object v5, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    const/4 v6, 0x0

    invoke-virtual {v5, v7, v6}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->ぁごぐすすぃ(Landroid/view/View;I)V

    .line 9
    invoke-virtual {v2, v1, v7, v0, v3}, Landroidx/transition/Visibility;->ぇとしたべど(Landroid/view/ViewGroup;Landroid/view/View;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_249

    new-instance v1, Landroidx/transition/Visibility$げつ〴ぬぐ;

    move/from16 v3, p4

    const/4 v4, 0x1

    invoke-direct {v1, v7, v3, v4}, Landroidx/transition/Visibility$げつ〴ぬぐ;-><init>(Landroid/view/View;IZ)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-static {v0, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->げつ〴ぬぐ(Landroid/animation/Animator;Landroid/animation/AnimatorListenerAdapter;)V

    invoke-virtual {v2, v1}, Landroidx/transition/Transition;->げつ〴ぬぐ(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    goto :goto_24c

    .line 10
    :cond_249
    invoke-virtual {v5, v7, v4}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->ぁごぐすすぃ(Landroid/view/View;I)V

    :goto_24c
    return-object v0

    :cond_24d
    const/4 v0, 0x0

    return-object v0
.end method

.method public ながふずは(I)V
    .registers 3

    and-int/lit8 v0, p1, -0x4

    if-nez v0, :cond_7

    iput p1, p0, Landroidx/transition/Visibility;->ぇ〳〲〺すっ:I

    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Only MODE_IN and MODE_OUT flags are allowed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public は〲ぱなで(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Z
    .registers 7

    const/4 v0, 0x0

    if-nez p1, :cond_6

    if-nez p2, :cond_6

    return v0

    :cond_6
    if-eqz p1, :cond_1b

    if-eqz p2, :cond_1b

    iget-object v1, p2, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v2, "android:visibility:visibility"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    iget-object v3, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eq v1, v2, :cond_1b

    return v0

    :cond_1b
    invoke-virtual {p0, p1, p2}, Landroidx/transition/Visibility;->けときぜと(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroidx/transition/Visibility$〺つふすそ;

    move-result-object p1

    iget-boolean p2, p1, Landroidx/transition/Visibility$〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz p2, :cond_2c

    iget p2, p1, Landroidx/transition/Visibility$〺つふすそ;->くし〴〺ぅ:I

    if-eqz p2, :cond_2b

    iget p1, p1, Landroidx/transition/Visibility$〺つふすそ;->びぐびあび:I

    if-nez p1, :cond_2c

    :cond_2b
    const/4 v0, 0x1

    :cond_2c
    return v0
.end method

.method public びぐびあび(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/transition/Visibility;->ぷぞてのほき(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    return-void
.end method

.method public final ぷぞてのほき(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 5

    iget-object v0, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    iget-object v1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "android:visibility:visibility"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    iget-object v1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const-string v2, "android:visibility:parent"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object p1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v1, "android:visibility:screenLocation"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public ぺふねづ〺(Landroid/view/ViewGroup;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;
    .registers 6

    invoke-virtual {p0, p2, p3}, Landroidx/transition/Visibility;->けときぜと(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroidx/transition/Visibility$〺つふすそ;

    move-result-object v0

    iget-boolean v1, v0, Landroidx/transition/Visibility$〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v1, :cond_20

    iget-object v1, v0, Landroidx/transition/Visibility$〺つふすそ;->づざかべべ:Landroid/view/ViewGroup;

    if-nez v1, :cond_10

    iget-object v1, v0, Landroidx/transition/Visibility$〺つふすそ;->なぎぱいぢぎ:Landroid/view/ViewGroup;

    if-eqz v1, :cond_20

    :cond_10
    iget-boolean v1, v0, Landroidx/transition/Visibility$〺つふすそ;->〺つふすそ:Z

    if-eqz v1, :cond_19

    invoke-virtual {p0, p1, p2, p3}, Landroidx/transition/Visibility;->〺でおいここ(Landroid/view/ViewGroup;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;

    move-result-object p1

    return-object p1

    :cond_19
    iget v0, v0, Landroidx/transition/Visibility$〺つふすそ;->びぐびあび:I

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/transition/Visibility;->げがぴうあだ(Landroid/view/ViewGroup;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;I)Landroid/animation/Animator;

    move-result-object p1

    return-object p1

    :cond_20
    const/4 p1, 0x0

    return-object p1
.end method
