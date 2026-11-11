.class public Landroidx/transition/ChangeBounds;
.super Landroidx/transition/Transition;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/ChangeBounds$いいにぽつ;
    }
.end annotation


# static fields
.field public static final ぅみぱぎぎ:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/transition/ChangeBounds$\u3044\u3044\u306b\u307d\u3064;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public static final ぉひのべい:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public static final じぜこほぱ:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/transition/ChangeBounds$\u3044\u3044\u306b\u307d\u3064;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public static final せづっ〸ちね:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public static final どぇぞほだ:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/graphics/drawable/Drawable;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public static final なぶひせが:[Ljava/lang/String;

.field public static ぷぞてのほき:Lづざかべべ/は〲ぱなで/おぐぴう〸ず;

.field public static final ぺづげぺが:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public ぇ〳〲〺すっ:[I

.field public びえぁぜい:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "android:changeBounds:bounds"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "android:changeBounds:clip"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "android:changeBounds:parent"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "android:changeBounds:windowX"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "android:changeBounds:windowY"

    aput-object v2, v0, v1

    sput-object v0, Landroidx/transition/ChangeBounds;->なぶひせが:[Ljava/lang/String;

    new-instance v0, Landroidx/transition/ChangeBounds$げつ〴ぬぐ;

    const-class v1, Landroid/graphics/PointF;

    const-string v2, "boundsOrigin"

    invoke-direct {v0, v1, v2}, Landroidx/transition/ChangeBounds$げつ〴ぬぐ;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/ChangeBounds;->どぇぞほだ:Landroid/util/Property;

    new-instance v0, Landroidx/transition/ChangeBounds$〺つふすそ;

    const-class v1, Landroid/graphics/PointF;

    const-string v2, "topLeft"

    invoke-direct {v0, v1, v2}, Landroidx/transition/ChangeBounds$〺つふすそ;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/ChangeBounds;->ぅみぱぎぎ:Landroid/util/Property;

    new-instance v0, Landroidx/transition/ChangeBounds$くし〴〺ぅ;

    const-class v1, Landroid/graphics/PointF;

    const-string v3, "bottomRight"

    invoke-direct {v0, v1, v3}, Landroidx/transition/ChangeBounds$くし〴〺ぅ;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/ChangeBounds;->じぜこほぱ:Landroid/util/Property;

    new-instance v0, Landroidx/transition/ChangeBounds$びぐびあび;

    const-class v1, Landroid/graphics/PointF;

    invoke-direct {v0, v1, v3}, Landroidx/transition/ChangeBounds$びぐびあび;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/ChangeBounds;->ぺづげぺが:Landroid/util/Property;

    new-instance v0, Landroidx/transition/ChangeBounds$づざかべべ;

    const-class v1, Landroid/graphics/PointF;

    invoke-direct {v0, v1, v2}, Landroidx/transition/ChangeBounds$づざかべべ;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/ChangeBounds;->ぉひのべい:Landroid/util/Property;

    new-instance v0, Landroidx/transition/ChangeBounds$なぎぱいぢぎ;

    const-class v1, Landroid/graphics/PointF;

    const-string v2, "position"

    invoke-direct {v0, v1, v2}, Landroidx/transition/ChangeBounds$なぎぱいぢぎ;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/ChangeBounds;->せづっ〸ちね:Landroid/util/Property;

    new-instance v0, Lづざかべべ/は〲ぱなで/おぐぴう〸ず;

    invoke-direct {v0}, Lづざかべべ/は〲ぱなで/おぐぴう〸ず;-><init>()V

    sput-object v0, Landroidx/transition/ChangeBounds;->ぷぞてのほき:Lづざかべべ/は〲ぱなで/おぐぴう〸ず;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/transition/ChangeBounds;->ぇ〳〲〺すっ:[I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/transition/ChangeBounds;->びえぁぜい:Z

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

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/transition/ChangeBounds;->ぇ〳〲〺すっ:[I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/transition/ChangeBounds;->びえぁぜい:Z

    sget-object v1, Lづざかべべ/は〲ぱなで/ざとぅぼこ〺;->〺つふすそ:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    check-cast p2, Landroid/content/res/XmlResourceParser;

    const-string v1, "resizeClip"

    invoke-static {p1, p2, v1, v0, v0}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->げつ〴ぬぐ(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IZ)Z

    move-result p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 1
    iput-boolean p2, p0, Landroidx/transition/ChangeBounds;->びえぁぜい:Z

    return-void
.end method


# virtual methods
.method public ぁごぐすすぃ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/transition/ChangeBounds;->ぷぞてのほき(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    return-void
.end method

.method public ぉざぅち〻()[Ljava/lang/String;
    .registers 2

    sget-object v0, Landroidx/transition/ChangeBounds;->なぶひせが:[Ljava/lang/String;

    return-object v0
.end method

.method public びぐびあび(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/transition/ChangeBounds;->ぷぞてのほき(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    return-void
.end method

.method public final ぷぞてのほき(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 9

    iget-object v0, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぶでにく〼〳(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_14

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    if-nez v1, :cond_14

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    if-eqz v1, :cond_4c

    :cond_14
    iget-object v1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    new-instance v2, Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v6

    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    const-string v3, "android:changeBounds:bounds"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    iget-object v2, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const-string v3, "android:changeBounds:parent"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Landroidx/transition/ChangeBounds;->びえぁぜい:Z

    if-eqz v1, :cond_4c

    iget-object p1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->いいにぽつ(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v0

    const-string v1, "android:changeBounds:clip"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4c
    return-void
.end method

.method public ぺふねづ〺(Landroid/view/ViewGroup;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;
    .registers 23

    move-object/from16 v8, p0

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    if-eqz v0, :cond_1a5

    if-nez v1, :cond_c

    goto/16 :goto_1a5

    :cond_c
    iget-object v3, v0, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    iget-object v4, v1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v5, "android:changeBounds:parent"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1a3

    if-nez v4, :cond_24

    goto/16 :goto_1a3

    :cond_24
    iget-object v9, v1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    iget-object v3, v0, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v4, "android:changeBounds:bounds"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Rect;

    iget-object v5, v1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Rect;

    iget v5, v3, Landroid/graphics/Rect;->left:I

    iget v6, v4, Landroid/graphics/Rect;->left:I

    iget v7, v3, Landroid/graphics/Rect;->top:I

    iget v10, v4, Landroid/graphics/Rect;->top:I

    iget v11, v3, Landroid/graphics/Rect;->right:I

    iget v12, v4, Landroid/graphics/Rect;->right:I

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    iget v13, v4, Landroid/graphics/Rect;->bottom:I

    sub-int v4, v11, v5

    sub-int v14, v3, v7

    sub-int v15, v12, v6

    sub-int v2, v13, v10

    iget-object v0, v0, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    move-object/from16 v16, v9

    const-string v9, "android:changeBounds:clip"

    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    iget-object v1, v1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/graphics/Rect;

    if-eqz v4, :cond_69

    if-nez v14, :cond_6d

    :cond_69
    if-eqz v15, :cond_7e

    if-eqz v2, :cond_7e

    :cond_6d
    if-ne v5, v6, :cond_75

    if-eq v7, v10, :cond_72

    goto :goto_75

    :cond_72
    const/16 v17, 0x0

    goto :goto_77

    :cond_75
    :goto_75
    const/16 v17, 0x1

    :goto_77
    if-ne v11, v12, :cond_7b

    if-eq v3, v13, :cond_80

    :cond_7b
    add-int/lit8 v17, v17, 0x1

    goto :goto_80

    :cond_7e
    const/16 v17, 0x0

    :cond_80
    :goto_80
    if-eqz v0, :cond_88

    invoke-virtual {v0, v9}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_8c

    :cond_88
    if-nez v0, :cond_8e

    if-eqz v9, :cond_8e

    :cond_8c
    add-int/lit8 v17, v17, 0x1

    :cond_8e
    move/from16 v1, v17

    if-lez v1, :cond_1a1

    move-object/from16 v17, v9

    iget-boolean v9, v8, Landroidx/transition/ChangeBounds;->びえぁぜい:Z

    move-object/from16 v18, v0

    const/4 v0, 0x2

    if-nez v9, :cond_116

    move-object/from16 v9, v16

    invoke-static {v9, v5, v7, v11, v3}, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->くし〴〺ぅ(Landroid/view/View;IIII)V

    if-ne v1, v0, :cond_f1

    if-ne v4, v15, :cond_b3

    if-ne v14, v2, :cond_b3

    .line 1
    iget-object v0, v8, Landroidx/transition/Transition;->でどあくず:Landroidx/transition/PathMotion;

    int-to-float v1, v5

    int-to-float v2, v7

    int-to-float v3, v6

    int-to-float v4, v10

    .line 2
    invoke-virtual {v0, v1, v2, v3, v4}, Landroidx/transition/PathMotion;->げつ〴ぬぐ(FFFF)Landroid/graphics/Path;

    move-result-object v0

    sget-object v1, Landroidx/transition/ChangeBounds;->せづっ〸ちね:Landroid/util/Property;

    goto :goto_10f

    :cond_b3
    new-instance v1, Landroidx/transition/ChangeBounds$いいにぽつ;

    invoke-direct {v1, v9}, Landroidx/transition/ChangeBounds$いいにぽつ;-><init>(Landroid/view/View;)V

    .line 3
    iget-object v2, v8, Landroidx/transition/Transition;->でどあくず:Landroidx/transition/PathMotion;

    int-to-float v4, v5

    int-to-float v5, v7

    int-to-float v6, v6

    int-to-float v7, v10

    .line 4
    invoke-virtual {v2, v4, v5, v6, v7}, Landroidx/transition/PathMotion;->げつ〴ぬぐ(FFFF)Landroid/graphics/Path;

    move-result-object v2

    sget-object v4, Landroidx/transition/ChangeBounds;->ぅみぱぎぎ:Landroid/util/Property;

    invoke-static {v1, v4, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->かづげぃぁ〺(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v2

    .line 5
    iget-object v4, v8, Landroidx/transition/Transition;->でどあくず:Landroidx/transition/PathMotion;

    int-to-float v5, v11

    int-to-float v3, v3

    int-to-float v6, v12

    int-to-float v7, v13

    .line 6
    invoke-virtual {v4, v5, v3, v6, v7}, Landroidx/transition/PathMotion;->げつ〴ぬぐ(FFFF)Landroid/graphics/Path;

    move-result-object v3

    sget-object v4, Landroidx/transition/ChangeBounds;->じぜこほぱ:Landroid/util/Property;

    invoke-static {v1, v4, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->かづげぃぁ〺(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v3

    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    new-array v0, v0, [Landroid/animation/Animator;

    const/4 v5, 0x0

    aput-object v2, v0, v5

    const/4 v2, 0x1

    aput-object v3, v0, v2

    invoke-virtual {v4, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    new-instance v0, Landroidx/transition/ChangeBounds$ぁごぐすすぃ;

    invoke-direct {v0, v8, v1}, Landroidx/transition/ChangeBounds$ぁごぐすすぃ;-><init>(Landroidx/transition/ChangeBounds;Landroidx/transition/ChangeBounds$いいにぽつ;)V

    invoke-virtual {v4, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_113

    :cond_f1
    if-ne v5, v6, :cond_103

    if-eq v7, v10, :cond_f6

    goto :goto_103

    .line 7
    :cond_f6
    iget-object v0, v8, Landroidx/transition/Transition;->でどあくず:Landroidx/transition/PathMotion;

    int-to-float v1, v11

    int-to-float v2, v3

    int-to-float v3, v12

    int-to-float v4, v13

    .line 8
    invoke-virtual {v0, v1, v2, v3, v4}, Landroidx/transition/PathMotion;->げつ〴ぬぐ(FFFF)Landroid/graphics/Path;

    move-result-object v0

    sget-object v1, Landroidx/transition/ChangeBounds;->ぺづげぺが:Landroid/util/Property;

    goto :goto_10f

    .line 9
    :cond_103
    :goto_103
    iget-object v0, v8, Landroidx/transition/Transition;->でどあくず:Landroidx/transition/PathMotion;

    int-to-float v1, v5

    int-to-float v2, v7

    int-to-float v3, v6

    int-to-float v4, v10

    .line 10
    invoke-virtual {v0, v1, v2, v3, v4}, Landroidx/transition/PathMotion;->げつ〴ぬぐ(FFFF)Landroid/graphics/Path;

    move-result-object v0

    sget-object v1, Landroidx/transition/ChangeBounds;->ぉひのべい:Landroid/util/Property;

    :goto_10f
    invoke-static {v9, v1, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->かづげぃぁ〺(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v4

    :goto_113
    const/4 v10, 0x1

    goto/16 :goto_187

    :cond_116
    move-object/from16 v9, v16

    invoke-static {v4, v15}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v14, v2}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/2addr v1, v5

    add-int/2addr v3, v7

    invoke-static {v9, v5, v7, v1, v3}, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->くし〴〺ぅ(Landroid/view/View;IIII)V

    if-ne v5, v6, :cond_12c

    if-eq v7, v10, :cond_12a

    goto :goto_12c

    :cond_12a
    const/4 v11, 0x0

    goto :goto_13d

    .line 11
    :cond_12c
    :goto_12c
    iget-object v1, v8, Landroidx/transition/Transition;->でどあくず:Landroidx/transition/PathMotion;

    int-to-float v3, v5

    int-to-float v5, v7

    int-to-float v7, v6

    int-to-float v11, v10

    .line 12
    invoke-virtual {v1, v3, v5, v7, v11}, Landroidx/transition/PathMotion;->げつ〴ぬぐ(FFFF)Landroid/graphics/Path;

    move-result-object v1

    sget-object v3, Landroidx/transition/ChangeBounds;->せづっ〸ちね:Landroid/util/Property;

    invoke-static {v9, v3, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->かづげぃぁ〺(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v1

    move-object v11, v1

    :goto_13d
    if-nez v18, :cond_146

    new-instance v1, Landroid/graphics/Rect;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v3, v4, v14}, Landroid/graphics/Rect;-><init>(IIII)V

    goto :goto_149

    :cond_146
    const/4 v3, 0x0

    move-object/from16 v1, v18

    :goto_149
    if-nez v17, :cond_151

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4, v3, v3, v15, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    goto :goto_153

    :cond_151
    move-object/from16 v4, v17

    :goto_153
    invoke-virtual {v1, v4}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_181

    invoke-static {v9, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げがぴうあだ(Landroid/view/View;Landroid/graphics/Rect;)V

    sget-object v2, Landroidx/transition/ChangeBounds;->ぷぞてのほき:Lづざかべべ/は〲ぱなで/おぐぴう〸ず;

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v1, v0, v3

    const/4 v1, 0x1

    aput-object v4, v0, v1

    const-string v3, "clipBounds"

    invoke-static {v9, v3, v2, v0}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object v14

    new-instance v15, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;

    move-object v0, v15

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object v2, v9

    move-object/from16 v3, v17

    move v4, v6

    move v5, v10

    move v6, v12

    const/4 v10, 0x1

    move v7, v13

    invoke-direct/range {v0 .. v7}, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;-><init>(Landroidx/transition/ChangeBounds;Landroid/view/View;Landroid/graphics/Rect;IIII)V

    invoke-virtual {v14, v15}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    move-object v2, v14

    goto :goto_183

    :cond_181
    const/4 v10, 0x1

    const/4 v2, 0x0

    :goto_183
    invoke-static {v11, v2}, Lづざかべべ/は〲ぱなで/〻ぞまぎな〻;->げつ〴ぬぐ(Landroid/animation/Animator;Landroid/animation/Animator;)Landroid/animation/Animator;

    move-result-object v4

    :goto_187
    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1a0

    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v0, v10}, Lづざかべべ/は〲ぱなで/じぜこほぱ;->〺つふすそ(Landroid/view/ViewGroup;Z)V

    new-instance v1, Landroidx/transition/ChangeBounds$ぺぁあねじ;

    invoke-direct {v1, v8, v0}, Landroidx/transition/ChangeBounds$ぺぁあねじ;-><init>(Landroidx/transition/ChangeBounds;Landroid/view/ViewGroup;)V

    invoke-virtual {v8, v1}, Landroidx/transition/Transition;->げつ〴ぬぐ(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    :cond_1a0
    return-object v4

    :cond_1a1
    const/4 v0, 0x0

    return-object v0

    :cond_1a3
    :goto_1a3
    const/4 v0, 0x0

    return-object v0

    :cond_1a5
    :goto_1a5
    const/4 v0, 0x0

    return-object v0
.end method
