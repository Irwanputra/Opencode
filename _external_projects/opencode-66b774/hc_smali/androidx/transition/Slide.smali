.class public Landroidx/transition/Slide;
.super Landroidx/transition/Visibility;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/Slide$ぺぁあねじ;,
        Landroidx/transition/Slide$〳ぜぞぜべっ;,
        Landroidx/transition/Slide$ぁごぐすすぃ;
    }
.end annotation


# static fields
.field public static final ぅみぱぎぎ:Landroid/animation/TimeInterpolator;

.field public static final ぉひのべい:Landroidx/transition/Slide$ぁごぐすすぃ;

.field public static final けときぜと:Landroidx/transition/Slide$ぁごぐすすぃ;

.field public static final じぜこほぱ:Landroidx/transition/Slide$ぁごぐすすぃ;

.field public static final せづっ〸ちね:Landroidx/transition/Slide$ぁごぐすすぃ;

.field public static final どぇぞほだ:Landroid/animation/TimeInterpolator;

.field public static final ぷぞてのほき:Landroidx/transition/Slide$ぁごぐすすぃ;

.field public static final ぺづげぺが:Landroidx/transition/Slide$ぁごぐすすぃ;


# instance fields
.field public なぶひせが:Landroidx/transition/Slide$ぁごぐすすぃ;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Landroidx/transition/Slide;->どぇぞほだ:Landroid/animation/TimeInterpolator;

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    sput-object v0, Landroidx/transition/Slide;->ぅみぱぎぎ:Landroid/animation/TimeInterpolator;

    new-instance v0, Landroidx/transition/Slide$げつ〴ぬぐ;

    invoke-direct {v0}, Landroidx/transition/Slide$げつ〴ぬぐ;-><init>()V

    sput-object v0, Landroidx/transition/Slide;->じぜこほぱ:Landroidx/transition/Slide$ぁごぐすすぃ;

    new-instance v0, Landroidx/transition/Slide$〺つふすそ;

    invoke-direct {v0}, Landroidx/transition/Slide$〺つふすそ;-><init>()V

    sput-object v0, Landroidx/transition/Slide;->ぺづげぺが:Landroidx/transition/Slide$ぁごぐすすぃ;

    new-instance v0, Landroidx/transition/Slide$くし〴〺ぅ;

    invoke-direct {v0}, Landroidx/transition/Slide$くし〴〺ぅ;-><init>()V

    sput-object v0, Landroidx/transition/Slide;->ぉひのべい:Landroidx/transition/Slide$ぁごぐすすぃ;

    new-instance v0, Landroidx/transition/Slide$びぐびあび;

    invoke-direct {v0}, Landroidx/transition/Slide$びぐびあび;-><init>()V

    sput-object v0, Landroidx/transition/Slide;->せづっ〸ちね:Landroidx/transition/Slide$ぁごぐすすぃ;

    new-instance v0, Landroidx/transition/Slide$づざかべべ;

    invoke-direct {v0}, Landroidx/transition/Slide$づざかべべ;-><init>()V

    sput-object v0, Landroidx/transition/Slide;->ぷぞてのほき:Landroidx/transition/Slide$ぁごぐすすぃ;

    new-instance v0, Landroidx/transition/Slide$なぎぱいぢぎ;

    invoke-direct {v0}, Landroidx/transition/Slide$なぎぱいぢぎ;-><init>()V

    sput-object v0, Landroidx/transition/Slide;->けときぜと:Landroidx/transition/Slide$ぁごぐすすぃ;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroidx/transition/Visibility;-><init>()V

    sget-object v0, Landroidx/transition/Slide;->けときぜと:Landroidx/transition/Slide$ぁごぐすすぃ;

    iput-object v0, p0, Landroidx/transition/Slide;->なぶひせが:Landroidx/transition/Slide$ぁごぐすすぃ;

    const/16 v0, 0x50

    invoke-virtual {p0, v0}, Landroidx/transition/Slide;->ぃぜぶの〸ぃ(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Landroidx/transition/Visibility;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object v0, Landroidx/transition/Slide;->けときぜと:Landroidx/transition/Slide$ぁごぐすすぃ;

    iput-object v0, p0, Landroidx/transition/Slide;->なぶひせが:Landroidx/transition/Slide$ぁごぐすすぃ;

    sget-object v0, Lづざかべべ/は〲ぱなで/ざとぅぼこ〺;->なぎぱいぢぎ:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    check-cast p2, Lorg/xmlpull/v1/XmlPullParser;

    const-string v0, "slideEdge"

    const/4 v1, 0x0

    const/16 v2, 0x50

    invoke-static {p1, p2, v0, v1, v2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->びぐびあび(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0, p2}, Landroidx/transition/Slide;->ぃぜぶの〸ぃ(I)V

    return-void
.end method


# virtual methods
.method public ぁごぐすすぃ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 4

    .line 1
    invoke-virtual {p0, p1}, Landroidx/transition/Visibility;->ぷぞてのほき(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    .line 2
    iget-object v0, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    const/4 v1, 0x2

    new-array v1, v1, [I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object p1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v0, "android:slide:screenPosition"

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public ぃぜぶの〸ぃ(I)V
    .registers 3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2f

    const/4 v0, 0x5

    if-eq p1, v0, :cond_2c

    const/16 v0, 0x30

    if-eq p1, v0, :cond_29

    const/16 v0, 0x50

    if-eq p1, v0, :cond_26

    const v0, 0x800003

    if-eq p1, v0, :cond_23

    const v0, 0x800005

    if-ne p1, v0, :cond_1b

    sget-object v0, Landroidx/transition/Slide;->ぷぞてのほき:Landroidx/transition/Slide$ぁごぐすすぃ;

    goto :goto_31

    :cond_1b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid slide direction"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_23
    sget-object v0, Landroidx/transition/Slide;->ぺづげぺが:Landroidx/transition/Slide$ぁごぐすすぃ;

    goto :goto_31

    :cond_26
    sget-object v0, Landroidx/transition/Slide;->けときぜと:Landroidx/transition/Slide$ぁごぐすすぃ;

    goto :goto_31

    :cond_29
    sget-object v0, Landroidx/transition/Slide;->ぉひのべい:Landroidx/transition/Slide$ぁごぐすすぃ;

    goto :goto_31

    :cond_2c
    sget-object v0, Landroidx/transition/Slide;->せづっ〸ちね:Landroidx/transition/Slide$ぁごぐすすぃ;

    goto :goto_31

    :cond_2f
    sget-object v0, Landroidx/transition/Slide;->じぜこほぱ:Landroidx/transition/Slide$ぁごぐすすぃ;

    :goto_31
    iput-object v0, p0, Landroidx/transition/Slide;->なぶひせが:Landroidx/transition/Slide$ぁごぐすすぃ;

    new-instance v0, Lづざかべべ/は〲ぱなで/ぉざぅち〻;

    invoke-direct {v0}, Lづざかべべ/は〲ぱなで/ぉざぅち〻;-><init>()V

    .line 1
    iput p1, v0, Lづざかべべ/は〲ぱなで/ぉざぅち〻;->〺つふすそ:I

    .line 2
    iput-object v0, p0, Landroidx/transition/Transition;->ごづごきえ:Lづざかべべ/は〲ぱなで/ぶでにく〼〳;

    return-void
.end method

.method public ぇとしたべど(Landroid/view/ViewGroup;Landroid/view/View;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;
    .registers 15

    iget-object p4, p3, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v0, "android:slide:screenPosition"

    invoke-interface {p4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [I

    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result v4

    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result v5

    iget-object v0, p0, Landroidx/transition/Slide;->なぶひせが:Landroidx/transition/Slide$ぁごぐすすぃ;

    invoke-interface {v0, p1, p2}, Landroidx/transition/Slide$ぁごぐすすぃ;->〺つふすそ(Landroid/view/ViewGroup;Landroid/view/View;)F

    move-result v6

    iget-object v0, p0, Landroidx/transition/Slide;->なぶひせが:Landroidx/transition/Slide$ぁごぐすすぃ;

    invoke-interface {v0, p1, p2}, Landroidx/transition/Slide$ぁごぐすすぃ;->げつ〴ぬぐ(Landroid/view/ViewGroup;Landroid/view/View;)F

    move-result v7

    const/4 p1, 0x0

    aget v2, p4, p1

    const/4 p1, 0x1

    aget v3, p4, p1

    sget-object v8, Landroidx/transition/Slide;->ぅみぱぎぎ:Landroid/animation/TimeInterpolator;

    move-object v0, p2

    move-object v1, p3

    move-object v9, p0

    invoke-static/range {v0 .. v9}, Lづざかべべ/は〲ぱなで/びえぁぜい;->げつ〴ぬぐ(Landroid/view/View;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;IIFFFFLandroid/animation/TimeInterpolator;Landroidx/transition/Transition;)Landroid/animation/Animator;

    move-result-object p1

    return-object p1
.end method

.method public おかぷせ〱(Landroid/view/ViewGroup;Landroid/view/View;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;
    .registers 15

    iget-object p3, p4, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v0, "android:slide:screenPosition"

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [I

    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result v6

    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result v7

    iget-object v0, p0, Landroidx/transition/Slide;->なぶひせが:Landroidx/transition/Slide$ぁごぐすすぃ;

    invoke-interface {v0, p1, p2}, Landroidx/transition/Slide$ぁごぐすすぃ;->〺つふすそ(Landroid/view/ViewGroup;Landroid/view/View;)F

    move-result v4

    iget-object v0, p0, Landroidx/transition/Slide;->なぶひせが:Landroidx/transition/Slide$ぁごぐすすぃ;

    invoke-interface {v0, p1, p2}, Landroidx/transition/Slide$ぁごぐすすぃ;->げつ〴ぬぐ(Landroid/view/ViewGroup;Landroid/view/View;)F

    move-result v5

    const/4 p1, 0x0

    aget v2, p3, p1

    const/4 p1, 0x1

    aget v3, p3, p1

    sget-object v8, Landroidx/transition/Slide;->どぇぞほだ:Landroid/animation/TimeInterpolator;

    move-object v0, p2

    move-object v1, p4

    move-object v9, p0

    invoke-static/range {v0 .. v9}, Lづざかべべ/は〲ぱなで/びえぁぜい;->げつ〴ぬぐ(Landroid/view/View;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;IIFFFFLandroid/animation/TimeInterpolator;Landroidx/transition/Transition;)Landroid/animation/Animator;

    move-result-object p1

    return-object p1
.end method

.method public びぐびあび(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 4

    .line 1
    invoke-virtual {p0, p1}, Landroidx/transition/Visibility;->ぷぞてのほき(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    .line 2
    iget-object v0, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    const/4 v1, 0x2

    new-array v1, v1, [I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object p1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v0, "android:slide:screenPosition"

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
