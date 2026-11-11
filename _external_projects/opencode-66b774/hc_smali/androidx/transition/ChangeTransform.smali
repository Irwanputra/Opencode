.class public Landroidx/transition/ChangeTransform;
.super Landroidx/transition/Transition;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/ChangeTransform$びぐびあび;,
        Landroidx/transition/ChangeTransform$くし〴〺ぅ;,
        Landroidx/transition/ChangeTransform$づざかべべ;
    }
.end annotation


# static fields
.field public static final ぅみぱぎぎ:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/transition/ChangeTransform$\u3073\u3050\u3073\u3042\u3073;",
            "[F>;"
        }
    .end annotation
.end field

.field public static final じぜこほぱ:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/transition/ChangeTransform$\u3073\u3050\u3073\u3042\u3073;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public static final どぇぞほだ:[Ljava/lang/String;

.field public static final ぺづげぺが:Z


# instance fields
.field public ぇ〳〲〺すっ:Z

.field public なぶひせが:Landroid/graphics/Matrix;

.field public びえぁぜい:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 5

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android:changeTransform:matrix"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android:changeTransform:transforms"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const/4 v1, 0x2

    const-string v4, "android:changeTransform:parentMatrix"

    aput-object v4, v0, v1

    sput-object v0, Landroidx/transition/ChangeTransform;->どぇぞほだ:[Ljava/lang/String;

    new-instance v0, Landroidx/transition/ChangeTransform$げつ〴ぬぐ;

    const-class v1, [F

    const-string v4, "nonTranslations"

    invoke-direct {v0, v1, v4}, Landroidx/transition/ChangeTransform$げつ〴ぬぐ;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/ChangeTransform;->ぅみぱぎぎ:Landroid/util/Property;

    new-instance v0, Landroidx/transition/ChangeTransform$〺つふすそ;

    const-class v1, Landroid/graphics/PointF;

    const-string v4, "translations"

    invoke-direct {v0, v1, v4}, Landroidx/transition/ChangeTransform$〺つふすそ;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/ChangeTransform;->じぜこほぱ:Landroid/util/Property;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_31

    const/4 v2, 0x1

    :cond_31
    sput-boolean v2, Landroidx/transition/ChangeTransform;->ぺづげぺが:Z

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/transition/ChangeTransform;->ぇ〳〲〺すっ:Z

    iput-boolean v0, p0, Landroidx/transition/ChangeTransform;->びえぁぜい:Z

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroidx/transition/ChangeTransform;->なぶひせが:Landroid/graphics/Matrix;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/transition/ChangeTransform;->ぇ〳〲〺すっ:Z

    iput-boolean v0, p0, Landroidx/transition/ChangeTransform;->びえぁぜい:Z

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Landroidx/transition/ChangeTransform;->なぶひせが:Landroid/graphics/Matrix;

    sget-object v1, Lづざかべべ/は〲ぱなで/ざとぅぼこ〺;->づざかべべ:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    check-cast p2, Lorg/xmlpull/v1/XmlPullParser;

    const-string v1, "reparentWithOverlay"

    invoke-static {p1, p2, v1, v0, v0}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->げつ〴ぬぐ(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IZ)Z

    move-result v1

    iput-boolean v1, p0, Landroidx/transition/ChangeTransform;->ぇ〳〲〺すっ:Z

    const-string v1, "reparent"

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2, v0}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->げつ〴ぬぐ(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IZ)Z

    move-result p2

    iput-boolean p2, p0, Landroidx/transition/ChangeTransform;->びえぁぜい:Z

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static おかぷせ〱(Landroid/view/View;FFFFFFFF)V
    .registers 9

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setTranslationY(F)V

    .line 1
    sget-object p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x15

    if-lt p1, p2, :cond_11

    invoke-virtual {p0, p3}, Landroid/view/View;->setTranslationZ(F)V

    .line 2
    :cond_11
    invoke-virtual {p0, p4}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {p0, p5}, Landroid/view/View;->setScaleY(F)V

    invoke-virtual {p0, p6}, Landroid/view/View;->setRotationX(F)V

    invoke-virtual {p0, p7}, Landroid/view/View;->setRotationY(F)V

    invoke-virtual {p0, p8}, Landroid/view/View;->setRotation(F)V

    return-void
.end method

.method public static けときぜと(Landroid/view/View;)V
    .registers 10

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v8}, Landroidx/transition/ChangeTransform;->おかぷせ〱(Landroid/view/View;FFFFFFFF)V

    return-void
.end method


# virtual methods
.method public ぁごぐすすぃ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 3

    invoke-virtual {p0, p1}, Landroidx/transition/ChangeTransform;->ぷぞてのほき(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    sget-boolean v0, Landroidx/transition/ChangeTransform;->ぺづげぺが:Z

    if-nez v0, :cond_14

    iget-object v0, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object p1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    :cond_14
    return-void
.end method

.method public ぉざぅち〻()[Ljava/lang/String;
    .registers 2

    sget-object v0, Landroidx/transition/ChangeTransform;->どぇぞほだ:[Ljava/lang/String;

    return-object v0
.end method

.method public びぐびあび(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/transition/ChangeTransform;->ぷぞてのほき(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    return-void
.end method

.method public final ぷぞてのほき(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 6

    iget-object v0, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_b

    return-void

    :cond_b
    iget-object v1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const-string v3, "android:changeTransform:parent"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Landroidx/transition/ChangeTransform$づざかべべ;

    invoke-direct {v1, v0}, Landroidx/transition/ChangeTransform$づざかべべ;-><init>(Landroid/view/View;)V

    iget-object v2, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v3, "android:changeTransform:transforms"

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    if-eqz v1, :cond_35

    invoke-virtual {v1}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v2

    if-eqz v2, :cond_2f

    goto :goto_35

    :cond_2f
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    goto :goto_36

    :cond_35
    :goto_35
    const/4 v2, 0x0

    :goto_36
    iget-object v1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v3, "android:changeTransform:matrix"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Landroidx/transition/ChangeTransform;->びえぁぜい:Z

    if-eqz v1, :cond_81

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    .line 1
    sget-object v3, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    invoke-virtual {v3, v2, v1}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->〳ぜぞぜべっ(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 2
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getScrollX()I

    move-result v3

    neg-int v3, v3

    int-to-float v3, v3

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    iget-object v2, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v3, "android:changeTransform:parentMatrix"

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    sget v2, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->transition_transform:I

    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "android:changeTransform:intermediateMatrix"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    sget v1, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->parent_matrix:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "android:changeTransform:intermediateParentMatrix"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_81
    return-void
.end method

.method public ぺふねづ〺(Landroid/view/ViewGroup;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;
    .registers 28

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    if-eqz v9, :cond_42b

    if-eqz v10, :cond_42b

    iget-object v1, v9, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v12, "android:changeTransform:parent"

    invoke-interface {v1, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_42b

    iget-object v1, v10, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v1, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    goto/16 :goto_42b

    :cond_20
    iget-object v1, v9, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v1, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Landroid/view/ViewGroup;

    iget-object v1, v10, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v1, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iget-boolean v2, v8, Landroidx/transition/ChangeTransform;->びえぁぜい:Z

    const/4 v15, 0x1

    if-eqz v2, :cond_58

    .line 1
    invoke-virtual {v8, v13}, Landroidx/transition/Transition;->ごづごきえ(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_4e

    invoke-virtual {v8, v1}, Landroidx/transition/Transition;->ごづごきえ(Landroid/view/View;)Z

    move-result v2

    if-nez v2, :cond_43

    goto :goto_4e

    :cond_43
    invoke-virtual {v8, v13, v15}, Landroidx/transition/Transition;->おぐぴう〸ず(Landroid/view/View;Z)Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    move-result-object v2

    if-eqz v2, :cond_52

    iget-object v2, v2, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    if-ne v1, v2, :cond_52

    goto :goto_50

    :cond_4e
    :goto_4e
    if-ne v13, v1, :cond_52

    :goto_50
    const/4 v1, 0x1

    goto :goto_53

    :cond_52
    const/4 v1, 0x0

    :goto_53
    if-nez v1, :cond_58

    const/16 v16, 0x1

    goto :goto_5a

    :cond_58
    const/16 v16, 0x0

    .line 2
    :goto_5a
    iget-object v1, v9, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v2, "android:changeTransform:intermediateMatrix"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Matrix;

    const-string v2, "android:changeTransform:matrix"

    if-eqz v1, :cond_6d

    iget-object v3, v9, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6d
    iget-object v1, v9, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v3, "android:changeTransform:intermediateParentMatrix"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Matrix;

    const-string v7, "android:changeTransform:parentMatrix"

    if-eqz v1, :cond_80

    iget-object v3, v9, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v3, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_80
    if-eqz v16, :cond_bb

    .line 3
    iget-object v1, v10, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Matrix;

    iget-object v3, v10, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    sget v4, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->parent_matrix:I

    invoke-virtual {v3, v4, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v3, v8, Landroidx/transition/ChangeTransform;->なぶひせが:Landroid/graphics/Matrix;

    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    iget-object v1, v9, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Matrix;

    if-nez v1, :cond_ad

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iget-object v4, v9, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v4, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_ad
    iget-object v4, v9, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Matrix;

    invoke-virtual {v1, v4}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 4
    :cond_bb
    iget-object v1, v9, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Matrix;

    iget-object v3, v10, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Matrix;

    if-nez v1, :cond_cf

    sget-object v1, Lづざかべべ/は〲ぱなで/てぜきぽく;->げつ〴ぬぐ:Landroid/graphics/Matrix;

    :cond_cf
    if-nez v2, :cond_d3

    sget-object v2, Lづざかべべ/は〲ぱなで/てぜきぽく;->げつ〴ぬぐ:Landroid/graphics/Matrix;

    :cond_d3
    move-object v4, v2

    invoke-virtual {v1, v4}, Landroid/graphics/Matrix;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v6, 0x2

    if-eqz v2, :cond_e4

    move-object/from16 v21, v12

    move-object/from16 v17, v13

    const/4 v12, 0x2

    const/4 v14, 0x0

    move-object v13, v7

    goto/16 :goto_15c

    :cond_e4
    iget-object v2, v10, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v3, "android:changeTransform:transforms"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Landroidx/transition/ChangeTransform$づざかべべ;

    iget-object v5, v10, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-static {v5}, Landroidx/transition/ChangeTransform;->けときぜと(Landroid/view/View;)V

    const/16 v2, 0x9

    new-array v3, v2, [F

    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->getValues([F)V

    new-array v1, v2, [F

    invoke-virtual {v4, v1}, Landroid/graphics/Matrix;->getValues([F)V

    new-instance v11, Landroidx/transition/ChangeTransform$びぐびあび;

    invoke-direct {v11, v5, v3}, Landroidx/transition/ChangeTransform$びぐびあび;-><init>(Landroid/view/View;[F)V

    sget-object v15, Landroidx/transition/ChangeTransform;->ぅみぱぎぎ:Landroid/util/Property;

    new-instance v14, Lづざかべべ/は〲ぱなで/づざかべべ;

    new-array v2, v2, [F

    invoke-direct {v14, v2}, Lづざかべべ/は〲ぱなで/づざかべべ;-><init>([F)V

    new-array v2, v6, [[F

    const/16 v20, 0x0

    aput-object v3, v2, v20

    const/16 v19, 0x1

    aput-object v1, v2, v19

    invoke-static {v15, v14, v2}, Landroid/animation/PropertyValuesHolder;->ofObject(Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;

    move-result-object v2

    .line 5
    iget-object v14, v8, Landroidx/transition/Transition;->でどあくず:Landroidx/transition/PathMotion;

    .line 6
    aget v15, v3, v6

    const/16 v21, 0x5

    aget v3, v3, v21

    move-object/from16 v22, v7

    aget v7, v1, v6

    aget v1, v1, v21

    invoke-virtual {v14, v15, v3, v7, v1}, Landroidx/transition/PathMotion;->げつ〴ぬぐ(FFFF)Landroid/graphics/Path;

    move-result-object v1

    sget-object v3, Landroidx/transition/ChangeTransform;->じぜこほぱ:Landroid/util/Property;

    invoke-static {v3, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〴ねぷぐくぼ(Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/PropertyValuesHolder;

    move-result-object v1

    new-array v3, v6, [Landroid/animation/PropertyValuesHolder;

    const/4 v7, 0x0

    aput-object v2, v3, v7

    const/4 v2, 0x1

    aput-object v1, v3, v2

    invoke-static {v11, v3}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v14

    new-instance v15, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;

    move-object v1, v15

    move-object/from16 v2, p0

    move/from16 v3, v16

    const/4 v7, 0x2

    move-object/from16 v6, v17

    move-object/from16 v21, v12

    move-object/from16 v17, v13

    move-object/from16 v13, v22

    const/4 v12, 0x2

    move-object v7, v11

    invoke-direct/range {v1 .. v7}, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;-><init>(Landroidx/transition/ChangeTransform;ZLandroid/graphics/Matrix;Landroid/view/View;Landroidx/transition/ChangeTransform$づざかべべ;Landroidx/transition/ChangeTransform$びぐびあび;)V

    invoke-virtual {v14, v15}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-static {v14, v15}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->げつ〴ぬぐ(Landroid/animation/Animator;Landroid/animation/AnimatorListenerAdapter;)V

    :goto_15c
    if-eqz v16, :cond_41d

    if-eqz v14, :cond_41d

    .line 7
    iget-boolean v1, v8, Landroidx/transition/ChangeTransform;->ぇ〳〲〺すっ:Z

    if-eqz v1, :cond_41d

    .line 8
    iget-object v1, v10, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    iget-object v2, v10, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v2, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Matrix;

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3, v2}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 9
    sget-object v2, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    invoke-virtual {v2, v0, v3}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->ぺぁあねじ(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 10
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1c

    if-ne v2, v4, :cond_1e1

    .line 11
    sget-boolean v2, Lづざかべべ/は〲ぱなで/ぺぁあねじ;->なぎぱいぢぎ:Z

    const/4 v4, 0x3

    if-nez v2, :cond_1b3

    .line 12
    :try_start_183
    sget-boolean v2, Lづざかべべ/は〲ぱなで/ぺぁあねじ;->びぐびあび:Z
    :try_end_185
    .catch Ljava/lang/NoSuchMethodException; {:try_start_183 .. :try_end_185} :catch_1af

    if-nez v2, :cond_192

    :try_start_187
    const-string v2, "android.view.GhostView"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    sput-object v2, Lづざかべべ/は〲ぱなで/ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/Class;
    :try_end_18f
    .catch Ljava/lang/ClassNotFoundException; {:try_start_187 .. :try_end_18f} :catch_18f
    .catch Ljava/lang/NoSuchMethodException; {:try_start_187 .. :try_end_18f} :catch_1af

    :catch_18f
    const/4 v2, 0x1

    :try_start_190
    sput-boolean v2, Lづざかべべ/は〲ぱなで/ぺぁあねじ;->びぐびあび:Z
    :try_end_192
    .catch Ljava/lang/NoSuchMethodException; {:try_start_190 .. :try_end_192} :catch_1b0

    .line 13
    :cond_192
    :try_start_192
    sget-object v2, Lづざかべべ/は〲ぱなで/ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/Class;

    const-string v5, "addGhost"

    new-array v6, v4, [Ljava/lang/Class;

    const-class v7, Landroid/view/View;

    const/4 v11, 0x0

    aput-object v7, v6, v11

    const-class v7, Landroid/view/ViewGroup;

    const/4 v11, 0x1

    aput-object v7, v6, v11

    const-class v7, Landroid/graphics/Matrix;

    aput-object v7, v6, v12

    invoke-virtual {v2, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, Lづざかべべ/は〲ぱなで/ぺぁあねじ;->づざかべべ:Ljava/lang/reflect/Method;

    invoke-virtual {v2, v11}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_1af
    .catch Ljava/lang/NoSuchMethodException; {:try_start_192 .. :try_end_1af} :catch_1af

    :catch_1af
    const/4 v2, 0x1

    :catch_1b0
    sput-boolean v2, Lづざかべべ/は〲ぱなで/ぺぁあねじ;->なぎぱいぢぎ:Z

    goto :goto_1b4

    :cond_1b3
    const/4 v2, 0x1

    .line 14
    :goto_1b4
    sget-object v5, Lづざかべべ/は〲ぱなで/ぺぁあねじ;->づざかべべ:Ljava/lang/reflect/Method;

    if-eqz v5, :cond_1da

    :try_start_1b8
    new-instance v6, Lづざかべべ/は〲ぱなで/ぺぁあねじ;

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v1, v4, v7

    aput-object v0, v4, v2

    aput-object v3, v4, v12

    const/4 v0, 0x0

    invoke-virtual {v5, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-direct {v6, v2}, Lづざかべべ/は〲ぱなで/ぺぁあねじ;-><init>(Landroid/view/View;)V
    :try_end_1cd
    .catch Ljava/lang/IllegalAccessException; {:try_start_1b8 .. :try_end_1cd} :catch_1da
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1b8 .. :try_end_1cd} :catch_1cf

    move-object v11, v6

    goto :goto_1db

    :catch_1cf
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1da
    :cond_1da
    const/4 v11, 0x0

    :goto_1db
    move-object/from16 v23, v1

    move-object/from16 v22, v14

    goto/16 :goto_3d7

    .line 15
    :cond_1e1
    sget v2, Lづざかべべ/は〲ぱなで/いいにぽつ;->〳ぜぞぜべっ:I

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v2, v2, Landroid/view/ViewGroup;

    if-eqz v2, :cond_415

    .line 16
    sget v2, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;->びぐびあび:I

    sget v2, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->ghost_view_holder:I

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;

    .line 17
    sget v4, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->ghost_view:I

    invoke-virtual {v1, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lづざかべべ/は〲ぱなで/いいにぽつ;

    if-eqz v4, :cond_20e

    .line 18
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    check-cast v5, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;

    if-eq v5, v2, :cond_20e

    iget v6, v4, Lづざかべべ/は〲ぱなで/いいにぽつ;->づざかべべ:I

    invoke-virtual {v5, v4}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    const/4 v11, 0x0

    goto :goto_210

    :cond_20e
    move-object v11, v4

    const/4 v6, 0x0

    :goto_210
    if-nez v11, :cond_3cb

    new-instance v4, Lづざかべべ/は〲ぱなで/いいにぽつ;

    invoke-direct {v4, v1}, Lづざかべべ/は〲ぱなで/いいにぽつ;-><init>(Landroid/view/View;)V

    .line 19
    iput-object v3, v4, Lづざかべべ/は〲ぱなで/いいにぽつ;->なぎぱいぢぎ:Landroid/graphics/Matrix;

    if-nez v2, :cond_221

    .line 20
    new-instance v2, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;

    invoke-direct {v2, v0}, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;-><init>(Landroid/view/ViewGroup;)V

    goto :goto_237

    .line 21
    :cond_221
    iget-boolean v3, v2, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;->くし〴〺ぅ:Z

    if-eqz v3, :cond_3c3

    iget-object v3, v2, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/ViewGroup;

    invoke-static {v3}, Lづざかべべ/は〲ぱなで/じぜこほぱ;->げつ〴ぬぐ(Landroid/view/ViewGroup;)Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;

    move-result-object v3

    invoke-interface {v3, v2}, Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;->〺つふすそ(Landroid/view/View;)V

    iget-object v3, v2, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/ViewGroup;

    invoke-static {v3}, Lづざかべべ/は〲ぱなで/じぜこほぱ;->げつ〴ぬぐ(Landroid/view/ViewGroup;)Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;

    move-result-object v3

    invoke-interface {v3, v2}, Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;->げつ〴ぬぐ(Landroid/view/View;)V

    .line 22
    :goto_237
    invoke-static {v0, v2}, Lづざかべべ/は〲ぱなで/いいにぽつ;->〺つふすそ(Landroid/view/View;Landroid/view/View;)V

    invoke-static {v0, v4}, Lづざかべべ/は〲ぱなで/いいにぽつ;->〺つふすそ(Landroid/view/View;Landroid/view/View;)V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, v4, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    invoke-static {v3, v0}, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;->げつ〴ぬぐ(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 24
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v5

    const/4 v7, 0x1

    sub-int/2addr v5, v7

    const/4 v7, 0x0

    :goto_253
    if-gt v7, v5, :cond_3ab

    add-int v11, v7, v5

    div-int/2addr v11, v12

    invoke-virtual {v2, v11}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Lづざかべべ/は〲ぱなで/いいにぽつ;

    iget-object v13, v13, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    invoke-static {v13, v3}, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;->げつ〴ぬぐ(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_384

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_384

    const/4 v13, 0x0

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    if-eq v15, v12, :cond_27c

    goto/16 :goto_384

    :cond_27c
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v12

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v13

    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    move-result v12

    const/4 v13, 0x1

    :goto_289
    if-ge v13, v12, :cond_370

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/view/View;

    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 p1, v0

    move-object/from16 v0, v17

    check-cast v0, Landroid/view/View;

    if-eq v15, v0, :cond_35d

    .line 26
    invoke-virtual {v15}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v12

    check-cast v12, Landroid/view/ViewGroup;

    invoke-virtual {v12}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v13

    move/from16 v17, v5

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x15

    if-lt v5, v8, :cond_2d2

    invoke-virtual {v15}, Landroid/view/View;->getZ()F

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getZ()F

    move-result v8

    cmpl-float v5, v5, v8

    if-eqz v5, :cond_2d2

    invoke-virtual {v15}, Landroid/view/View;->getZ()F

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getZ()F

    move-result v0

    cmpl-float v0, v5, v0

    if-lez v0, :cond_2c9

    goto/16 :goto_35a

    :cond_2c9
    move-object/from16 v23, v1

    move-object/from16 v22, v14

    const/4 v8, 0x2

    const/16 v20, 0x0

    goto/16 :goto_382

    :cond_2d2
    const/4 v5, 0x0

    :goto_2d3
    if-ge v5, v13, :cond_35a

    .line 27
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    move/from16 v18, v13

    const/16 v13, 0x1d

    if-lt v8, v13, :cond_2ea

    invoke-virtual {v12, v5}, Landroid/view/ViewGroup;->getChildDrawingOrder(I)I

    move-result v8

    move-object/from16 v23, v1

    move v1, v8

    move-object/from16 v22, v14

    const/4 v8, 0x2

    const/16 v20, 0x0

    goto :goto_344

    :cond_2ea
    sget-boolean v8, Lづざかべべ/は〲ぱなで/じぜこほぱ;->くし〴〺ぅ:Z

    if-nez v8, :cond_317

    :try_start_2ee
    const-class v8, Landroid/view/ViewGroup;

    const-string v13, "getChildDrawingOrder"
    :try_end_2f2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2ee .. :try_end_2f2} :catch_30f

    move-object/from16 v22, v14

    const/4 v14, 0x2

    :try_start_2f5
    new-array v10, v14, [Ljava/lang/Class;

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/16 v20, 0x0

    aput-object v14, v10, v20
    :try_end_2fd
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2f5 .. :try_end_2fd} :catch_30c

    move-object/from16 v23, v1

    const/4 v1, 0x1

    :try_start_300
    aput-object v14, v10, v1

    invoke-virtual {v8, v13, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    sput-object v8, Lづざかべべ/は〲ぱなで/じぜこほぱ;->〺つふすそ:Ljava/lang/reflect/Method;

    invoke-virtual {v8, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_30b
    .catch Ljava/lang/NoSuchMethodException; {:try_start_300 .. :try_end_30b} :catch_314

    goto :goto_313

    :catch_30c
    move-object/from16 v23, v1

    goto :goto_313

    :catch_30f
    move-object/from16 v23, v1

    move-object/from16 v22, v14

    :goto_313
    const/4 v1, 0x1

    :catch_314
    sput-boolean v1, Lづざかべべ/は〲ぱなで/じぜこほぱ;->くし〴〺ぅ:Z

    goto :goto_31b

    :cond_317
    move-object/from16 v23, v1

    move-object/from16 v22, v14

    :goto_31b
    sget-object v1, Lづざかべべ/は〲ぱなで/じぜこほぱ;->〺つふすそ:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_340

    const/4 v8, 0x2

    :try_start_320
    new-array v10, v8, [Ljava/lang/Object;

    invoke-virtual {v12}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13
    :try_end_32a
    .catch Ljava/lang/IllegalAccessException; {:try_start_320 .. :try_end_32a} :catch_341
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_320 .. :try_end_32a} :catch_341

    const/16 v20, 0x0

    :try_start_32c
    aput-object v13, v10, v20

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v14, 0x1

    aput-object v13, v10, v14

    invoke-virtual {v1, v12, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1
    :try_end_33f
    .catch Ljava/lang/IllegalAccessException; {:try_start_32c .. :try_end_33f} :catch_343
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_32c .. :try_end_33f} :catch_343

    goto :goto_344

    :cond_340
    const/4 v8, 0x2

    :catch_341
    const/16 v20, 0x0

    :catch_343
    move v1, v5

    .line 28
    :goto_344
    invoke-virtual {v12, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-ne v1, v15, :cond_34b

    goto :goto_382

    :cond_34b
    if-ne v1, v0, :cond_34e

    goto :goto_38f

    :cond_34e
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v10, p3

    move/from16 v13, v18

    move-object/from16 v14, v22

    move-object/from16 v1, v23

    goto/16 :goto_2d3

    :cond_35a
    :goto_35a
    move-object/from16 v23, v1

    goto :goto_38a

    :cond_35d
    move-object/from16 v23, v1

    move/from16 v17, v5

    move-object/from16 v22, v14

    const/4 v8, 0x2

    const/16 v20, 0x0

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    move-object/from16 v10, p3

    goto/16 :goto_289

    :cond_370
    move-object/from16 p1, v0

    move-object/from16 v23, v1

    move/from16 v17, v5

    move-object/from16 v22, v14

    const/4 v8, 0x2

    const/16 v20, 0x0

    .line 29
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v0, v12, :cond_382

    goto :goto_38f

    :cond_382
    :goto_382
    const/4 v0, 0x0

    goto :goto_390

    :cond_384
    :goto_384
    move-object/from16 p1, v0

    move-object/from16 v23, v1

    move/from16 v17, v5

    :goto_38a
    move-object/from16 v22, v14

    const/4 v8, 0x2

    const/16 v20, 0x0

    :goto_38f
    const/4 v0, 0x1

    :goto_390
    if-eqz v0, :cond_398

    add-int/lit8 v11, v11, 0x1

    move v7, v11

    move/from16 v5, v17

    goto :goto_39b

    :cond_398
    add-int/lit8 v11, v11, -0x1

    move v5, v11

    .line 30
    :goto_39b
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    move-object/from16 v10, p3

    move-object/from16 v14, v22

    move-object/from16 v1, v23

    const/4 v12, 0x2

    goto/16 :goto_253

    :cond_3ab
    move-object/from16 v23, v1

    move-object/from16 v22, v14

    if-ltz v7, :cond_3bc

    .line 31
    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v0

    if-lt v7, v0, :cond_3b8

    goto :goto_3bc

    :cond_3b8
    invoke-virtual {v2, v4, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;I)V

    goto :goto_3bf

    :cond_3bc
    :goto_3bc
    invoke-virtual {v2, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 32
    :goto_3bf
    iput v6, v4, Lづざかべべ/は〲ぱなで/いいにぽつ;->づざかべべ:I

    move-object v11, v4

    goto :goto_3d1

    .line 33
    :cond_3c3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This GhostViewHolder is detached!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3cb
    move-object/from16 v23, v1

    move-object/from16 v22, v14

    .line 34
    iput-object v3, v11, Lづざかべべ/は〲ぱなで/いいにぽつ;->なぎぱいぢぎ:Landroid/graphics/Matrix;

    .line 35
    :goto_3d1
    iget v0, v11, Lづざかべべ/は〲ぱなで/いいにぽつ;->づざかべべ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, v11, Lづざかべべ/は〲ぱなで/いいにぽつ;->づざかべべ:I

    :goto_3d7
    if-nez v11, :cond_3da

    goto :goto_42a

    .line 36
    :cond_3da
    iget-object v0, v9, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    move-object/from16 v1, v21

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, v9, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-interface {v11, v0, v1}, Lづざかべべ/は〲ぱなで/ぁごぐすすぃ;->げつ〴ぬぐ(Landroid/view/ViewGroup;Landroid/view/View;)V

    move-object/from16 v0, p0

    :goto_3eb
    iget-object v1, v0, Landroidx/transition/Transition;->いいにぽつ:Landroidx/transition/TransitionSet;

    if-eqz v1, :cond_3f1

    move-object v0, v1

    goto :goto_3eb

    :cond_3f1
    new-instance v1, Landroidx/transition/ChangeTransform$くし〴〺ぅ;

    move-object/from16 v2, v23

    invoke-direct {v1, v2, v11}, Landroidx/transition/ChangeTransform$くし〴〺ぅ;-><init>(Landroid/view/View;Lづざかべべ/は〲ぱなで/ぁごぐすすぃ;)V

    invoke-virtual {v0, v1}, Landroidx/transition/Transition;->げつ〴ぬぐ(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    sget-boolean v0, Landroidx/transition/ChangeTransform;->ぺづげぺが:Z

    if-eqz v0, :cond_42a

    iget-object v0, v9, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    move-object/from16 v1, p3

    iget-object v1, v1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    if-eq v0, v1, :cond_40d

    const/4 v1, 0x0

    .line 37
    sget-object v3, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    invoke-virtual {v3, v0, v1}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->なぎぱいぢぎ(Landroid/view/View;F)V

    :cond_40d
    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v1, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    invoke-virtual {v1, v2, v0}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->なぎぱいぢぎ(Landroid/view/View;F)V

    goto :goto_42a

    .line 38
    :cond_415
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Ghosted views must be parented by a ViewGroup"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_41d
    move-object/from16 v22, v14

    .line 39
    sget-boolean v0, Landroidx/transition/ChangeTransform;->ぺづげぺが:Z

    if-nez v0, :cond_42a

    iget-object v0, v9, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    :cond_42a
    :goto_42a
    return-object v22

    :cond_42b
    :goto_42b
    const/4 v0, 0x0

    return-object v0
.end method
