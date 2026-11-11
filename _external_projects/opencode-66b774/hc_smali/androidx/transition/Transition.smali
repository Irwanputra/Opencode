.class public abstract Landroidx/transition/Transition;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/Transition$くし〴〺ぅ;,
        Landroidx/transition/Transition$〺つふすそ;,
        Landroidx/transition/Transition$びぐびあび;
    }
.end annotation


# static fields
.field public static final 〻ぞまぎな〻:Landroidx/transition/PathMotion;

.field public static ぉ〲なぱぽた:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Landroid/animation/Animator;",
            "Landroidx/transition/Transition$\u303a\u3064\u3075\u3059\u305d;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final ぶでにく〼〳:[I


# instance fields
.field public 〳ぜぞぜべっ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

.field public 〺つふすそ:Ljava/lang/String;

.field public ぁごぐすすぃ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public いいにぽつ:Landroidx/transition/TransitionSet;

.field public ぇぬぎばつ:Z

.field public ぉざぅち〻:Z

.field public おぐぴう〸ず:I

.field public くし〴〺ぅ:J

.field public ごづごきえ:Lづざかべべ/は〲ぱなで/ぶでにく〼〳;

.field public ざっざへづ:Landroidx/transition/Transition$くし〴〺ぅ;

.field public ざとぅぼこ〺:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/transition/Transition$\u3073\u3050\u3073\u3042\u3073;",
            ">;"
        }
    .end annotation
.end field

.field public づざかべべ:Landroid/animation/TimeInterpolator;

.field public てぜきぽく:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306f\u3032\u3071\u306a\u3067/\u3049\u3032\u306a\u3071\u307d\u305f;",
            ">;"
        }
    .end annotation
.end field

.field public でどあくず:Landroidx/transition/PathMotion;

.field public なぎぱいぢぎ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public のぷのちつ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306f\u3032\u3071\u306a\u3067/\u3049\u3032\u306a\u3071\u307d\u305f;",
            ">;"
        }
    .end annotation
.end field

.field public は〲ぱなで:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator;",
            ">;"
        }
    .end annotation
.end field

.field public びぐびあび:J

.field public へぬ〴づぞ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator;",
            ">;"
        }
    .end annotation
.end field

.field public ぺぁあねじ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

.field public ぺふねづ〺:[I


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_18

    sput-object v0, Landroidx/transition/Transition;->ぶでにく〼〳:[I

    new-instance v0, Landroidx/transition/Transition$げつ〴ぬぐ;

    invoke-direct {v0}, Landroidx/transition/Transition$げつ〴ぬぐ;-><init>()V

    sput-object v0, Landroidx/transition/Transition;->〻ぞまぎな〻:Landroidx/transition/PathMotion;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Landroidx/transition/Transition;->ぉ〲なぱぽた:Ljava/lang/ThreadLocal;

    return-void

    nop

    :array_18
    .array-data 4
        0x2
        0x1
        0x3
        0x4
    .end array-data
.end method

.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/transition/Transition;->〺つふすそ:Ljava/lang/String;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroidx/transition/Transition;->くし〴〺ぅ:J

    iput-wide v0, p0, Landroidx/transition/Transition;->びぐびあび:J

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/transition/Transition;->づざかべべ:Landroid/animation/TimeInterpolator;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->なぎぱいぢぎ:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    new-instance v1, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    invoke-direct {v1}, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->〳ぜぞぜべっ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    new-instance v1, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    invoke-direct {v1}, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->ぺぁあねじ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    iput-object v0, p0, Landroidx/transition/Transition;->いいにぽつ:Landroidx/transition/TransitionSet;

    sget-object v1, Landroidx/transition/Transition;->ぶでにく〼〳:[I

    iput-object v1, p0, Landroidx/transition/Transition;->ぺふねづ〺:[I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->へぬ〴づぞ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    iput v1, p0, Landroidx/transition/Transition;->おぐぴう〸ず:I

    iput-boolean v1, p0, Landroidx/transition/Transition;->ぇぬぎばつ:Z

    iput-boolean v1, p0, Landroidx/transition/Transition;->ぉざぅち〻:Z

    iput-object v0, p0, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/Transition;->は〲ぱなで:Ljava/util/ArrayList;

    sget-object v0, Landroidx/transition/Transition;->〻ぞまぎな〻:Landroidx/transition/PathMotion;

    iput-object v0, p0, Landroidx/transition/Transition;->でどあくず:Landroidx/transition/PathMotion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/transition/Transition;->〺つふすそ:Ljava/lang/String;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroidx/transition/Transition;->くし〴〺ぅ:J

    iput-wide v0, p0, Landroidx/transition/Transition;->びぐびあび:J

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/transition/Transition;->づざかべべ:Landroid/animation/TimeInterpolator;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->なぎぱいぢぎ:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    new-instance v1, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    invoke-direct {v1}, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->〳ぜぞぜべっ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    new-instance v1, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    invoke-direct {v1}, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->ぺぁあねじ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    iput-object v0, p0, Landroidx/transition/Transition;->いいにぽつ:Landroidx/transition/TransitionSet;

    sget-object v1, Landroidx/transition/Transition;->ぶでにく〼〳:[I

    iput-object v1, p0, Landroidx/transition/Transition;->ぺふねづ〺:[I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->へぬ〴づぞ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    iput v1, p0, Landroidx/transition/Transition;->おぐぴう〸ず:I

    iput-boolean v1, p0, Landroidx/transition/Transition;->ぇぬぎばつ:Z

    iput-boolean v1, p0, Landroidx/transition/Transition;->ぉざぅち〻:Z

    iput-object v0, p0, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/Transition;->は〲ぱなで:Ljava/util/ArrayList;

    sget-object v0, Landroidx/transition/Transition;->〻ぞまぎな〻:Landroidx/transition/PathMotion;

    iput-object v0, p0, Landroidx/transition/Transition;->でどあくず:Landroidx/transition/PathMotion;

    sget-object v0, Lづざかべべ/は〲ぱなで/ざとぅぼこ〺;->げつ〴ぬぐ:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    check-cast p2, Landroid/content/res/XmlResourceParser;

    const-string v2, "duration"

    const/4 v3, 0x1

    const/4 v4, -0x1

    invoke-static {v0, p2, v2, v3, v4}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->びぐびあび(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v2

    int-to-long v5, v2

    const-wide/16 v7, 0x0

    cmp-long v2, v5, v7

    if-ltz v2, :cond_6d

    invoke-virtual {p0, v5, v6}, Landroidx/transition/Transition;->びえぁぜい(J)Landroidx/transition/Transition;

    :cond_6d
    const/4 v2, 0x2

    const-string v5, "startDelay"

    invoke-static {v0, p2, v5, v2, v4}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->びぐびあび(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v4

    int-to-long v4, v4

    cmp-long v6, v4, v7

    if-lez v6, :cond_7c

    invoke-virtual {p0, v4, v5}, Landroidx/transition/Transition;->ぺづげぺが(J)Landroidx/transition/Transition;

    :cond_7c
    const-string v4, "interpolator"

    invoke-static {v0, p2, v4, v1, v1}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->づざかべべ(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v4

    if-lez v4, :cond_8b

    invoke-static {p1, v4}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/transition/Transition;->どぇぞほだ(Landroid/animation/TimeInterpolator;)Landroidx/transition/Transition;

    :cond_8b
    const/4 p1, 0x3

    const-string v4, "matchOrder"

    invoke-static {v0, p2, v4, p1}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->なぎぱいぢぎ(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_140

    .line 1
    new-instance v4, Ljava/util/StringTokenizer;

    const-string v5, ","

    invoke-direct {v4, p2, v5}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/util/StringTokenizer;->countTokens()I

    move-result p2

    new-array p2, p2, [I

    const/4 v5, 0x0

    :goto_a2
    invoke-virtual {v4}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result v6

    const/4 v7, 0x4

    if-eqz v6, :cond_fd

    invoke-virtual {v4}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    const-string v8, "id"

    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_bc

    aput p1, p2, v5

    goto :goto_ed

    :cond_bc
    const-string v8, "instance"

    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_c7

    aput v3, p2, v5

    goto :goto_ed

    :cond_c7
    const-string v8, "name"

    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_d2

    aput v2, p2, v5

    goto :goto_ed

    :cond_d2
    const-string v8, "itemId"

    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_dd

    aput v7, p2, v5

    goto :goto_ed

    :cond_dd
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_ef

    array-length v6, p2

    sub-int/2addr v6, v3

    new-array v6, v6, [I

    invoke-static {p2, v1, v6, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v5, v5, -0x1

    move-object p2, v6

    :goto_ed
    add-int/2addr v5, v3

    goto :goto_a2

    :cond_ef
    new-instance p1, Landroid/view/InflateException;

    const-string p2, "Unknown match type in matchOrder: \'"

    const-string v0, "\'"

    invoke-static {p2, v6, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2
    :cond_fd
    array-length p1, p2

    if-nez p1, :cond_105

    sget-object p1, Landroidx/transition/Transition;->ぶでにく〼〳:[I

    iput-object p1, p0, Landroidx/transition/Transition;->ぺふねづ〺:[I

    goto :goto_140

    :cond_105
    const/4 p1, 0x0

    :goto_106
    array-length v1, p2

    if-ge p1, v1, :cond_138

    aget v1, p2, p1

    if-lt v1, v3, :cond_111

    if-gt v1, v7, :cond_111

    const/4 v1, 0x1

    goto :goto_112

    :cond_111
    const/4 v1, 0x0

    :goto_112
    if-eqz v1, :cond_130

    .line 3
    aget v1, p2, p1

    const/4 v2, 0x0

    :goto_117
    if-ge v2, p1, :cond_122

    aget v4, p2, v2

    if-ne v4, v1, :cond_11f

    const/4 v1, 0x1

    goto :goto_123

    :cond_11f
    add-int/lit8 v2, v2, 0x1

    goto :goto_117

    :cond_122
    const/4 v1, 0x0

    :goto_123
    if-nez v1, :cond_128

    add-int/lit8 p1, p1, 0x1

    goto :goto_106

    .line 4
    :cond_128
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "matches contains a duplicate value"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_130
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "matches contains invalid value"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_138
    invoke-virtual {p2}, [I->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, Landroidx/transition/Transition;->ぺふねづ〺:[I

    .line 5
    :cond_140
    :goto_140
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static ぇぬぎばつ()Lづざかべべ/づざかべべ/げつ〴ぬぐ;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Landroid/animation/Animator;",
            "Landroidx/transition/Transition$\u303a\u3064\u3075\u3059\u305d;",
            ">;"
        }
    .end annotation

    sget-object v0, Landroidx/transition/Transition;->ぉ〲なぱぽた:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    if-nez v0, :cond_14

    new-instance v0, Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-direct {v0}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;-><init>()V

    sget-object v1, Landroidx/transition/Transition;->ぉ〲なぱぽた:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_14
    return-object v0
.end method

.method public static くし〴〺ぅ(Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;Landroid/view/View;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 9

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p2

    const/4 v0, 0x0

    if-ltz p2, :cond_1f

    iget-object v1, p0, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->〺つふすそ:Landroid/util/SparseArray;

    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v1

    if-ltz v1, :cond_1a

    iget-object v1, p0, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->〺つふすそ:Landroid/util/SparseArray;

    invoke-virtual {v1, p2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_1f

    :cond_1a
    iget-object v1, p0, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->〺つふすそ:Landroid/util/SparseArray;

    invoke-virtual {v1, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_1f
    :goto_1f
    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ごづごきえ(Landroid/view/View;)Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p2, :cond_3f

    iget-object v3, p0, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->びぐびあび:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    .line 1
    invoke-virtual {v3, p2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->づざかべべ(Ljava/lang/Object;)I

    move-result v3

    if-ltz v3, :cond_31

    const/4 v3, 0x1

    goto :goto_32

    :cond_31
    const/4 v3, 0x0

    :goto_32
    if-eqz v3, :cond_3a

    .line 2
    iget-object v3, p0, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->びぐびあび:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v3, p2, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3f

    :cond_3a
    iget-object v3, p0, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->びぐびあび:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v3, p2, p1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3f
    :goto_3f
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    instance-of p2, p2, Landroid/widget/ListView;

    if-eqz p2, :cond_8d

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    check-cast p2, Landroid/widget/ListView;

    invoke-virtual {p2}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v3

    invoke-interface {v3}, Landroid/widget/ListAdapter;->hasStableIds()Z

    move-result v3

    if-eqz v3, :cond_8d

    invoke-virtual {p2, p1}, Landroid/widget/ListView;->getPositionForView(Landroid/view/View;)I

    move-result v3

    invoke-virtual {p2, v3}, Landroid/widget/ListView;->getItemIdAtPosition(I)J

    move-result-wide v3

    iget-object p2, p0, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/づざかべべ;

    .line 3
    iget-boolean v5, p2, Lづざかべべ/づざかべべ/づざかべべ;->〺つふすそ:Z

    if-eqz v5, :cond_68

    invoke-virtual {p2}, Lづざかべべ/づざかべべ/づざかべべ;->びぐびあび()V

    :cond_68
    iget-object v5, p2, Lづざかべべ/づざかべべ/づざかべべ;->くし〴〺ぅ:[J

    iget p2, p2, Lづざかべべ/づざかべべ/づざかべべ;->づざかべべ:I

    invoke-static {v5, p2, v3, v4}, Lづざかべべ/づざかべべ/びぐびあび;->〺つふすそ([JIJ)I

    move-result p2

    if-ltz p2, :cond_85

    .line 4
    iget-object p1, p0, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/づざかべべ;

    invoke-virtual {p1, v3, v4}, Lづざかべべ/づざかべべ/づざかべべ;->づざかべべ(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_8d

    invoke-static {p1, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぃぜぶの〸ぃ(Landroid/view/View;Z)V

    iget-object p0, p0, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/づざかべべ;

    invoke-virtual {p0, v3, v4, v0}, Lづざかべべ/づざかべべ/づざかべべ;->ぁごぐすすぃ(JLjava/lang/Object;)V

    goto :goto_8d

    :cond_85
    invoke-static {p1, v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぃぜぶの〸ぃ(Landroid/view/View;Z)V

    iget-object p0, p0, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/づざかべべ;

    invoke-virtual {p0, v3, v4, p1}, Lづざかべべ/づざかべべ/づざかべべ;->ぁごぐすすぃ(JLjava/lang/Object;)V

    :cond_8d
    :goto_8d
    return-void
.end method

.method public static ざっざへづ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Ljava/lang/String;)Z
    .registers 3

    iget-object p0, p0, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    iget-object p1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x1

    if-nez p0, :cond_13

    if-nez p1, :cond_13

    const/4 p2, 0x0

    goto :goto_1d

    :cond_13
    if-eqz p0, :cond_1d

    if-nez p1, :cond_18

    goto :goto_1d

    :cond_18
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/2addr p2, p0

    :cond_1d
    :goto_1d
    return p2
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0}, Landroidx/transition/Transition;->いいにぽつ()Landroidx/transition/Transition;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    const-string v0, ""

    invoke-virtual {p0, v0}, Landroidx/transition/Transition;->せづっ〸ちね(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〳ぜぞぜべっ(Landroid/view/ViewGroup;Z)V
    .registers 8

    invoke-virtual {p0, p2}, Landroidx/transition/Transition;->ぺぁあねじ(Z)V

    iget-object v0, p0, Landroidx/transition/Transition;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_19

    iget-object v0, p0, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_14

    goto :goto_19

    :cond_14
    invoke-virtual {p0, p1, p2}, Landroidx/transition/Transition;->づざかべべ(Landroid/view/View;Z)V

    goto/16 :goto_8b

    :cond_19
    :goto_19
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_1b
    iget-object v2, p0, Landroidx/transition/Transition;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_58

    iget-object v2, p0, Landroidx/transition/Transition;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_55

    new-instance v3, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    invoke-direct {v3, v2}, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_40

    invoke-virtual {p0, v3}, Landroidx/transition/Transition;->ぁごぐすすぃ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    goto :goto_43

    :cond_40
    invoke-virtual {p0, v3}, Landroidx/transition/Transition;->びぐびあび(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    :goto_43
    iget-object v4, v3, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v3}, Landroidx/transition/Transition;->なぎぱいぢぎ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    if-eqz p2, :cond_50

    iget-object v4, p0, Landroidx/transition/Transition;->〳ぜぞぜべっ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    goto :goto_52

    :cond_50
    iget-object v4, p0, Landroidx/transition/Transition;->ぺぁあねじ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    :goto_52
    invoke-static {v4, v2, v3}, Landroidx/transition/Transition;->くし〴〺ぅ(Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;Landroid/view/View;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    :cond_55
    add-int/lit8 v1, v1, 0x1

    goto :goto_1b

    :cond_58
    :goto_58
    iget-object p1, p0, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v0, p1, :cond_8b

    iget-object p1, p0, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    new-instance v1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    invoke-direct {v1, p1}, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_73

    invoke-virtual {p0, v1}, Landroidx/transition/Transition;->ぁごぐすすぃ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    goto :goto_76

    :cond_73
    invoke-virtual {p0, v1}, Landroidx/transition/Transition;->びぐびあび(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    :goto_76
    iget-object v2, v1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v1}, Landroidx/transition/Transition;->なぎぱいぢぎ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    if-eqz p2, :cond_83

    iget-object v2, p0, Landroidx/transition/Transition;->〳ぜぞぜべっ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    goto :goto_85

    :cond_83
    iget-object v2, p0, Landroidx/transition/Transition;->ぺぁあねじ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    :goto_85
    invoke-static {v2, p1, v1}, Landroidx/transition/Transition;->くし〴〺ぅ(Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;Landroid/view/View;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_58

    :cond_8b
    :goto_8b
    return-void
.end method

.method public 〺つふすそ(Landroid/view/View;)Landroidx/transition/Transition;
    .registers 3

    iget-object v0, p0, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public 〻ぞまぎな〻(Landroid/view/View;)Landroidx/transition/Transition;
    .registers 3

    iget-object v0, p0, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public abstract ぁごぐすすぃ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
.end method

.method public いいにぽつ()Landroidx/transition/Transition;
    .registers 4

    const/4 v0, 0x0

    :try_start_1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/Transition;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Landroidx/transition/Transition;->は〲ぱなで:Ljava/util/ArrayList;

    new-instance v2, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    invoke-direct {v2}, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;-><init>()V

    iput-object v2, v1, Landroidx/transition/Transition;->〳ぜぞぜべっ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    new-instance v2, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    invoke-direct {v2}, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;-><init>()V

    iput-object v2, v1, Landroidx/transition/Transition;->ぺぁあねじ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    iput-object v0, v1, Landroidx/transition/Transition;->てぜきぽく:Ljava/util/ArrayList;

    iput-object v0, v1, Landroidx/transition/Transition;->のぷのちつ:Ljava/util/ArrayList;
    :try_end_20
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_1 .. :try_end_20} :catch_21

    return-object v1

    :catch_21
    return-object v0
.end method

.method public ぅみぱぎぎ(Landroidx/transition/PathMotion;)V
    .registers 2

    if-nez p1, :cond_4

    sget-object p1, Landroidx/transition/Transition;->〻ぞまぎな〻:Landroidx/transition/PathMotion;

    :cond_4
    iput-object p1, p0, Landroidx/transition/Transition;->でどあくず:Landroidx/transition/PathMotion;

    return-void
.end method

.method public ぇ〳〲〺すっ()V
    .registers 9

    invoke-virtual {p0}, Landroidx/transition/Transition;->ぉひのべい()V

    invoke-static {}, Landroidx/transition/Transition;->ぇぬぎばつ()Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    move-result-object v0

    iget-object v1, p0, Landroidx/transition/Transition;->は〲ぱなで:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_d
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_58

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/animation/Animator;

    invoke-virtual {v0, v2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-virtual {p0}, Landroidx/transition/Transition;->ぉひのべい()V

    if-eqz v2, :cond_d

    .line 1
    new-instance v3, Lづざかべべ/は〲ぱなで/は〲ぱなで;

    invoke-direct {v3, p0, v0}, Lづざかべべ/は〲ぱなで/は〲ぱなで;-><init>(Landroidx/transition/Transition;Lづざかべべ/づざかべべ/げつ〴ぬぐ;)V

    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 2
    iget-wide v3, p0, Landroidx/transition/Transition;->びぐびあび:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-ltz v7, :cond_37

    .line 3
    invoke-virtual {v2, v3, v4}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 4
    :cond_37
    iget-wide v3, p0, Landroidx/transition/Transition;->くし〴〺ぅ:J

    cmp-long v7, v3, v5

    if-ltz v7, :cond_45

    .line 5
    invoke-virtual {v2}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v5

    add-long/2addr v5, v3

    invoke-virtual {v2, v5, v6}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 6
    :cond_45
    iget-object v3, p0, Landroidx/transition/Transition;->づざかべべ:Landroid/animation/TimeInterpolator;

    if-eqz v3, :cond_4c

    .line 7
    invoke-virtual {v2, v3}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    :cond_4c
    new-instance v3, Lづざかべべ/は〲ぱなで/ごづごきえ;

    invoke-direct {v3, p0}, Lづざかべべ/は〲ぱなで/ごづごきえ;-><init>(Landroidx/transition/Transition;)V

    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v2}, Landroid/animation/Animator;->start()V

    goto :goto_d

    .line 8
    :cond_58
    iget-object v0, p0, Landroidx/transition/Transition;->は〲ぱなで:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Landroidx/transition/Transition;->のぷのちつ()V

    return-void
.end method

.method public ぉ〲なぱぽた(Landroid/view/View;)V
    .registers 11

    iget-boolean v0, p0, Landroidx/transition/Transition;->ぇぬぎばつ:Z

    if-eqz v0, :cond_82

    iget-boolean v0, p0, Landroidx/transition/Transition;->ぉざぅち〻:Z

    const/4 v1, 0x0

    if-nez v0, :cond_80

    invoke-static {}, Landroidx/transition/Transition;->ぇぬぎばつ()Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    move-result-object v0

    .line 1
    iget v2, v0, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    .line 2
    invoke-static {p1}, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->〺つふすそ(Landroid/view/View;)Lづざかべべ/は〲ぱなで/えがぐせほち;

    move-result-object p1

    add-int/lit8 v2, v2, -0x1

    :goto_15
    if-ltz v2, :cond_5b

    invoke-virtual {v0, v2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->ぺふねづ〺(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/transition/Transition$〺つふすそ;

    iget-object v4, v3, Landroidx/transition/Transition$〺つふすそ;->げつ〴ぬぐ:Landroid/view/View;

    if-eqz v4, :cond_58

    iget-object v3, v3, Landroidx/transition/Transition$〺つふすそ;->びぐびあび:Lづざかべべ/は〲ぱなで/えがぐせほち;

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_58

    invoke-virtual {v0, v2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/Animator;

    .line 3
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x13

    if-lt v4, v5, :cond_39

    invoke-virtual {v3}, Landroid/animation/Animator;->resume()V

    goto :goto_58

    :cond_39
    invoke-virtual {v3}, Landroid/animation/Animator;->getListeners()Ljava/util/ArrayList;

    move-result-object v4

    if-eqz v4, :cond_58

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_44
    if-ge v6, v5, :cond_58

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/animation/Animator$AnimatorListener;

    instance-of v8, v7, Lづざかべべ/は〲ぱなで/げつ〴ぬぐ;

    if-eqz v8, :cond_55

    check-cast v7, Lづざかべべ/は〲ぱなで/げつ〴ぬぐ;

    invoke-interface {v7, v3}, Lづざかべべ/は〲ぱなで/げつ〴ぬぐ;->onAnimationResume(Landroid/animation/Animator;)V

    :cond_55
    add-int/lit8 v6, v6, 0x1

    goto :goto_44

    :cond_58
    :goto_58
    add-int/lit8 v2, v2, -0x1

    goto :goto_15

    .line 4
    :cond_5b
    iget-object p1, p0, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    if-eqz p1, :cond_80

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_80

    iget-object p1, p0, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_72
    if-ge v2, v0, :cond_80

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/transition/Transition$びぐびあび;

    invoke-interface {v3, p0}, Landroidx/transition/Transition$びぐびあび;->びぐびあび(Landroidx/transition/Transition;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_72

    :cond_80
    iput-boolean v1, p0, Landroidx/transition/Transition;->ぇぬぎばつ:Z

    :cond_82
    return-void
.end method

.method public ぉざぅち〻()[Ljava/lang/String;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public ぉひのべい()V
    .registers 6

    iget v0, p0, Landroidx/transition/Transition;->おぐぴう〸ず:I

    if-nez v0, :cond_2c

    iget-object v0, p0, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eqz v0, :cond_2a

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2a

    iget-object v0, p0, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1c
    if-ge v3, v2, :cond_2a

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/transition/Transition$びぐびあび;

    invoke-interface {v4, p0}, Landroidx/transition/Transition$びぐびあび;->げつ〴ぬぐ(Landroidx/transition/Transition;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1c

    :cond_2a
    iput-boolean v1, p0, Landroidx/transition/Transition;->ぉざぅち〻:Z

    :cond_2c
    iget v0, p0, Landroidx/transition/Transition;->おぐぴう〸ず:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/transition/Transition;->おぐぴう〸ず:I

    return-void
.end method

.method public おぐぴう〸ず(Landroid/view/View;Z)Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;
    .registers 9

    iget-object v0, p0, Landroidx/transition/Transition;->いいにぽつ:Landroidx/transition/TransitionSet;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1, p2}, Landroidx/transition/Transition;->おぐぴう〸ず(Landroid/view/View;Z)Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    move-result-object p1

    return-object p1

    :cond_9
    if-eqz p2, :cond_e

    iget-object v0, p0, Landroidx/transition/Transition;->てぜきぽく:Ljava/util/ArrayList;

    goto :goto_10

    :cond_e
    iget-object v0, p0, Landroidx/transition/Transition;->のぷのちつ:Ljava/util/ArrayList;

    :goto_10
    const/4 v1, 0x0

    if-nez v0, :cond_14

    return-object v1

    :cond_14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    :goto_1a
    if-ge v4, v2, :cond_2e

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    if-nez v5, :cond_25

    return-object v1

    :cond_25
    iget-object v5, v5, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    if-ne v5, p1, :cond_2b

    move v3, v4

    goto :goto_2e

    :cond_2b
    add-int/lit8 v4, v4, 0x1

    goto :goto_1a

    :cond_2e
    :goto_2e
    if-ltz v3, :cond_3e

    if-eqz p2, :cond_35

    iget-object p1, p0, Landroidx/transition/Transition;->のぷのちつ:Ljava/util/ArrayList;

    goto :goto_37

    :cond_35
    iget-object p1, p0, Landroidx/transition/Transition;->てぜきぽく:Ljava/util/ArrayList;

    :goto_37
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    :cond_3e
    return-object v1
.end method

.method public げつ〴ぬぐ(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;
    .registers 3

    iget-object v0, p0, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    if-nez v0, :cond_b

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    :cond_b
    iget-object v0, p0, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public ごづごきえ(Landroid/view/View;)Z
    .registers 5

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Landroidx/transition/Transition;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_16

    iget-object v1, p0, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Landroidx/transition/Transition;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2d

    iget-object v0, p0, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2b

    goto :goto_2d

    :cond_2b
    const/4 p1, 0x0

    return p1

    :cond_2d
    :goto_2d
    return v2
.end method

.method public ざとぅぼこ〺(Landroid/view/View;Z)Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;
    .registers 4

    iget-object v0, p0, Landroidx/transition/Transition;->いいにぽつ:Landroidx/transition/TransitionSet;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1, p2}, Landroidx/transition/Transition;->ざとぅぼこ〺(Landroid/view/View;Z)Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    move-result-object p1

    return-object p1

    :cond_9
    if-eqz p2, :cond_e

    iget-object p2, p0, Landroidx/transition/Transition;->〳ぜぞぜべっ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    goto :goto_10

    :cond_e
    iget-object p2, p0, Landroidx/transition/Transition;->ぺぁあねじ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    :goto_10
    iget-object p2, p2, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p2, p1, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 2
    check-cast p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    return-object p1
.end method

.method public じぜこほぱ(Lづざかべべ/は〲ぱなで/ぶでにく〼〳;)V
    .registers 2

    iput-object p1, p0, Landroidx/transition/Transition;->ごづごきえ:Lづざかべべ/は〲ぱなで/ぶでにく〼〳;

    return-void
.end method

.method public せづっ〸ちね(Ljava/lang/String;)Ljava/lang/String;
    .registers 8

    invoke-static {p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "@"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-wide v0, p0, Landroidx/transition/Transition;->びぐびあび:J

    const-wide/16 v2, -0x1

    const-string v4, ") "

    cmp-long v5, v0, v2

    if-eqz v5, :cond_44

    const-string v0, "dur("

    invoke-static {p1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-wide v0, p0, Landroidx/transition/Transition;->びぐびあび:J

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_44
    iget-wide v0, p0, Landroidx/transition/Transition;->くし〴〺ぅ:J

    cmp-long v5, v0, v2

    if-eqz v5, :cond_5c

    const-string v0, "dly("

    invoke-static {p1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-wide v0, p0, Landroidx/transition/Transition;->くし〴〺ぅ:J

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_5c
    iget-object v0, p0, Landroidx/transition/Transition;->づざかべべ:Landroid/animation/TimeInterpolator;

    if-eqz v0, :cond_72

    const-string v0, "interp("

    invoke-static {p1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, p0, Landroidx/transition/Transition;->づざかべべ:Landroid/animation/TimeInterpolator;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_72
    iget-object v0, p0, Landroidx/transition/Transition;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_82

    iget-object v0, p0, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_e6

    :cond_82
    const-string v0, "tgts("

    invoke-static {p1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Landroidx/transition/Transition;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-string v1, ", "

    const/4 v2, 0x0

    if-lez v0, :cond_b6

    const/4 v0, 0x0

    :goto_94
    iget-object v3, p0, Landroidx/transition/Transition;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_b6

    if-lez v0, :cond_a2

    invoke-static {p1, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_a2
    invoke-static {p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v3, p0, Landroidx/transition/Transition;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v0, v0, 0x1

    goto :goto_94

    :cond_b6
    iget-object v0, p0, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_e0

    :goto_be
    iget-object v0, p0, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_e0

    if-lez v2, :cond_cc

    invoke-static {p1, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_cc
    invoke-static {p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, p0, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v2, v2, 0x1

    goto :goto_be

    :cond_e0
    const-string v0, ")"

    invoke-static {p1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_e6
    return-object p1
.end method

.method public final づざかべべ(Landroid/view/View;Z)V
    .registers 5

    if-nez p1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2e

    new-instance v0, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    invoke-direct {v0, p1}, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_19

    invoke-virtual {p0, v0}, Landroidx/transition/Transition;->ぁごぐすすぃ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    goto :goto_1c

    :cond_19
    invoke-virtual {p0, v0}, Landroidx/transition/Transition;->びぐびあび(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    :goto_1c
    iget-object v1, v0, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v0}, Landroidx/transition/Transition;->なぎぱいぢぎ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    if-eqz p2, :cond_29

    iget-object v1, p0, Landroidx/transition/Transition;->〳ぜぞぜべっ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    goto :goto_2b

    :cond_29
    iget-object v1, p0, Landroidx/transition/Transition;->ぺぁあねじ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    :goto_2b
    invoke-static {v1, p1, v0}, Landroidx/transition/Transition;->くし〴〺ぅ(Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;Landroid/view/View;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    :cond_2e
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_45

    check-cast p1, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    :goto_35
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_45

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Landroidx/transition/Transition;->づざかべべ(Landroid/view/View;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_35

    :cond_45
    return-void
.end method

.method public てぜきぽく(Landroid/view/ViewGroup;Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .registers 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "L\u3065\u3056\u304b\u3079\u3079/\u306f\u3032\u3071\u306a\u3067/\u3047\u3033\u3032\u303a\u3059\u3063;",
            "L\u3065\u3056\u304b\u3079\u3079/\u306f\u3032\u3071\u306a\u3067/\u3047\u3033\u3032\u303a\u3059\u3063;",
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306f\u3032\u3071\u306a\u3067/\u3049\u3032\u306a\u3071\u307d\u305f;",
            ">;",
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306f\u3032\u3071\u306a\u3067/\u3049\u3032\u306a\u3071\u307d\u305f;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    invoke-static {}, Landroidx/transition/Transition;->ぇぬぎばつ()Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    move-result-object v8

    new-instance v9, Landroid/util/SparseIntArray;

    invoke-direct {v9}, Landroid/util/SparseIntArray;-><init>()V

    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->size()I

    move-result v10

    const-wide v0, 0x7fffffffffffffffL

    const/4 v12, 0x0

    :goto_17
    if-ge v12, v10, :cond_125

    move-object/from16 v13, p4

    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    move-object/from16 v14, p5

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    if-eqz v2, :cond_34

    iget-object v5, v2, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_34

    const/4 v2, 0x0

    :cond_34
    if-eqz v3, :cond_3f

    iget-object v5, v3, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3f

    const/4 v3, 0x0

    :cond_3f
    if-nez v2, :cond_49

    if-nez v3, :cond_49

    :cond_43
    move/from16 v16, v10

    move/from16 v18, v12

    goto/16 :goto_11f

    :cond_49
    if-eqz v2, :cond_56

    if-eqz v3, :cond_56

    invoke-virtual {v6, v2, v3}, Landroidx/transition/Transition;->は〲ぱなで(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Z

    move-result v5

    if-eqz v5, :cond_54

    goto :goto_56

    :cond_54
    const/4 v5, 0x0

    goto :goto_57

    :cond_56
    :goto_56
    const/4 v5, 0x1

    :goto_57
    if-eqz v5, :cond_43

    invoke-virtual {v6, v7, v2, v3}, Landroidx/transition/Transition;->ぺふねづ〺(Landroid/view/ViewGroup;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;

    move-result-object v5

    if-eqz v5, :cond_43

    if-eqz v3, :cond_e2

    iget-object v15, v3, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->ぉざぅち〻()[Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_d6

    array-length v11, v4

    if-lez v11, :cond_d6

    new-instance v11, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    invoke-direct {v11, v15}, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;-><init>(Landroid/view/View;)V

    move-object/from16 v17, v5

    move/from16 v16, v10

    move-object/from16 v10, p3

    iget-object v5, v10, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v5, v15}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    if-eqz v5, :cond_a1

    const/4 v10, 0x0

    :goto_82
    array-length v13, v4

    if-ge v10, v13, :cond_a1

    iget-object v13, v11, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    aget-object v14, v4, v10

    move/from16 v18, v12

    iget-object v12, v5, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    move-object/from16 v19, v5

    aget-object v5, v4, v10

    invoke-interface {v12, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v13, v14, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v14, p5

    move/from16 v12, v18

    move-object/from16 v5, v19

    goto :goto_82

    :cond_a1
    move/from16 v18, v12

    .line 1
    iget v4, v8, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    const/4 v5, 0x0

    :goto_a6
    if-ge v5, v4, :cond_d3

    .line 2
    invoke-virtual {v8, v5}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/animation/Animator;

    invoke-virtual {v8, v10}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/transition/Transition$〺つふすそ;

    iget-object v12, v10, Landroidx/transition/Transition$〺つふすそ;->くし〴〺ぅ:Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    if-eqz v12, :cond_d0

    iget-object v12, v10, Landroidx/transition/Transition$〺つふすそ;->げつ〴ぬぐ:Landroid/view/View;

    if-ne v12, v15, :cond_d0

    iget-object v12, v10, Landroidx/transition/Transition$〺つふすそ;->〺つふすそ:Ljava/lang/String;

    .line 3
    iget-object v13, v6, Landroidx/transition/Transition;->〺つふすそ:Ljava/lang/String;

    .line 4
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d0

    iget-object v10, v10, Landroidx/transition/Transition$〺つふすそ;->くし〴〺ぅ:Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    invoke-virtual {v10, v11}, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d0

    const/4 v4, 0x0

    goto :goto_df

    :cond_d0
    add-int/lit8 v5, v5, 0x1

    goto :goto_a6

    :cond_d3
    move-object/from16 v4, v17

    goto :goto_df

    :cond_d6
    move-object/from16 v17, v5

    move/from16 v16, v10

    move/from16 v18, v12

    move-object/from16 v4, v17

    const/4 v11, 0x0

    :goto_df
    move-object v10, v4

    move-object v5, v11

    goto :goto_ee

    :cond_e2
    move-object/from16 v17, v5

    move/from16 v16, v10

    move/from16 v18, v12

    iget-object v4, v2, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    move-object v15, v4

    move-object/from16 v10, v17

    const/4 v5, 0x0

    :goto_ee
    if-eqz v10, :cond_11f

    iget-object v4, v6, Landroidx/transition/Transition;->ごづごきえ:Lづざかべべ/は〲ぱなで/ぶでにく〼〳;

    if-eqz v4, :cond_106

    invoke-virtual {v4, v7, v6, v2, v3}, Lづざかべべ/は〲ぱなで/ぶでにく〼〳;->げつ〴ぬぐ(Landroid/view/ViewGroup;Landroidx/transition/Transition;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)J

    move-result-wide v2

    iget-object v4, v6, Landroidx/transition/Transition;->は〲ぱなで:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    long-to-int v11, v2

    invoke-virtual {v9, v4, v11}, Landroid/util/SparseIntArray;->put(II)V

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    :cond_106
    move-wide v11, v0

    new-instance v13, Landroidx/transition/Transition$〺つふすそ;

    .line 5
    iget-object v2, v6, Landroidx/transition/Transition;->〺つふすそ:Ljava/lang/String;

    .line 6
    invoke-static/range {p1 .. p1}, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->〺つふすそ(Landroid/view/View;)Lづざかべべ/は〲ぱなで/えがぐせほち;

    move-result-object v4

    move-object v0, v13

    move-object v1, v15

    move-object/from16 v3, p0

    invoke-direct/range {v0 .. v5}, Landroidx/transition/Transition$〺つふすそ;-><init>(Landroid/view/View;Ljava/lang/String;Landroidx/transition/Transition;Lづざかべべ/は〲ぱなで/えがぐせほち;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    invoke-virtual {v8, v10, v13}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v6, Landroidx/transition/Transition;->は〲ぱなで:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide v0, v11

    :cond_11f
    :goto_11f
    add-int/lit8 v12, v18, 0x1

    move/from16 v10, v16

    goto/16 :goto_17

    :cond_125
    invoke-virtual {v9}, Landroid/util/SparseIntArray;->size()I

    move-result v2

    if-eqz v2, :cond_14f

    const/4 v11, 0x0

    :goto_12c
    invoke-virtual {v9}, Landroid/util/SparseIntArray;->size()I

    move-result v2

    if-ge v11, v2, :cond_14f

    invoke-virtual {v9, v11}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v2

    iget-object v3, v6, Landroidx/transition/Transition;->は〲ぱなで:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/animation/Animator;

    invoke-virtual {v9, v11}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v3, v0

    invoke-virtual {v2}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v7

    add-long/2addr v7, v3

    invoke-virtual {v2, v7, v8}, Landroid/animation/Animator;->setStartDelay(J)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_12c

    :cond_14f
    return-void
.end method

.method public でどあくず(Landroid/view/View;)V
    .registers 11

    iget-boolean v0, p0, Landroidx/transition/Transition;->ぉざぅち〻:Z

    if-nez v0, :cond_7c

    invoke-static {}, Landroidx/transition/Transition;->ぇぬぎばつ()Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    move-result-object v0

    .line 1
    iget v1, v0, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    .line 2
    invoke-static {p1}, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->〺つふすそ(Landroid/view/View;)Lづざかべべ/は〲ぱなで/えがぐせほち;

    move-result-object p1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_10
    const/4 v3, 0x0

    if-ltz v1, :cond_56

    invoke-virtual {v0, v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->ぺふねづ〺(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/transition/Transition$〺つふすそ;

    iget-object v5, v4, Landroidx/transition/Transition$〺つふすそ;->げつ〴ぬぐ:Landroid/view/View;

    if-eqz v5, :cond_53

    iget-object v4, v4, Landroidx/transition/Transition$〺つふすそ;->びぐびあび:Lづざかべべ/は〲ぱなで/えがぐせほち;

    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_53

    invoke-virtual {v0, v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator;

    .line 3
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x13

    if-lt v5, v6, :cond_35

    invoke-virtual {v4}, Landroid/animation/Animator;->pause()V

    goto :goto_53

    :cond_35
    invoke-virtual {v4}, Landroid/animation/Animator;->getListeners()Ljava/util/ArrayList;

    move-result-object v5

    if-eqz v5, :cond_53

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    :goto_3f
    if-ge v3, v6, :cond_53

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/animation/Animator$AnimatorListener;

    instance-of v8, v7, Lづざかべべ/は〲ぱなで/げつ〴ぬぐ;

    if-eqz v8, :cond_50

    check-cast v7, Lづざかべべ/は〲ぱなで/げつ〴ぬぐ;

    invoke-interface {v7, v4}, Lづざかべべ/は〲ぱなで/げつ〴ぬぐ;->onAnimationPause(Landroid/animation/Animator;)V

    :cond_50
    add-int/lit8 v3, v3, 0x1

    goto :goto_3f

    :cond_53
    :goto_53
    add-int/lit8 v1, v1, -0x1

    goto :goto_10

    .line 4
    :cond_56
    iget-object p1, p0, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    if-eqz p1, :cond_7a

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_7a

    iget-object p1, p0, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_6c
    if-ge v3, v0, :cond_7a

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/Transition$びぐびあび;

    invoke-interface {v1, p0}, Landroidx/transition/Transition$びぐびあび;->くし〴〺ぅ(Landroidx/transition/Transition;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_6c

    :cond_7a
    iput-boolean v2, p0, Landroidx/transition/Transition;->ぇぬぎばつ:Z

    :cond_7c
    return-void
.end method

.method public どぇぞほだ(Landroid/animation/TimeInterpolator;)Landroidx/transition/Transition;
    .registers 2

    iput-object p1, p0, Landroidx/transition/Transition;->づざかべべ:Landroid/animation/TimeInterpolator;

    return-object p0
.end method

.method public なぎぱいぢぎ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 9

    iget-object v0, p0, Landroidx/transition/Transition;->ごづごきえ:Lづざかべべ/は〲ぱなで/ぶでにく〼〳;

    if-eqz v0, :cond_8a

    iget-object v0, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8a

    iget-object v0, p0, Landroidx/transition/Transition;->ごづごきえ:Lづざかべべ/は〲ぱなで/ぶでにく〼〳;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lづざかべべ/は〲ぱなで/ぃぜぶの〸ぃ;->げつ〴ぬぐ:[Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_15
    array-length v3, v0

    const/4 v4, 0x1

    if-ge v2, v3, :cond_28

    iget-object v3, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    aget-object v5, v0, v2

    invoke-interface {v3, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_25

    const/4 v0, 0x0

    goto :goto_29

    :cond_25
    add-int/lit8 v2, v2, 0x1

    goto :goto_15

    :cond_28
    const/4 v0, 0x1

    :goto_29
    if-nez v0, :cond_8a

    iget-object v0, p0, Landroidx/transition/Transition;->ごづごきえ:Lづざかべべ/は〲ぱなで/ぶでにく〼〳;

    check-cast v0, Lづざかべべ/は〲ぱなで/ぃぜぶの〸ぃ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    iget-object v2, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v3, "android:visibility:visibility"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_48

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_48
    iget-object v3, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v5, "android:visibilityPropagation:visibility"

    invoke-interface {v3, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v3, v2, [I

    invoke-virtual {v0, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    aget v5, v3, v1

    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    add-int/2addr v6, v5

    aput v6, v3, v1

    aget v5, v3, v1

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v6

    div-int/2addr v6, v2

    add-int/2addr v6, v5

    aput v6, v3, v1

    aget v1, v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    add-int/2addr v5, v1

    aput v5, v3, v4

    aget v1, v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    div-int/2addr v0, v2

    add-int/2addr v0, v1

    aput v0, v3, v4

    iget-object p1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v0, "android:visibilityPropagation:center"

    invoke-interface {p1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8a
    return-void
.end method

.method public なぶひせが(Landroidx/transition/Transition$くし〴〺ぅ;)V
    .registers 2

    iput-object p1, p0, Landroidx/transition/Transition;->ざっざへづ:Landroidx/transition/Transition$くし〴〺ぅ;

    return-void
.end method

.method public のぷのちつ()V
    .registers 7

    iget v0, p0, Landroidx/transition/Transition;->おぐぴう〸ず:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Landroidx/transition/Transition;->おぐぴう〸ず:I

    if-nez v0, :cond_6a

    iget-object v0, p0, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v0, :cond_2e

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2e

    iget-object v0, p0, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_20
    if-ge v4, v3, :cond_2e

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/transition/Transition$びぐびあび;

    invoke-interface {v5, p0}, Landroidx/transition/Transition$びぐびあび;->づざかべべ(Landroidx/transition/Transition;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_20

    :cond_2e
    const/4 v0, 0x0

    :goto_2f
    iget-object v3, p0, Landroidx/transition/Transition;->〳ぜぞぜべっ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    iget-object v3, v3, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/づざかべべ;

    invoke-virtual {v3}, Lづざかべべ/づざかべべ/づざかべべ;->〳ぜぞぜべっ()I

    move-result v3

    if-ge v0, v3, :cond_4b

    iget-object v3, p0, Landroidx/transition/Transition;->〳ぜぞぜべっ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    iget-object v3, v3, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/づざかべべ;

    invoke-virtual {v3, v0}, Lづざかべべ/づざかべべ/づざかべべ;->ぺぁあねじ(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_48

    invoke-static {v3, v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぃぜぶの〸ぃ(Landroid/view/View;Z)V

    :cond_48
    add-int/lit8 v0, v0, 0x1

    goto :goto_2f

    :cond_4b
    const/4 v0, 0x0

    :goto_4c
    iget-object v3, p0, Landroidx/transition/Transition;->ぺぁあねじ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    iget-object v3, v3, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/づざかべべ;

    invoke-virtual {v3}, Lづざかべべ/づざかべべ/づざかべべ;->〳ぜぞぜべっ()I

    move-result v3

    if-ge v0, v3, :cond_68

    iget-object v3, p0, Landroidx/transition/Transition;->ぺぁあねじ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    iget-object v3, v3, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/づざかべべ;

    invoke-virtual {v3, v0}, Lづざかべべ/づざかべべ/づざかべべ;->ぺぁあねじ(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_65

    invoke-static {v3, v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぃぜぶの〸ぃ(Landroid/view/View;Z)V

    :cond_65
    add-int/lit8 v0, v0, 0x1

    goto :goto_4c

    :cond_68
    iput-boolean v1, p0, Landroidx/transition/Transition;->ぉざぅち〻:Z

    :cond_6a
    return-void
.end method

.method public は〲ぱなで(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Z
    .registers 9

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_39

    if-eqz p2, :cond_39

    invoke-virtual {p0}, Landroidx/transition/Transition;->ぉざぅち〻()[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1c

    array-length v3, v2

    const/4 v4, 0x0

    :goto_e
    if-ge v4, v3, :cond_39

    aget-object v5, v2, v4

    invoke-static {p1, p2, v5}, Landroidx/transition/Transition;->ざっざへづ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_19

    goto :goto_38

    :cond_19
    add-int/lit8 v4, v4, 0x1

    goto :goto_e

    :cond_1c
    iget-object v2, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_26
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_39

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {p1, p2, v3}, Landroidx/transition/Transition;->ざっざへづ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_26

    :goto_38
    const/4 v0, 0x1

    :cond_39
    return v0
.end method

.method public びえぁぜい(J)Landroidx/transition/Transition;
    .registers 3

    iput-wide p1, p0, Landroidx/transition/Transition;->びぐびあび:J

    return-object p0
.end method

.method public abstract びぐびあび(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
.end method

.method public ぶでにく〼〳(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;
    .registers 3

    iget-object v0, p0, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    if-nez v0, :cond_5

    return-object p0

    :cond_5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_13

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    :cond_13
    return-object p0
.end method

.method public へぬ〴づぞ()Landroid/graphics/Rect;
    .registers 2

    iget-object v0, p0, Landroidx/transition/Transition;->ざっざへづ:Landroidx/transition/Transition$くし〴〺ぅ;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    return-object v0

    :cond_6
    invoke-virtual {v0, p0}, Landroidx/transition/Transition$くし〴〺ぅ;->げつ〴ぬぐ(Landroidx/transition/Transition;)Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public ぺぁあねじ(Z)V
    .registers 2

    if-eqz p1, :cond_13

    iget-object p1, p0, Landroidx/transition/Transition;->〳ぜぞぜべっ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    iget-object p1, p1, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {p1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->clear()V

    iget-object p1, p0, Landroidx/transition/Transition;->〳ぜぞぜべっ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    iget-object p1, p1, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->〺つふすそ:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    iget-object p1, p0, Landroidx/transition/Transition;->〳ぜぞぜべっ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    goto :goto_23

    :cond_13
    iget-object p1, p0, Landroidx/transition/Transition;->ぺぁあねじ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    iget-object p1, p1, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {p1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->clear()V

    iget-object p1, p0, Landroidx/transition/Transition;->ぺぁあねじ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    iget-object p1, p1, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->〺つふすそ:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    iget-object p1, p0, Landroidx/transition/Transition;->ぺぁあねじ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    :goto_23
    iget-object p1, p1, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/づざかべべ;

    invoke-virtual {p1}, Lづざかべべ/づざかべべ/づざかべべ;->〺つふすそ()V

    return-void
.end method

.method public ぺづげぺが(J)Landroidx/transition/Transition;
    .registers 3

    iput-wide p1, p0, Landroidx/transition/Transition;->くし〴〺ぅ:J

    return-object p0
.end method

.method public ぺふねづ〺(Landroid/view/ViewGroup;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;
    .registers 4

    const/4 p1, 0x0

    return-object p1
.end method
